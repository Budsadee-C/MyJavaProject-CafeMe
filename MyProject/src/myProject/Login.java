package myProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frmLogin;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Login() {
		initialize();
	}
	private void initialize() {

		frmLogin = new JFrame();
		admin ad = new admin();
		//MyMainMenu my = new MyMainMenu();
		main_menu my = new main_menu();
		frmLogin.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmLogin.getContentPane().setBackground(SystemColor.info);
		frmLogin.setForeground(UIManager.getColor("ToolTip.background"));
		frmLogin.setFont(new Font("French Script MT", Font.PLAIN, 25));
		frmLogin.setTitle("Login");
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\access_key-512.png"));
		frmLogin.setBounds(100, 100, 863, 549);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		frmLogin.setLocationRelativeTo(null);
		
		JLabel Userlbl = new JLabel("Username");
		Userlbl.setForeground(SystemColor.textInactiveText);
		Userlbl.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 30));
		Userlbl.setBounds(322, 151, 115, 73);
		frmLogin.getContentPane().add(Userlbl);
		
		JLabel Passwordlbl = new JLabel("Password");
		Passwordlbl.setForeground(SystemColor.textInactiveText);
		Passwordlbl.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 30));
		Passwordlbl.setBounds(322, 266, 115, 73);
		frmLogin.getContentPane().add(Passwordlbl);
		
		user = new JTextField();
		user.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 36));
		user.setBounds(452, 164, 308, 52);
		frmLogin.getContentPane().add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.PLAIN, 36));
		pass.setBounds(455, 279, 305, 52);
		frmLogin.getContentPane().add(pass);
		
		JLabel imglbl = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		imglbl.setIcon(new ImageIcon(img));
		imglbl.setBounds(35, 147, 256, 230);
		frmLogin.getContentPane().add(imglbl);
		
		JButton login = new JButton("LOGIN");
		login.setBackground(Color.WHITE);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((user.getText().equals(ad.getUser()))&&(pass.getText().equals(ad.getPassword())))
				{
					my.setVisible(true);
					frmLogin.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid user or password\nPlease Try again!!");
					user.setText("");
					pass.setText("");
				}
			}
		});
		login.setBounds(452, 386, 115, 58);
		frmLogin.getContentPane().add(login);
		
		JLabel lblNewLabel = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/background.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 841, 83);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JButton exit = new JButton("EXIT");
		exit.setBackground(Color.WHITE);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLogin.dispose();
			}
		});
		exit.setBounds(595, 386, 115, 58);
		frmLogin.getContentPane().add(exit);
		


	}
}
