package net.iveiculos.iveiculos.service;

import net.iveiculos.iveiculos.dao.VeiculoOpcionalDao;
import net.iveiculos.iveiculos.model.VeiculoOpcional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("veiculoOpcionalService")
public class VeiculoOpcionalService extends AbstractGenericService<VeiculoOpcional> {

	@Autowired
	private VeiculoOpcionalDao veiculoOpcionalDao;

}
