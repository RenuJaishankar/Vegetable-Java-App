package com.example.demo.Repository;

import com.example.demo.Model.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetableRepository extends JpaRepository<Vegetable,Long>{
}
