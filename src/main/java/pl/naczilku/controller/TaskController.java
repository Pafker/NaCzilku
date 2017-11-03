package pl.naczilku.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.naczilku.model.Task;

@RestController
@RequestMapping("/naczilku")
public class TaskController {

	@RequestMapping("/task")
	public Task taskTest() {
		Task task = new Task();
		return task;
	}
	
}
