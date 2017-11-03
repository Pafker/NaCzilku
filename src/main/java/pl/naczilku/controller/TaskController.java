package pl.naczilku.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.naczilku.model.Task;
import pl.naczilku.repository.TaskRepository;

@RestController
@RequestMapping("/naczilku")
public class TaskController {

	@Autowired
	private TaskRepository taskRepository;

	@GetMapping("/task")
	public List<Task> retrieveTasks() {
		return taskRepository.findAll();
	}

	@GetMapping("/task/{id}")
	public ResponseEntity<Task> retrieveSingleTask(
			@PathVariable(value = "id") Long taskId) {
		Task task = taskRepository.findOne(taskId);
		if (task == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(task);

	}

	@PostMapping("/task")
	public Task createTask(@Valid @RequestBody Task task) {
		return taskRepository.save(task);
	}

}
