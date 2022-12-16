package com.genspringboot.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.genspringboot.project.model.CarSell;
import com.genspringboot.project.repository.CarSellRepository;

@Service
@Transactional
public class CarSellService {

    private CarSellRepository  carSellRepository;

    public CarSellService(CarSellRepository carSellRepository){
        this.carSellRepository = carSellRepository;
    }

    public void saveCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }
    public void updateCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }

    public List<CarSell> findAllCarSell(){
        return carSellRepository.findAll();
    }

    public List<CarSell> findAllCarSellCantidad (int cantidad){
        return carSellRepository.findAllCarSellCant(cantidad);
    }


    


    
}
