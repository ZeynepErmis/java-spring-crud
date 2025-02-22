package com.Kodlama.io.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Kodlama.io.business.abstracts.ProgrammingLanguageService;
import com.Kodlama.io.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("api/programmingLanguages")
public class ProgrammingLanguageController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.add(programmingLanguage);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestParam String id) {
		programmingLanguageService.delete(id);
	}

	@PutMapping("/update")
	public void update(@RequestBody ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.update(programmingLanguage);
	}

	@GetMapping("/get")
	public ProgrammingLanguage get(@RequestParam String id) {
		return programmingLanguageService.getProgrammingLanguageById(id);
	}
}
