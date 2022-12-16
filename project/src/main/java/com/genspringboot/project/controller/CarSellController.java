package com.genspringboot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.project.model.CarSell;
import com.genspringboot.project.service.CarSellService;

@RestController
@CrossOrigin("*")
public class CarSellController {


    private CarSellService carSellService;

    public CarSellController(@Autowired CarSellService carSellService){
        this.carSellService = carSellService;
    }

    @PostMapping("/CarSell/save")
    public void guardarAutosVendidos(@RequestBody CarSell carSell){
        carSellService.saveCarSell(carSell);
    }

    @PutMapping("/CarSell/update")
    public void actualizarAutosVendidos(@RequestBody CarSell carSell){
        carSellService.updateCarSell(carSell);
    }

    @GetMapping("/CarSell/findAll")
    public List<CarSell> todosLosAutosVendidos(){
        return carSellService.findAllCarSell();
    }

    @GetMapping("/CarSell/buscarCantidad/{cantidad}")
    public List<CarSell> buscarAutosVendidosCant(@PathVariable int cantidad){
        return carSellService.findAllCarSellCantidad(cantidad);
    }



    
}
