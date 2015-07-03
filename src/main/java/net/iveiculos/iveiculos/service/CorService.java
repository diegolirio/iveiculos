package net.iveiculos.iveiculos.service;

import net.iveiculos.iveiculos.dao.CorDao;
import net.iveiculos.iveiculos.model.Cor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("corService")
public class CorService extends AbstractGenericService<Cor> {

	@Autowired
	private CorDao corDao;

	public Cor getPorDescricao(String descricao) {
		return this.corDao.getPorDescricao(descricao);
	}
	
}
