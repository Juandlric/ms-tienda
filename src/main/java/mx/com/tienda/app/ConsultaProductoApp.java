/**
 * 
 */
package mx.com.tienda.app;

import java.util.List;
import mx.com.tienda.dao.ProductosAbarroteEntity;
import mx.com.tienda.vo.ProductosResponseVO;

/**
 * @author 1086600
 *
 */
public interface ConsultaProductoApp {
	
	public List<ProductosResponseVO> consultaProductos();
	
	public ProductosAbarroteEntity consultaProductosPorId(String id);

}
