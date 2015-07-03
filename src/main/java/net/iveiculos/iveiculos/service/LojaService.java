package net.iveiculos.iveiculos.service;

import net.iveiculos.iveiculos.dao.LojaDao;
import net.iveiculos.iveiculos.model.Loja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("lojaService")
public class LojaService extends AbstractGenericService<Loja> {

	@Autowired
	private LojaDao lojaDao;

	public Loja getPorDescricao(String descricao) {
		return this.lojaDao.getPorDescricao(descricao);
	}
	
}
