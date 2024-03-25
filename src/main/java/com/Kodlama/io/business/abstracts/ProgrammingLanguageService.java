package com.Kodlama.io.business.abstracts;

import java.util.List;

import com.Kodlama.io.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();

	void add(ProgrammingLanguage programmingLanguage);

	void delete(String id);

	void update(ProgrammingLanguage programmingLanguage);

	ProgrammingLanguage getProgrammingLanguageById(String id);
}
