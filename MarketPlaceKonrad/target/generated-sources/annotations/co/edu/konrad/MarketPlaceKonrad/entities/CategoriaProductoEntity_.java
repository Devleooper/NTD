package co.edu.konrad.MarketPlaceKonrad.entities;

import co.edu.konrad.MarketPlaceKonrad.entities.CategoriaEntity;
import co.edu.konrad.MarketPlaceKonrad.entities.ProductoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-31T12:46:12")
@StaticMetamodel(CategoriaProductoEntity.class)
public class CategoriaProductoEntity_ { 

    public static volatile SingularAttribute<CategoriaProductoEntity, Long> codCategoriaProducto;
    public static volatile SingularAttribute<CategoriaProductoEntity, CategoriaEntity> codCategoria;
    public static volatile SingularAttribute<CategoriaProductoEntity, ProductoEntity> producto;

}