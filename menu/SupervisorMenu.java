package frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class SupervisorMenu {

	private JFrame frame;
	private JLabel title;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public void call() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupervisorMenu window = new SupervisorMenu();
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
	public SupervisorMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Menu");
		frame.setBounds(100, 100, 728, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 694, 137);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel logo = new JLabel();
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon logo1 = new ImageIcon(EmployeeMenu.class.getResource("/Photo/logo1.png"));
		Image resize = logo1.getImage();
		logo.setIcon(new ImageIcon(resize.getScaledInstance(151, 74, java.awt.Image.SCALE_SMOOTH)));
		logo.setBounds(271, 10, 151, 74);
		panel.add(logo);
		
		title = new JLabel("Canteen Inventory Management");
		title.setFont(new Font("Gabriola", Font.PLAIN, 36));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setVerticalAlignment(SwingConstants.TOP);
		title.setBounds(137, 94, 419, 46);
		panel.add(title);
		
		panel_1 = new JPanel();
		panel_1.setBounds(149, 157, 416, 405);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton employee = new JButton("Employee Rost");
		ImageIcon logo2 = new ImageIcon(EmployeeMenu.class.getResource("/Photo/logo3.png"));
		resize = logo2.getImage();
		employee.setIcon(new ImageIcon(resize.getScaledInstance(46, 44, java.awt.Image.SCALE_SMOOTH)));
		employee.setVerticalAlignment(SwingConstants.TOP);
		employee.setFont(new Font("Palatino Linotype", Font.PLAIN, 29));
		employee.setBounds(61, 46, 294, 44);
		employee.setFocusable(false);
		panel_1.add(employee);
		
		JButton viewStocks = new JButton("View Stocks     ");
		viewStocks.setIcon(new ImageIcon(resize.getScaledInstance(46, 44, java.awt.Image.SCALE_SMOOTH)));
		viewStocks.setVerticalAlignment(SwingConstants.TOP);
		viewStocks.setFont(new Font("Palatino Linotype", Font.PLAIN, 29));
		viewStocks.setBounds(61, 120, 294, 44);
		viewStocks.setFocusable(false);
		panel_1.add(viewStocks);
		
		JButton updateStocks = new JButton("Update Stocks  ");
		updateStocks.setIcon(new ImageIcon(resize.getScaledInstance(46, 44, java.awt.Image.SCALE_SMOOTH)));
		updateStocks.setVerticalAlignment(SwingConstants.TOP);
		updateStocks.setFont(new Font("Palatino Linotype", Font.PLAIN, 29));
		updateStocks.setBounds(61, 205, 294, 44);
		updateStocks.setFocusable(false);
		panel_1.add(updateStocks);
		
		JButton orderProducts = new JButton("Order products");
		orderProducts.setVerticalAlignment(SwingConstants.TOP);
		orderProducts.setIcon(new ImageIcon(resize.getScaledInstance(46, 44, java.awt.Image.SCALE_SMOOTH)));
		orderProducts.setFont(new Font("Palatino Linotype", Font.PLAIN, 29));
		orderProducts.setBounds(61, 293, 294, 44);
		orderProducts.setFocusable(false);
		panel_1.add(orderProducts);
		resize = logo2.getImage();
		frame.setLocationRelativeTo(null);
	}
}
