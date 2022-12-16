package com.genspringboot.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



// Le ponemos el nombre a nuestra tabla en la base de datos
@Entity(name = "User")
public class User {

    // Especificamos a la base q el siguiente atributo será el id de la tabla
    @Id
    // Generamos la llave primaria
    @GeneratedValue
    // Definimos el atributo id
    private int id;
    private String name;
    // Cambiamos el nombre del atributo en la base de datos
    @Column(name="last_name")
    private String lastName;
    // @column(name= "correo", unique = "true" para q un atributo sea único y no se pueda repetir
    private String correo;

    //relación one to one
    //@JsonBackReference
    // LAZY se usa cuando de se va a enviar una relacion one to one
    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private License license;

    //Relación one to many
    //@JsonBackReference
    // En las relaciones one to many el tipo de fetch, siempre se hace con EAGER
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL, fetch =FetchType.EAGER)
    private List<BuySell> buySell;


    public User() {
    }

    public User(int id, String name, String lastName, String correo) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    

    

    
    
}
