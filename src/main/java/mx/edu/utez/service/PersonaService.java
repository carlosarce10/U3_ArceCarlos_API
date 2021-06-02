package mx.edu.utez.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.entities.PersonaEntity;
import mx.edu.utez.repository.PersonaRepository;

@Service
@Transactional
public class PersonaService {
	@Autowired
	private PersonaRepository personaRepository;

	public List<PersonaEntity> getEntities() {
		return personaRepository.findAll();
	}

	public PersonaEntity findByIdPersona(int id) {
		return personaRepository.findByIdPersona(id);
	}

	public boolean save(PersonaEntity personaEntity) {
		return personaRepository.existsById(personaRepository.save(personaEntity).getIdPersona());

	}

	public boolean deleteUser(int id) {
		personaRepository.deleteById(id);
		return !personaRepository.existsById(id);
	}

}
