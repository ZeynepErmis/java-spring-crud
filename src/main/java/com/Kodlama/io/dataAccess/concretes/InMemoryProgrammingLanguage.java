package com.Kodlama.io.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Kodlama.io.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.Kodlama.io.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> programmingLanguages = new ArrayList<ProgrammingLanguage>();

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getProgrammingLanguageById(String id) {
		int currentId = Integer.parseInt(id);
		return programmingLanguages.get(currentId - 1);
	}

	@Override
	public void delete(String id) {
		programmingLanguages.removeIf(language -> language.getId().equals(id));

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		int id = Integer.parseInt(programmingLanguage.getId());
		programmingLanguages.set(id - 1, programmingLanguage);

	}

}
