package com.genspringboot.project.service;


import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.genspringboot.project.model.License;
import com.genspringboot.project.repository.LicenseRepository;

@Service
@Transactional
public class LicenseService {

    private LicenseRepository licenseRepository;

    public LicenseService (LicenseRepository licenseRepository){
        this.licenseRepository = licenseRepository;
    }

    public void saveLicense(License license){
        licenseRepository.save(license);
    }

    public void updateLicense(License license){
        licenseRepository.save(license);
    }

    public List<License> findAllLicense(){
        return licenseRepository.findAll();
    }

    public List<License> buscarPorClase(String clase){
       return licenseRepository.findAllClase(clase);
    }

    public List<License> buscarPorEstado(String estado){
        return licenseRepository.findAllEstado(estado);
    }

    public List<License> buscarPorFechaVenc(Date fechaVencimiento){
        return licenseRepository.findAllFechaVencimiento(fechaVencimiento);
    }

    public void eliminarLicencia(Integer id){
        licenseRepository.deleteById(id);
    }

    
}
