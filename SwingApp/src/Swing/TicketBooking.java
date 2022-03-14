package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class TicketBooking {
int q=001;
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
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketBooking window = new TicketBooking();
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
	public TicketBooking() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 1357, 770);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(453, 0, 379, 55);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(331, 70, 218, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(176, 67, 145, 34);
		frame.getContentPane().add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(231, 343, 218, 34);
		frame.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(231, 387, 218, 34);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(231, 431, 218, 34);
		frame.getContentPane().add(textField_3);

		JSeparator separator = new JSeparator();
		separator.setBounds(43, 137, 29, -5);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(97, 137, 224, -5);
		frame.getContentPane().add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(43, 135, 782, 19);
		frame.getContentPane().add(separator_2);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(30, 160, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSingleTicket.setBounds(268, 162, 154, 21);
		frame.getContentPane().add(rdbtnSingleTicket);

		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnAdult.setBounds(531, 162, 103, 21);
		frame.getContentPane().add(rdbtnAdult);

		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnFirstClass.setBounds(30, 202, 103, 21);
		frame.getContentPane().add(rdbtnFirstClass);

		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnAc.setBounds(268, 202, 103, 21);
		frame.getContentPane().add(rdbtnAc);

		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSleeper.setBounds(531, 202, 103, 21);
		frame.getContentPane().add(rdbtnSleeper);

		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnChild.setBounds(704, 202, 103, 21);
		frame.getContentPane().add(rdbtnChild);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] { "From", "Chennai", "Manglore", "Trivandrum", "Mumbai" }));
		comboBox.setBounds(30, 247, 202, 34);
		frame.getContentPane().add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "To", "Shornur", "Hyderabad", "Goa", "Punjab" }));
		comboBox_1.setBounds(324, 247, 188, 34);
		frame.getContentPane().add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
		comboBox_2.setBounds(595, 247, 188, 34);
		frame.getContentPane().add(comboBox_2);

		JLabel lblNewLabel_1_1 = new JLabel("Tax");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(30, 340, 145, 34);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("SubTotal");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(30, 384, 145, 34);
		
		JLabel lblNewLabel_1_3 = new JLabel("Total");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(30, 428, 145, 34);
		frame.getContentPane().add(lblNewLabel_1_3);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(30, 309, 802, 21);
		frame.getContentPane().add(separator_3);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {

			// public void actionPerformed(ActionEvent e) { } }); JButton jButton = new
			// JButton(); jButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) { 
				String ddR=textField_3.getText();
			
			  textField_10.setText(ddR);
				  String tc = textField.getText();
				  textField_4.setText(tc);
			  String bc=(String)comboBox.getSelectedItem();
			  textField_5.setText(bc);
			  String cc=(String)comboBox_1.getSelectedItem();
			  textField_6.setText(cc);
			
			     
				  String qq=String.format("%d", q);
				  q++;
				  textField_9.setText(qq);
//				  String pc=textField_9.getText();
//				  textField_9.setText(pc);
//				 
				  textField_1.setText("10");
				  Calendar timer=Calendar.getInstance();
				  timer.getTime();
				  SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				  textField_8.setText(tTime.format(timer.getTime()));
				  SimpleDateFormat tdate=new SimpleDateFormat("dd:MMM:yyyy");
				  textField_7.setText(tdate.format(timer.getTime()));
				  //boolean n=JRadioButton. boolean
//			boolean	  z=rdbtnSingleTicket.isSelected(); 
//				  rdbtnSingleTicket.setSelected(z); 
//				  
//				  boolean m= rdbtnAdult.isSelected(); 
//				  rdbtnAdult.setSelected(m);
//				  
//				  rdbtnFirstClass.isSelected();
//				 rdbtnFirstClass.setSelected(n1); boolean
//				  pq=rdbtnAc.isSelected(); rdbtnAc.setSelected(pq); boolean
//				  q=rdbtnSleeper.isSelected();
//				  
//				  boolean r= rdbtnChild.isSelected();
//				  
//				  String a = textField_1.getText(); textField_4.setText(a);
				  
				  textField_11.setText("ANY");
				  int p,p1,p2,p3,p4,p5,p6,ps=0, pt=0;
				  boolean s=rdbtnSingleTicket.isSelected();
				  if(s==true)
				  {
					 p=3;}
					 else
					 {
						 p=0;
				  boolean s1=rdbtnNewRadioButton.isSelected();
				  if(s1==true)
				  {
					  p1=5;
				  }
				  else
				  {
					  p1=0;
				  }
				 boolean s2=rdbtnAdult.isSelected();
					if(s2==true)
					{
						p2=4;
					}
					else
					{
						p2=0;
					}
				 boolean s3=rdbtnFirstClass.isSelected();
				 if(s3==true)
				 {
					 p3=6;
				 }
				 else
				 {
					 p3=0;
				 }
				 boolean s4=rdbtnAc.isSelected();
				 if(s4==true)
				 {
					 p4=8;
				 }
				 else
				 {
					 p4=0;
				 }
				 boolean s5=rdbtnSleeper.isSelected();
				 if(s5==true)
				 {
				 p5=7;
				 }
				 else
				 {
					p5=0; 
				 }
				boolean s6=rdbtnChild.isSelected();
				if(s6==true)
				{
					p6=5;
				}
				else
				{
					p6=0;
				}
			     pt=p+p1+p2+p3+p4+p5+p6;
			 
				}
				int y=comboBox_1.getSelectedIndex();
				int  x=comboBox.getSelectedIndex(); 
				  switch(x) 
				  { 
			      case 1: if(x==2||y==2)
				  { 
					  ps=150;
					  }
				  break;
				  case 2:
					  if(x==2||y==3)
					  { 
						  ps=200;
						  }
					  break;
		         case 3: 
			          if(x==2||y==4) 
			          {
				        ps=170;
				        } 
				       break;
		        case 4:
				      if(x==3||y==2) 
			          {
			           ps=250;
			           }				
				       break;
								
				case 5:
				  if(x==3||y==3) 
				  { 
					  ps=300;  
					  }
				  
				  break;
//				  default:
//					  ps=0;
				  } 
				  int tot=ps+pt;
				  String h=String.format("%d",tot);
				  textField_2.setText(h);
				 int total=tot*Integer.parseInt((String) comboBox_2.getSelectedItem())+10; 
				 String y1=String.format("%d",total);
				 textField_3.setText(y1);
				 // String c=String.format("%.2f", st);
//				  textField_2.setText(c);
//				  int tt=st*Integer.parseInt((String) comboBox_2.getSelectedItem())+10;
//				  String  t=String.format("%.2f",tt);
//				  textField_3.setText(t);
//			      String ab=(String)comboBox.getSelectedItem(); 
//			      textField_5.setText(ab);
//			      String bc=(String)comboBox_1.getSelectedItem(); 
//			      textField_6.setText(bc); 
//				  String  cd=textField_3.getText(); textField_10.setText(cd);
				 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(30, 516, 167, 34);
		frame.getContentPane().add(btnNewButton);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				comboBox.setSelectedItem(null);
				comboBox_1.setSelectedItem(null);
				comboBox_2.setSelectedItem(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.setBounds(282, 516, 167, 34);
		frame.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(frame, "Confirm", "Exit",
						JOptionPane.YES_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}

			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBounds(531, 516, 167, 34);
		frame.getContentPane().add(btnExit);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(30, 499, 802, 14);
		frame.getContentPane().add(separator_4);

		JPanel panel = new JPanel();
		panel.setBounds(857, 26, 476, 524);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1_1_1 = new JLabel("Name");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(77, 50, 145, 34);
		panel.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_2 = new JLabel("From");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(26, 140, 145, 34);
		panel.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_3 = new JLabel("To");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_3.setBounds(26, 185, 145, 34);
		panel.add(lblNewLabel_1_1_3);

		JLabel lblNewLabel_1_1_4 = new JLabel("Date");
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_4.setBounds(26, 285, 145, 34);
		panel.add(lblNewLabel_1_1_4);

		JLabel lblNewLabel_1_1_5 = new JLabel("Time");
		lblNewLabel_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_5.setBounds(26, 329, 145, 34);
		panel.add(lblNewLabel_1_1_5);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(127, 50, 218, 34);
		panel.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(80, 143, 163, 34);
		panel.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(80, 184, 164, 34);
		panel.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(81, 285, 164, 34);
		panel.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(80, 329, 164, 34);
		panel.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(302, 185, 164, 34);
		panel.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(302, 252, 164, 34);
		panel.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(302, 339, 164, 34);
		panel.add(textField_11);

		JLabel lblNewLabel_1_1_2_1 = new JLabel("Ticket No");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1.setBounds(321, 140, 145, 34);
		panel.add(lblNewLabel_1_1_2_1);
		frame.getContentPane().add(lblNewLabel_1_2);
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Price");
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2_2.setBounds(344, 219, 145, 34);
		panel.add(lblNewLabel_1_1_2_2); 
		

		JLabel lblNewLabel_1_1_2_3 = new JLabel("Rout");
		lblNewLabel_1_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2_3.setBounds(344, 295, 145, 34);
		panel.add(lblNewLabel_1_1_2_3);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				{
					model.addRow(new String[] { textField.getText(), textField_9.getText(),
							// textField_5.getText(),
							// textField_6.getText(),
							(String) comboBox.getSelectedItem(), (String) comboBox_1.getSelectedItem(),
							(String) comboBox_2.getSelectedItem(), textField_7.getText(), textField_8.getText(),
					        rdbtnAc.isSelected(),
							textField_3.getText()});

				}
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConfirm.setBounds(164, 417, 167, 34);
		panel.add(btnConfirm);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
						{ "Name", "Booking No", "From", "To", "No of Seats", "Time", "Date", "AC/Non AC", "Price" }, },
				new String[] { "New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column", "New column" }));
		table.setBounds(10, 570, 1323, 163);
		frame.getContentPane().add(table);

		JLabel lblNewLabel_1_4 = new JLabel("Name");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(30, 247, 145, 34);
		frame.getContentPane().add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("From");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_5.setBounds(97, 247, 145, 34);
		frame.getContentPane().add(lblNewLabel_1_5);

		JLabel lblNewLabel_1_6 = new JLabel("Name");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_6.setBounds(176, 247, 145, 34);
		frame.getContentPane().add(lblNewLabel_1_6);
	}
}
