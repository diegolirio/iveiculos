package net.iveiculos.iveiculos.service;

import java.util.List;

import net.iveiculos.iveiculos.dao.FotoDao;
import net.iveiculos.iveiculos.model.Foto;
import net.iveiculos.iveiculos.model.Veiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fotoService")
public class FotoService extends AbstractGenericService<Foto> {

	@Autowired
	private FotoDao fotoDao;

	public List<Foto> getListaPorVeiculo(Veiculo veiculo) {
		return this.fotoDao.getListaPorVeiculo(veiculo);
	}
	
}
