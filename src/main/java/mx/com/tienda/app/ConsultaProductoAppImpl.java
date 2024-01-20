/**
 * 
 */
package mx.com.tienda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.tienda.dao.ProductosAbarroteDAO;
import mx.com.tienda.dao.ProductosAbarroteEntity;
import mx.com.tienda.vo.ProductosResponseVO;

/**
 * @author 1086600
 *
 */
@Service
public class ConsultaProductoAppImpl implements ConsultaProductoApp{
	@Autowired
	private ProductosAbarroteDAO abarroteDao;

	@Override
	public ProductosAbarroteEntity consultaProductosPorId(String id) {
//		abarroteDao.findById(null);
		ProductosAbarroteEntity resCons = abarroteDao.findbyskuDao(id);
		
//		return abarroteDao.findById(id);
		return resCons;
	}

	@Override
	public List<ProductosResponseVO> consultaProductos() {
		List<ProductosAbarroteEntity> lisRes = abarroteDao.findAll();
		List<ProductosResponseVO> resProde = new ArrayList<>();
		lisRes.forEach(a -> {
			ProductosResponseVO resProd = new ProductosResponseVO(a.getNombreProducto(),
					a.getSku(),
					a.getStock().toString(),
					a.getPrecioCompra().toString(),
					a.getPrecioVenta().toString());
			resProde.add(resProd);
		});
		return resProde;
	}

//	public List<ProductosResponseVO> consultaProductos() {
//		List<ProductosAbarroteEntity> lisRes = abarroteDao.findAll();
//		List<ProductosResponseVO> resProde = new ArrayList<>();
//		lisRes.forEach(a -> {
//			ProductosResponseVO resProd = new ProductosResponseVO(a.getNombreProducto(),
//					a.getSku(),
//					a.getStock().toString(),
//					a.getPrecioCompra().toString(),
//					a.getPrecioVenta().toString());
//			resProde.add(resProd);
//		});
//		return resProde;
//	}

}
