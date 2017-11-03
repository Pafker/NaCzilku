package pl.naczilku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.naczilku.TestService;
import pl.naczilku.model.Family;

@RestController
@RequestMapping("/naczilku")
public class FamilyController {

	@Autowired
	private TestService familyService;
		
	@RequestMapping("/familylist/{id}")
	public Family showFamily(@PathVariable int id) {
		return familyService.getFamily(id);
	}
	
	@RequestMapping("/familylist")
	public List<Family> showFamilyListTree() {
		return familyService.getFamilyList();
	}
	
}
