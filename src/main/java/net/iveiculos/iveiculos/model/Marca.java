package net.iveiculos.iveiculos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Marca extends Model {

	@Id @GeneratedValue
	private long id;
	
	private String descricao;

	private String urlImage;

	public Marca() {}
	
	public Marca(long id, String descricao, String urlImage) {
		this.id = id;
		this.descricao = descricao;
		this.urlImage = urlImage;
	}

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

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}



	@Override
	public String toString() {
		return "Marca [id=" + id + ", descricao=" + descricao + ", urlImage=" + urlImage + "]";
	}	
	
	
}
