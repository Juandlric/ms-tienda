/**
 * 
 */
package mx.com.tienda.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.tienda.vo.ProductosResponseVO;

/**
 * @author 1086600	
 *
 */
@Repository
public interface ProductosAbarroteDAO extends JpaRepository<ProductosAbarroteEntity, Long>{
	
	@Query(value = "SELECT * "
			+ "FROM PRODUCTO "
			+ "WHERE SKU = :sku", nativeQuery = true)
	ProductosAbarroteEntity findbyskuDao(@Param("sku") String sku);

}
