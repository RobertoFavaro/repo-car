package com.develhope.repositorueses.springRepositories1.repositories;

import com.develhope.repositorueses.springRepositories1.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {
}
