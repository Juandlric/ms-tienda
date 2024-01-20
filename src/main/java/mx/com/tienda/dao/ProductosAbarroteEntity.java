/**
 * 
 */
package mx.com.tienda.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author 1086600
 *
 */
@Entity
@Table (name = "PRODUCTO")
public class ProductosAbarroteEntity implements Serializable{

	private static final long serialVersionUID = -5783289479403762438L;
	@Id
	@Column(name = "ID_PRODUCTO")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mi_sequence")
	@SequenceGenerator(name = "mi_sequence", sequenceName = "mi_sequence", allocationSize = 1)
	private Long idProducto;
	@Column(name = "NOMBRE_PRODUCTO")
	private String nombreProducto;
	@Column(name = "SKU")
	private String sku;
	@Column(name = "STOCK")
	private Double stock;
	@Column(name = "PRECIO_COMPRA")
	private Double precioCompra;
	@Column(name = "PRECIO_VENTA")
	private Double precioVenta;
	/**
	 * @return the idProducto
	 */
	public Long getIdProducto() {
		return idProducto;
	}
	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
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
	public Double getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(Double stock) {
		this.stock = stock;
	}
	/**
	 * @return the precioCompra
	 */
	public Double getPrecioCompra() {
		return precioCompra;
	}
	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}
	/**
	 * @return the precioVenta
	 */
	public Double getPrecioVenta() {
		return precioVenta;
	}
	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public ProductosAbarroteEntity(Long idProducto, String nombreProducto, String sku, Double stock,
			Double precioCompra, Double precioVenta) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.sku = sku;
		this.stock = stock;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}
	public ProductosAbarroteEntity() {
		super();
	}
	
}