package dinheiro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class ConvertCoins extends JFrame implements ActionListener {
	JComboBox escolhamoeda, moedaconvert;
	JButton converter, limpar, sair;
	JLabel moedaescolhida, corvertmoeda;
	TextField digitevalor;
	TextField Responda;

	String[] unidadesDeMoeda = { "Unidades", "India Rupee", "Paquistão Rupee", "US Dollar", "Dollar Canadense",
			"Quenia Shilling", "Nigeria Naira", "Brasil Real", "Indonésia Rupiah", "Philippine_Pisco", };

	double India_Rupee = 95.21;
	double Paquistao_Rupee = 162.74;
	double US_Dollar = 1.31;
	double Dollar_Canadense = 1.71;
	double Quenia_Shilling = 132.53;
	double Nigeria_Naira = 476.57;
	double Brasil_Real = 5.47;
	double Indonesia_Rupiah = 19554.94;
	double Philippine_Pisco = 71.17;

	ConvertCoins() {
		setBackground(new Color(0, 100, 0));
		setFont(new Font("Arial", Font.BOLD, 14));
		setTitle("Tela Converter Dinheiro");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\exact\\OneDrive\\Imagens\\179938397_4579019755447020_4755125684073058466_n.jpg"));
		setBounds(300, 60, 779, 519);
		getContentPane().setBackground(new Color(47, 79, 79));
		getContentPane().setLayout(null);

		JLabel maintitle = new JLabel("Conversor Monet\u00E1rio");
		maintitle.setBounds(125, 26, 535, 60);
		maintitle.setFont(new Font("EaDesigner", Font.BOLD, 50));
		maintitle.setForeground(new Color(0, 255, 0));
		getContentPane().add(maintitle);

		JLabel from = new JLabel("De");
		from.setBounds(76, 104, 50, 50);
		from.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		from.setForeground(new Color(0, 255, 0));
		getContentPane().add(from);

		escolhamoeda = new JComboBox(new String[] { "Selecione..", "India", "Paquistão", "USA", "Canada", "Quênia",
				"Nigéria", "Brasil", "Indonésia", "Philippine" });
		escolhamoeda.setBounds(158, 109, 200, 40);
		escolhamoeda.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		escolhamoeda.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(ItemEvent evt) {
				fromcountryItemStateChanged(evt);
			}
		});
		getContentPane().add(escolhamoeda);

		digitevalor = new TextField();
		digitevalor.setBounds(419, 109, 144, 40);
		digitevalor.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		digitevalor.setForeground(Color.BLACK);
		getContentPane().add(digitevalor);

		moedaescolhida = new JLabel("Valor");
		moedaescolhida.setBounds(589, 110, 161, 40);
		moedaescolhida.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		moedaescolhida.setForeground(new Color(0, 255, 0));
		getContentPane().add(moedaescolhida);

		JLabel to = new JLabel("Para");
		to.setBounds(76, 191, 50, 50);
		to.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		to.setForeground(new Color(0, 255, 0));
		getContentPane().add(to);

		moedaconvert = new JComboBox(new String[] { "Selecione..", "India", "Paquistão", "USA", "Canada", "Quênia",
				"Nigéria", "Brasil", "Indonésia", "Philippine" });
		moedaconvert.setBounds(158, 196, 200, 40);
		moedaconvert.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		moedaconvert.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(ItemEvent evt) {
				tocountryItemStateChanged(evt);
			}
		});
		getContentPane().add(moedaconvert);

		Responda = new TextField(" ");
		Responda.setBounds(419, 196, 144, 40);
		Responda.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		Responda.setForeground(Color.BLACK);
		getContentPane().add(Responda);

		corvertmoeda = new JLabel("Valor");
		corvertmoeda.setBounds(589, 192, 161, 50);
		corvertmoeda.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		corvertmoeda.setForeground(new Color(0, 255, 0));
		getContentPane().add(corvertmoeda);

		converter = new JButton("Converta");
		converter.setBounds(100, 329, 200, 40);
		converter.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		converter.addActionListener(this);
		getContentPane().add(converter);

		limpar = new JButton("Limpar");
		limpar.setBounds(339, 329, 200, 40);
		limpar.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		limpar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		getContentPane().add(limpar);

		sair = new JButton("Sair");
		sair.setBounds(573, 329, 100, 40);
		sair.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		sair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		getContentPane().add(sair);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		escolhamoeda.setSelectedIndex(0);
		moedaconvert.setSelectedIndex(0);
		digitevalor.setText(null);
		Responda.setText(null);
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	public static void main(String[] args) {
		new ConvertCoins();
	}

	private void fromcountryItemStateChanged(java.awt.event.ItemEvent evt) {
		int position = escolhamoeda.getSelectedIndex();
		moedaescolhida.setText(unidadesDeMoeda[position]);
	}

	private void tocountryItemStateChanged(java.awt.event.ItemEvent evt) {
		int position = moedaconvert.getSelectedIndex();
		corvertmoeda.setText(unidadesDeMoeda[position]);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == converter) {
			if (escolhamoeda.getSelectedIndex() == 0 || moedaconvert.getSelectedIndex() == 0
					|| digitevalor.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Invalid Input", "Getting Error", JOptionPane.ERROR_MESSAGE);

			} else {
				double amountToChange = Double.parseDouble(digitevalor.getText());
				double amountInPounds = 0.0;
				switch (escolhamoeda.getSelectedItem().toString()) {
				case "India":
					amountInPounds = amountToChange / India_Rupee;
					break;
				case "Paquistão":
					amountInPounds = amountToChange / Paquistao_Rupee;
					break;
				case "USA":
					amountInPounds = amountToChange / US_Dollar;
					break;
				case "Canada":
					amountInPounds = amountToChange / Dollar_Canadense;
					break;
				case "Quênia":
					amountInPounds = amountToChange / Quenia_Shilling;
					break;
				case "Nigéria":
					amountInPounds = amountToChange / Nigeria_Naira;
					break;
				case "Brasil":
					amountInPounds = amountToChange / Brasil_Real;
					break;
				case "Indonésia":
					amountInPounds = amountToChange / Indonesia_Rupiah;
					break;
				case "Philippine":
					amountInPounds = amountToChange / Philippine_Pisco;
					break;
				default:
					amountInPounds = 0.0;
				}

				double newamount = 0.0;
				switch (moedaconvert.getSelectedItem().toString()) {
				case "India":
					newamount = amountInPounds * India_Rupee;
				case "Paquistão":
					newamount = amountInPounds * Paquistao_Rupee;
					break;
				case "USA":
					newamount = amountInPounds * US_Dollar;
					break;
				case "Canada":
					newamount = amountInPounds * Dollar_Canadense;
					break;
				case "Quênia":
					newamount = amountInPounds * Quenia_Shilling;
					break;
				case "Nigéria":
					newamount = amountInPounds * Nigeria_Naira;
					break;
				case "Brasil":
					newamount = amountInPounds * Brasil_Real;
					break;
				case "Indonésia":
					newamount = amountInPounds * Indonesia_Rupiah;
					break;
				case "Philippine":
					newamount = amountInPounds * Philippine_Pisco;
					break;
				default:
					newamount = amountInPounds = 0.0;
				}
				String amount = String.format("%.2f", newamount);
				Responda.setText(amount);
			}
		}

	}
}
