package com.example.demo.Controller;

import com.example.demo.Model.Vegetable;
import com.example.demo.Service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RequestMapping("/api")
@RestController
public class VegetableController {
  @Autowired
  VegetableService vegetableService;

    @GetMapping("/{id}")
      public Optional<Vegetable> getVegetable(@PathVariable Long id){
          return vegetableService.getVegetable(id);
    }
    @GetMapping("/")
       public List<Vegetable> getAllVegetables(){
        return vegetableService.getAllVegetables();
    }
     @PutMapping("/{id}")
        public Optional<Vegetable> updateVegetable(@RequestBody Vegetable newVegetable,Long id){
        return vegetableService.updateVegetable(newVegetable,id);
     }


}
