/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.MarketPlaceKonrad.dto;

import co.edu.konrad.MarketPlaceKonrad.entities.TipoProductoEntity;

/**
 *
 * @author Juan
 */
class TipoProductoDTO {
    
    private Long codTipoProducto;
    
    private String nomTipoProducto;
    
    private String descripcion;
    
    public TipoProductoDTO (TipoProductoEntity tipoProducto){
    this.codTipoProducto = tipoProducto.getCodTipo();
    this.nomTipoProducto = tipoProducto.getNomTipoProducto();
    this.descripcion = tipoProducto.getDescripcion();
    }
}
