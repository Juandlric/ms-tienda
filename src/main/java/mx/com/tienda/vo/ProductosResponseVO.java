/**
 * 
 */
package mx.com.tienda.vo;

import java.io.Serializable;

/**
 * @author 1086600
 *
 */
public class ProductosResponseVO implements Serializable{
	
	private static final long serialVersionUID = -523304591609170925L;
	private String nombreProducto;
	private String sku;
	private String stock;
	private String precioCompra;
	private String precioVenta;
	/**
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}
	/**
	 * @param nombreProducto the nombreProducto to set
	 */
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
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
	 * @return the stock
	 */
	public String getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(String stock) {
		this.stock = stock;
	}
	/**
	 * @return the precioCompra
	 */
	public String getPrecioCompra() {
		return precioCompra;
	}
	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(String precioCompra) {
		this.precioCompra = precioCompra;
	}
	/**
	 * @return the precioVenta
	 */
	public String getPrecioVenta() {
		return precioVenta;
	}
	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(String precioVenta) {
		this.precioVenta = precioVenta;
	}
	public ProductosResponseVO(String nombreProducto, String sku, String stock, String precioCompra,
			String precioVenta) {
		super();
		this.nombreProducto = nombreProducto;
		this.sku = sku;
		this.stock = stock;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}
	public ProductosResponseVO() {
		super();
	}
}