package co.edu.konrad.MarketPlaceKonrad.entities;

import co.edu.konrad.MarketPlaceKonrad.entities.MarcaEntity;
import co.edu.konrad.MarketPlaceKonrad.entities.ProovedorEntity;
import co.edu.konrad.MarketPlaceKonrad.entities.TipoProductoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-30T21:01:37")
@StaticMetamodel(ProductoEntity.class)
public class ProductoEntity_ { 

    public static volatile SingularAttribute<ProductoEntity, MarcaEntity> marca;
    public static volatile SingularAttribute<ProductoEntity, Long> codProducto;
    public static volatile SingularAttribute<ProductoEntity, TipoProductoEntity> tipoProducto;
    public static volatile SingularAttribute<ProductoEntity, ProovedorEntity> proovedor;
    public static volatile SingularAttribute<ProductoEntity, String> nomProducto;
    public static volatile SingularAttribute<ProductoEntity, Integer> stockDisponible;
    public static volatile SingularAttribute<ProductoEntity, Double> valorUnitario;
    public static volatile SingularAttribute<ProductoEntity, Integer> garantia;

}