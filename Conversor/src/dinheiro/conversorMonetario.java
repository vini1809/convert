package dinheiro;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dinheiroConverter obj = new dinheiroConverter();
				obj.setVisible(true);
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
	}
}
