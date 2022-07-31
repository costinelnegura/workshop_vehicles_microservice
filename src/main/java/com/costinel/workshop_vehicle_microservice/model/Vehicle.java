package com.costinel.workshop_vehicle_microservice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long Id;

    @Column
    String vehicleRegistration;

    @Column
    String vehicleModel;

    @Column
    String vehicleMake;

    @Column
    String vehicleEngine;

    @Column
    String vehicleTrim;

    @Column
    String vehicleBodyType;

    @Column
    int vehicleEngineNumber;

    @Column
    String vehicleVIN;

    @Column
    int vehicleMileage;

    @Column
    String vehicleRegistrationDate;

    @Column
    String vehiclePaintColour;

    @Column
    String vehiclePaintReference;

    @Column
    int vehicleRadioSecurityCode;

    public Vehicle(long id, String vehicleRegistration, String vehicleModel, String vehicleMake, String vehicleEngine, String vehicleTrim, String vehicleBodyType, int vehicleEngineNumber, String vehicleVIN, int vehicleMileage, String vehicleRegistrationDate, String vehiclePaintColour, String vehiclePaintReference, int vehicleRadioSecurityCode) {
        Id = id;
        this.vehicleRegistration = vehicleRegistration;
        this.vehicleModel = vehicleModel;
        this.vehicleMake = vehicleMake;
        this.vehicleEngine = vehicleEngine;
        this.vehicleTrim = vehicleTrim;
        this.vehicleBodyType = vehicleBodyType;
        this.vehicleEngineNumber = vehicleEngineNumber;
        this.vehicleVIN = vehicleVIN;
        this.vehicleMileage = vehicleMileage;
        this.vehicleRegistrationDate = vehicleRegistrationDate;
        this.vehiclePaintColour = vehiclePaintColour;
        this.vehiclePaintReference = vehiclePaintReference;
        this.vehicleRadioSecurityCode = vehicleRadioSecurityCode;
    }

    public Vehicle() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleEngine() {
        return vehicleEngine;
    }

    public void setVehicleEngine(String vehicleEngine) {
        this.vehicleEngine = vehicleEngine;
    }

    public String getVehicleTrim() {
        return vehicleTrim;
    }

    public void setVehicleTrim(String vehicleTrim) {
        this.vehicleTrim = vehicleTrim;
    }

    public String getVehicleBodyType() {
        return vehicleBodyType;
    }

    public void setVehicleBodyType(String vehicleBodyType) {
        this.vehicleBodyType = vehicleBodyType;
    }

    public int getVehicleEngineNumber() {
        return vehicleEngineNumber;
    }

    public void setVehicleEngineNumber(int vehicleEngineNumber) {
        this.vehicleEngineNumber = vehicleEngineNumber;
    }

    public String getVehicleVIN() {
        return vehicleVIN;
    }

    public void setVehicleVIN(String vehicleVIN) {
        this.vehicleVIN = vehicleVIN;
    }

    public int getVehicleMileage() {
        return vehicleMileage;
    }

    public void setVehicleMileage(int vehicleMileage) {
        this.vehicleMileage = vehicleMileage;
    }

    public String getVehicleRegistrationDate() {
        return vehicleRegistrationDate;
    }

    public void setVehicleRegistrationDate(String vehicleRegistrationDate) {
        this.vehicleRegistrationDate = vehicleRegistrationDate;
    }

    public String getVehiclePaintColour() {
        return vehiclePaintColour;
    }

    public void setVehiclePaintColour(String vehiclePaintColour) {
        this.vehiclePaintColour = vehiclePaintColour;
    }

    public String getVehiclePaintReference() {
        return vehiclePaintReference;
    }

    public void setVehiclePaintReference(String vehiclePaintReference) {
        this.vehiclePaintReference = vehiclePaintReference;
    }

    public int getVehicleRadioSecurityCode() {
        return vehicleRadioSecurityCode;
    }

    public void setVehicleRadioSecurityCode(int vehicleRadioSecurityCode) {
        this.vehicleRadioSecurityCode = vehicleRadioSecurityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Id == vehicle.Id && vehicleEngineNumber == vehicle.vehicleEngineNumber && vehicleMileage == vehicle.vehicleMileage && vehicleRadioSecurityCode == vehicle.vehicleRadioSecurityCode && Objects.equals(vehicleRegistration, vehicle.vehicleRegistration) && Objects.equals(vehicleModel, vehicle.vehicleModel) && Objects.equals(vehicleMake, vehicle.vehicleMake) && Objects.equals(vehicleEngine, vehicle.vehicleEngine) && Objects.equals(vehicleTrim, vehicle.vehicleTrim) && Objects.equals(vehicleBodyType, vehicle.vehicleBodyType) && Objects.equals(vehicleVIN, vehicle.vehicleVIN) && Objects.equals(vehicleRegistrationDate, vehicle.vehicleRegistrationDate) && Objects.equals(vehiclePaintColour, vehicle.vehiclePaintColour) && Objects.equals(vehiclePaintReference, vehicle.vehiclePaintReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, vehicleRegistration, vehicleModel, vehicleMake, vehicleEngine, vehicleTrim, vehicleBodyType, vehicleEngineNumber, vehicleVIN, vehicleMileage, vehicleRegistrationDate, vehiclePaintColour, vehiclePaintReference, vehicleRadioSecurityCode);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Id=" + Id +
                ", vehicleRegistration='" + vehicleRegistration + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleMake='" + vehicleMake + '\'' +
                ", vehicleEngine='" + vehicleEngine + '\'' +
                ", vehicleTrim='" + vehicleTrim + '\'' +
                ", vehicleBodyType='" + vehicleBodyType + '\'' +
                ", vehicleEngineNumber=" + vehicleEngineNumber +
                ", vehicleVIN='" + vehicleVIN + '\'' +
                ", vehicleMileage=" + vehicleMileage +
                ", vehicleRegistrationDate='" + vehicleRegistrationDate + '\'' +
                ", vehiclePaintColour='" + vehiclePaintColour + '\'' +
                ", vehiclePaintReference='" + vehiclePaintReference + '\'' +
                ", vehicleRadioSecurityCode=" + vehicleRadioSecurityCode +
                '}';
    }
}
