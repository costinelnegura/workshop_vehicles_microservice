package com.costinel.workshop_vehicle_microservice.repo;

import com.costinel.workshop_vehicle_microservice.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle, Long> {
}
