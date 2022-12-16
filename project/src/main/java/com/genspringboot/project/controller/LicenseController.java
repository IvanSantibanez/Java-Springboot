package com.genspringboot.project.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.project.model.License;
import com.genspringboot.project.service.LicenseService;

@RestController
@CrossOrigin("*")
public class LicenseController {

    private LicenseService licenseService;

    public LicenseController (@Autowired LicenseService licenseService){
        this.licenseService = licenseService;
    }

    @PostMapping (value ="/License/save", consumes = {"application/json"}
    )
    public void guardarLicencia(@RequestBody License license){
        licenseService.saveLicense(license);
    }

    @PutMapping ("/License/update")
    public void actualizarLicencia (@RequestBody License license){
        licenseService.updateLicense(license);
    }

    @GetMapping ("/License/findAll")
    public List<License> todasLasLicencias(){
        return licenseService.findAllLicense();
    }

    @GetMapping ("/License/buscarPorClase/{clase}")
    public List<License> buscarClase (@PathVariable String clase){
        return licenseService.buscarPorClase(clase);
    }

    @GetMapping ("/License/buscarPorEstado/{estado}")
    public List<License> buscarEstado (@PathVariable String estado){
        return licenseService.buscarPorEstado(estado);
    }

    @GetMapping ("/License/buscarPorFechaVenc")
    public List<License> buscarFechaVenc (@RequestBody Date fechaVencimiento){
        return licenseService.buscarPorFechaVenc(fechaVencimiento);
    }

    @DeleteMapping("/License/eliminarLicencia/{id}")
    public void eliminarLicencia(@PathVariable Integer id){
        licenseService.eliminarLicencia(id);
    }
    
}
