package pl.naczilku.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.naczilku.model.Donor;
import pl.naczilku.repository.DonorRepository;

@RestController
@RequestMapping("/naczilku")
public class DonorController {

	@Autowired
	private DonorRepository donorRepository;
	
	@RequestMapping("/donor")
	public List<Donor> retrieveDonors() {
		return donorRepository.findAll();
	}
	
	@PostMapping("/donor")
	public Donor createDonor(@Valid @RequestBody Donor donor) {
		return donorRepository.save(donor);
		
	}
	
}
