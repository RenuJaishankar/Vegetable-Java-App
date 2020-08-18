package com.example.demo.Service;

import com.example.demo.Model.Vegetable;
import com.example.demo.Repository.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VegetableService {
    @Autowired
    VegetableRepository vegetableRepository;

    public void createVegetable(Vegetable vegetable){
        vegetableRepository.save(vegetable);
    }
    public Optional<Vegetable> getVegetable(Long id){
        return vegetableRepository.findById(id);

    }

    public List<Vegetable> getAllVegetables(){
        return vegetableRepository.findAll();
    }

    public Optional<Vegetable> updateVegetable(Vegetable newVegetable,Long id){
            vegetableRepository.findById(id).map(vegetable-> {vegetable.setName(newVegetable.getName();
                             vegetable.setEmoji(newVegetable.getEmoji());
                             vegetable.setColor(newVegetable.getColor());
                                     return vegetableRepository.save(vegetable);
                    });
                                     return vegetableRepository.findById(id);
    }

    public void deleteVegetable(Long id){
           vegetableRepository.deleteById(id);
     }
}