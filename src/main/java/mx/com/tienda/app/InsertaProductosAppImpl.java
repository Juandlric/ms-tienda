/**
 * 
 */
package mx.com.tienda.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.tienda.dao.ProductosAbarroteDAO;
import mx.com.tienda.vo.ProductosRequestVO;

/**
 * @author 1086600
 *
 */
@Service
public class InsertaProductosAppImpl implements InsertaProductosApp{
	@Autowired
	private ProductosAbarroteDAO abarroteDao;

	@Override
	public String insertaProductos(List<ProductosRequestVO> productosRequestVo) {
		productosRequestVo.forEach(a -> {
			ProductosRequestVO request = new ProductosRequestVO();
			request.setCantidad(a.getCantidad());
			request.setSku(a.getSku());
			int mod = abarroteDao.modificaStokc(abarroteDao.findStockBySku(a.getSku())-a.getCantidad(), a.getSku());
//			Long sku = abarroteDao.findStockBySku(a.getSku());
			System.out.println(mod);
		});
		return "actualización exitosa";
	}

}
