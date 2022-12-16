package com.genspringboot.project.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.genspringboot.project.model.BuySell;

public interface BuySellRepository extends JpaRepository <BuySell,Integer>{

    @Query(value = "SELECT * FROM buySell WHERE monto = ?1",nativeQuery = true)
    List<BuySell> findAllbuySellMonto (int monto);

    @Query(value = "SELECT * FROM buySell WHERE fechaCompra = ?1",nativeQuery = true)
    List<BuySell> findAllBuySellfechaCompra (Date fechaCompra);
    
    
}
