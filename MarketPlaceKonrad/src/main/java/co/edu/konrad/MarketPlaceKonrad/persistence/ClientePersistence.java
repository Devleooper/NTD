/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.MarketPlaceKonrad.persistence;

import co.edu.konrad.MarketPlaceKonrad.entities.ClienteEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Leonardo Ruiz
 * Manejador de la tabla cliente
 */
@Stateless
public class ClientePersistence {
    @PersistenceContext(unitName = "MarketPlacePU")
    protected EntityManager em;
    
    /**
     * Obtener todos los elementos de la tabla cliente
     * @return todos los elementos de la tabla cliente
     *  
     * 
     */
     public List <ClienteEntity> findAll(){
        Query todos = em.createQuery("select ec from ClienteEntity ec");
        return todos.getResultList();
    }
     
     
     /**
     * Obtener un elemento a partir de su id
     * @param id
     * @return elemento encontrado
     */
    public ClienteEntity find(Long id){
        ClienteEntity Cli = em.find(ClienteEntity.class, id);
        return Cli;
    }
    
     /**
     * Crear un objeto de la entidad Cliente
     * @param ClienteNuevo
     * @return Objeto creado
     */
    public ClienteEntity create(ClienteEntity ClienteNuevo){
        em.persist(ClienteNuevo);
        return ClienteNuevo;
    }
    
     /**
     * Actualizar un objeto de la entidad Cliente
     * @param ClienteActualizar 
     * @return objeto actualizado
     */
    public ClienteEntity update(ClienteEntity ClienteActualizar){
        return em.merge(ClienteActualizar);
    }
    
    /**
     * Eliminar un objeto determinado de la entidad Cliente
     * @param id 
     */
    public void delete(Long id){
        ClienteEntity ClienteBorrar = em.find(ClienteEntity.class, id);
        em.remove(ClienteBorrar);
    }
    
}
