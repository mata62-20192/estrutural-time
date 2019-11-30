package ufba.decorator.lib;

import ufba.decorator.app.UsuarioUtils;

public class UsuarioDAOAutenticacaoDecorator extends UsuarioDAODecorator {
	protected String IP;

	public UsuarioDAOAutenticacaoDecorator(UsuarioDAO usuario, String ip) {
		super(usuario);
		this.IP = ip;
	}
	
	@Override
	public void apagarTudo() {
		if(UsuarioUtils.ehAdministrador(this.IP))
			this.usuario.apagarTudo();
	}
	
	@Override
	public void inserir(Usuario u) {
		if(UsuarioUtils.ehAdministrador(this.IP))
			this.usuario.inserir(u);
	}
	
	@Override
	public Usuario obter(String username) {
		if(UsuarioUtils.ehAdministrador(this.IP))
			return this.usuario.obter(username);
		return null;
	}
	
}
