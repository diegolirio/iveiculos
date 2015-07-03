package net.iveiculos.iveiculos.service;

import net.iveiculos.iveiculos.dao.CategoriaDao;
import net.iveiculos.iveiculos.model.Categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("categoriaService")
public class CategoriaService extends AbstractGenericService<Categoria> {

	@Autowired
	private CategoriaDao categoriaDao;

	public Categoria getPorDescricao(String descricao) {
		return this.categoriaDao.getPorDescricao(descricao);
	}
	
	
}
