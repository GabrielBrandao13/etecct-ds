import javax.swing.*;
import java.awt.*;

public class PrimeiraTela extends JFrame{
	JLabel lblLogin = new JLabel("Senha");
	JTextField txtLogin = new JTextField(50);
	JLabel lblSenha = new JLabel("Login");
	JTextField txtSenha = new JTextField(50);
	JButton btnEntrar = new JButton("Ok");
	JButton btnEsquecer = new JButton("Esqueceu a senha?");
	

	public PrimeiraTela(){
		
		Container c = getContentPane();
		setLayout(new GridLayout(6,1,3,3));
		setTitle("Login");
		setSize(400, 250);
		
		c.add(lblSenha);
		c.add(txtSenha);
		c.add(lblLogin);
		c.add(txtLogin);
		c.add(btnEntrar);
		c.add(btnEsquecer);
		
		setVisible(true);
		
	}
	
	
}