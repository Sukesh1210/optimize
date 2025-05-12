package com.tyss.movie_management_system.entity;

import java.util.List;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
@Entity
@Table(name = "actors")
public class Actor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer actorId;
	private String name;
	private Integer birthYear; 
	
	
	@ManyToMany
	private List<Movie> moviessuk;
	
	
	

}
