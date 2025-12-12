package example.spring.rest.data.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.data.jpa.entity.Movie;
import example.spring.rest.data.jpa.repo.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepo;
	public List<Movie> getAllMovies(){
		return movieRepo.findAll();
	}
	
	public Movie getOneMovie(Integer movieId) {
		Movie foundMovie = null;
		Optional<Movie> opRef =
		movieRepo.findById(movieId);
		if(opRef.isPresent()) {
			foundMovie = opRef.get();
		}
		return foundMovie;
	}
	
	public void createMovie(Movie movieObj) {
		movieRepo.save(movieObj);
	}
	
	public void deleteMovie(Integer movieId) {
		movieRepo.deleteById(movieId);
	}

}







