package com.rare.app.models.dao;

import java.util.List;

import com.rare.app.models.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();
	
}
