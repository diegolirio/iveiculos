package net.iveiculos.iveiculos.service;

import java.util.ArrayList;
import java.util.List;

import net.iveiculos.iveiculos.builder.FotoBuilder;
import net.iveiculos.iveiculos.builder.VeiculoBuilder;
import net.iveiculos.iveiculos.model.Cambio;
import net.iveiculos.iveiculos.model.Categoria;
import net.iveiculos.iveiculos.model.Combustivel;
import net.iveiculos.iveiculos.model.Cor;
import net.iveiculos.iveiculos.model.Foto;
import net.iveiculos.iveiculos.model.Loja;
import net.iveiculos.iveiculos.model.Marca;
import net.iveiculos.iveiculos.model.Modelo;
import net.iveiculos.iveiculos.model.Opcional;
import net.iveiculos.iveiculos.model.Subcategoria;
import net.iveiculos.iveiculos.model.Veiculo;
import net.iveiculos.iveiculos.model.VeiculoOpcional;
import net.iveiculos.iveiculos.model.Versao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("criarExemploService")
public class _CriarExemploService {

	@Autowired
	private _CriarBaseService criarBaseService;
	@Autowired
	private VeiculoService veiculoService;
	@Autowired
	private VeiculoOpcionalService veiculoOpcionalService;
	@Autowired
	private FotoService fotoService;
	
	public boolean execute() {
		this.criarPegeout3082014();
		return true;
	}

	private void criarPegeout3082014() {		
		Marca pegeout = this.criarBaseService.getMarcaOuCria(_CriarBaseService.PEGEOUT);		
		Categoria categoria = criarBaseService.getCategoriaOuCria(_CriarBaseService.HATCH);
		Subcategoria subcategoria = criarBaseService.getSubcategoriaOuCria(_CriarBaseService.HATCH_MEDIO, categoria);
		Modelo modelo = this.criarBaseService.getModeloOuCria(_CriarBaseService.PEGEOUT_308, pegeout, subcategoria);
		Combustivel flex = this.criarBaseService.getCombustivelOuCria(_CriarBaseService.FLEX);
		Cambio cambio = this.criarBaseService.getCambioOuCria(_CriarBaseService.CAMBIO_AUTOMATICO);
		Versao versao = this.criarBaseService.getVersaoOuCria(_CriarBaseService.PEGEOUT_308_QUIKSILVER, 1.8f, 2015, 2015, 4, modelo, flex, cambio);
		Cor cor = this.criarBaseService.getCorOuCria(_CriarBaseService.BRANCO);
		Loja matriz = this.criarBaseService.getLojaOuCria(_CriarBaseService.LOJA_MATRIZ);
		
		List<Foto> fotos = new ArrayList<Foto>();
		VeiculoBuilder vb = new VeiculoBuilder();
		Veiculo veiculo = vb
				.comCor(cor)
				.comKm(0d)
				.comLoja(matriz)
				.comVersao(versao)
				.comUrlFotoPrincipal("http://mlb-s1-p.mlstatic.com/peugeot-308-allure-20-flex-2014-automatico-teto-novissimo-581401-MLB8669941040_062015-O.jpg")
				.comFotos(fotos)
				.comValor(72990.90)
				.comObservacao("Zero KM pronta entrega!!!")
				.getInstance();
		this.veiculoService.save(veiculo);
		
		Opcional ar = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.AR_CONDICIONADO);
		Opcional dh = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.DIRECAO_HIDRAULICA); 
		Opcional ve = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.VIDRO_ELETRICO);
		Opcional te = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.TRAVA_ELETRICA);
		Opcional air = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.AIR_BAG);
		Opcional alarme = this.criarBaseService.getOpcionalOuCria(_CriarBaseService.ALARME);
		
		// TODO: retirar
		VeiculoOpcional vo = new VeiculoOpcional();
		vo.setOpcional(ar);
		vo.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo);
		// TODO: retirar
		VeiculoOpcional vo2 = new VeiculoOpcional();
		vo2.setOpcional(dh);
		vo2.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo2);		
		// TODO: retirar
		VeiculoOpcional vo3 = new VeiculoOpcional();
		vo3.setOpcional(ve);
		vo3.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo3);
		// TODO: retirar
		VeiculoOpcional vo4 = new VeiculoOpcional();
		vo4.setOpcional(te);
		vo4.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo4);		
		// TODO: retirar
		VeiculoOpcional vo5 = new VeiculoOpcional();
		vo5.setOpcional(air);
		vo5.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo5);
		// TODO: retirar
		VeiculoOpcional vo6 = new VeiculoOpcional();
		vo6.setOpcional(alarme);
		vo6.setVeiculo(veiculo);
		this.veiculoOpcionalService.save(vo6);
		
		FotoBuilder fb = new FotoBuilder();
		Foto f1 = fb
				.comPrincipal(true)
				.comUri("/revendaveiculos/static/images/veiculos/34266268_1.jpeg")
				.comVeiculo(veiculo)
				.build();
		
		this.fotoService.save(f1);

		Foto f2 = fb
				.comPrincipal(false)
				.comUri("/revendaveiculos/static/images/veiculos/34266269_1.jpeg")
				.comVeiculo(veiculo)
				.build();
		
		this.fotoService.save(f2);
	}	
	
}
