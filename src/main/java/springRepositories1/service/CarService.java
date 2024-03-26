package springRepositories1.service;

import springRepositories1.entity.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> listOfCar = new ArrayList<>();
    public Car addCar(Car car){
        listOfCar.add(car);
        return car;
    }
    public Car removeCar(Integer id){
        Car carDeleted = new Car();
        for (Car cars : listOfCar){
            if(cars.getId().equals(id)){
                listOfCar.remove(cars);
                carDeleted = cars;
            }
        }
        return carDeleted;
    }
    public Car returnCarById(Integer id){
        Car carsFound = new Car();
        for (Car cars : listOfCar){
            if(cars.getId().equals(id)){
                carsFound = cars;
            }
        }
        return carsFound;
    }
    public List<Car> returnAllCars(){
        return listOfCar;
    }
    public Car updateCars(Car carToUpdate, Integer id){
        Car carUpdated = new Car();
        for (Car cars: listOfCar){
            if(cars.getId().equals(id)){
                cars.setId(carToUpdate.getId());
                cars.setCurrentPrice(carToUpdate.getCurrentPrice());
                cars.setModelName(carToUpdate.getModelName());
                cars.setSerialNumber(carToUpdate.getSerialNumber());
                carUpdated = cars;
            }
        }
        return carUpdated;
    }}