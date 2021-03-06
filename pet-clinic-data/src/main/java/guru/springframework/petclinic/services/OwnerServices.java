package guru.springframework.petclinic.services;

import java.util.Set;

import guru.springframework.petclinic.model.Owner;

public interface OwnerServices {
	Owner findLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();

}
