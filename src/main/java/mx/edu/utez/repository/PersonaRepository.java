package mx.edu.utez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.entities.PersonaEntity;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity,Integer> {
	PersonaEntity findByIdPersona(int id);
}
