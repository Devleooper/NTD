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

/**
 *
 * @author Leonardo Ruiz
 * Tabla tipo_tarjeta
 */
@Entity(name = "tipo_tarjeta")
public class TipoTarjetaEntity implements Serializable {
    /**
     * Id de la tarjeta
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "cod_tipo_tarjeta" , nullable = false , unique  = true)
    private Long codTipotarjeta;
    /*
    Nombre de el tipo de tarjeta (debito o credito)
    */
    @Column(name = "nom_tipo_tarjeta" , nullable = false , unique = true)
    private String nombreTipoTarjeta;
    
    
    // Getters y Setters de la tabla tipo_tarjeta

    public Long getCodTipotarjeta() {
        return codTipotarjeta;
    }

    public void setCodTipotarjeta(Long codTipotarjeta) {
        this.codTipotarjeta = codTipotarjeta;
    }

    public String getNombreTipoTarjeta() {
        return nombreTipoTarjeta;
    }

    public void setNombreTipoTarjeta(String nombreTipoTarjeta) {
        this.nombreTipoTarjeta = nombreTipoTarjeta;
    }
    
}
