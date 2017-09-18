package maytinhfix;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Desktop.Action;
import java.awt.EventQueue;
import java.awt.LayoutManager;
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

public class jFrame extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static double ketqua;
	private JPanel contentPane;
	private static String pheptoan;
	
	
	static JButton[] buttons = new JButton[30];
	static JTextField textField = new JTextField();
	
	
public  jFrame() {
		
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
	    buttons[29].setText("+");
	    buttons[28].setText(".");
	    
	    getContentPane().add(buttons[1]);			
	    getContentPane().add(buttons[2]);			
	    getContentPane().add(buttons[3]);			
	    getContentPane().add(buttons[4]);			
	    getContentPane().add(buttons[5]);			
	    getContentPane().add(buttons[6]);			
	    getContentPane().add(buttons[7]);			
	    getContentPane().add(buttons[8]);			
	    getContentPane().add(buttons[9]);			
	    getContentPane().add(buttons[10]);			
	    getContentPane().add(buttons[11]);			
	    getContentPane().add(buttons[12]);			
	    getContentPane().add(buttons[13]);			
	    getContentPane().add(buttons[14]);			
	    getContentPane().add(buttons[15]);			
	    getContentPane().add(buttons[16]);			
	    getContentPane().add(buttons[17]);			
	    getContentPane().add(buttons[18]);			
	    getContentPane().add(buttons[19]);			
	    getContentPane().add(buttons[20]);			
	    getContentPane().add(buttons[21]);			
	    getContentPane().add(buttons[22]);			
	    getContentPane().add(buttons[23]);			
	    getContentPane().add(buttons[24]);			
	    getContentPane().add(buttons[25]);			
	    getContentPane().add(buttons[26]);			
	    getContentPane().add(buttons[28]);			
	    getContentPane().add(buttons[29]);
	    
	    buttons[1].addActionListener(this);			
	    buttons[2].addActionListener(this);			
	    buttons[3].addActionListener(this);			
	    buttons[4].addActionListener(this);			
	    buttons[5].addActionListener(this);			
	    buttons[6].addActionListener(this);			
	    buttons[7].addActionListener(this);			
	    buttons[8].addActionListener(this);			
	    buttons[9].addActionListener(this);			
	    buttons[10].addActionListener(this);			
	    buttons[11].addActionListener(this);			
	    buttons[12].addActionListener(this);			
	    buttons[13].addActionListener(this);			
	    buttons[14].addActionListener(this);			
	    buttons[15].addActionListener(this);			
	    buttons[16].addActionListener(this);			
	    buttons[17].addActionListener(this);			
	    buttons[18].addActionListener(this);			
	    buttons[19].addActionListener(this);			
	    buttons[20].addActionListener(this);			
	    buttons[21].addActionListener(this);			
	    buttons[22].addActionListener(this);			
	    buttons[23].addActionListener(this);			
	    buttons[24].addActionListener(this);			
	    buttons[25].addActionListener(this);			
	    buttons[26].addActionListener(this);			
	    buttons[29].addActionListener(this);			
	    buttons[28].addActionListener(this);
	    
	     
	}
	
	
	
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
		
	
	}
	///hàm khoi tạo jframe

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b= (JButton) e.getSource();
		
		
		if(b==buttons[11]){
			textField.setText(textField.getText()+7);}
		if(b==buttons[12]){
			textField.setText(textField.getText()+8);}
		if(b==buttons[13]){
			textField.setText(textField.getText()+9);}
		if(b==buttons[16]){
			textField.setText(textField.getText()+4);}
		if(b==buttons[17]){
			textField.setText(textField.getText()+5);}
		if(b==buttons[18]){
			textField.setText(textField.getText()+6);}
		if(b==buttons[21]){
			textField.setText(textField.getText()+1);}
		if(b==buttons[22]){
			textField.setText(textField.getText()+2);}
		if(b==buttons[23]){
			textField.setText(textField.getText()+3);}
		if(b==buttons[6]){
			String l =textField.getText();
		    l=l.substring(0,l.length()-1);
		    textField.setText(l);}
		if(b==buttons[8]){
			textField.setText(null);}
		if(b==buttons[10]){
			Double so1= Double.valueOf(textField.getText());
			ketqua=Math.sqrt(so1);
			pheptoan="can";}
		if(b==buttons[25]){
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
		if(b==buttons[28]){
			textField.setText(textField.getText()+".");
			String chuoi =textField.getText();
			String[] str =chuoi.split("");
			int dem=0;
			for(int i=0;i<str.length;i++){
				if(str[i].equals(".")){
					dem++;
				}
			}
			if(dem>1){
				JOptionPane.showMessageDialog(buttons[28], "chi duoc nhap 1 lan");
				String l=textField.getText();
				l=l.substring(0, l.length()-1);
				textField.setText(l);
			}}
		if(b==buttons[29]){
			Double so1= Double.valueOf(textField.getText());
			ketqua=so1;
			textField.setText(null);
			pheptoan="+";}
		if(b==buttons[26]){
			textField.setText(textField.getText()+0);}
		if(b==buttons[24]){
			Double so1 = Double.valueOf(textField.getText());
			ketqua = so1;
			textField.setText(null);
			pheptoan = "-";}
		if(b==buttons[20]){
			Double so1= Double.parseDouble(textField.getText());
			ketqua=1/so1;
			pheptoan="1/x";
			textField.setText(null);
			}
		if(b==buttons[19]){
			double so1 = Double.valueOf(textField.getText());
			ketqua = so1;
			textField.setText(null);
			pheptoan = "*";
			}
		if(b==buttons[14]){
			Double so1=Double.valueOf(textField.getText());
			ketqua=so1;
			textField.setText(null);
			pheptoan="/";
			}
		if(b==buttons[15]){
			double so1 = Double.valueOf(textField.getText());
			ketqua = so1;
			textField.setText(null);
			pheptoan = "%";}
		
		
	}
	}

