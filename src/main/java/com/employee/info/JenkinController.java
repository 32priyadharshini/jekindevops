package com.employee.info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinController {
	@GetMapping("/get")
	public String get() {
		return "jenkins";
	}

}
