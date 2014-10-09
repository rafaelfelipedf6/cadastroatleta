package view;

import control.*;
import javax.swing.*;
import java.awt.*;
public class InterfaceGrafic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Bem Vindo ao Cadastro Profissional de Atletas");
		JOptionPane.showMessageDialog(null, "Você poderá cadastrar Tenistas e Ciclistas nesta plataforma além de\nIncluir novos Torneios");
		
		/*Botoes do Menu Principal*/
		JButton botaoCadastrarTenista = new JButton("Cadastrar Tenista");
		JButton botaoCadastrarCiclista = new JButton("Cadastrar Ciclista");
		JButton botaoSair = new JButton("Sair");

	
		

		JButton botaoNome = new JButton("Nome");
		JButton botaoAltura = new JButton("Altura");
		JButton botaoPeso = new JButton("Peso");
		
		JPanel painelCadastro = new JPanel();
		painelCadastro.add(botaoNome);
		painelCadastro.add(botaoAltura);
		painelCadastro.add(botaoPeso);
		
		
		JPanel painel = new JPanel();
		painel.add(botaoCadastrarTenista);
		painel.add(botaoCadastrarCiclista);
		painel.add(botaoSair);
		
		JFrame janela = new JFrame("Cadastro Atleta - 2.0");
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);
		
		JFrame janelaCadastro = new JFrame("Menu - Cadastro");
		janelaCadastro.add(painelCadastro);
		janelaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaCadastro.pack();
		janelaCadastro.setVisible(false);
		
	}

}
