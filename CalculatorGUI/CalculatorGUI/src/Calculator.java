import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private double answer,number;
	private int operation;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	
	public void addInput(String str) {
		textField.setText(textField.getText()+str);
	}
	
	public void calculate() {
		switch (operation) {
		
		case 1: 
			answer=number+ Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
		case 2: 
			answer=number - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
		case 3: 
			answer=number * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
			
		case 4: 
			answer=number/Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
		
		
		default:
			
		}
	}
	
	public Calculator() {
		setTitle("Calculator");
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 11, 314, 50);
		contentPane.add(screen);
		screen.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setBounds(0, 22, 313, 28);
		screen.add(textField);
		textField.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl.setBounds(0, 0, 314, 14);
		screen.add(lbl);
		
		JPanel buttons = new JPanel();
		buttons.setBounds(10, 72, 314, 308);
		contentPane.add(buttons);
		buttons.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setBounds(1, 66, 63, 45);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("8");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1.setBounds(84, 66, 63, 45);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_3 = new JButton("9");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_3.setBounds(167, 66, 63, 45);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_2 = new JButton("/");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				operation=4;
				lbl.setText(textField.getText()+e.getActionCommand());
				textField.setText("");
			}
		});
		btnNewButton_1_2.setBounds(250, 1, 63, 45);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_2);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setBounds(1, 131, 63, 45);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton);
		
		JButton btnNewButton_1_7 = new JButton("5");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_7.setBounds(84, 131, 63, 45);
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_5 = new JButton("6");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_5.setBounds(167, 131, 63, 45);
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_4 = new JButton("*");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				operation=3;
				lbl.setText(textField.getText()+e.getActionCommand());
				textField.setText("");
			}
		});
		btnNewButton_1_4.setBounds(250, 66, 63, 45);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_10 = new JButton("1");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_10.setBounds(1, 196, 63, 45);
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_8 = new JButton("2");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_8.setBounds(84, 196, 63, 45);
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_10_2 = new JButton("3");
		btnNewButton_1_10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_10_2.setBounds(167, 196, 63, 45);
		btnNewButton_1_10_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_10_2);
		
		JButton btnNewButton_1_6 = new JButton("-");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				operation=2;
				lbl.setText(textField.getText()+e.getActionCommand());
				textField.setText("");
				
			}
		});
		btnNewButton_1_6.setBounds(250, 131, 63, 45);
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_9 = new JButton("C");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_1_9.setBounds(167, 0, 64, 45);
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10_3 = new JButton("+");
		btnNewButton_1_10_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				operation=1;
				lbl.setText(textField.getText()+e.getActionCommand());
				textField.setText("");
				
				
			}
		});
		btnNewButton_1_10_3.setBounds(250, 196, 63, 45);
		btnNewButton_1_10_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_10_3);
		
		JButton btnNewButton_1_10_6 = new JButton("0");
		btnNewButton_1_10_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_10_6.setBounds(1, 261, 146, 45);
		btnNewButton_1_10_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_10_6);
		
		JButton btnNewButton_1_10_8 = new JButton("=");
		btnNewButton_1_10_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
			}
		});
		btnNewButton_1_10_8.setBounds(250, 261, 63, 45);
		btnNewButton_1_10_8.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttons.add(btnNewButton_1_10_8);
		
		JButton btnNewButton_1_10_2_1 = new JButton(".");
		btnNewButton_1_10_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_10_2_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_1_10_2_1.setBounds(167, 261, 63, 45);
		buttons.add(btnNewButton_1_10_2_1);
		
		JButton btnNewButton_1_9_1 = new JButton("ON");
		btnNewButton_1_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setVisible(true);
				textField.setText("");
			}
		});
		btnNewButton_1_9_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_9_1.setBounds(1, 0, 62, 45);
		buttons.add(btnNewButton_1_9_1);
		
		JButton btnNewButton_1_9_2 = new JButton("OFF");
		btnNewButton_1_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setVisible(false);
			}
		});
		btnNewButton_1_9_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_9_2.setBounds(83, 0, 64, 45);
		buttons.add(btnNewButton_1_9_2);
	}
}
