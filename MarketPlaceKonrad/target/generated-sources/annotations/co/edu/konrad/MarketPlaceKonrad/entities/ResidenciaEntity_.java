package co.edu.konrad.MarketPlaceKonrad.entities;

import co.edu.konrad.MarketPlaceKonrad.entities.CiudadEntity;
import co.edu.konrad.MarketPlaceKonrad.entities.UsuarioEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-31T12:26:53")
@StaticMetamodel(ResidenciaEntity.class)
public class ResidenciaEntity_ { 

    public static volatile SingularAttribute<ResidenciaEntity, String> nombreResidencia;
    public static volatile SingularAttribute<ResidenciaEntity, String> DireccionResidencia;
    public static volatile SingularAttribute<ResidenciaEntity, Long> codResidencia;
    public static volatile SingularAttribute<ResidenciaEntity, CiudadEntity> ciudad;
    public static volatile SingularAttribute<ResidenciaEntity, UsuarioEntity> usuario;

}