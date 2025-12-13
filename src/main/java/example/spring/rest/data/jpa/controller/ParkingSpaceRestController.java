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

import example.spring.rest.data.jpa.entity.ParkingSpace;
import example.spring.rest.data.jpa.service.ParkingSpaceService;

@RestController
@RequestMapping("/spaces")
public class ParkingSpaceRestController {
    @Autowired
    private ParkingSpaceService psServ;

    @GetMapping
    public List<ParkingSpace> getAll() {
        return psServ.getAllSpaces();
    }

    @PostMapping
    public void createSpace(@RequestBody ParkingSpace ps) {
        psServ.createSpace(ps);
    }

    @DeleteMapping("/{psId}")
    public void deleteSpace(@PathVariable Integer psId) {
        psServ.deleteSpace(psId);
    }
}
