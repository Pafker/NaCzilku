package pl.naczilku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.naczilku.TestService;
import pl.naczilku.model.Family;
import pl.naczilku.repository.FamilyRepository;

@RestController
@RequestMapping("/naczilku")
public class FamilyController {

	@Autowired
	private TestService testService;

	@Autowired
	private FamilyRepository familyRepository;

	@GetMapping("/familylist")
	public List<Family> showFamilyListTree() {
		return familyRepository.findAll();
	}

	@GetMapping("/familylist/{id}")
	public Family showFamily(@PathVariable int id) {
		return testService.getFamily(id);
	}

	@GetMapping("/familylist/{id}")
	public ResponseEntity<Family> retrieveSingleFamily(
			@PathVariable(value = "id") Long familyId) {
		Family family = familyRepository.findOne(familyId);
		if (family == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(family);

	}

}
