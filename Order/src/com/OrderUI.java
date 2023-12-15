package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class OrderUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField lcd;
	private JTextField ram;
	private JTextField mouse;
	private JTextField name;
    private JCheckBox isMember; // 是會員的核取框

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUI frame = new OrderUI();
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
	public OrderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(249, 190, 221));
		panel.setBounds(6, 6, 438, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("訂單計算系統");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblNewLabel.setBounds(147, 6, 261, 35);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 220, 228));
		panel_1.setBounds(6, 62, 448, 142);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LCD數量");
		lblNewLabel_1.setBounds(6, 45, 61, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RAM數量");
		lblNewLabel_2.setBounds(6, 73, 61, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mouse數量");
		lblNewLabel_3.setBounds(6, 101, 61, 14);
		panel_1.add(lblNewLabel_3);
		
		lcd = new JTextField();
		lcd.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lcd.setBounds(66, 40, 130, 26);
		panel_1.add(lcd);
		lcd.setColumns(10);
		
		ram = new JTextField();
		ram.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		ram.setBounds(66, 68, 130, 26);
		panel_1.add(ram);
		ram.setColumns(10);
		
		mouse = new JTextField();
		mouse.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		mouse.setBounds(66, 95, 130, 26);
		panel_1.add(mouse);
		mouse.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("是否是會員");
		lblNewLabel_4.setBounds(208, 18, 61, 16);
		panel_1.add(lblNewLabel_4);
		
		/*JCheckBox chckbxNewCheckBox */isMember= new JCheckBox("是會員");
		/*chckbxNewCheckBox*/isMember.setBounds(218, 42, 128, 23);
		panel_1.add(/*chckbxNewCheckBox*/isMember);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("不是會員");
		chckbxNewCheckBox_1.setBounds(218, 70, 128, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("顧客名稱");
		lblNewLabel_5.setBounds(6, 17, 61, 16);
		panel_1.add(lblNewLabel_5);
		
		name = new JTextField();
		name.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name.setBounds(66, 13, 130, 26);
		panel_1.add(name);
		name.setColumns(10);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(215, 185, 212));
		panel_2.setBounds(6, 208, 438, 100);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 426, 52);// 調整高度為 52==>200
		panel_2.add(scrollPane);
		


		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		output.setBackground(new Color(240, 192, 250));
		output.setFont(new Font("Baghdad", Font.BOLD, 16));
		
		
		output.setLineWrap(true); // 自動換行
		
	

		JButton btnNewButton = new JButton("輸出");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 String Name = name.getText();
			        int LCD = Integer.parseInt(lcd.getText());
			        int RAM = Integer.parseInt(ram.getText());
			        int MOUSE = Integer.parseInt(mouse.getText());
			        boolean isMemberStatus = isMember.isSelected();

			     
			       
			        // 建立 Order 物件並傳遞 sum 參數
			        Order o = new Order(Name, LCD, RAM, MOUSE, isMemberStatus, MOUSE);
			        // 計算總價
			       // calculateSum();

			        // 判斷是會員還是不是會員
			        output.setText("姓名:" + o.getName() +
			                "\nLCD:" + o.getLcd() +
			                "\nRAM:" + o.getRam() +
			                "\nMOUSE:" + o.getMouse() +
			                "\n是否是會員:" + o.isMember() +
			                "\n總價:" + o.getSum());

			     
			}
		});
		btnNewButton.setBounds(312, 101, 117, 29);
		panel_1.add(btnNewButton);
		
	}

}
