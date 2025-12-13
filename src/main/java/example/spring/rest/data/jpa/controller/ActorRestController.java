package example.spring.rest.data.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.data.jpa.entity.Actor;
import example.spring.rest.data.jpa.service.ActorService;

@RestController
@RequestMapping("/actors")
public class ActorRestController {
    @Autowired
    private ActorService actorServ;

    @GetMapping
    public List<Actor> getAllActors() {
        return actorServ.getAllActors();
    }

    @PostMapping
    public void createActor(@RequestBody Actor actor) {
        actorServ.createActor(actor);
    }

    @DeleteMapping("/{actorId}")
    public void deleteActor(@PathVariable Integer actorId) {
        actorServ.deleteActor(actorId);
    }

    @PutMapping("/{actorId}/{movieId}")
    public void linkActorToMovie(@PathVariable Integer actorId, @PathVariable Integer movieId) {
        actorServ.linkActorToMovie(actorId, movieId);
    }
}
