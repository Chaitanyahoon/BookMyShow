package example.spring.rest.data.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.data.jpa.entity.Movie;
import example.spring.rest.data.jpa.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieRestController {
	@Autowired
	private MovieService movieServ;
	
	@GetMapping
	public List<Movie> getAllMovies(){
		return movieServ.getAllMovies();
	}
	
	@GetMapping("/{movieId}")
	public Movie getOneMove(@PathVariable Integer movieId) {
		Movie foundMovie = null;
		foundMovie = movieServ.getOneMovie(movieId);
		return foundMovie;
	}
	
	@PostMapping
	public void createMovie(@RequestBody Movie movieObj) {
		System.out.println("Received Movie Object: " + movieObj);
		movieServ.createMovie(movieObj);
	}
	
	@DeleteMapping("/{movieId}")
	public void deleteMovie(@PathVariable Integer movieId) {
		movieServ.deleteMovie(movieId);
	}
}

//  /movies           GET
//  /movies/{ID}      GET
//  /movies			  POST
//  /movies/{ID}      DELETE







