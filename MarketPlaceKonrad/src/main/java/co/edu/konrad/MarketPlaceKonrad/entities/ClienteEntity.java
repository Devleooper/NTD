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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Leonardo Ruiz tabla cliente
 */
@Entity(name = "Cliente")
public class ClienteEntity implements Serializable {

    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cliente", unique = true, nullable = false)
    private Long idCliente;

    @Column(name = "nom_cliente")
    private String nombreCliente;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    @Column(name = "Tel_cliente")
    private int TelefonoCliente;
    @Column(name = "Mail_cliente")
    private String Mailcliente;
    //cedula del cliente , debe ser unica 
    @Column(name = "cc_cliente", unique = true, nullable = false)
    private int cedulaCliente;
    //direccion del cliente , no puede ser nula para el envio
    @Column(name = "dir_cliente", unique = true, nullable = false)
    private String dirCliente;
    /**
     * Relacion muchos a uno con la tabla ciudad
     */
    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private CiudadEntity ciudad;
    /**
     * Relacion muchos a uno con la tabla de tipo de identificacion - tipo_id
     */
    @ManyToOne
    @JoinColumn(name = "id_tipo_id")
    private TipoIdEntity tipoId;

    public CiudadEntity getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadEntity ciudad) {
        this.ciudad = ciudad;
    }

    public TipoIdEntity getTipoId() {
        return tipoId;
    }

    public void setTipoId(TipoIdEntity tipoId) {
        this.tipoId = tipoId;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefonoCliente() {
        return TelefonoCliente;
    }

    public void setTelefonoCliente(int TelefonoCliente) {
        this.TelefonoCliente = TelefonoCliente;
    }

    public String getMailcliente() {
        return Mailcliente;
    }

    public void setMailcliente(String Mailcliente) {
        this.Mailcliente = Mailcliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getDirCliente() {
        return dirCliente;
    }

    public void setDirCliente(String dirCliente) {
        this.dirCliente = dirCliente;
    }

}
