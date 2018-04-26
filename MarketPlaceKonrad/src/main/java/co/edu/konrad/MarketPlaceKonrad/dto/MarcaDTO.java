/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.MarketPlaceKonrad.dto;

import co.edu.konrad.MarketPlaceKonrad.entities.MarcaEntity;

/**
 *
 * @author Manuel S. Nino
 */
class MarcaDTO {
    
    private Long codMarca;
    
    private String nomMarca;
    
    public MarcaDTO(MarcaEntity marca){
    this.codMarca = marca.getCodMarca();
    this.nomMarca = marca.getNomMarca();
    }
}
