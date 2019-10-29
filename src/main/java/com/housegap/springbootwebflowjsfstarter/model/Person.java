package com.housegap.springbootwebflowjsfstarter.model;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * A person entity.
 */
public class Person {
	
	private Long id;

    private String firstName;

    private String lastName;

    private Set<Address> addresses = new HashSet<> ();

    public Person () {
    }

    public Person ( String firstName, String lastName ) {
        this(firstName, lastName, new HashSet<Address> () );
    }

    public Person ( String firstName, String lastName, Set<Address> addresses ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addresses;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public Set<Address> getAddresses () {
        return addresses;
    }

    public void setAddresses ( Set<Address> addresses ) {
        this.addresses = addresses;
    }

    @Override
    public String toString () {
        return new ToStringBuilder ( this, ToStringStyle.SIMPLE_STYLE )
                .append ( "firstName", firstName )
                .append ( "lastName", lastName )
                .append ( "addresses", addresses )
                .toString ();
    }
}
