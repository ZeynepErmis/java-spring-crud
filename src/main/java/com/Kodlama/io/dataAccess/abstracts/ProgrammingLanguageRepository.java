package com.Kodlama.io.dataAccess.abstracts;

import java.util.List;

import com.Kodlama.io.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

//	public ProgrammingLanguage getProgrammingLanguageById(String id);

	List<ProgrammingLanguage> getAll();

	void add(ProgrammingLanguage programmingLanguage);

	void delete(String id);

	void update(ProgrammingLanguage programmingLanguage);

	ProgrammingLanguage getProgrammingLanguageById(String id);

}
