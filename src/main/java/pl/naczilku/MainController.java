package pl.naczilku;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.naczilku.model.Donor;
import pl.naczilku.model.Family;
import pl.naczilku.model.Task;

@RestController
@RequestMapping("/naczilku")
public class MainController {

	@Autowired
	private FamilyService familyService;
	
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
	public Donor donorTest() {
		Donor donor = new Donor();
		return donor;
	}

}
