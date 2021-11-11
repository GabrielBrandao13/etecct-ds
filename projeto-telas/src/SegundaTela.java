
import javax.swing.*;
import java.awt.*;


public class SegundaTela extends JFrame {
	JLabel titulo = new JLabel("Cadastrar novo fornecedor");
	
	JLabel lblCodigo = new JLabel("Código");
	JTextField txtCodigo = new JTextField(5);
	String[] pfPj = {"PJ", "PF"};
	JLabel lblPjPf = new JLabel("PF/PJ");
	JComboBox cboPjPf = new JComboBox(pfPj);
	JLabel lblNome = new JLabel("Nome");
	JTextField txtNome = new JTextField(35);
	JLabel lblCnpjCpf = new JLabel("cnpj/cpf");
	JTextField txtCnpjCpf = new JTextField(20);
	JLabel lblRg = new JLabel("Inst. Est/RG");
	JTextField txtRg = new JTextField(20);
	JLabel lblTelefone1 = new JLabel("Telefone 1");
	JTextField txtTelefone1 = new JTextField(15);
	JLabel lblTelefone2 = new JLabel("Telefone 2");
	JTextField txtTelefone2 = new JTextField(15);
	JLabel lblEmail = new JLabel("E-mail");
	JTextField txtEmail = new JTextField(30);
	JLabel lblProfissao = new JLabel("Atividade/Profissão");
	JTextField txtProfissao = new JTextField(30);
	JLabel lblCep = new JLabel("CEP");
	JTextField txtCep = new JTextField(10);
	
	JLabel lblEstado = new JLabel("Estado");
	String[] estados = {"SP", "RJ", "MG", "MT"};
	JComboBox cboEstado = new JComboBox(estados);
	
	JLabel lblCidade = new JLabel("Cidade");
	JTextField txtCidade = new JTextField(10);
	JLabel lblRua = new JLabel("Rua");
	JTextField txtRua = new JTextField(10);
	JLabel lblComplemento = new JLabel("N° e Complemento");
	JTextField txtComplemento = new JTextField(10);
	JLabel lblBairro = new JLabel("Bairro");
	JTextField txtBairro = new JTextField(10);
	JLabel lblSite = new JLabel("Site/Instagram");
	JTextField txtSite = new JTextField(10);
	JLabel lblObservacoes = new JLabel("Observações");
	JTextField txtObservacoes = new JTextField(100);
	
	JButton btnGravar = new JButton("Gravar");
	JButton btnSair = new JButton("Sair");
	
	public SegundaTela(){
		Container c = getContentPane();
		
		setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		setSize(900, 550);
		setVisible(true);
		setTitle("Segunda tela");
		setResizable(false);
		
		JPanel header = new JPanel();
		header.setLayout(new FlowLayout(FlowLayout.CENTER));
		header.add(titulo);
		titulo.setFont(new Font("sans-serif", Font.PLAIN, 20));
		header.setVisible(true);
		header.setBackground(new Color(196, 138, 79));
		c.add(header);
		
		JPanel campos = new JPanel();
		campos.setVisible(true);
		campos.setLayout(new BoxLayout(campos, BoxLayout.X_AXIS));

		c.add(campos);
		
		GridLayout colLayout = new GridLayout(0, 1);
		
		JPanel camposCol1 = new JPanel();
		camposCol1.setVisible(true);
		camposCol1.setLayout(colLayout);

		campos.add(camposCol1);
		
		JPanel camposCol2 = new JPanel();
		camposCol2.setVisible(true);
		camposCol2.setLayout(colLayout);
		
		JPanel bottom = new JPanel();
		bottom.setVisible(true);
		bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
		c.add(bottom);
		
		bottom.add(lblObservacoes);
		bottom.add(txtObservacoes);

		
		JPanel bottomButtons = new JPanel();
		bottomButtons.setLayout(new GridLayout(0, 1, 15, 15));
		bottomButtons.setVisible(true);
		btnGravar.setBackground(new Color(196, 138, 79));
		btnSair.setBackground(new Color(255, 0, 0));
		bottomButtons.add(btnGravar);
		bottomButtons.add(btnSair);
		
		bottom.add(bottomButtons);
		
		campos.add(camposCol2);
		
		camposCol1.add(lblCodigo);
		txtCodigo.setPreferredSize(new Dimension(50, 50));
		camposCol1.add(txtCodigo);
		camposCol1.add(lblPjPf);
		camposCol1.add(cboPjPf);
		camposCol1.add(lblNome);
		camposCol1.add(txtNome);
		camposCol1.add(lblCnpjCpf);
		camposCol1.add(txtCnpjCpf);
		camposCol1.add(lblRg);
		camposCol1.add(txtRg);
		camposCol1.add(lblTelefone1);
		camposCol1.add(txtTelefone1);
		camposCol1.add(lblTelefone2);
		camposCol1.add(txtTelefone2);
		camposCol1.add(lblEmail);
		camposCol1.add(txtEmail);

		camposCol2.add(lblProfissao);
		camposCol2.add(txtProfissao);
		camposCol2.add(lblCep);
		camposCol2.add(txtCep);
		
		camposCol2.add(lblEstado);
		camposCol2.add(cboEstado);
		
		camposCol2.add(lblCidade);
		camposCol2.add(txtCidade);
		camposCol2.add(lblRua);
		camposCol2.add(txtRua);
		camposCol2.add(lblComplemento);
		camposCol2.add(txtComplemento);
		camposCol2.add(lblBairro);
		camposCol2.add(txtBairro);
		camposCol2.add(lblSite);
		camposCol2.add(txtSite);
		
	}
}
