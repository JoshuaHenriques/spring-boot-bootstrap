package com.rename.me.interfaces;

import java.util.List;
import java.util.UUID;

import com.rename.me.exception.PersonAlreadyExistsException;
import com.rename.me.exception.PersonDoesNotExistsException;
import com.rename.me.model.Person;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ControllerI {
	
	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<String> add(@RequestBody Person person) throws PersonAlreadyExistsException;

	@PutMapping(value = "/update/{personId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<String> update(@RequestBody @ModelAttribute Person person, @PathVariable UUID personId)
		throws PersonDoesNotExistsException;

	@DeleteMapping(value = "/delete/{email}")
	ResponseEntity<String> delete(@PathVariable String email) throws PersonDoesNotExistsException;

	@GetMapping(value = "/listAll", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<List<Person>> listAll();
	
	@GetMapping(value = "/get/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Person> getByEmail(@PathVariable String email) throws PersonDoesNotExistsException;

	@GetMapping(value = "/{email}/exists")
	ResponseEntity<Boolean> existsByEmail(@PathVariable String email);

	@GetMapping(value = "/get/{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Person> getById(@PathVariable UUID personId) throws PersonDoesNotExistsException;

	@GetMapping(value = "/{personId}/exists")
	ResponseEntity<Boolean> existsById(@PathVariable UUID personId);
}
