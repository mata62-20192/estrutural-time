package ufba.decorator.lib;

public abstract class UsuarioDAODecorator implements UsuarioDAO {
	UsuarioDAO usuario;
	
	public UsuarioDAODecorator(UsuarioDAO usuario) {
		this.usuario = usuario;
	}
}
