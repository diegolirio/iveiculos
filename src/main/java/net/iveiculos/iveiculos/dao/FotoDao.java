package net.iveiculos.iveiculos.dao;

import java.util.List;

import net.iveiculos.iveiculos.model.Foto;
import net.iveiculos.iveiculos.model.Veiculo;

import org.springframework.stereotype.Repository;

@Repository("fotoDao")
public class FotoDao extends AbstractGenericDao<Foto> {

	public List<Foto> getListaPorVeiculo(Veiculo veiculo) {
		@SuppressWarnings("unchecked")
		List<Foto> fotos = (List<Foto>) super.manager
										.createQuery("Select f from Foto f where f.veiculo.id = :veiculoId")
										.setParameter("veiculoId", veiculo.getId())
										.getResultList();
		return fotos;
	}

}
