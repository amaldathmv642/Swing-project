package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Studnt {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studnt window = new Studnt();
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
	public Studnt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1344, 676);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(121, 10, 267, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStudentid.setBounds(23, 52, 267, 32);
		frame.getContentPane().add(lblStudentid);
		
		JLabel lblFirstname = new JLabel("First Name");
		lblFirstname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFirstname.setBounds(23, 94, 267, 32);
		frame.getContentPane().add(lblFirstname);
		
		JLabel lblSurname = new JLabel("Sur Name");
		lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSurname.setBounds(23, 135, 267, 32);
		frame.getContentPane().add(lblSurname);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCourseCode.setBounds(23, 183, 267, 32);
		frame.getContentPane().add(lblCourseCode);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaths.setBounds(428, 47, 267, 32);
		frame.getContentPane().add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnglish.setBounds(428, 94, 267, 32);
		frame.getContentPane().add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBiology.setBounds(428, 135, 267, 32);
		frame.getContentPane().add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblComputer.setBounds(428, 183, 267, 32);
		frame.getContentPane().add(lblComputer);
		
		textField = new JTextField();
		textField.setBounds(142, 52, 171, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 94, 171, 28);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(142, 139, 171, 28);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(513, 52, 171, 28);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(513, 97, 171, 28);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(513, 139, 171, 28);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(513, 181, 171, 28);
		frame.getContentPane().add(textField_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1012A", "1012B", "1012C", "1013F", "1022D"}));
		comboBox.setBounds(142, 187, 171, 28);
		frame.getContentPane().add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 237, 352, 17);
		frame.getContentPane().add(separator);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setBackground(new Color(240, 240, 240));
		lblTotalScore.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotalScore.setBounds(23, 264, 267, 32);
		frame.getContentPane().add(lblTotalScore);
		
		JLabel lblAverageScore = new JLabel("Average Score");
		lblAverageScore.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAverageScore.setBounds(23, 306, 267, 32);
		frame.getContentPane().add(lblAverageScore);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRanking.setBounds(23, 344, 267, 32);
		frame.getContentPane().add(lblRanking);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(142, 264, 171, 28);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(142, 306, 171, 28);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(142, 348, 171, 28);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(513, 264, 171, 28);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(513, 306, 171, 28);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(513, 348, 171, 28);
		frame.getContentPane().add(textField_12);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChemistry.setBounds(428, 264, 267, 32);
		frame.getContentPane().add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPhysics.setBounds(428, 306, 267, 32);
		frame.getContentPane().add(lblPhysics);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMalayalam.setBounds(428, 344, 267, 32);
		frame.getContentPane().add(lblMalayalam);
		
		JLabel lblStudentReport = new JLabel("Student Report");
		lblStudentReport.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStudentReport.setBounds(914, 10, 267, 32);
		frame.getContentPane().add(lblStudentReport);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(747, 52, 562, 324);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(23, 10, 529, 269);
		panel.add(textArea);
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textArea.setText(null);
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(228, 281, 93, 43);
		panel.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Add Report");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int s=Integer.parseInt(textField.getText());
			String c=(String) comboBox.getSelectedItem();
			
			int m=Integer.parseInt(textField_3.getText());
			int e1=Integer.parseInt(textField_4.getText());
			int b=Integer.parseInt(textField_5.getText());
			int c1=Integer.parseInt(textField_6.getText());
			int ch=Integer.parseInt(textField_10.getText());
			int p=Integer.parseInt(textField_11.getText());
			int t=Integer.parseInt(textField_14.getText());
			int m1=Integer.parseInt(textField_12.getText());
			double total=m+e1+b+c1+ch+p+t+m1;
			textField_7.setText(String.format("%.2f",total));
			double average=total/8;
			textField_8.setText(String.format("%.2f", average));
			double r=average;
			if(r>=85)
			{
			textField_9.setText("Rank 1");	
			}
			if(r<85&&r>=70)
			{
			textField_9.setText("Rank 2");	
			}
			if(r<70&&r>=65)
			{
				textField_9.setText("Rank 3");
			}
			if(r<65&&r>=50)
			{
				textField_9.setText("Rank 4");
			}
			if(r<50&&r>=45)
			{
				textField_9.setText("Rank 5");
			}
			if(r<=45)
			{
				textField_9.setText("Fail");
			}
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			{
				model.addRow(new String[]
				{
					textField.getText(),
					(String)comboBox.getSelectedItem(),
					textField_3.getText(),
					textField_4.getText(),
					textField_5.getText(),
					textField_6.getText(),
					textField_10.getText(),
					textField_11.getText(),
					textField_14.getText(),
					textField_12.getText(),
					textField_7.getText(),
					textField_8.getText(),
					textField_9.getText()
				});
			}
			}
		});
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(42, 578, 132, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Delete");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.removeRow(row);
			}
		});
		btnNewButton_1_1.setForeground(Color.CYAN);
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(274, 578, 132, 32);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Show Report");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  textArea.append("\n Studen Record\n"+" Student Name:\t\t\t\t\t\t\t "
				  +textField_1.getText()+"\n=========================="+"\n Maths:\t\t\t\t\t"
				 +textField_3.getText()
				  +"\n English:\t\t\t\t\t"+textField_4.getText()+"\n Biology:\t\t\t\t\t"
				  +textField_5.getText()+"\n Computer:\t\t\t\t\t"+textField_6.getText()
				  +"\n Chemistry:\t\t\t\t\t"+textField_10.getText()+"\n Physics:\t\t\t\t\t"
				  +textField_11.getText()+"\n Tamil:\t\t\t\t\t"+textField_14.getText()
				  +"\n Malayalam :\t\t\t\t\t"+textField_4.getText()+
				  "\n======================="+"\n Total:\t\t\t\t\t"+textField_7.getText()+
				  "\n Average:\t\t\t\t\t"+textField_8.getText()+"\n Ranking:\t\t\t\t\t"
				  +textField_9.getText());
				 
			}
		});
		btnNewButton_1_2.setBackground(Color.CYAN);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2.setBounds(513, 578, 132, 32);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Exit");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
			{
				System.exit(0);
			}
			}
		});
		btnNewButton_1_3.setBackground(Color.PINK);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_3.setBounds(731, 578, 132, 32);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Reset");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_14.setText(null);
			}
		});
		btnNewButton_1_4.setBackground(Color.YELLOW);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_4.setBounds(961, 578, 132, 32);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(42, 416, 1267, 152);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course_id","Maths"," English"," Biology"," Computer"," Chemistry","Physics"," Tamil"," Malayalam","Total_S","Average","Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(44, 10, 1184, 132);
		panel_1.add(table);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(513, 386, 171, 28);
		frame.getContentPane().add(textField_14);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTamil.setBounds(428, 386, 267, 32);
		frame.getContentPane().add(lblTamil);
	}
}
