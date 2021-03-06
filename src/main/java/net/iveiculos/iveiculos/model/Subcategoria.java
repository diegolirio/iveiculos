package net.iveiculos.iveiculos.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonBackReference;

/**
 * @author Diego Lirio
 * Subcategoria Ex: Pick-Up pequena (saveiro) e Pick-Up Grande (Hilux) | SUV Medio e SUV Grande
 */
@Entity
public class Subcategoria extends Model {

	@Id @GeneratedValue
	private long id;
	
	private String descricao;
	
	@ManyToOne
	private Categoria categoria;
	
	@JsonBackReference
	@OneToMany(mappedBy="subcategoria")
	private Set<Modelo> modelos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Set<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(Set<Modelo> modelos) {
		this.modelos = modelos;
	}
	
	
	
}
