package com.example.demo;

import com.example.demo.Model.Vegetable;
import com.example.demo.Repository.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
@Autowired
    VegetableRepository vegetableRepository;
@Override
public void run(String...args) throws Exception{
vegetableRepository.save(new Vegetable("Avocodo","\uD83E\uDD51"      ,"green")) ;
vegetableRepository.save(new Vegetable("Carrot","\uD83E\uDD55","orange"));
    vegetableRepository.save(new Vegetable("Pepper","\uD83C\uDF36️"      ,"Red"));

}

}
