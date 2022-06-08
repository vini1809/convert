package dinheiro;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class conversorMonetario extends JFrame {

	private JPanel contentPane;
	private JTextField txtBemVindoAo;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conversorMonetario frame = new conversorMonetario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public conversorMonetario() {
		setTitle("Conversor");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\exact\\OneDrive\\Imagens\\179938397_4579019755447020_4755125684073058466_n.jpg"));
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 463);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setEnabled(false);
		menuBar.setBackground(new Color(255, 0, 255));
		setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("Dinheiro");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(245, 255, 250));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Temperatura");
		btnNewButton_1.setBackground(new Color(245, 255, 250));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		menuBar.add(btnNewButton_1);
		
		txtBemVindoAo = new JTextField();
		txtBemVindoAo.setBackground(new Color(245, 255, 250));
		txtBemVindoAo.setEditable(false);
		txtBemVindoAo.setText("       Bem vindo ao Conversor, Projeto Oracle ONE #AluraChallenge");
		txtBemVindoAo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		menuBar.add(txtBemVindoAo);
		txtBemVindoAo.setColumns(20);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 130, 238));
		contentPane.setBorder(UIManager.getBorder("InternalFrame.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de moeda");
		lblNewLabel.setToolTipText("Tipo de moeda");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		lblNewLabel.setBounds(70, 45, 200, 30);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(294, 45, 52, 36);
		contentPane.add(comboBox);
		
		JLabel lblValorASer = new JLabel("Valor a ser convertido");
		lblValorASer.setToolTipText("Valor a ser convertido");
		lblValorASer.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		lblValorASer.setBounds(70, 126, 298, 30);
		contentPane.add(lblValorASer);
		
		textField = new JTextField();
		textField.setBounds(381, 126, 96, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblParaQualMoeda = new JLabel("Para qual moeda voc\u00EA quer converter ?");
		lblParaQualMoeda.setToolTipText("Para qual moeda voc\u00EA quer converter ?");
		lblParaQualMoeda.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		lblParaQualMoeda.setBounds(70, 205, 518, 30);
		contentPane.add(lblParaQualMoeda);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Reais");
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBackground(new Color(255, 0, 255));
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		rdbtnNewRadioButton.setBounds(70, 255, 71, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnDolares = new JRadioButton("Dolares");
		rdbtnDolares.setBackground(new Color(255, 0, 255));
		rdbtnDolares.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		rdbtnDolares.setBounds(143, 255, 87, 21);
		contentPane.add(rdbtnDolares);
		
		JRadioButton rdbtnEuros = new JRadioButton("Euros");
		rdbtnEuros.setBackground(new Color(255, 0, 255));
		rdbtnEuros.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		rdbtnEuros.setBounds(232, 255, 71, 21);
		contentPane.add(rdbtnEuros);
		
		JRadioButton rdbtnYans = new JRadioButton("Ienes");
		rdbtnYans.setBackground(new Color(255, 0, 255));
		rdbtnYans.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		rdbtnYans.setBounds(305, 255, 65, 21);
		contentPane.add(rdbtnYans);
		
		JRadioButton rdbtnRenmimbi = new JRadioButton("Renmimbi");
		rdbtnRenmimbi.setBackground(new Color(255, 0, 255));
		rdbtnRenmimbi.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		rdbtnRenmimbi.setBounds(372, 255, 105, 21);
		contentPane.add(rdbtnRenmimbi);
		
		JLabel lblOResultadoObtido = new JLabel("O Resultado obtido na convers\u00E3o \u00E9: ");
		lblOResultadoObtido.setToolTipText("O Resultado obtido na convers\u00E3o \u00E9: ");
		lblOResultadoObtido.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		lblOResultadoObtido.setBounds(70, 317, 470, 30);
		contentPane.add(lblOResultadoObtido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(543, 317, 105, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
	}
}
