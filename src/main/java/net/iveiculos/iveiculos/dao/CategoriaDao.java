package net.iveiculos.iveiculos.dao;

import javax.persistence.NoResultException;

import net.iveiculos.iveiculos.model.Categoria;

import org.springframework.stereotype.Repository;

@Repository("categoriaDao")
public class CategoriaDao extends AbstractGenericDao<Categoria> {

	public Categoria getPorDescricao(String descricao) {
		try {
			return (Categoria) super.manager.createQuery("Select c from Categoria c where c.descricao = :descricao")
								    .setParameter("descricao", descricao)
								    .getSingleResult();
		} catch(NoResultException e) {
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage() + "descricao="+descricao);
		}
	}

}
