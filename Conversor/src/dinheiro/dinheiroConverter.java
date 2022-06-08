package dinheiro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class dinheiroConverter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dinheiroConverter frame = new dinheiroConverter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public dinheiroConverter() {
		setTitle("Converter valores");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\exact\\OneDrive\\Imagens\\179938397_4579019755447020_4755125684073058466_n.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 503);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(UIManager.getBorder("InternalFrame.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de moeda");
		lblNewLabel.setToolTipText("Tipo de moeda");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		lblNewLabel.setBounds(70, 45, 200, 30);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setBounds(294, 45, 87, 36);
		contentPane.add(comboBox);
		comboBox.addItem("Real");
		comboBox.addItem("Dolar");
		comboBox.addItem("Euro");
		comboBox.addItem("Ien");
		comboBox.addItem("Renmimbi");
		
		JLabel lblValorASer = new JLabel("Valor a ser convertido");
		lblValorASer.setToolTipText("Valor a ser convertido");
		lblValorASer.setFont(new Font("Times New Roman", Font.ITALIC, 32));
		lblValorASer.setBounds(70, 126, 298, 30);
		contentPane.add(lblValorASer);
		
		JTextField textField = new JTextField();
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
		lblOResultadoObtido.setBounds(50, 395, 470, 30);
		contentPane.add(lblOResultadoObtido);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(526, 395, 105, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\exact\\Downloads\\btnConverter.png"));
		btnNewButton.setBounds(246, 292, 193, 93);
		contentPane.add(btnNewButton);
		
	}
}
