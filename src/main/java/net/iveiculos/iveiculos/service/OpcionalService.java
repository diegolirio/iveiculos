package net.iveiculos.iveiculos.service;

import java.util.List;

import net.iveiculos.iveiculos.dao.OpcionalDao;
import net.iveiculos.iveiculos.model.Opcional;
import net.iveiculos.iveiculos.model.Veiculo;
import net.iveiculos.iveiculos.model.VeiculoOpcional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("opcionalService")
public class OpcionalService extends AbstractGenericService<Opcional> {

	@Autowired
	private OpcionalDao opcionalDao;

	public List<VeiculoOpcional> getListaPorVeiculo(Veiculo veiculo) {
		return this.opcionalDao.getListaPorVeiculo(veiculo);
	}

	public Opcional getPorDescricao(String descricao) {
		return this.opcionalDao.getPorDescricao(descricao);
	}

	
	
}
