/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.MarketPlaceKonrad.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
/**
 *
 * @author Manuel S. Nino
 */
@Entity (name = "Categoria")
public class CategoriaEntity implements Serializable{

     /**
     * Controlador de versiones
     * 
     */
    private final static Long serialVersionUID = 1L;
    /**
     * Codigo categoria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "cod_categoria")
    private Long codCategoria;
    
    /**
     * Nombre de la categoria
     */
    @Column (name = "nom_categoria")
    private String NomCategoria;
    /**
     * Descripcion de la categoria
     */
    @Column (name = "descripcion")
    private String descripcionCategoria;
    
        public Long getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(Long codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNomCategoria() {
        return NomCategoria;
    }

    public void setNomCategoria(String NomCategoria) {
        this.NomCategoria = NomCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }
}
