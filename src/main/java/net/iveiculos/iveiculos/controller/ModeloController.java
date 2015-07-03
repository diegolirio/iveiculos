package net.iveiculos.iveiculos.controller;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("modelo")
public class ModeloController {

	@RequestMapping(value="/get/list/pagination/{firstResult}/{maxResults}/json")
	public ResponseEntity<String> getListPagination(@PathVariable("firstResult") int firstResult, @PathVariable("maxResults") int maxResults) {
		try {
			List<Object> list = null;
			return new ResponseEntity<String>(new ObjectMapper().writeValueAsString(list), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
