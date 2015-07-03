package net.iveiculos.iveiculos.dao;

import javax.persistence.NoResultException;

import net.iveiculos.iveiculos.model.Combustivel;

import org.springframework.stereotype.Repository;

@Repository("combustivelDao")
public class CombustivelDao extends AbstractGenericDao<Combustivel> {

	public Combustivel getPorDescricao(String descricao) {
		try {
			return (Combustivel) super.manager.createQuery("Select c from Combustivel c where c.descricao = :descricao")
											  .setParameter("descricao", descricao)
											  .getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}

}
