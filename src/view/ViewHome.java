package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CtrUser;
import util.Screen;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTable;

public class ViewHome extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1914114289164303534L;
	private static final String USER_TXT = "<p style=\"font-size:10px;\">Users</p></html>";
	private JPanel contentPane;
	private JPanel panelMain;
	private CtrUser controller;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewHome frame = new ViewHome();
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
	public ViewHome() {
		setBounds(new Rectangle(0, 0, 800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, Screen.width, Screen.height);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		controller = new CtrUser(this);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(5, 5, 1338, 690);
		splitPane.setDividerSize(0);
		splitPane.setContinuousLayout(true);
		splitPane.setResizeWeight(0.2);
		contentPane.add(splitPane);
		
		JPanel panelLeftNav = new JPanel();
		panelLeftNav.setBackground(new Color(72, 61, 139));
		splitPane.setLeftComponent(panelLeftNav);
		panelLeftNav.setLayout(null);
		
		JButton btnDashboardTab = new JButton("Dashboard");
		btnDashboardTab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)panelMain.getLayout()).show(panelMain, "name_10896877720410");
			}
		});
		btnDashboardTab.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				btnDashboardTab.setBackground(new Color(75, 0, 130));
			}
			@Override
			public void focusLost(FocusEvent e) {
				btnDashboardTab.setBackground(new Color(106, 90, 205));
			}
		});
		btnDashboardTab.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
		btnDashboardTab.setForeground(new Color(248, 248, 255));
		btnDashboardTab.setBackground(new Color(106, 90, 205));
		btnDashboardTab.setBorderPainted(false);
		btnDashboardTab.setBounds(12, 60, 242, 50);
		panelLeftNav.add(btnDashboardTab);
		
		JButton btnWorkersTab = new JButton("Workers");
		btnWorkersTab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)panelMain.getLayout()).show(panelMain, "name_6333187032366");
			}
		});
		btnWorkersTab.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				btnWorkersTab.setBackground(new Color(75, 0, 130));
			}
			@Override
			public void focusLost(FocusEvent e) {
				btnWorkersTab.setBackground(new Color(106, 90, 205));
			}
		});
		
		JButton btnUsersTab = new JButton("Users");
		btnUsersTab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)panelMain.getLayout()).show(panelMain, "name_6330962720913");
			}
		});
		btnUsersTab.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				btnUsersTab.setBackground(new Color(75, 0, 130));
			}
			@Override
			public void focusLost(FocusEvent e) {
				btnUsersTab.setBackground(new Color(106, 90, 205));
			}
		});
		btnUsersTab.setForeground(new Color(248, 248, 255));
		btnUsersTab.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
		btnUsersTab.setBorderPainted(false);
		btnUsersTab.setBackground(new Color(106, 90, 205));
		btnUsersTab.setBounds(12, 122, 242, 50);
		panelLeftNav.add(btnUsersTab);
		btnWorkersTab.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
		btnWorkersTab.setForeground(new Color(248, 248, 255));
		btnWorkersTab.setBackground(new Color(106, 90, 205));
		btnWorkersTab.setBorderPainted(false);
		btnWorkersTab.setBounds(12, 186, 242, 50);
		panelLeftNav.add(btnWorkersTab);
		
		JButton btnProducts = new JButton("Products");
		btnProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)panelMain.getLayout()).show(panelMain, "name_6353658165297");
			}
		});
		btnProducts.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				btnProducts.setBackground(new Color(75, 0, 130));
			}
			@Override
			public void focusLost(FocusEvent e) {
				btnProducts.setBackground(new Color(106, 90, 205));
			}
		});
		btnProducts.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
		btnProducts.setForeground(new Color(248, 248, 255));
		btnProducts.setBorderPainted(false);
		btnProducts.setBackground(new Color(106, 90, 205));
		btnProducts.setBounds(12, 248, 242, 50);
		panelLeftNav.add(btnProducts);
		
		panelMain = new JPanel();
		panelMain.setBackground(new Color(255, 255, 255));
		splitPane.setRightComponent(panelMain);
		panelMain.setLayout(new CardLayout(0, 0));
		
		JPanel panelDashboard = new JPanel();
		panelDashboard.setBackground(new Color(230, 230, 230));
		panelMain.add(panelDashboard, "name_10896877720410");
		panelDashboard.setLayout(null);
		
		JPanel panelUsersBoard = new JPanel();
		panelUsersBoard.setLayout(null);
		panelUsersBoard.setBackground(Color.WHITE);
		panelUsersBoard.setBounds(21, 12, 257, 110);
		panelDashboard.add(panelUsersBoard);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ViewHome.class.getResource("/icon/user.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(150, 12, 95, 78);
		panelUsersBoard.add(label);
		
		JLabel lblNewLabel = new JLabel("<html>"+ controller.getUserCount() + USER_TXT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 28));
		lblNewLabel.setBounds(12, 12, 126, 78);
		panelUsersBoard.add(lblNewLabel);
		
		JPanel panelUsers = new JPanel();
		panelUsers.setBackground(new Color(230, 230, 230));
		panelMain.add(panelUsers, "name_6330962720913");
		panelUsers.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Users management");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 12, 185, 30);
		panelUsers.add(lblNewLabel_1);
		
		JLabel lblYouCanAdd = new JLabel("You can add, edit or delete users");
		lblYouCanAdd.setFont(new Font("Dialog", Font.BOLD, 10));
		lblYouCanAdd.setForeground(UIManager.getColor("Button.toolBarBorderBackground"));
		lblYouCanAdd.setBounds(196, 14, 200, 30);
		panelUsers.add(lblYouCanAdd);
		
		JButton btnNewButton = new JButton("User");
		btnNewButton.setIconTextGap(10);
		btnNewButton.setIcon(new ImageIcon(ViewHome.class.getResource("/icon/plus.png")));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(19, 206, 234));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(941, 60, 117, 25);
		panelUsers.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(12, 160, 1046, 411);
		panelUsers.add(table);
		
		JPanel panelWorkers = new JPanel();
		panelWorkers.setBackground(new Color(255, 0, 0));
		panelMain.add(panelWorkers, "name_6333187032366");
		
		JPanel panelProducts = new JPanel();
		panelProducts.setBackground(Color.ORANGE);
		panelMain.add(panelProducts, "name_6353658165297");
	}
}
