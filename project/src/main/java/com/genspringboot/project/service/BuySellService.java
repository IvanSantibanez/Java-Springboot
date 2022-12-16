package com.genspringboot.project.service;


import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.genspringboot.project.model.BuySell;
import com.genspringboot.project.repository.BuySellRepository;

@Service
@Transactional
public class BuySellService {


    private BuySellRepository  buySellRepository;

    public BuySellService(BuySellRepository buySellRepository){
        this.buySellRepository = buySellRepository;
    }


    public void saveBuySell(BuySell buySell){
        buySellRepository.save(buySell);
    }
    public void updateBuySell(BuySell buySell){
        buySellRepository.save(buySell);
    }

    public List<BuySell> findAllBuySell(){
        return buySellRepository.findAll();
    }

    public List<BuySell> findAllBuySellMonto (int monto){
        return buySellRepository.findAllbuySellMonto(monto);
    }

    public List<BuySell> findAllBuySellfechaCompra(Date fechaCompra){
        return buySellRepository.findAllBuySellfechaCompra(fechaCompra);
    }



  


    
}
