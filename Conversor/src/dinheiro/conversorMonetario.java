package dinheiro;

import java.awt.Color;
import java.awt.Desktop;
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
import java.net.URI;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import java.awt.CardLayout;
import javax.swing.ImageIcon;

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
		getContentPane().setBackground(Color.BLACK);
		setTitle("Conversor");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\exact\\OneDrive\\Imagens\\179938397_4579019755447020_4755125684073058466_n.jpg"));
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 578);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setEnabled(false);
		menuBar.setBackground(new Color(255, 0, 255));
		setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("Dinheiro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConvertCoins obj = new ConvertCoins();
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
		getContentPane().setLayout(null);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\exact\\Downloads\\T.jpg"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args;
		        try{
		            URI link = new URI("https://github.com/vini1809");
		            Desktop.getDesktop().browse(link);
		        }catch(Exception erro){
		            System.out.println(erro);
		        }
			}
		});
		btnNewButton_2.setBounds(49, 10, 544, 488);
		getContentPane().add(btnNewButton_2);
	}
}
