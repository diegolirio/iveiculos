package net.iveiculos.iveiculos.service;

import net.iveiculos.iveiculos.dao.MarcaDao;
import net.iveiculos.iveiculos.model.Marca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("marcaService")
public class MarcaService extends AbstractGenericService<Marca> {

	@Autowired
	private MarcaDao marcaDao;

	public Marca getPorDescricao(String descricao) {
		return this.marcaDao.getPorDescricao(descricao);
	}
	
}
