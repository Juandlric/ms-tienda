package mx.com.tienda.app;

import java.util.List;

import mx.com.tienda.vo.ProductosRequestVO;

public interface InsertaProductosApp {
	
	public String insertaProductos(List<ProductosRequestVO> productosRequestVo);

}
