package net.iveiculos.iveiculos.service;

import net.iveiculos.iveiculos.dao.VersaoDao;
import net.iveiculos.iveiculos.model.Versao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("versaoService")
public class VersaoService extends AbstractGenericService<Versao> {

	@Autowired
	private VersaoDao versaoDao;

}
