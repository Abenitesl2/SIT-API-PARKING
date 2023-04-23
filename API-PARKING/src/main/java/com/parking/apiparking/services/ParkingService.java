package com.parking.apiparking.services;

import com.parking.apiparking.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {
    private List<Car> parkingLot;


    public ParkingService(){

        this.parkingLot = new ArrayList<>();


    }

    public List<Car> getAllCars(){

        return this.parkingLot;

    }

    public void addCar(Car car){

        this.parkingLot.add(car);


    }


}
