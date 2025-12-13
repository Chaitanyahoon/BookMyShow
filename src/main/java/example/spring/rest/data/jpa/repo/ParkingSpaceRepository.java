package example.spring.rest.data.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import example.spring.rest.data.jpa.entity.ParkingSpace;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Integer> {

}
