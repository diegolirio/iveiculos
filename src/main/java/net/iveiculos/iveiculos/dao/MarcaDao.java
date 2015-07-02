package net.iveiculos.iveiculos.dao;

import javax.persistence.NoResultException;

import net.iveiculos.iveiculos.model.Marca;

import org.springframework.stereotype.Repository;

@Repository("marcaDao")
public class MarcaDao extends AbstractGenericDao<Marca> {

	public Marca getPorDescricao(String descricao) {
		try {
			return (Marca) super.manager.createQuery("Select m from Marca m where m.descricao = :descricao")
										.setParameter("descricao", descricao)
										.getSingleResult();
		} catch(NoResultException e) {
			return null;
		}
	}

	 
	
}
