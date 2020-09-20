package com.example.demo.Controller;

import com.example.demo.Model.Vegetable;
import com.example.demo.Service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;
@RequestMapping("/api/")
@RestController
public class VegetableController {
  @Autowired
  VegetableService vegetableService;

    @RequestMapping(value = "/", method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public RedirectView postFormAnimal( Vegetable vegetable){
        vegetableService.createVegetable(vegetable);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/");
        return redirectView;
    }





    @PostMapping("/")
     public void postVegetable(@RequestBody Vegetable vegetable){
        vegetableService.createVegetable(vegetable);

    }
    @GetMapping("/{id}")
      public Optional<Vegetable> getVegetable(@PathVariable Long id){
          return vegetableService.getVegetable(id);
    }
    @GetMapping("/")
       public List<Vegetable> getAllVegetables(){
        return vegetableService.getAllVegetables();
    }

    @RequestMapping("/a")
    public RedirectView localRedirect() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://www.yahoo.com");
        return redirectView;
    }

    @PutMapping("/{id}")
        public Optional<Vegetable> updateVegetable(@RequestBody Vegetable newVegetable,Long id){
        return vegetableService.updateVegetable(newVegetable,id);
     }
     @DeleteMapping("/{id}")
    public void deleteVegetable(@PathVariable Long id){
        vegetableService.deleteVegetable(id);
     }


}
