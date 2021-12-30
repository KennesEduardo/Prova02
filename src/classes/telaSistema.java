package classes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class telaSistema {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCpf;
	private JTextField tfEndereco;
	private Cliente cliente1;
	private Salgado salgado;
	private JTextField tfNomeS;
	private JTextField tfQuantidade;

	public static void main(String[] args) {
		telaSistema window = new telaSistema();
		window.frame.setVisible(true);

	}

	public telaSistema() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel cadrastrar = new JPanel();
		JPanel pedido = new JPanel();
		pedido.setBackground(new Color(255, 0, 0));
		cadrastrar.setBackground(new Color(255, 0, 0));
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tabbedPane.setBounds(0, 0, 436, 253);
		tabbedPane.add("Cadrastrar-se", cadrastrar);
		tabbedPane.add("Pedido", pedido);
		pedido.setLayout(null);
		
		JLabel lblRelizandoPedido = new JLabel("Relizando pedido!");
		lblRelizandoPedido.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelizandoPedido.setForeground(Color.WHITE);
		lblRelizandoPedido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRelizandoPedido.setBounds(87, 10, 234, 22);
		pedido.add(lblRelizandoPedido);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nome do Salgado:");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(10, 42, 117, 22);
		pedido.add(lblNewLabel_1_3);
		
		tfNomeS = new JTextField();
		tfNomeS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNomeS.setColumns(10);
		tfNomeS.setBounds(200, 42, 165, 22);
		pedido.add(tfNomeS);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Quantidade desej\u00E1vel:");
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(10, 74, 146, 22);
		pedido.add(lblNewLabel_1_3_1);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfQuantidade.setColumns(10);
		tfQuantidade.setBounds(248, 74, 54, 22);
		pedido.add(tfQuantidade);
		
		JButton btPedido = new JButton("Finalizar pedido");
		btPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = tfNomeS.getText();
				int quantidade = Integer.parseInt(tfQuantidade.getText());
				Float preco = 1.75f;
				salgado = new Salgado(nome, quantidade);
				salgado.setPreco(preco*quantidade);
				JOptionPane.showMessageDialog(null, "Pedido realizado" + "\n" + "Será entregue em: " + cliente1.getEndereco() + "\n" + "Valor a ser pago: " + salgado.getPreco(), "Pedido Concluído", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btPedido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btPedido.setBounds(142, 158, 145, 28);
		pedido.add(btPedido);
		cadrastrar.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem-Vindo a K.D.Salgados");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(98, 10, 234, 22);
		cadrastrar.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 38, 64, 22);
		cadrastrar.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 70, 64, 22);
		cadrastrar.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Endereco");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(10, 102, 64, 22);
		cadrastrar.add(lblNewLabel_1_2);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNome.setBounds(175, 42, 165, 22);
		cadrastrar.add(tfNome);
		tfNome.setColumns(10);
		
		tfCpf = new JTextField();
		tfCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCpf.setColumns(10);
		tfCpf.setBounds(175, 74, 165, 22);
		cadrastrar.add(tfCpf);
		
		tfEndereco = new JTextField();
		tfEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(175, 106, 165, 22);
		cadrastrar.add(tfEndereco);
		
		JButton btnNewButton = new JButton("Cadrastre-se");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfCpf.getText().equals("01234567891") || tfCpf.getText().equals("1111111111")) {
					JOptionPane.showMessageDialog(null, "CPF inválido \n Verifique o CPF" , "CPF Inválido", JOptionPane.ERROR_MESSAGE);

				} else {
					String nome = tfNome.getText();
					String endereco = tfEndereco.getText();
					String cpf = tfCpf.getText();
					cliente1 = new Cliente(nome, endereco, cpf);
					JOptionPane.showMessageDialog(null, "Ben-vindo: " + cliente1.getNome() + "\n Clique na aba Pedido paraa relizar o seu!", "Cadrastro realizado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(142, 158, 145, 28);
		cadrastrar.add(btnNewButton);
		frame.getContentPane().add(tabbedPane);
	}
}
