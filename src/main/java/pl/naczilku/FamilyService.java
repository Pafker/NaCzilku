package pl.naczilku;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import pl.naczilku.model.Donor;
import pl.naczilku.model.Family;
import pl.naczilku.model.Task;
import pl.naczilku.model.Volunteer;

@Service
public class FamilyService {

	private List<Family> familyList = new LinkedList<Family>();

	private List<Family> setUpData() {
		List<Donor> donorList = new LinkedList<Donor>();
		Donor tmpDonor = new Donor(1, "Patryk", "Pawlos", true, 765567765);
		donorList.add(tmpDonor);
		Donor tmpDonor2 = new Donor(2, "Amadeusz", "Rogowski", false, 668347892);
		donorList.add(tmpDonor2);
		Donor tmpDonor3 = new Donor(3, "Kaper", "Bailando", false, 996872334);
		donorList.add(tmpDonor3);
		Donor tmpDonor4 = new Donor(4, "Szymon", "Pyrek", false, 696755921);
		donorList.add(tmpDonor4);
		
		List<Task> taskList = null;
		int[] familyStatus = {1, 0, 1};
		String street = "Olsza";
		Volunteer volunteer = new Volunteer("Mati", 564754842);
		int numOfMembers = 5;
		String region = "Krakow - Pradnik Czerwony";
		String description = "Super pozytywna rodzinka";
		String woivoiship = "malopolskie";
		boolean isFinished = false;
		String lastName = "Nowak";
		int id = 1;
		Family family1 = new Family(id, lastName, numOfMembers, woivoiship,
				region, street, volunteer, donorList, familyStatus, isFinished,
				description, taskList);
		family1.addTask(new Task("Jedzenie", "Maka", null, false, null, null));
		family1.addTask(new Task("Jedzenie", "Chleb", null, false, null, null));
		family1.addTask(new Task("Inne", "Pralka", null, false, null, null));
		familyList.add(family1);

		Family family2 = new Family();
		family2.setId(2);
		family2.addTask(new Task("Ubrania", "Spodnie", null, false, null, null));
		family2.addTask(new Task("Inne", "TV", null, false, null, null));
		familyList.add(family2);

		Family family3 = new Family();
		family3.setId(3);
		family3.addTask(new Task("Ubrania", "Koszula", null, false, null, null));
		family3.addTask(new Task("Jedzenie", "Makaron", null, false, null, null));
		familyList.add(family3);

		return familyList;
	}

	public List<Family> getFamilyList() {
		familyList = setUpData();
		return familyList;

	}

	public Family getFamily(int index) {
		Family tmpFamily = familyList.get(index);
		return tmpFamily;
	}

}
