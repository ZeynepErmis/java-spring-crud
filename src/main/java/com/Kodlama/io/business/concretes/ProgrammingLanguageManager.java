package com.Kodlama.io.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kodlama.io.business.abstracts.ProgrammingLanguageService;
import com.Kodlama.io.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.Kodlama.io.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	@Autowired
	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return programmingLanguageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		if (programmingLanguage.getName().isEmpty()) {
			throw new IllegalArgumentException("Programming Language cannot be empty");
		} else {
			List<ProgrammingLanguage> existingLanguages = programmingLanguageRepository.getAll();
			for (ProgrammingLanguage existingLanguage : existingLanguages) {
				if (existingLanguage.getName().equalsIgnoreCase(programmingLanguage.getName())) {
					throw new IllegalArgumentException("Name cannot be repeated");
				}
			}
		}
		programmingLanguageRepository.add(programmingLanguage);
	}

	public void delete(String id) {
		programmingLanguageRepository.delete(id);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.update(programmingLanguage);

	}

	@Override
	public ProgrammingLanguage getProgrammingLanguageById(String id) {
		return programmingLanguageRepository.getProgrammingLanguageById(id);
	}

}
