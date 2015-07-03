package net.iveiculos.iveiculos.dao;

import java.util.List;

import net.iveiculos.iveiculos.model.Veiculo;

import org.springframework.stereotype.Repository;

@Repository("veiculoDao")
public class VeiculoDao extends AbstractGenericDao<Veiculo> {

	public List<Veiculo> getListHome() {
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Veiculo> getListPagination(int first, int countReturn) {
		List<Veiculo> list = (List<Veiculo>) super.manager.createQuery("Select v from Veiculo v").setFirstResult(first).setMaxResults(countReturn).getResultList();
		return list;
	}
	

	
	
}
