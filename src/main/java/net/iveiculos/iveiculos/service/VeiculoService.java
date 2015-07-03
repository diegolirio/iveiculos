package net.iveiculos.iveiculos.service;

import java.util.List;

import net.iveiculos.iveiculos.dao.VeiculoDao;
import net.iveiculos.iveiculos.model.Veiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("veiculoService")
public class VeiculoService extends AbstractGenericService<Veiculo> {

	@Autowired
	private VeiculoDao veiculoDao;

	public List<Veiculo> getListHome() {
		return this.veiculoDao.getListHome();
	}
	
	public List<Veiculo> getListPagination(int first, int countReturn) {
		return this.veiculoDao.getListPagination(first, countReturn);
	}

}
