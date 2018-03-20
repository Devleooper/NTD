/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.MarketPlaceKonrad.persistence;

import co.edu.konrad.MarketPlaceKonrad.entities.ProductoEntity;
import co.edu.konrad.MarketPlaceKonrad.entities.UsuarioEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Leonardo Ruiz
 * Manejador de la tabla usuario
 */
@Stateless
public class ProductoPersistence {
    @PersistenceContext(unitName = "MarketPlacePU")
    protected EntityManager em;
    
    /**
     * Obtener todos los productos de la tabla Producto
     * @return todos los productos de la tabla Producto
     *  
     * 
     */
     public List <UsuarioEntity> findAll(){
        Query todos = em.createQuery("select pe from ProductoEntity pe");
        return todos.getResultList();
    }
          
     /**
     * Obtener un producto a partir de su id
     * @param id
     * @return elemento encontrado
     */
    public ProductoEntity find(Long id){
        ProductoEntity producto = em.find(ProductoEntity.class, id);
        return producto;
    }
    
     /**
     * Crear un objeto de la entidad Producto
     * @param ProductoNuevo
     * @return Objeto creado
     */
    public ProductoEntity create(ProductoEntity ProductoNuevo){
        em.persist(ProductoNuevo);
        return ProductoNuevo;
    }
    
     /**
     * Actualizar un objeto de la entidad Producto
     * @param ProductoActualizar 
     * @return objeto actualizado
     */
    public ProductoEntity update(ProductoEntity ProductoActualizar){
        return em.merge(ProductoActualizar);
    }
    
    /**
     * Eliminar un objeto de la entidad Producto apartir de su Id
     * @param id 
     */
    public void delete(Long id){
        ProductoEntity ProductoBorrar = em.find(ProductoEntity.class, id);
        em.remove(ProductoBorrar);
    }
    
}