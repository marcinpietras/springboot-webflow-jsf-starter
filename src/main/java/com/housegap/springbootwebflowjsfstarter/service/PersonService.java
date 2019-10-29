package com.housegap.springbootwebflowjsfstarter.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.housegap.springbootwebflowjsfstarter.model.Person;

/**
 * Implementation for {@link PersonService person service boundary}.
 */
@Service("personService")
public class PersonService {
	
	private Map<Long, Person> repository = new HashMap<Long, Person>();

//	@Autowired
//	private PersonRepository personRepository;

	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		repository.forEach((k,v) -> persons.add(v));
		return persons;
	}

//	public Page<Person> findAll(Pageable pageable) {
//		return personRepository.findAll(pageable);
//	}

	public Person save(Person entity) {
		if (entity.getId() == null) {
			entity.setId(new Random().nextLong());
		}
		repository.put(entity.getId(), entity);
		return entity;
	}

	public Person findOne(Long id) {
		return repository.get(id);
	}

	public long count() {
		return repository.size();
	}

	public boolean exists(Long id) {
		return repository.containsKey(id);
	}

	public void delete(Long id) {
		repository.remove(id);
	}

	public void deleteAll() {
		repository = new HashMap<Long, Person>();
	}
}
