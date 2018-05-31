package co.edu.konrad.MarketPlaceKonrad.entities;

import co.edu.konrad.MarketPlaceKonrad.entities.RolEntity;
import co.edu.konrad.MarketPlaceKonrad.entities.TipoDocumentoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-30T21:01:37")
@StaticMetamodel(UsuarioEntity.class)
public class UsuarioEntity_ { 

    public static volatile SingularAttribute<UsuarioEntity, Integer> TelefonoUsuario;
    public static volatile SingularAttribute<UsuarioEntity, TipoDocumentoEntity> tipoDocumento;
    public static volatile SingularAttribute<UsuarioEntity, String> apellidoUsuario;
    public static volatile SingularAttribute<UsuarioEntity, String> fechaNacimiento;
    public static volatile SingularAttribute<UsuarioEntity, Long> idUsuario;
    public static volatile SingularAttribute<UsuarioEntity, String> contraseñaUsuario;
    public static volatile SingularAttribute<UsuarioEntity, String> nombreUsuario;
    public static volatile SingularAttribute<UsuarioEntity, String> avatar;
    public static volatile SingularAttribute<UsuarioEntity, String> MailUsuario;
    public static volatile SingularAttribute<UsuarioEntity, RolEntity> rol;

}