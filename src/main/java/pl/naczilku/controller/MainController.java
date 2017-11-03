package pl.naczilku.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/naczilku")
public class MainController {

	@RequestMapping("/")
	public String welcomePage() {
		return "Szlachetna paczka";
	}

}
