package net.iveiculos.iveiculos.service;

import net.iveiculos.iveiculos.builder.MarcaBuilder;
import net.iveiculos.iveiculos.model.Marca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("criarBaseService")
public class _CriarBaseService {

	@Autowired
	private MarcaService marcaService;
	
	// Marca
	public static final String FERRARI = "Ferrari";
	public static final String VOLKSWAGEM = "Volkswagem";
	public static final String CHEVROLET = "Chevrolet";
	public static final String FORD = "Ford";
	public static final String FIAT = "Fiat";
	public static final String AUDI = "Audi";
	public static final String PORSCHE = "Porsche";
	public static final String LEXUS = "Lexus";
	public static final String TOYOTA = "Toyota";
	public static final String HYUNDAI = "Hyundai";
	public static final String KIA = "Kia";
	public static final String NISSAN = "Nissan";
	public static final String ALFA_ROMEO = "Alfa Romeo";
	public static final String CHRYSLER = "Chrysler";
	public static final String DODGE = "Dodge";
	public static final String JEEP = "Jeep";
	public static final String CITROEN = "Citroen";
	public static final String PEGEOUT = "Pegeout";
	public static final String SUZUKI = "Suzuki";
	public static final String RENAULT = "Renault";
	public static final String HONDA = "Honda";
	public static final String BMW = "BMW";
	public static final String MERCEDES_BENZ =  "Mercedes-Benz";
	public static final String MITSUBISHI = "Mitsubishi";
	public static final String JAGUAR = "Jaguar";
	public static final String LAND_ROVER = "Land Rover";
	public static final String VOLVO = "Volvo";
	public static final String JAC = "JAC";
	
	// Categorias
	public static final String HATCH = "Hatch"; 
	public static final String SEDAN = "Sedan"; 
	public static final String SW = "SW";
	public static final String VAN = "Van";
	public static final String PICK_UP = "Pick-Up";
	public static final String SPORT = "Sport";
	public static final String SUV = "SUV";
	public static final String MOTO = "Moto";
	public static final String ONIBUS = "Onibus";
	public static final String CAMINHAO = "Caminhão";
	
	// Subcategorias
	public static final String POPULAR = "Popular"; 
	public static final String HATCH_PEQUENO = HATCH + " Pequeno"; 
	public static final String HATCH_MEDIO = HATCH + " Medio";
	public static final String HATCH_GRANDE = HATCH + " Grande";
	public static final String SEDAN_PEQUENO = SEDAN + " Pequeno";
	public static final String SEDAN_COMPACTO = SEDAN + " Compacto";
	public static final String SEDAN_MEDIO = SEDAN + " Medio";
	public static final String SEDAN_GRANDE = SEDAN + " Grande";
	public static final String SW_MEDIO = SW + " Medio";
	public static final String SW_GRANDE = SW + " Grande";
	public static final String MONOCAB = "Monocab";
	public static final String GRANDCAB = "Grandcab";
	public static final String PICK_UP_PEQUENO = PICK_UP + " Pequeno";
	public static final String PICK_UP_GRANDE = PICK_UP + " Grande";
	public static final String MINI_SUV = "Mini " + SUV;
	public static final String CROSSOVER_SUV = "Crossover " + SUV;

	// Modelos Volkswagem
	public static final String VOLKSWAGEM_GOL = "Gol";
	public static final String VOLKSWAGEM_UP = "Up";
	public static final String FORD_ECOSPORT = "Ecosport";	
	// Modelos pegeout 
	public static final String PEGEOUT_308 = "308";	
	// Modelos Land Rover
	public static final String LAND_ROVER_RANGE_ROVER_EVOQUE = "Range Rover Evoque";
	
	// Cambios
	public static final String CAMBIO_MANUAL = "Manual";
	public static final String CAMBIO_AUTOMATICO = "Automatico";
	
	//Combustivel
	public static final String GASOLINA = "Gasolina";
	public static final String ALCOOL = "Alcool";
	public static final String DIESEL = "Diesel";
	public static final String FLEX = "Flex";
	
	// Versoes
	public static final String FORD_ECOSPORT_FREESTYLE_16V = "Freestyle 16V";
	public static final String VOLKSWAGEM_GOL_TEC = "TEC";
	public static final String PEGEOUT_308_QUIKSILVER = "Freestyle 16V";
	public static final String LAND_ROVER_RANGE_ROVER_EVOQUE_SI4_COUPE_PURE_TECH_PACK = "Si4 Coupe Pure Tech Pack";

	// Cor
	public static final String AMARELO = "Amarelo";
	public static final String AZUL = "Azul";
	public static final String VERMELHO = "Vermelho";
	public static final String VERDE = "Verde";
	public static final String BRANCO = "Branco";
	public static final String PRETO = "Preto";
	public static final String PRATA = "Prata";
	public static final String CHUMBO = "Chumbo";
	public static final String DOURADO = "Dourado";
	
	// Opcionais
	public static final String AR_CONDICIONADO = "Ar condicionado";
	
	// loja
	public static final String LOJA_MATRIZ = "Matriz";

	// Opcionais
	public static final String DIRECAO_HIDRAULICA = "Direcao Hidraulica";
	public static final String VIDRO_ELETRICO = "Vidro Eletrico";
	public static final String TRAVA_ELETRICA = "Trava Eletrica";
	public static final String AIR_BAG = "Air Bag";
	public static final String ALARME = "Alarme";
	
	
	
	public boolean execute() {		
		this.criaCadastroBase();		
		return true;
	}
	
	private void criaCadastroBase() {
		// Marcas
		this.getMarcaOuCria(FERRARI);
		Marca volkswagem = this.getMarcaOuCria(VOLKSWAGEM);
		this.getMarcaOuCria(CHEVROLET);
		Marca ford = this.getMarcaOuCria(FORD);
		this.getMarcaOuCria(FIAT);
		this.getMarcaOuCria(AUDI);
		this.getMarcaOuCria(PORSCHE);
		this.getMarcaOuCria(LEXUS);
		this.getMarcaOuCria(TOYOTA);
		this.getMarcaOuCria(HYUNDAI);
		this.getMarcaOuCria(KIA);
		this.getMarcaOuCria(NISSAN);
		this.getMarcaOuCria(ALFA_ROMEO);
		this.getMarcaOuCria(CHRYSLER);
		this.getMarcaOuCria(DODGE);
		this.getMarcaOuCria(JEEP);
		this.getMarcaOuCria(CITROEN);
		Marca pegeout = this.getMarcaOuCria(PEGEOUT);
		this.getMarcaOuCria(SUZUKI);
		this.getMarcaOuCria(RENAULT);
		this.getMarcaOuCria(HONDA);
		this.getMarcaOuCria(BMW);
		this.getMarcaOuCria(MERCEDES_BENZ);
		this.getMarcaOuCria(MITSUBISHI);
		this.getMarcaOuCria(JAGUAR);
		Marca landRover = this.getMarcaOuCria(LAND_ROVER);
		this.getMarcaOuCria(VOLVO);
		this.getMarcaOuCria(JAC);		
	}
	
	
	/*
	 * Pega ou Criar
	 */
	
	public Marca getMarcaOuCria(String descricao) {
		Marca marca = this.marcaService.getPorDescricao(descricao);
		if(marca == null) {
			MarcaBuilder volksBuilder = new MarcaBuilder();
			marca = volksBuilder.comDescricao(descricao)
			    				.comUrlImage("/revendaveiculos/static/images/veiculos/34266268_1.jpeg")
								.build();
			this.marcaService.save(marca);
		}
		return marca;
	}	
	
}
