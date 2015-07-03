package net.iveiculos.iveiculos.dao;

import javax.persistence.NoResultException;

import net.iveiculos.iveiculos.model.Marca;
import net.iveiculos.iveiculos.model.Modelo;
import net.iveiculos.iveiculos.model.Subcategoria;

import org.springframework.stereotype.Repository;

@Repository("modeloDao")
public class ModeloDao extends AbstractGenericDao<Modelo> {

	public Modelo getPorDescricaoMarca(String descricao, Marca marca, Subcategoria subcategoria) {
		try {
			String sql = "Select m from Modelo m where m.descricao = :descricao and m.marca.id = :marcaId and m.subcategoria.id = :subcategoriaId";
			return (Modelo) super.manager.createQuery(sql)
								    .setParameter("descricao", descricao)
								    .setParameter("marcaId", marca.getId())
								    .setParameter("subcategoriaId", subcategoria.getId())
								    .getSingleResult();
		} catch(NoResultException e) {
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage() + " marca="+marca+";descricao="+descricao+";subcategoria="+subcategoria);
		}
	}	

}
