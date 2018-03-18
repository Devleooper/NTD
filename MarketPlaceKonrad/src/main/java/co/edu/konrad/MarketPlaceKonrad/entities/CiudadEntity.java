/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.MarketPlaceKonrad.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Leonardo Ruiz
 * tabla ciudad
 */
@Entity(name ="Ciudad")
public class CiudadEntity implements Serializable{
    
    private final static long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_ciudad" , nullable = false , unique = true)
    private Long idCiudad;
    
    
    @Column(name = "nom_ciudad" , nullable = false)
    private String nomCiudad;
    /**
     * Relacion muchos a uno con la tabla pais
     */
    @ManyToOne
    @JoinColumn(name = "id_pais")
    private PaisEntity pais;

    public PaisEntity getPais() {
        return pais;
    }

    public void setPais(PaisEntity pais) {
        this.pais = pais;
    }

    public Long getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Long idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }
    
    
}
