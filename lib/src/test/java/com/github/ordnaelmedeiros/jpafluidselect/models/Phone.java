package com.github.ordnaelmedeiros.jpafluidselect.models;

import static javax.persistence.FetchType.LAZY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Phone {

	public static Long countId = 0l;
	
	@Id
	private Long id;
	
	@ManyToOne(fetch=LAZY)
	private People people;
	
	@Column(length=50)
	private String number;
	
	public Phone() {
		this.setId(++countId);
	}
	
	public Phone(People people, String number) {
		this();
		this.people = people;
		this.number = number;
	}
	
}
