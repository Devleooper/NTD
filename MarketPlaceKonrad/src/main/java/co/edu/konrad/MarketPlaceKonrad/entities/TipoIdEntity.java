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
 * tabla tipo_id
 */
@Entity(name = "tipo_id")
public class TipoIdEntity implements Serializable{
    
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_id", unique = true, nullable = false)
    private Long idtipoID;
    
    @Column(name ="nom_tipo" ,nullable = false , unique= true)
    private String nomTipoId;

    public Long getIdtipoID() {
        return idtipoID;
    }

    public void setIdtipoID(Long idtipoID) {
        this.idtipoID = idtipoID;
    }

    public String getNomTipoId() {
        return nomTipoId;
    }

    public void setNomTipoId(String nomTipoId) {
        this.nomTipoId = nomTipoId;
    }
    
}
