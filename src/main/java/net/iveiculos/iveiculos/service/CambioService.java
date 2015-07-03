package net.iveiculos.iveiculos.service;

import net.iveiculos.iveiculos.dao.CambioDao;
import net.iveiculos.iveiculos.model.Cambio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cambioService")
public class CambioService extends AbstractGenericService<Cambio> {

	@Autowired
	private CambioDao cambioDao;

	public Cambio getPorDescricao(String descricao) {
		return this.cambioDao.getPorDescricao(descricao);
	}

}
