package myProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

public class main_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_menu frame = new main_menu();
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
	public main_menu() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		MyMainMenu my = new MyMainMenu();
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\menu.png"));
		setResizable(false);
		setTitle("main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 392);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\report3.jpg"));
		btnNewButton.setBounds(252, 88, 156, 173);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\door_exit.png"));
		button.setBounds(443, 88, 156, 173);
		contentPane.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				my.setVisible(true);
				setVisible(false);
				
				
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\shop1.png"));
		button_1.setBounds(67, 88, 156, 173);
		contentPane.add(button_1);
		
		JLabel lblPosSystem = new JLabel("POS System");
		lblPosSystem.setForeground(new Color(47, 79, 79));
		lblPosSystem.setFont(new Font("Juice ITC", Font.PLAIN, 35));
		lblPosSystem.setBounds(87, 277, 119, 43);
		contentPane.add(lblPosSystem);
		
		JLabel lblReport = new JLabel("Report");
		lblReport.setForeground(new Color(47, 79, 79));
		lblReport.setFont(new Font("Juice ITC", Font.PLAIN, 35));
		lblReport.setBounds(284, 277, 79, 43);
		contentPane.add(lblReport);
		
		JLabel lblExitDoor = new JLabel("Check Out");
		lblExitDoor.setForeground(new Color(47, 79, 79));
		lblExitDoor.setFont(new Font("Juice ITC", Font.PLAIN, 35));
		lblExitDoor.setBounds(463, 277, 119, 43);
		contentPane.add(lblExitDoor);
		
	}
}
