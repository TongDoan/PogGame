package PongGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Menu extends JFrame {
	static FrameLogin login;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setTitle("Pong Game");
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 429);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pong Game");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 60));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(205, 28, 367, 87);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 	login = new FrameLogin();
				 	login.setVisible(true);
					dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 34));
		btnNewButton.setFocusPainted (false); 
		btnNewButton.setBorderPainted (false);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setToolTipText("");
		btnNewButton.setBounds(313, 159, 174, 68);
		contentPane.add(btnNewButton);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setForeground(Color.WHITE);
		btnAbout.setToolTipText("");
		btnAbout.setFont(new Font("Tahoma", Font.BOLD, 34));
		btnAbout.setBackground(Color.BLACK);
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Infomation Infomations = new Infomation();
				Infomations.setVisible(true);
				dispose();
			}
		});
		
		btnAbout.setBounds(313, 276, 174, 68);
		btnAbout.setBorderPainted (false);
		btnAbout.setFocusPainted (false); 
		contentPane.add(btnAbout);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setIcon(new ImageIcon("icons8-cup-58 (1).png"));
		btnNewButton_1.setBounds(682, 322, 96, 60);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getDatabase.getName();
				JOptionPane.showMessageDialog(null, getDatabase.getText(),"Top 5", JOptionPane.INFORMATION_MESSAGE);
				getDatabase.setText("");
			}
		});
		btnNewButton_1.setBorderPainted (false);
		btnNewButton_1.setFocusPainted (false); 
		contentPane.add(btnNewButton_1);
		
		JButton btnHow = new JButton("How to play");
		btnHow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 Guild  Guildd = new  Guild();
				 Guildd.setVisible(true);
				 dispose();
			}
		});
		btnHow.setToolTipText("");
		btnHow.setForeground(Color.WHITE);
		btnHow.setFont(new Font("Tahoma", Font.BOLD, 32));
		btnHow.setFocusPainted(false);
		btnHow.setBorderPainted(false);
		btnHow.setBackground(Color.BLACK);
		btnHow.setBounds(279, 224, 244, 55);
		contentPane.add(btnHow);
		
	}
}
