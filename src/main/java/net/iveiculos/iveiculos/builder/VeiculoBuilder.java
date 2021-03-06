package net.iveiculos.iveiculos.builder;

import java.util.Date;
import java.util.List;

import net.iveiculos.iveiculos.model.Cor;
import net.iveiculos.iveiculos.model.Foto;
import net.iveiculos.iveiculos.model.Loja;
import net.iveiculos.iveiculos.model.Veiculo;
import net.iveiculos.iveiculos.model.VeiculoOpcional;
import net.iveiculos.iveiculos.model.Versao;

public class VeiculoBuilder {
	
	private long id;
	
	private String renavam;
	
	private String placa;
	
	private double km;
	
	private String chassi;
	
	private Versao versao;
	
	private Cor cor;
	
	private List<VeiculoOpcional> opcionais;
	
	private Date dataVenda;
	
	private Loja loja;

	private List<Foto> fotos;

	private String urlFotoPrincipal;

	private double valor;

	private String observacao;
	
	public VeiculoBuilder comId(long id) {
		this.id = id;
		return this;
	}
	
	public VeiculoBuilder comRenavam(String renavam) {
		this.renavam = renavam;
		return this;
	}
	
	public VeiculoBuilder comPlaca(String placa) {
		this.placa = placa;
		return this;
	}	
	
	public VeiculoBuilder comKm(double km) {
		this.km = km;
		return this;
	}

	public VeiculoBuilder comChassi(String chassi) {
		this.chassi = chassi;
		return this;
	}

	public VeiculoBuilder comVersao(Versao versao) {
		this.versao = versao;
		return this;
	}

	public VeiculoBuilder comCor(Cor cor) {
		this.cor = cor;
		return this;
	}

	public VeiculoBuilder comOpcionais(List<VeiculoOpcional> opcionais) {
		this.opcionais = opcionais;
		return this;
	}	
	
	public VeiculoBuilder comDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
		return this;
	}	
	
	public VeiculoBuilder comLoja(Loja loja) {
		this.loja = loja;
		return this;
	}	

	public VeiculoBuilder comFotos(List<Foto> fotos) {
		this.fotos = fotos;
		return this;
	}

	public VeiculoBuilder comUrlFotoPrincipal(String urlFotoPrincipal) {
		this.urlFotoPrincipal = urlFotoPrincipal;
		return this;
	}
	
	public VeiculoBuilder comValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public VeiculoBuilder comObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}
	
	public Veiculo getInstance() {
		Veiculo veiculo = new Veiculo(id, renavam, placa, km, chassi, versao, cor, opcionais, dataVenda, loja, urlFotoPrincipal, fotos);
		veiculo.setValor(valor);
		veiculo.setObservacao(observacao);
		return veiculo;
	}



}
