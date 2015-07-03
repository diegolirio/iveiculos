package net.iveiculos.iveiculos.dao;

import javax.persistence.NoResultException;

import net.iveiculos.iveiculos.model.Cor;

import org.springframework.stereotype.Repository;

@Repository("corDao")
public class CorDao extends AbstractGenericDao<Cor> {

	public Cor getPorDescricao(String descricao) {
		try {
			return (Cor) super.manager.createQuery("Select c from Cor c where c.descricao = :descricao")
								      .setParameter("descricao", descricao)
								      .getSingleResult();
		} catch(NoResultException e) {
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage() + "descricao="+descricao);
		}
	}

	
	
}
