package com.projectmaat.website;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {

	@GetMapping("/overons")
	public String overons() {
		return "about";
	}

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/error")
    public String error() {
        return String.format("Woops, iets ging fout");
    }

}