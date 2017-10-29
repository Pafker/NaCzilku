package pl.naczilku;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import pl.naczilku.model.Donor;
import pl.naczilku.model.Family;
import pl.naczilku.model.Task;
import pl.naczilku.model.Volunteer;

@Service
public class FamilyService {

	private List<Family> familyList = new LinkedList<Family>();
	private Random rnd = new Random();

	private List<Family> setUpData() {

		int numOfFamilies = rnd.nextInt(10);
		String[] nazwisko = { "Herman", "Prokop", "Bucek", "Zdyb", "Balon" };
		for (int i = 1; i < numOfFamilies; i++) {

			Family tmpFamily = sampleFamilyMaker(i, nazwisko[rnd.nextInt(5)]);
			familyList.add(tmpFamily);

		}
		return familyList;
	}

	private Family sampleFamilyMaker(int id, String lastName) {
		String[] nazwiska = { "Nowak", "Kowalski", "Kolorow7", "Kurczak", "Rej" };
		String[] imiona = { "Patryk", "Kacper", "Paweł", "Marcin", "Sebastian" };

		List<Donor> donorList = new LinkedList<Donor>();
		Donor tmpDonor = new Donor(1, imiona[rnd.nextInt(5)],
				nazwiska[rnd.nextInt(5)], true,
				rnd.nextInt(28000000) + 60000000);
		donorList.add(tmpDonor);
		Donor tmpDonor2 = new Donor(1, imiona[rnd.nextInt(5)],
				nazwiska[rnd.nextInt(5)], false,
				rnd.nextInt(28000000) + 60000000);
		donorList.add(tmpDonor2);
		Donor tmpDonor3 = new Donor(1, imiona[rnd.nextInt(5)],
				nazwiska[rnd.nextInt(5)], false,
				rnd.nextInt(28000000) + 60000000);
		donorList.add(tmpDonor3);
		Donor tmpDonor4 = new Donor(1, imiona[rnd.nextInt(5)],
				nazwiska[rnd.nextInt(5)], false,
				rnd.nextInt(28000000) + 60000000);
		donorList.add(tmpDonor4);

		List<Task> taskList = new LinkedList<Task>();
		int[] familyStatus = { 1, 0, 1 };
		String[] street = { "Olsza", "Strzelcow", "Czarnowiejska",
				"Rumiankowa", "Mlynska" };
		Volunteer volunteer = new Volunteer(imiona[rnd.nextInt(5)],
				rnd.nextInt(28000000) + 60000000);
		int numOfMembers = (rnd.nextInt(3) + 2);
		String[] region = { "Krakow - Pradnik Czerwony", "Lublin - LSM",
				"Warszawa - Mokotow", "Katowice - Centrum", "Poznan - Centrum" };
		String description = "Super pozytywna rodzinka";
		String woivoiship = "polska";
		boolean isFinished = false;
		Family family1 = new Family(id, lastName, numOfMembers, woivoiship,
				region[rnd.nextInt(5)], street[rnd.nextInt(5)], volunteer,
				donorList, familyStatus, isFinished, description, taskList);
		family1.addTask(new Task("Jedzenie", "Maka", null, false, null, null));
		family1.addTask(new Task("Jedzenie", "Chleb", null, false, null, null));
		family1.addTask(new Task("Inne", "Zeszyty", null, false, null, null));

		return family1;
	}

	public List<Family> getFamilyList() {
		familyList = setUpData();
		return familyList;

	}

	public Family getFamily(int index) {
		Family tmpFamily = familyList.get(index - 1);
		return tmpFamily;
	}

}
