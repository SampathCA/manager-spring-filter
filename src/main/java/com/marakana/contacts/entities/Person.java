package com.marakana.contacts.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person extends Contact {

	@OneToOne(optional = false, cascade = CascadeType.ALL)
	private Address address;
	
	@ManyToOne
	private Person manager;
	
	/*@OneToMany(mappedBy = "manager")
	private Set<Person> reports;
*/
	@ManyToOne
	private Company employer;

	public Person() {
		super();
	}

	public Person(String name, Address address) {
		super(name);
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person getManager() {
		return manager;
	}

	public void setManager(Person manager) {
		this.manager = manager;
	}

	public Company getEmployer() {
		return employer;
	}

	public void setEmployer(Company employer) {
		this.employer = employer;
	}
}
