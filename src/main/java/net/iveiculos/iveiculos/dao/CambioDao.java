package net.iveiculos.iveiculos.dao;

import javax.persistence.NoResultException;

import net.iveiculos.iveiculos.model.Cambio;

import org.springframework.stereotype.Repository;

@Repository("cambioDao")
public class CambioDao extends AbstractGenericDao<Cambio> {

	public Cambio getPorDescricao(String descricao) {
		try {
			return (Cambio) super.manager.createQuery("Select c from Cambio c where c.descricao = :descricao")
						 						  .setParameter("descricao", descricao)
						 						  .getSingleResult();
		} catch(NoResultException e) {
			return null;
		}
	}

}
