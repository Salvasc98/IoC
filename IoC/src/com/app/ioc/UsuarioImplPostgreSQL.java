package com.app.ioc;

public class UsuarioImplPostgreSQL implements IUsuario {

	@Override
	public void insertoUsuario() {
		// TODO Auto-generated method stub
		System.out.println("Insertando usuario con PostgreSQL");
	}

	@Override
	public void eliminoUsuarioByID(int id) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando usuario con PostgreSQL: " + id);
	}

}
