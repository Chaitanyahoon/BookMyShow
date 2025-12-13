package example.spring.rest.data.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.data.jpa.entity.Actor;
import example.spring.rest.data.jpa.entity.Movie;
import example.spring.rest.data.jpa.repo.ActorRepository;
import example.spring.rest.data.jpa.repo.MovieRepository;

@Service
public class ActorService {
    @Autowired
    private ActorRepository actorRepo;
    @Autowired
    private MovieRepository movieRepo;

    public List<Actor> getAllActors() {
        return actorRepo.findAll();
    }

    public void createActor(Actor actor) {
        actorRepo.save(actor);
    }

    public void deleteActor(Integer actorId) {
        actorRepo.deleteById(actorId);
    }

    public void linkActorToMovie(Integer actorId, Integer movieId) {
        Actor actor = actorRepo.findById(actorId).orElse(null);
        Movie movie = movieRepo.findById(movieId).orElse(null);

        if (actor != null && movie != null) {
            // Add actor to movie (owning side of ManyToMany)
            movie.getActors().add(actor);
            // Save the movie to update the join table
            movieRepo.save(movie);
        }
    }
}
