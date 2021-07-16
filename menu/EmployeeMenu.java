package frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class EmployeeMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void call() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeMenu window = new EmployeeMenu();
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
	public EmployeeMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Menu");
		frame.getContentPane().setBackground(SystemColor.textHighlightText);
		frame.setBounds(100, 100, 461, 574);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel pane0 = new JLabel("");
		pane0.setBackground(UIManager.getColor("Button.background"));
		pane0.setBounds(10, 10, 427, 117);
		frame.getContentPane().add(pane0);
		
		JLabel title = new JLabel("Canteen Inventory Management");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Sylfaen", Font.PLAIN, 28));
		title.setBounds(10, 73, 427, 41);
		frame.getContentPane().add(title);
		
		JLabel logo_label = new JLabel("");
		ImageIcon logo1 = new ImageIcon(EmployeeMenu.class.getResource("/Photo/logo1.png"));
		Image resize = logo1.getImage();
			
		
		logo_label.setIcon(new ImageIcon(resize.getScaledInstance(95, 53, java.awt.Image.SCALE_SMOOTH)));
		logo_label.setBounds(171, 10, 95, 53);
		frame.getContentPane().add(logo_label);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon logo2 = new ImageIcon(EmployeeMenu.class.getResource("/Photo/logo2.jpg"));
		resize = logo2.getImage();
		lblNewLabel.setIcon(new ImageIcon(resize.getScaledInstance(193, 390, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(233, 124, 193, 390);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1.setBounds(10, 137, 213, 390);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton updateStock = new JButton("Update Stock");
		updateStock.setBackground(UIManager.getColor("Button.background"));
		updateStock.setVerticalAlignment(SwingConstants.TOP);
		updateStock.setFont(new Font("Gabriola", Font.PLAIN, 32));
		updateStock.setBounds(30, 352, 169, 53);
		updateStock.setFocusable(false);
		frame.getContentPane().add(updateStock);
		
		JButton viewStock = new JButton("View Stock");
		viewStock.setVerticalAlignment(SwingConstants.TOP);
		viewStock.setFont(new Font("Gabriola", Font.PLAIN, 32));
		viewStock.setBounds(30, 257, 169, 53);
		viewStock.setFocusable(false);
		frame.getContentPane().add(viewStock);
		
		JLabel welcome = new JLabel("Welcome");
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.setFont(new Font("Constantia", Font.ITALIC, 36));
		welcome.setVerticalAlignment(SwingConstants.TOP);
		welcome.setBounds(22, 156, 189, 61);
		frame.getContentPane().add(welcome);
		frame.setLocationRelativeTo(null);
	}
}
