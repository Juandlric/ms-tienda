package mx.com.tienda.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.com.tienda.app.ConsultaProductoApp;
import mx.com.tienda.app.InsertaProductosApp;
import mx.com.tienda.dao.ProductosAbarroteEntity;
import mx.com.tienda.vo.ProductosRequestVO;
import mx.com.tienda.vo.ProductosResponseVO;

@RestController
@RequestMapping("/tienda")
@CrossOrigin(origins = "http://127.0.0.1:5500")
//@CrossOrigin(origins = "http://localhost:5500", allowedHeaders = "*")
public class ControllerTienda {
	@Autowired
	private ConsultaProductoApp consProd;
	@Autowired
	private InsertaProductosApp insertaProd;
	
	@GetMapping("/productos/{sku}")
    public ProductosAbarroteEntity llavePub(@PathVariable(name = "sku") String sku) {
		
        return consProd.consultaProductosPorId(sku);
    }
	
	@GetMapping("/productos")
	public List<ProductosResponseVO> consultaAbarrotes(){
		return consProd.consultaProductos();
	}
	
	@PostMapping("/productos")
	public String insertaProductos(List<ProductosRequestVO> requesVo) {
		return insertaProd.insertaProductos(requesVo);
	}
}
