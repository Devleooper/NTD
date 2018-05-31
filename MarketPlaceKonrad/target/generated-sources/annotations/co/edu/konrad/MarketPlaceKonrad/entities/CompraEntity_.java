package co.edu.konrad.MarketPlaceKonrad.entities;

import co.edu.konrad.MarketPlaceKonrad.entities.ProductoEntity;
import co.edu.konrad.MarketPlaceKonrad.entities.ResidenciaEntity;
import co.edu.konrad.MarketPlaceKonrad.entities.TarjetaUsuarioEntity;
import co.edu.konrad.MarketPlaceKonrad.entities.UsuarioEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-31T12:26:53")
@StaticMetamodel(CompraEntity.class)
public class CompraEntity_ { 

    public static volatile SingularAttribute<CompraEntity, ResidenciaEntity> residencia;
    public static volatile SingularAttribute<CompraEntity, Long> codCompra;
    public static volatile SingularAttribute<CompraEntity, String> valoracion;
    public static volatile SingularAttribute<CompraEntity, UsuarioEntity> usuario;
    public static volatile SingularAttribute<CompraEntity, ProductoEntity> producto;
    public static volatile SingularAttribute<CompraEntity, TarjetaUsuarioEntity> tarjeta;

}