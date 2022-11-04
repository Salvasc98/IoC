package com.app.ioc;

public class UsuarioImplMongo implements IUsuario {

	@Override
	public void insertoUsuario() {
		// TODO Auto-generated method stub
		System.out.println("Insertando usuario con Mongo");
	}

	@Override
	public void eliminoUsuarioByID(int id) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando usuario con Mongo: " + id);
	}

}
