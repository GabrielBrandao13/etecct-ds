package primeiraTelaSwing;

import java.awt.FlowLayout;

import javax.swing.*;

public class PrimeiraTelaSwing extends JFrame {
	JLabel lblNome = new JLabel("Nome");
	JTextField txtNome = new JTextField(70);
	JLabel lblEndereco = new JLabel("Endereço");
	JTextField txtEndereco = new JTextField(50);
	JLabel lblSexo = new JLabel("Sexo");
	JButton btnGravar = new JButton("Gravar");
	JButton btnFechar = new JButton("Fechar");
	String[] sexos = {"Feminino", "Masculino", "Outro"};
	JComboBox cboSexo = new JComboBox(sexos);
	
	public PrimeiraTelaSwing() {
		setLayout(new FlowLayout());
		
		getContentPane().add(lblNome);
		getContentPane().add(txtNome);
		getContentPane().add(lblEndereco);
		getContentPane().add(txtEndereco);
		getContentPane().add(lblSexo);
		getContentPane().add(cboSexo);
		getContentPane().add(btnGravar);
		getContentPane().add(btnFechar);
		
		setVisible(true);
		pack();

	}
}
