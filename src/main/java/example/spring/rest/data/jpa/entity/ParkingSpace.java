package example.spring.rest.data.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Parking_Space_Master")
public class ParkingSpace {
    @Id
    @Column(name = "ps_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer psId;

    @Column(name = "flat_number")
    private String flatNumber;

    @Column(name = "location")
    private String location;

    public ParkingSpace() {
        // TODO Auto-generated constructor stub
    }

    public ParkingSpace(Integer psId, String flatNumber, String location) {
        super();
        this.psId = psId;
        this.flatNumber = flatNumber;
        this.location = location;
    }

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ParkingSpace [psId=" + psId + ", flatNumber=" + flatNumber + ", location=" + location + "]";
    }

}
