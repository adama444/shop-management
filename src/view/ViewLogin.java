package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CtrUser;
import model.User;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 599437262348712058L;
	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JPasswordField passwordFieldLogin;
	private JLabel lblInfo;
	private CtrUser controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin frame = new ViewLogin();
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
	public ViewLogin() {
		controller = new CtrUser(this);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 299);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(9, 5, 0, 0));
		
		JLabel lblTitle = new JLabel("LOGIN");
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 24));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 255, 255));
		contentPane.add(separator_1);
		
		JLabel lblUsername = new JLabel("Username");
		contentPane.add(lblUsername);
		
		textFieldUsername = new JTextField();
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		contentPane.add(lblPassword);
		
		passwordFieldLogin = new JPasswordField();
		contentPane.add(passwordFieldLogin);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		contentPane.add(separator);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				controller.controlUserInfos(new User(0, textFieldUsername.getText(),
						passwordFieldLogin.getText()));
			}
		});
		btnLogin.setBackground(new Color(51, 153, 102));
		btnLogin.setBorderPainted(false);
		contentPane.add(btnLogin);
		
		lblInfo = new JLabel("Username or Password Incorrect");
		lblInfo.setVisible(false);
		lblInfo.setForeground(new Color(255, 0, 0));
		lblInfo.setFont(new Font("Dialog", Font.BOLD, 10));
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblInfo);
	}
	
	public void showErrorMessage() {
		lblInfo.setVisible(true);
	}
	
	public void openHomeJFrame() {
		ViewHome frame = new ViewHome();
		frame.setVisible(true);
		this.dispose();
	}

}
