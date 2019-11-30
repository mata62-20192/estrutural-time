package ufba.composite;

import java.util.ArrayList;

public class Equipe {
	String nome;
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public Equipe(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void addPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public double getCustoEquipeMensal() {
		double total = 0;
		for (Pessoa pessoa : pessoas) {
			total += pessoa.getSalario();
		}
		return total;
	}
		
}