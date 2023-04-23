package com.parking.apiparking.controller;

import com.parking.apiparking.services.ParkingService;
import com.parking.apiparking.entities.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parking") //parking => url
public class ParkingController {

    //Inyeccion de Dependecias => instancia => new ParkingService();

   private final  ParkingService parkingService;

   public ParkingController(ParkingService parkingService){

       this.parkingService = parkingService;

   }

    //http://dominio/parking/cars
@GetMapping("/cars")
        public ResponseEntity<List<Car>> getAllCars(){

            return ResponseEntity.ok(this.parkingService.getAllCars());

    }

    @GetMapping("/cars")
    public ResponseEntity<Car> addCar(Car car){

      this.parkingService.addCar(car);

      return new ResponseEntity<>(car, HttpStatus.CREATED);

    }



}
