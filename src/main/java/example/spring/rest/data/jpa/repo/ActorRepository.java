package example.spring.rest.data.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import example.spring.rest.data.jpa.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

}
