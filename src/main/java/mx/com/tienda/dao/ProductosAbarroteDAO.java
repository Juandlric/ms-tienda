/**
 * 
 */
package mx.com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

	@Query(value = "SELECT STOCK "
			+ "FROM PRODUCTO "
			+ "WHERE SKU = :sku", nativeQuery = true)
	Long findStockBySku(@Param("sku") String sku); 
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE PRODUCTO "
			+ "SET STOCK = :stock "
			+ "WHERE SKU = :sku", nativeQuery = true)
	int modificaStokc(@Param("stock") Long stock,
			@Param("sku") String sku);
}
