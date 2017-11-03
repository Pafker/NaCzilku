package pl.naczilku.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.naczilku.TestService;
import pl.naczilku.model.Donor;
import pl.naczilku.model.Family;
import pl.naczilku.model.Task;
import pl.naczilku.repository.DonorRepository;

@RestController
@RequestMapping("/naczilku")
public class MainController {

	@Autowired
	private TestService familyService;
	
	@Autowired
	private DonorRepository donorRepository;
	
	@RequestMapping("/familylist/{id}")
	public Family showFamily(@PathVariable int id) {
		return familyService.getFamily(id);
	}
	
	@RequestMapping("/familylist")
	public List<Family> showFamilyListTree() {
		return familyService.getFamilyList();
	}
	
	@RequestMapping("/task")
	public Task taskTest() {
		Task task = new Task();
		return task;
	}
	
	@RequestMapping("/donor")
	public List<Donor> donorTest() {
		return donorRepository.findAll();
	}
	
	@PostMapping
	public Donor createDonor(@Valid @RequestBody Donor donor) {
		return donorRepository.save(donor);
		
	}

}
