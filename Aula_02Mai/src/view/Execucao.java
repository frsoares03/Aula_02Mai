package view;

import javax.swing.JOptionPane;

import modal.PessoaFisica;

public class Execucao {

	public static void main(String[] args) {

		PessoaFisica pf = new PessoaFisica();
		pf.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		pf.setEndereco(JOptionPane.showInputDialog("Digite seu endereço: "));
		
		System.out.println("Nome: " + pf.getNome());
		System.out.println("Endereço: " + pf.getEndereco());

	}

}
