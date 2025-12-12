package example.spring.rest.data.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import example.spring.rest.data.jpa.entity.Movie;
//No need to use @Repository because JpaRepository is already a Managed Component
public interface MovieRepository 
extends JpaRepository<Movie, Integer>{
	//Additional methods if any other than
	//regular CRUD operations.
}
