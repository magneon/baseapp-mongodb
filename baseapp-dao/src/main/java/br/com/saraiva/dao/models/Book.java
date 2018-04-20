package br.com.saraiva.dao.models;
// Generated 06/04/2018 11:15:23 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Book generated by hbm2java
 */
@Entity
@Table(name = "book", catalog = "saraiva")
@NamedQueries(value = {
	@NamedQuery(name = Book.CONSULTA_LIVROS, query = "SELECT b FROM Book b"),
	@NamedQuery(name = Book.CONSULTA_LIVROS_ATE_PRECO, query = "SELECT b FROM Book b WHERE b.price <= :price"),
})
public class Book implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	public static final String CONSULTA_LIVROS = "Book.consultaLivro";
	public static final String CONSULTA_LIVROS_ATE_PRECO = "Book.consultaLivrosAtePreco";
	
	private int sku;
	private String name;
	private String brand;
	private BigDecimal price;

	public Book() {
	}

	public Book(int sku) {
		this.sku = sku;
	}

	public Book(int sku, String name, String brand, BigDecimal price) {
		this.sku = sku;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	@Id
	@Column(name = "sku", unique = true, nullable = false)
	public int getSku() {
		return this.sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "brand")
	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name = "price", precision = 16)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}