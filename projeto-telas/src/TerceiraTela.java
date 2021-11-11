
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class TerceiraTela extends JFrame {
	// subclasse de JFrame
	
	JLabel lblDescricao = new JLabel("Descri��o:");
	JTextField txtDescricao = new JTextField(25);
	JLabel lblEspecie = new JLabel("Esp�cie:");
	JTextField txtEspecie = new JTextField(10);
	JLabel lblUnidadeEntrada = new JLabel("Unidade Entrada:");
	JTextField txtUnidadeEntrada = new JTextField(21);
	JLabel lblSubdivisivel = new JLabel ("Subdivisivel?:");
	String [] subdivisivel = {"Sim", "N�o"};
	JComboBox cboDivisivel = new JComboBox(subdivisivel);
	JLabel lblUnidadeSaida = new JLabel ("Unidade Saida:");
	JTextField txtUnidadeSaida = new JTextField(25);	
	JLabel lblQtdSubdivisao = new JLabel ("Qtd Subdivis�o:");
	JTextField txtQtdSubdivisao = new JTextField(25);		
	
	public TerceiraTela() {
		Container c = getContentPane();
		setLayout(new GridLayout(0, 2));
			
		setTitle("Cadastro de Produto");
			
		c.add(lblDescricao);
		c.add(txtDescricao);	
		c.add(lblEspecie);
		c.add(txtEspecie);
		c.add(lblUnidadeEntrada);
		c.add(txtUnidadeEntrada);
		c.add(lblSubdivisivel);
		c.add(cboDivisivel);
		c.add(lblUnidadeSaida);
		c.add(lblQtdSubdivisao);
		c.add(txtUnidadeSaida);
		c.add(txtQtdSubdivisao);
			
		setVisible(true);
		pack();
	}
}

