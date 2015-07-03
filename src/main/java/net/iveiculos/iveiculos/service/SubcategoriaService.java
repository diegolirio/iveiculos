package net.iveiculos.iveiculos.service;

import net.iveiculos.iveiculos.dao.SubcategoriaDao;
import net.iveiculos.iveiculos.model.Subcategoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("subcategoriaService")
public class SubcategoriaService extends AbstractGenericService<Subcategoria> {

	@Autowired
	private SubcategoriaDao subcategoriaDao;

	public Subcategoria getPorDescricao(String descricao) {
		return this.subcategoriaDao.getPorDescricao(descricao);
	}

}
