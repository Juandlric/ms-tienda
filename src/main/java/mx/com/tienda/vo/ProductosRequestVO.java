/**
 * 
 */
package mx.com.tienda.vo;

import java.io.Serializable;

/**
 * Clase que contiene el objeto request de los productos
 * @author 1086600
 *
 */
public class ProductosRequestVO implements Serializable{

	private static final long serialVersionUID = -6173961818827808274L;
	
	String sku;
	Long cantidad;
	public ProductosRequestVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductosRequestVO(String sku, Long cantidad) {
		super();
		this.sku = sku;
		this.cantidad = cantidad;
	}
	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}
	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}
	/**
	 * @return the cantidad
	 */
	public Long getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
}