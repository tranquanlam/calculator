package MAYTINH;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.DisplayMode;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Panel;

public class tinh extends JFrame{
	private JTextField textField;
	private double ketqua;
	private String pheptoan;

	public tinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 421);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmView = new JMenuItem("view");
		menuBar.add(mntmView);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("hepl");
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("edit");
		menuBar.add(mntmNewMenuItem_1);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 326, 63);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("MC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 69, 62, 34);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\u2190");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String l =textField.getText();
			    l=l.substring(0,l.length()-1);
			    textField.setText(l);
			}
		});
		button.setBounds(0, 114, 62, 34);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+7);
			}
		});
		button_1.setBounds(0, 154, 62, 34);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+4);
			}
		});
		button_2.setBounds(0, 199, 62, 34);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("1");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+1);
			}
		});
		button_3.setBounds(0, 244, 62, 34);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("0");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+0);
			}
		});
		button_4.setBounds(0, 289, 128, 34);
		getContentPane().add(button_4);
		
		JButton btnMr = new JButton("MR");
		btnMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMr.setBounds(66, 69, 62, 34);
		getContentPane().add(btnMr);
		
		JButton btnMs = new JButton("MS");
		btnMs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMs.setBounds(133, 69, 62, 34);
		getContentPane().add(btnMs);
		
		JButton btnM = new JButton("M+");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnM.setBounds(199, 69, 62, 34);
		getContentPane().add(btnM);
		
		JButton btnM_1 = new JButton("M-");
		btnM_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnM_1.setBounds(264, 69, 62, 34);
		getContentPane().add(btnM_1);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCe.setBounds(66, 114, 62, 34);
		getContentPane().add(btnCe);
		
		JButton button_10 = new JButton("8");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+8);
			}
		});
		button_10.setBounds(66, 154, 62, 34);
		getContentPane().add(button_10);
		
		JButton button_11 = new JButton("5");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+5);
			}
		});
		button_11.setBounds(66, 199, 62, 34);
		getContentPane().add(button_11);
		
		JButton button_12 = new JButton("2");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+2);
			}
		});
		button_12.setBounds(66, 244, 62, 34);
		getContentPane().add(button_12);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(133, 114, 62, 34);
		getContentPane().add(btnC);
		
		JButton button_15 = new JButton("9");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+9);
			}
		});
		button_15.setBounds(133, 154, 62, 34);
		getContentPane().add(button_15);
		
		JButton button_16 = new JButton("6");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+6);
			}
		});
		button_16.setBounds(133, 199, 62, 34);
		getContentPane().add(button_16);
		
		JButton button_17 = new JButton("3");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+3);
			}
		});
		button_17.setBounds(133, 244, 62, 34);
		getContentPane().add(button_17);
		
		JButton button_18 = new JButton(".");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		button_18.setBounds(133, 289, 62, 34);
		getContentPane().add(button_18);
		
		JButton button_19 = new JButton("\u00B1");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_19.setBounds(199, 114, 62, 34);
		getContentPane().add(button_19);
		
		JButton button_20 = new JButton("/");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double so1=Double.valueOf(textField.getText());
				ketqua=so1;
				textField.setText(null);
				pheptoan="/";
			}
		});
		button_20.setBounds(199, 154, 62, 34);
		getContentPane().add(button_20);
		
		JButton button_21 = new JButton("*");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double so1 = Double.valueOf(textField.getText());
				ketqua = so1;
				textField.setText(null);
				pheptoan = "*";
			}
		});
		button_21.setBounds(199, 199, 62, 34);
		getContentPane().add(button_21);
		
		JButton button_22 = new JButton("-");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double so1 = Double.valueOf(textField.getText());
				ketqua = so1;
				textField.setText(null);
				pheptoan = "-";
			}
		});
		button_22.setBounds(199, 244, 62, 34);
		getContentPane().add(button_22);
		
		JButton button_23 = new JButton("+");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double so1= Double.valueOf(textField.getText());
				ketqua=so1;
				textField.setText(null);
				pheptoan="+";
				
			}
		});
		button_23.setBounds(199, 289, 62, 34);
		getContentPane().add(button_23);
		
		JButton button_24 = new JButton("\u221A");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JButton button_25 = new JButton("%");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double so1 = Double.valueOf(textField.getText());
				ketqua = so1;
				textField.setText(null);
				pheptoan = "%";
			}
		});
		button_25.setBounds(264, 154, 62, 34);
		getContentPane().add(button_25);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double so1= Double.parseDouble(textField.getText());
				ketqua=1/so1;
				pheptoan="1/x";
				
			}
		});
		btnx.setBounds(264, 199, 62, 34);
		getContentPane().add(btnx);
		
		JButton button_27 = new JButton("=");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (pheptoan) {
				case "+":
					textField.setText(String.valueOf(ketqua+Double.parseDouble(textField.getText())));	
					break;
				case "/":
					textField.setText(String.valueOf(ketqua/Double.parseDouble(textField.getText())));
					break;
				case "*":
					textField.setText(String.valueOf(ketqua*Double.parseDouble(textField.getText())));
					break;
				case "-":
					textField.setText(String.valueOf(ketqua-Double.parseDouble(textField.getText())));
					break;
				case "1/x":
					textField.setText(String.valueOf(ketqua));
					break;
				case "%":
					textField.setText(String.valueOf((ketqua / Double.parseDouble(textField.getText())) * 100) + "%");
					break;
				case "can":
					textField.setText(String.valueOf(ketqua));
					break;

				default:
					break;
				}
				
			
			}
		});
		button_27.setBounds(264, 244, 62, 79);
		getContentPane().add(button_27);
		
		JButton button_5 = new JButton("\u221A");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double so1= Double.valueOf(textField.getText());
				ketqua=Math.sqrt(so1);
				pheptoan="can";
			}
		});
		button_5.setBounds(264, 114, 62, 34);
		getContentPane().add(button_5);
	}
	
public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinh frame = new tinh();
					frame.setVisible(true);
					frame.setSize(350, 410);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
}
