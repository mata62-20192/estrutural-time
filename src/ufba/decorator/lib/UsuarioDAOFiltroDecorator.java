package ufba.decorator.lib;

import ufba.decorator.app.UsuarioUtils;

public class UsuarioDAOFiltroDecorator extends UsuarioDAODecorator{
	
	public UsuarioDAOFiltroDecorator(UsuarioDAO usuario) {
		super(usuario);
	}
	
	@Override
	public void apagarTudo() {	
		this.usuario.apagarTudo();
	}
	
	@Override
	public void inserir(Usuario u) {
		this.usuario.inserir(UsuarioUtils.filtraEntrada(u));
	}
	
	@Override
	public Usuario obter(String username) {
		return UsuarioUtils.filtraEntrada(this.usuario.obter(username));
	}
}
