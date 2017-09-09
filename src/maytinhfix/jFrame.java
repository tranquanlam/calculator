package maytinhfix;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Desktop.Action;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class jFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double ketqua;
	private JPanel contentPane;
	private String pheptoan;
	
	JButton[] buttons = new JButton[30];
	JTextField textField = new JTextField();
	///ham tạo jframe
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					jFrame frame = new jFrame();
					frame.setSize(355, 421);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		add
       
	}
	///hàm khoi tạo jframe
	public jFrame() {
		
        getContentPane().setLayout(null);
		textField.setBounds(5, 0, 326, 63);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		int kichcodoc=69;
		int kichcongang=0;
		int chieudai=62;
		int chieurong=34;
//		try{
//		buttons[0] =new JButton("MC");
//		buttons[0].setBounds(0, 69, 62, 34);
//		getContentPane().add(buttons[0]);}
//		catch(Exception e){
//			System.out.println(e);
//		}
		
		for(int i=1;i<buttons.length;i++){
		
			buttons[i] =new JButton();
			if(i==25){chieurong=79;}
			if(i==26){chieudai=128;}
			if(i==27||i==28){chieudai=62;chieurong=34;}
			buttons[i].setBounds(kichcongang,kichcodoc , chieudai, chieurong);
			getContentPane().add(buttons[i]);
			kichcongang+=65;
			if(kichcongang==325){
				           kichcongang=0;
		                   kichcodoc+=40;
		                   }
			if(i==25){chieurong=34;}
			if(i==26){chieudai=62;}
						}
		buttons[1].setText("MC");
		buttons[2].setText("MR");
		buttons[3].setText("MS");
		buttons[4].setText("M+");		
		buttons[5].setText("M-");
		buttons[6].setText("\u2190");
		buttons[7].setText("CE");
		buttons[8].setText("C");
		buttons[9].setText("\u00B1");
		buttons[10].setText("\u221A");
	    buttons[11].setText("7");
	    buttons[12].setText("8");
	    buttons[13].setText("9");
	    buttons[14].setText("/");
	    buttons[15].setText("%");
	    buttons[16].setText("4");
	    buttons[17].setText("5");
	    buttons[18].setText("6");
	    buttons[19].setText("*");
	    buttons[20].setText("1/x");
	    buttons[21].setText("1");
	    buttons[22].setText("2");
	    buttons[23].setText("3");
	    buttons[24].setText("-");
	    buttons[25].setText("=");
	    buttons[26].setText("0");
	    buttons[27].setText(".");
	    buttons[28].setText("+");
	
	}
	public jFrame () {
		
		buttons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttons[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});buttons[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});buttons[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});buttons[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});buttons[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String l =textField.getText();
			    l=l.substring(0,l.length()-1);
			    textField.setText(l);
			}
		});buttons[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});buttons[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});buttons[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});buttons[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double so1= Double.valueOf(textField.getText());
				ketqua=Math.sqrt(so1);
				pheptoan="can";
			}
		});buttons[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+7);
			}
		});buttons[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+8);
			}
		});buttons[13].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+9);
			}
		});buttons[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double so1=Double.valueOf(textField.getText());
				ketqua=so1;
				textField.setText(null);
				pheptoan="/";
			}
		});buttons[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double so1 = Double.valueOf(textField.getText());
				ketqua = so1;
				textField.setText(null);
				pheptoan = "%";
			}
		});buttons[16].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+4);
			}
		});buttons[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+5);
			}
		});buttons[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+6);
			}
		});buttons[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double so1 = Double.valueOf(textField.getText());
				ketqua = so1;
				textField.setText(null);
				pheptoan = "*";
			}
		});buttons[20].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double so1= Double.parseDouble(textField.getText());
				ketqua=1/so1;
				pheptoan="1/x";
			}
		});buttons[21].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+1);
			}
		});buttons[22].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+2);
			}
		});buttons[23].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+3);
			}
		});buttons[24].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double so1 = Double.valueOf(textField.getText());
				ketqua = so1;
				textField.setText(null);
				pheptoan = "-";
			}
		});buttons[25].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		});buttons[26].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+0);
			}
		});
		buttons[27].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+".");
			}
		});
		buttons[28].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double so1= Double.valueOf(textField.getText());
				ketqua=so1;
				textField.setText(null);
				pheptoan="+";
			}
		});
		
		
	}
	}

