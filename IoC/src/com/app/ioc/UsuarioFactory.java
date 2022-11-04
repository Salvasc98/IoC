package com.app.ioc;

public class UsuarioFactory {
	
	IUsuario usr;
	
	public UsuarioFactory(IUsuario usr) {
		this.usr = usr;
	}
	
	public void getInsertaUsuario() {
		usr.insertoUsuario();
	}
	
	public void getEliminaUsuarioByID(int id) {
		usr.eliminoUsuarioByID(id);
	}

}
