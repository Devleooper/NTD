/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.MarketPlaceKonrad.dto;

import co.edu.konrad.MarketPlaceKonrad.entities.MarcaEntity;
import co.edu.konrad.MarketPlaceKonrad.entities.ProductoEntity;
import co.edu.konrad.MarketPlaceKonrad.entities.TipoProductoEntity;

/**
 *
 * @author Juan
 */
public class ProductoDTO {

    /**
     * Variables tipo DTO
     *
     */
    private Long codProducto;
    private double valorUnitario;
    private int garantia;
    private int stockDisponible;
    private TipoProductoDTO tipoProducto;
    private MarcaDTO marca;
    private ProovedorDTO proveedor;

    public ProductoDTO(ProductoEntity producto) {
        this.codProducto = producto.getCodProducto();
        this.valorUnitario = producto.getValorUnitario();
        this.garantia = producto.getGarantia();
        this.stockDisponible = producto.getGarantia();
        if (producto.getTipoProducto() != null) {
            this.tipoProducto = new TipoProductoDTO(producto.getTipoProducto());
        }
        if (producto.getMarca() != null) {
            this.marca = new MarcaDTO(producto.getMarca());
        }
        if (producto.getProovedor() != null) {
            this.proveedor = new ProovedorDTO(producto.getProovedor());
        }
    }

}
