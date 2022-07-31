package com.costinel.workshop_vehicle_microservice.controller;

import com.costinel.workshop_vehicle_microservice.model.Vehicle;
import com.costinel.workshop_vehicle_microservice.repo.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkshopVehicleMicroserviceController {

    @Autowired
    private VehicleRepo vehicleRepo;

    @GetMapping(value = "/getAllVehicles")
    public List<Vehicle> getAllVehicles(){
        return vehicleRepo.findAll();
    }

    @GetMapping(value = "getVehicleById/{id}")
    public Vehicle getVehicleById(@PathVariable long id){
        return vehicleRepo.findById(id).get();
    }

    @PostMapping(value = "/saveNewVehicle")
    public long saveNewVehicle(@RequestBody Vehicle vehicle){
        long id = vehicleRepo.save(vehicle).getId();
        return id;
    }

    @PutMapping(value = "/updateVehicle/{id}")
    public String updateVehicleById(@PathVariable long id, @RequestBody Vehicle vehicle){
        Vehicle vehicleToUpdate = vehicleRepo.findById(id).get();
        vehicleToUpdate.setVehicleRegistration(vehicle.getVehicleRegistration());
        vehicleToUpdate.setVehicleModel(vehicle.getVehicleModel());
        vehicleToUpdate.setVehicleMake(vehicle.getVehicleMake());
        vehicleToUpdate.setVehicleEngine(vehicle.getVehicleEngine());
        vehicleToUpdate.setVehicleTrim(vehicle.getVehicleTrim());
        vehicleToUpdate.setVehicleBodyType(vehicle.getVehicleBodyType());
        vehicleToUpdate.setVehicleEngineNumber(vehicle.getVehicleEngineNumber());
        vehicleToUpdate.setVehicleVIN(vehicle.getVehicleVIN());
        vehicleToUpdate.setVehicleMileage(vehicle.getVehicleMileage());
        vehicleToUpdate.setVehicleRegistrationDate(vehicle.getVehicleRegistrationDate());
        vehicleToUpdate.setVehiclePaintColour(vehicle.getVehiclePaintColour());
        vehicleToUpdate.setVehiclePaintReference(vehicle.getVehiclePaintReference());
        vehicleToUpdate.setVehicleRadioSecurityCode(vehicle.getVehicleRadioSecurityCode());
        return "Vehicle updated successfully!";
    }

    @DeleteMapping(value = "/deleteVehicle/{id}")
    public String deleteVehicleById(@PathVariable long id){
        vehicleRepo.delete(vehicleRepo.findById(id).get());
        return "Vehicle deleted successfully!";
    }
}
