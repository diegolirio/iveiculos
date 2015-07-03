package net.iveiculos.iveiculos.service;

import net.iveiculos.iveiculos.dao.CombustivelDao;
import net.iveiculos.iveiculos.model.Combustivel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("combustivelService")
public class CombustivelService extends AbstractGenericService<Combustivel> {

	@Autowired
	private CombustivelDao combustivelDao;

	public Combustivel getPorDescricao(String descricao) {
		return this.combustivelDao.getPorDescricao(descricao);
	}

}
