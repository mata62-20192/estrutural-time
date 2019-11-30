package ufba.composite;

import java.util.ArrayList;
import java.util.Collection;

public class Membro {
	String nome;
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	ArrayList<Equipe> equipes = new ArrayList<Equipe>();
	ArrayList<Membro> membros = new ArrayList<Membro>();
	
	Membro(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void addPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	public void addEquipe(Equipe equipe) {
		equipes.add(equipe);
	}
	public void addMembro(Membro membro) {
		membros.add(membro);
	}
	
	
	public double getCustoTotalMensal() {
		double total = 0;
		for (Pessoa pessoa : pessoas) {
			total += pessoa.getSalario();
		}
		for (Equipe equipe : equipes) {
			total += equipe.getCustoEquipeMensal();
		}
		for (Membro membro : membros) {
			total += membro.getCustoTotalMensal();
		}
		return total;
	}
}
