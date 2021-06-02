package mx.edu.utez.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import mx.edu.utez.entities.PersonaEntity;
import mx.edu.utez.service.PersonaService;

@RestController
@RequestMapping("/practica")
public class PersonaController {
	@Autowired
	private PersonaService personaService;
	@GetMapping("/persona/findById/{idPersona}")
	public PersonaEntity findById(@PathVariable ("idPersona") int id) {
		return personaService.findByIdPersona(id);
	}
	@GetMapping("/persona/findEntities")
	public List<PersonaEntity> findEntities() {
		return personaService.getEntities();
	}
	@PostMapping("/persona/save")
	public boolean save( @RequestBody PersonaEntity personaEntity) {
		return personaService.save(personaEntity);
	}
	@PutMapping("/persona/put/{id}")
	public boolean update(@PathVariable("id") int id, @RequestBody PersonaEntity personaEntity) {
		return personaService.save(personaEntity);
	}
	@DeleteMapping("/persona/delete/{id}")
	public boolean delete(@PathVariable("id") int id) {
		return personaService.deleteUser(id);
	}
}
