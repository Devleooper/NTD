/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.MarketPlaceKonrad.persistence;
import co.edu.konrad.MarketPlaceKonrad.entities.CategoriaProductoEntity;
    import java.util.List;
    import javax.ejb.Stateless;
    import javax.persistence.EntityManager;
    import javax.persistence.PersistenceContext;
    import javax.persistence.Query;
/**
 *
 * @author Manuel S. Nino
 */
@Stateless
public class CategoriaProductoPersistece {
    @PersistenceContext (unitName = "MarketPlacePU")
    protected EntityManager em;
    /**
     * Obtener todos los elementos de la tabla CategoriaProducto
     */
        public List <CategoriaProductoEntity> finAll (){
        Query todos = em.createQuery("select cpe CategoriaProductoEntity cpe");
        return todos;    
    }
    /**
     * Obtener un elemento por su id
     * @param id
     * @return Elemento correspondiente al id
     */

    
}
