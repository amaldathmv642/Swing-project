package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class SimpleCalculator {
double n1,n2,result;
String op;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.getContentPane().setForeground(Color.BLUE);
		frame.setBounds(100, 100, 1135, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIMPLE CALCULATOR");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(251, 31, 208, 24);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(146, 81, 313, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		String a=textField.getText()+btnNewButton.getText();
		textField.setText(a);
		
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(25, 203, 43, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=textField.getText()+btnNewButton_1.getText();
				textField.setText(b);
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(83, 203, 43, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c=textField.getText()+btnNewButton_2.getText();
				textField.setText(c);	
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(136, 203, 43, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("6");
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g=textField.getText()+btnNewButton_3.getText();
				textField.setText(g);		
			}
		});
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(25, 248, 43, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_2 = new JButton("5");
		btnNewButton_3_2.setForeground(Color.BLUE);
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g=textField.getText()+btnNewButton_3_2.getText();
				textField.setText(g);		
			}
		});
		btnNewButton_3_2.setBackground(Color.WHITE);
		btnNewButton_3_2.setBounds(83, 248, 43, 21);
		frame.getContentPane().add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("4");
		btnNewButton_3_3.setForeground(Color.BLUE);
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String j=textField.getText()+btnNewButton_3_3.getText();
				textField.setText(j);		
			}
		});
		btnNewButton_3_3.setBackground(Color.WHITE);
		btnNewButton_3_3.setBounds(136, 248, 43, 21);
		frame.getContentPane().add(btnNewButton_3_3);
		
		JButton btnNewButton_3_4 = new JButton("3");
		btnNewButton_3_4.setForeground(Color.BLUE);
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g=textField.getText()+btnNewButton_3_4.getText();
				textField.setText(g);		
			}
		});
		btnNewButton_3_4.setBackground(Color.WHITE);
		btnNewButton_3_4.setBounds(25, 294, 43, 21);
		frame.getContentPane().add(btnNewButton_3_4);
		
		JButton btnNewButton_3_4_1 = new JButton("2");
		btnNewButton_3_4_1.setForeground(Color.BLUE);
		btnNewButton_3_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g=textField.getText()+btnNewButton_3_4_1.getText();
				textField.setText(g);		
			}
		});
		btnNewButton_3_4_1.setBackground(Color.WHITE);
		btnNewButton_3_4_1.setBounds(83, 294, 43, 21);
		frame.getContentPane().add(btnNewButton_3_4_1);
		
		JButton btnNewButton_3_4_2 = new JButton("1");
		btnNewButton_3_4_2.setForeground(Color.BLUE);
		btnNewButton_3_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String k=textField.getText()+btnNewButton_3_4_2.getText();
				textField.setText(k);		
			}
		});
		btnNewButton_3_4_2.setBackground(Color.WHITE);
		btnNewButton_3_4_2.setBounds(136, 294, 43, 21);
		frame.getContentPane().add(btnNewButton_3_4_2);
		
		JButton btnNewButton_3_4_2_1_1 = new JButton("<-");
		btnNewButton_3_4_2_1_1.setForeground(Color.BLUE);
		btnNewButton_3_4_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String b=null;
			if(textField.getText().length()>0)
			{
				StringBuilder str=new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				b=str.toString();
				textField.setText(b);
			}
			}
		});
		btnNewButton_3_4_2_1_1.setBackground(Color.WHITE);
		btnNewButton_3_4_2_1_1.setBounds(299, 340, 49, 24);
		frame.getContentPane().add(btnNewButton_3_4_2_1_1);
		
		JButton btnNewButton_3_4_2_1_1_1 = new JButton("%");
		btnNewButton_3_4_2_1_1_1.setForeground(Color.BLUE);
		btnNewButton_3_4_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				op="%";
				textField.setText(null);			
			}
		});
		btnNewButton_3_4_2_1_1_1.setBackground(Color.WHITE);
		btnNewButton_3_4_2_1_1_1.setBounds(299, 292, 49, 26);
		frame.getContentPane().add(btnNewButton_3_4_2_1_1_1);
		
		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				n1=Double.parseDouble(textField.getText());
				op="+";
				textField.setText(null);
			}
		});
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setBounds(213, 201, 49, 24);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("x");
		btnNewButton_4_1.setForeground(Color.BLUE);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				op="x";
				textField.setText(null);	
			}
		});
		btnNewButton_4_1.setBackground(Color.WHITE);
		btnNewButton_4_1.setBounds(213, 246, 49, 24);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_1 = new JButton("-");
		btnNewButton_4_1_1.setForeground(Color.BLUE);
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				op="-";
				textField.setText(null);		
			}
		});
		btnNewButton_4_1_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1.setBounds(213, 292, 49, 24);
		frame.getContentPane().add(btnNewButton_4_1_1);
		
		JButton btnNewButton_4_1_1_1 = new JButton("/");
		btnNewButton_4_1_1_1.setForeground(Color.BLUE);
		btnNewButton_4_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				op="/";
				textField.setText(null);			
			}
		});
		btnNewButton_4_1_1_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1_1.setBounds(213, 340, 49, 24);
		frame.getContentPane().add(btnNewButton_4_1_1_1);
		
		JButton btnNewButton_4_1_1_2_1 = new JButton(".");
		btnNewButton_4_1_1_2_1.setForeground(Color.BLUE);
		btnNewButton_4_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g=textField.getText()+btnNewButton_4_1_1_2_1.getText();
				textField.setText(g);		
			}
		});
		btnNewButton_4_1_1_2_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1_2_1.setBounds(373, 338, 49, 28);
		frame.getContentPane().add(btnNewButton_4_1_1_2_1);
		
		JButton btnNewButton_4_1_1_2_1_1 = new JButton("AC");
		btnNewButton_4_1_1_2_1_1.setForeground(Color.BLUE);
		btnNewButton_4_1_1_2_1_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);		
			}
		});
		btnNewButton_4_1_1_2_1_1.setBounds(562, 468, 74, 31);
		frame.getContentPane().add(btnNewButton_4_1_1_2_1_1);
		
		JButton btnNewButton_2_1 = new JButton("sin");
		btnNewButton_2_1.setForeground(Color.BLUE);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				double g=Math.sin(n1);
				String t=String.format("%.2f",g);
				textField.setText(t);
			}
		});
		btnNewButton_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1.setBounds(462, 260, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("cos");
		btnNewButton_2_1_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				double s=Math.cos(n1);
				String z=String.format(" %.2f",s);
				textField.setText(z);
				
			}
		});
		btnNewButton_2_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1.setBounds(462, 328, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("tan");
		btnNewButton_2_1_1_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				double p=Math.tan(n1);
				String z=String.format(" %.2f",p);
				textField.setText(z);		
			}
		});
		btnNewButton_2_1_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1.setBounds(462, 392, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_4_1_1_2_1_1_1 = new JButton("sqt");
		btnNewButton_4_1_1_2_1_1_1.setForeground(Color.BLUE);
		btnNewButton_4_1_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				double p=Math.sqrt(n1);
				String z=String.format(" %.2f",p);
				textField.setText(z);			
			}
		});
		btnNewButton_4_1_1_2_1_1_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1_2_1_1_1.setBounds(462, 196, 74, 35);
		frame.getContentPane().add(btnNewButton_4_1_1_2_1_1_1);
		
		JButton btnNewButton_4_1_1_2_1_1_1_1 = new JButton("del");
		btnNewButton_4_1_1_2_1_1_1_1.setForeground(Color.BLUE);
		btnNewButton_4_1_1_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g=textField.getText()+btnNewButton_4_1_1_2_1_1_1_1.getText();
				textField.setText(g);		
			}
		});
		btnNewButton_4_1_1_2_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1_2_1_1_1_1.setBounds(462, 468, 74, 35);
		frame.getContentPane().add(btnNewButton_4_1_1_2_1_1_1_1);
		
		JButton btnNewButton_4_1_1_2_1_1_1_1_1 = new JButton("^");
		btnNewButton_4_1_1_2_1_1_1_1_1.setForeground(Color.BLUE);
		btnNewButton_4_1_1_2_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				
				double p=Math.pow(n1,n2);
				String z=String.format(" %.2f",p);
				textField.setText(z);	
						
			}
		});
		btnNewButton_4_1_1_2_1_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1_2_1_1_1_1_1.setBounds(299, 247, 49, 23);
		frame.getContentPane().add(btnNewButton_4_1_1_2_1_1_1_1_1);
		
		JButton btnNewButton_4_1_1_2_1_1_1_1_1_1 = new JButton("(");
		btnNewButton_4_1_1_2_1_1_1_1_1_1.setForeground(Color.BLUE);
		btnNewButton_4_1_1_2_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g=textField.getText()+btnNewButton_4_1_1_2_1_1_1_1_1_1.getText();
				textField.setText(g);		
			}
		});
		btnNewButton_4_1_1_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1_2_1_1_1_1_1_1.setBounds(83, 340, 43, 22);
		frame.getContentPane().add(btnNewButton_4_1_1_2_1_1_1_1_1_1);
		
		JButton btnNewButton_4_1_1_2_1_1_1_1_1_1_1 = new JButton(")");
		btnNewButton_4_1_1_2_1_1_1_1_1_1_1.setForeground(Color.BLUE);
		btnNewButton_4_1_1_2_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g=textField.getText()+btnNewButton_4_1_1_2_1_1_1_1_1_1_1.getText();
				textField.setText(g);	
			}
		});
		btnNewButton_4_1_1_2_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_4_1_1_2_1_1_1_1_1_1_1.setBounds(136, 340, 43, 21);
		frame.getContentPane().add(btnNewButton_4_1_1_2_1_1_1_1_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBounds(686, 10, 425, 321);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.PINK);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"India", "UK  ", "US", "RUSSIA", "ARAB"}));
		comboBox.setToolTipText("converter");
		comboBox.setBounds(68, 47, 242, 28);
		panel.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("CONVERTER");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(134, 10, 157, 27);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_5 = new JButton("Clear");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
			}
		});
		btnNewButton_5.setBounds(51, 207, 105, 34);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Convert");
		
		double UK=1.2;
		double US=5;
		double ARAB=3;
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double db=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("India"))
			{
					String c= String.format("Rs.%.2f",db);
					textField_2.setText(c);
					
				}
				if(comboBox.getSelectedItem().equals("UK"))
				{
					String c=String.format("Dollar.%.2f",db*UK);
			        textField_2.setText(c);
				}
				if(comboBox.getSelectedItem().equals("US"))
				{
					String c=String.format("UsDollar.%.2f",db*US);
					textField_2.setText(c);
				}
				if(comboBox.getSelectedItem().equals("ARAB"))
				{
					String c=String.format("Riyal.%.2f",db*ARAB);
				}
			}
		});
		btnNewButton_6.setBounds(263, 207, 96, 34);
		panel.add(btnNewButton_6);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 136, 162, 34);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 94, 162, 28);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_3_4_3 = new JButton("0");
		btnNewButton_3_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g=textField.getText()+btnNewButton_3_4_3.getText();
				textField.setText(g);	
			}
		});
		btnNewButton_3_4_3.setForeground(Color.BLUE);
		btnNewButton_3_4_3.setBackground(Color.WHITE);
		btnNewButton_3_4_3.setBounds(25, 340, 43, 23);
		frame.getContentPane().add(btnNewButton_3_4_3);
		
		JButton btnNewButton_3_4_4 = new JButton("=");
		btnNewButton_3_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			n2=Double.parseDouble(textField.getText());
			if(op=="+")
			{
				result=n1+n2;
				String ans=String.format("%.2f", result);
				textField.setText(ans);
			}
			if(op=="-")
			{
				result=n1-n2;
				String ans=String.format("%.2f", result);
				textField.setText(ans);
			}
			if(op=="x")
			{
				result=n1*n2;
				String ans=String.format("%.2f", result);
				textField.setText(ans);
			}
			if(op=="/")
			{
				result=n1/n2;
				String ans=String.format("%.2f", result);
				textField.setText(ans);
			}
			if(op=="%")
			{
				result=n1%n2;
				String ans=String.format("%.2f", result);
				textField.setText(ans);
			}
			if(op=="x^y")
			{
				result=Math.pow(n1, n2);
				String ans=String.format("%.2f",result);
				textField.setText(ans);
			}
				/*
				 * if(op=="1/x") { result=1/n1; String ans=String.format("%.2f",result);
				 * textField.setText(ans); }
				 */
			}
		});
		btnNewButton_3_4_4.setForeground(Color.BLUE);
		btnNewButton_3_4_4.setBackground(Color.WHITE);
		btnNewButton_3_4_4.setBounds(373, 244, 49, 28);
		frame.getContentPane().add(btnNewButton_3_4_4);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("L");
		btnNewButton_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1_1_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_1.setBounds(373, 294, 49, 21);
		frame.getContentPane().add(btnNewButton_2_1_1_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("sinh");
		btnNewButton_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				double s=Math.sinh(n1);
				String z=String.format(" %.2f",s);
				textField.setText(z);	
			}
		});
		btnNewButton_2_1_2.setForeground(Color.BLUE);
		btnNewButton_2_1_2.setBackground(Color.WHITE);
		btnNewButton_2_1_2.setBounds(562, 196, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_2);
		
		JButton btnNewButton_2_1_2_1 = new JButton("cosh");
		btnNewButton_2_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				double s=Math.cosh(n1);
				String z=String.format(" %.2f",s);
				textField.setText(z);	
			}
		});
		btnNewButton_2_1_2_1.setForeground(Color.BLUE);
		btnNewButton_2_1_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1_2_1.setBounds(562, 260, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_2_1);
		
		JButton btnNewButton_2_1_2_2 = new JButton("tanh");
		btnNewButton_2_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				double s=Math.tanh(n1);
				String z=String.format(" %.2f",s);
				textField.setText(z);	
			}
		});
		btnNewButton_2_1_2_2.setForeground(Color.BLUE);
		btnNewButton_2_1_2_2.setBackground(Color.WHITE);
		btnNewButton_2_1_2_2.setBounds(562, 328, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_2_2);
		
		JButton btnNewButton_2_1_2_2_1 = new JButton("cbr");
		btnNewButton_2_1_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n2=Double.parseDouble(textField.getText());
				double s=(n1/n2);
				String z=String.format(" %.2f",s);
				textField.setText(z);		
			}
		});
		btnNewButton_2_1_2_2_1.setForeground(Color.BLUE);
		btnNewButton_2_1_2_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1_2_2_1.setBounds(562, 392, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_2_2_1);
		
		JButton btnNewButton_2_1_1_1_2 = new JButton("Round");
		btnNewButton_2_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				double p=Math.round(n1);
				String z=String.format(" %.2f",p);
				textField.setText(z);
			}
		});
		btnNewButton_2_1_1_1_2.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1_2.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_2.setBounds(25, 409, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_1_1_2);
		
		JButton btnNewButton_2_1_1_1_2_1 = new JButton("Hex");
		btnNewButton_2_1_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(b));
			}
		});
		btnNewButton_2_1_1_1_2_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_2_1.setBounds(129, 409, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_1_1_2_1);
		
		JButton btnNewButton_2_1_1_1_2_1_1 = new JButton("Bin");
		btnNewButton_2_1_1_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(c));
			}
		});
		btnNewButton_2_1_1_1_2_1_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1_2_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_2_1_1.setBounds(240, 409, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_1_1_2_1_1);
		
		JButton btnNewButton_2_1_1_1_2_1_1_1 = new JButton("Oct");
		btnNewButton_2_1_1_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int d=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(d));	
			}
		});
		btnNewButton_2_1_1_1_2_1_1_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1_2_1_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_2_1_1_1.setBounds(348, 409, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_1_1_2_1_1_1);
		
		JButton btnNewButton_2_1_1_1_2_1_1_1_1 = new JButton("2Pi");
		btnNewButton_2_1_1_1_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				double s=n1*2*3.14;
				String z=String.format("%.2f", s);
				textField.setText(z);	
			}
		});
		btnNewButton_2_1_1_1_2_1_1_1_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1_2_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_2_1_1_1_1.setBounds(298, 201, 50, 23);
		frame.getContentPane().add(btnNewButton_2_1_1_1_2_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_2_1_1_1_1_1 = new JButton("Pi");
		btnNewButton_2_1_1_1_2_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			n1=Double.parseDouble(textField.getText());
			double s=n1*3.14;
			String z=String.format("%.2f", s);
			textField.setText(z);		
			}
		});
		btnNewButton_2_1_1_1_2_1_1_1_1_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1_2_1_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_2_1_1_1_1_1.setBounds(373, 200, 49, 24);
		frame.getContentPane().add(btnNewButton_2_1_1_1_2_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_2_2 = new JButton("X^Y");
		btnNewButton_2_1_1_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				op="x^y";
				textField.setText(null);
			}
		});
		btnNewButton_2_1_1_1_2_2.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1_2_2.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_2_2.setBounds(25, 468, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_1_1_2_2);
		
		JButton btnNewButton_2_1_1_1_2_2_1 = new JButton("X^2");
		btnNewButton_2_1_1_1_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				double s=n1*n1;
				String z=String.format("%.2f",s);
				textField.setText(z);	
			}
		});
		btnNewButton_2_1_1_1_2_2_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1_2_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_2_2_1.setBounds(129, 468, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_1_1_2_2_1);
		
		JButton btnNewButton_2_1_1_1_2_2_1_1 = new JButton("X^3");
		btnNewButton_2_1_1_1_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				double s=n1*n1*n1;
				String z=String.format("%.2f",s);
				textField.setText(z);
			}
		});
		btnNewButton_2_1_1_1_2_2_1_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1_2_2_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_2_2_1_1.setBounds(240, 468, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_1_1_2_2_1_1);
		
		JButton btnNewButton_2_1_1_1_2_2_1_1_1 = new JButton("1/X");
		btnNewButton_2_1_1_1_2_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=	Double.parseDouble(textField.getText());
				op="1/X";
				textField.setText(null);
			}
		});
		btnNewButton_2_1_1_1_2_2_1_1_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1_2_2_1_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_2_2_1_1_1.setBounds(348, 468, 74, 35);
		frame.getContentPane().add(btnNewButton_2_1_1_1_2_2_1_1_1);
	}
}
