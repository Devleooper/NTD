package co.edu.konrad.MarketPlaceKonrad.entities;

import co.edu.konrad.MarketPlaceKonrad.entities.TipoTarjetaEntity;
import co.edu.konrad.MarketPlaceKonrad.entities.UsuarioEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-30T21:01:37")
@StaticMetamodel(TarjetaUsuarioEntity.class)
public class TarjetaUsuarioEntity_ { 

    public static volatile SingularAttribute<TarjetaUsuarioEntity, String> codClave;
    public static volatile SingularAttribute<TarjetaUsuarioEntity, String> numCuenta;
    public static volatile SingularAttribute<TarjetaUsuarioEntity, String> fecVencimiento;
    public static volatile SingularAttribute<TarjetaUsuarioEntity, TipoTarjetaEntity> tipoTarjeta;
    public static volatile SingularAttribute<TarjetaUsuarioEntity, String> numFranquicia;
    public static volatile SingularAttribute<TarjetaUsuarioEntity, Long> codTarjeta;
    public static volatile SingularAttribute<TarjetaUsuarioEntity, String> numTarjeta;
    public static volatile SingularAttribute<TarjetaUsuarioEntity, String> nomBanco;
    public static volatile SingularAttribute<TarjetaUsuarioEntity, UsuarioEntity> usuario;

}