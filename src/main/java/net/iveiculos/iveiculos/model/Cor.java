package net.iveiculos.iveiculos.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
public class Cor extends Model {
	
	@Id @GeneratedValue
	private long id;
	
	private String descricao;
	
	@JsonBackReference
	@OneToMany(mappedBy="cor")
	private Set<Veiculo> veiculos;

	public Cor() {}
	
	public Cor(long id, String descricao, Set<Veiculo> veiculos) {
		this.id = id;
		this.descricao = descricao;
		this.veiculos = veiculos;
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

	public Set<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Set<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	
}
