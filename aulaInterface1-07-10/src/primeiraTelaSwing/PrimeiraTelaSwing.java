package primeiraTelaSwing;

import java.awt.*;

import javax.swing.*;

public class PrimeiraTelaSwing extends JFrame {
	JLabel lblNome = new JLabel("Nome");
	JTextField txtNome = new JTextField(40);
	
	JLabel lblCpf = new JLabel("CPF");
	JTextField txtCpf = new JTextField(35);
	
	JLabel lblEndereco = new JLabel("Endereço");
	JTextField txtEndereco = new JTextField(30);
	JLabel lblSexo = new JLabel("Sexo");
	JButton btnGravar = new JButton("Gravar");
	JButton btnFechar = new JButton("Fechar");
	String[] sexos = {"Feminino", "Masculino", "Outro"};
	JComboBox cboSexo = new JComboBox(sexos);
	
	public PrimeiraTelaSwing() {
		setLayout(new GridLayout(0, 1));
		
		Container c = getContentPane();
		
		c.add(lblNome);
		c.add(txtNome);
		c.add(lblCpf);
		c.add(txtCpf);
		c.add(lblEndereco);
		c.add(txtEndereco);
		c.add(lblSexo);
		c.add(cboSexo);
		c.add(btnGravar);
		c.add(btnFechar);
		
		setVisible(true);
		setTitle("Cadastro");
		pack();

	}
}
