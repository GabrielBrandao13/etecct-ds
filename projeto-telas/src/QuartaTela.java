import javax.swing.*;
import java.awt.*;


public class QuartaTela extends JFrame {
	JLabel lblComandos = new JLabel("Comandos");
	JButton btnNovo = new JButton("Novo");
	JButton btnAlterar = new JButton("Alterar");
	JButton btnExcluir = new JButton("Excluir");
	JButton btnSalvar = new JButton("Salvar");
	JButton btnRelatorio = new JButton("Relatório");
	JButton btnRetorna = new JButton("Retorna");
	
	
	JLabel lblDadosCadastrais = new JLabel("Dados cadastrais");
	JLabel lblCodigo = new JLabel("Código");
	JTextField txtCodigo = new JTextField(10);
	JLabel lblNome = new JLabel("Nome");
	JTextField txtNome = new JTextField(10);
	JLabel lblEndereco = new JLabel("Endereço");
	JTextField txtEndereco = new JTextField(10);
	JLabel lblBairro = new JLabel("Bairro");
	JTextField txtBairro = new JTextField(10);
	JLabel lblCidade = new JLabel("Cidade");
	JTextField txtCidade = new JTextField(10);
	JLabel lblEstado = new JLabel("Estado");
	String[] estados = {"SP", "RJ", "MG", "MT"};
	JComboBox cboEstado = new JComboBox(estados);
	JLabel lblCep = new JLabel("Cep");
	JTextField txtCep = new JTextField(10);
	JLabel lblTelefone = new JLabel("Telefone");
	JTextField txtTelefone = new JTextField(10);
	JLabel lblObservacao = new JLabel("Observação");
	JTextField txtObservacao = new JTextField(50);
	
	JPanel comandos = new JPanel();
	JPanel dadosCadastrais = new JPanel();
	JPanel subDadosCadastrais = new JPanel();
	
	public QuartaTela() {
		Container c = getContentPane();
		setVisible(true);
		setSize(800, 350);
		setResizable(false);
		setTitle("Cadastro de clientes");
		setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
		c.setBackground(new Color(237, 192, 147));
		
		dadosCadastrais.setLayout(new GridLayout(0, 1));
		dadosCadastrais.add(lblDadosCadastrais);
		dadosCadastrais.add(lblCodigo);
		dadosCadastrais.add(txtCodigo);
		dadosCadastrais.add(lblNome);
		dadosCadastrais.add(txtNome);
		dadosCadastrais.add(lblEndereco);
		dadosCadastrais.add(txtEndereco);
		
		lblDadosCadastrais.setForeground(new Color(50, 66, 209));
		
		subDadosCadastrais.setLayout(new FlowLayout());
		subDadosCadastrais.setVisible(true);
		
		subDadosCadastrais.add(lblBairro);
		subDadosCadastrais.add(txtBairro);
		subDadosCadastrais.add(lblCidade);
		subDadosCadastrais.add(txtCidade);
		subDadosCadastrais.add(lblEstado);
		subDadosCadastrais.add(cboEstado);
		subDadosCadastrais.add(lblCep);
		subDadosCadastrais.add(txtCep);
		subDadosCadastrais.add(lblTelefone);
		subDadosCadastrais.add(txtTelefone);
		
		dadosCadastrais.add(subDadosCadastrais);
		
		dadosCadastrais.add(lblObservacao);
		dadosCadastrais.add(txtObservacao);
		
		c.add(dadosCadastrais);
		

		comandos.setVisible(true);
		comandos.setLayout(new GridLayout(0, 1, 20, 20));
		
		comandos.setVisible(true);
		comandos.add(lblComandos);
		comandos.add(btnNovo);
		comandos.add(btnAlterar);
		comandos.add(btnExcluir);
		comandos.add(btnSalvar);
		comandos.add(btnRelatorio);
		comandos.add(btnRetorna);
		comandos.setSize(150, 550);
		
		lblComandos.setForeground(new Color(50, 66, 209));
		
		c.add(comandos);
		
	}
}
