package pl.naczilku.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.naczilku.model.Volunteer;
import pl.naczilku.repository.VolunteerRepository;

@RestController
@RequestMapping("/naczilku")
public class VolunteerController {

	@Autowired
	private VolunteerRepository volunteerRepository;

	@GetMapping("/volunteer")
	public List<Volunteer> retrieveVolunteers() {
		return volunteerRepository.findAll();
	}

	@PostMapping("/volunteer")
	public Volunteer createVolunteer(@Valid @RequestBody Volunteer volunteer) {
		return volunteerRepository.save(volunteer);

	}

}
