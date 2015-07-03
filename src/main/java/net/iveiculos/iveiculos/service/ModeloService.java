package net.iveiculos.iveiculos.service;
 
import java.util.List;

import net.iveiculos.iveiculos.dao.ModeloDao;
import net.iveiculos.iveiculos.model.Marca;
import net.iveiculos.iveiculos.model.Modelo;
import net.iveiculos.iveiculos.model.Subcategoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("modeloService")
public class ModeloService extends AbstractGenericService<Modelo> {

	@Autowired
	private ModeloDao modeloDao;

	public Modelo getPorDescricaoMarca(String descricao, Marca marca, Subcategoria subcategoria) {
		return this.modeloDao.getPorDescricaoMarca(descricao, marca, subcategoria);
	}

	public List<Modelo> getListPagination(int firstResult, int maxResults) {
		return this.modeloDao.getListPagination(firstResult, maxResults);
	}

	
}
