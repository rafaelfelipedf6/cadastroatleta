package view;

import control.*;

import javax.swing.*;

import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class InterfaceGrafic {
		private JFrame janela;
		private JFrame janelaCadastro;
		private JPanel painel;
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Bem Vindo ao Cadastro Profissional de Atletas");
		JOptionPane.showMessageDialog(null, "Você poderá cadastrar Tenistas e Ciclistas nesta plataforma além de\nIncluir novos Torneios");
		new InterfaceGrafic().montaTela();
	}
	private void montaTela(){
		preparaTela();
		preparaPainelTelaInicial();
		preparaBotoes();
		mostraJanela();
	}
	private void preparaTela() {
		// TODO Auto-generated method stub
		janela = new JFrame("Cadastro Atleta - 2.0");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	private void preparaPainelTelaInicial() {
		/*Criando Painel do Menu PRINCIPAL*/
		painel = new JPanel();
		/*Criando a Janela com o Painel do Menu Principal*/
		janela.add(painel);
		
	}
	private void preparaBotoes() {
		/*Botoes do Menu Principal*/
		JButton botaoCadastrarTenista = new JButton("Cadastrar Tenista");
		JButton botaoCadastrarCiclista = new JButton("Cadastrar Ciclista");
		JButton botaoSair = new JButton("Sair");
		/*Adicionando ações dos Botoes*/
		ActionListener sairListener = new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			    System.exit(0);
			  }
			};
		ActionListener cadastroTenista = new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  /*Botoes do Menu Cadastro*/
					JButton botaoNome = new JButton("Nome");
					JButton botaoAltura = new JButton("Altura");
					JButton botaoPeso = new JButton("Peso");
					
					/*Criando Painel do Menu Cadastro*/
					JPanel painelCadastro = new JPanel();
					painelCadastro.add(botaoNome);
					painelCadastro.add(botaoAltura);
					painelCadastro.add(botaoPeso);
					
					janelaCadastro = new JFrame("Menu - Cadastro");
					janelaCadastro.add(painelCadastro);
					janelaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					janelaCadastro.pack();
					janelaCadastro.setVisible(true);
				 
			  }
			};
			ActionListener cadastroCiclista = new ActionListener() {
				  public void actionPerformed(ActionEvent e) {
					  /*Botoes do Menu Cadastro*/
						JButton botaoNome = new JButton("Nome");
						JButton botaoAltura = new JButton("Altura");
						JButton botaoPeso = new JButton("Peso");
						
						/*Criando Painel do Menu Cadastro*/
						JPanel painelCadastro = new JPanel();
						painelCadastro.add(botaoNome);
						painelCadastro.add(botaoAltura);
						painelCadastro.add(botaoPeso);
						
						JFrame janelaCadastro = new JFrame("Menu - Cadastro");
						janelaCadastro.add(painelCadastro);
						janelaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						janelaCadastro.pack();
						janelaCadastro.setVisible(true);
					 
				  }
				};
		
		/*Setando Acoes nos Botoes*/
		botaoSair.addActionListener(sairListener);
		botaoCadastrarTenista.addActionListener(cadastroTenista);
		botaoCadastrarCiclista.addActionListener(cadastroCiclista);
		
		painel.add(botaoCadastrarTenista);
		painel.add(botaoCadastrarCiclista);
		painel.add(botaoSair);
		
	}

	private void mostraJanela() {
		// TODO Auto-generated method stub
		janela.pack();
		janela.setSize(1000,1000);
		janela.setVisible(true);
		
	}
}
