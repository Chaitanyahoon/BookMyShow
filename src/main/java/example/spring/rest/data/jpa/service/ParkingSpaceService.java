package example.spring.rest.data.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.data.jpa.entity.ParkingSpace;
import example.spring.rest.data.jpa.repo.ParkingSpaceRepository;

@Service
public class ParkingSpaceService {
    @Autowired
    private ParkingSpaceRepository psRepo;

    public List<ParkingSpace> getAllSpaces() {
        return psRepo.findAll();
    }

    public void createSpace(ParkingSpace ps) {
        psRepo.save(ps);
    }

    public void deleteSpace(Integer psId) {
        psRepo.deleteById(psId);
    }
}
