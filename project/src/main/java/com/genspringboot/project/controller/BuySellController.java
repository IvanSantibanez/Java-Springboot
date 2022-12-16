package com.genspringboot.project.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.project.model.BuySell;
import com.genspringboot.project.service.BuySellService;

@RestController
@CrossOrigin("*")
public class BuySellController {

    private BuySellService buySellService;

    public BuySellController(@Autowired BuySellService buySellService){
        this.buySellService = buySellService;
    }


    @PostMapping("/BuySell/save")
    public void guardarAuto(@RequestBody BuySell buySell){
        buySellService.saveBuySell(buySell);
    }

    @PutMapping("/BuySell/update")
    public void actualizarAuto(@RequestBody BuySell buySell){
        buySellService.updateBuySell(buySell);
    }

    @GetMapping("/BuySell/findAll")
    public List<BuySell> todosLosAutos(){
        return buySellService.findAllBuySell();
    }

    @GetMapping("/BuySell/buscarMonto/")
    public List<BuySell> buscarMonto(@RequestBody int monto){
        return buySellService.findAllBuySellMonto(monto);
    }

    @GetMapping("/BuySell/buscarFechaCompra/")
    public List<BuySell> buscarFechaCompra(@RequestBody Date fechaCompra){
        return buySellService.findAllBuySellfechaCompra(fechaCompra);
    }





    
}
