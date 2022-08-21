package PongGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tplay1;
	private JTextField tplay2;
	static GameFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
					frame.setVisible(true);
					frame.setTitle("Login");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 387);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp t\u00EAn Player 1");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(92, 69, 170, 56);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpTnPlayer = new JLabel("Nh\u1EADp t\u00EAn Player 2");
		lblNhpTnPlayer.setForeground(Color.WHITE);
		lblNhpTnPlayer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNhpTnPlayer.setBounds(480, 69, 170, 56);
		contentPane.add(lblNhpTnPlayer);
		
		tplay1 = new JTextField();
		tplay1.setBounds(92, 135, 190, 29);
		contentPane.add(tplay1);
		tplay1.setColumns(10);
		
		tplay2 = new JTextField();
		tplay2.setColumns(10);
		tplay2.setBounds(480, 135, 190, 29);
		contentPane.add(tplay2);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnNewButton.setFocusPainted (false); 
		btnNewButton.setBorderPainted (false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					getName s = new getName();
					s.setName1(tplay1.getText());
					s.setName2(tplay2.getText());
				 	frame = new GameFrame();
					dispose();
					
			}
		});
		btnNewButton.setBounds(327, 242, 118, 56);
		contentPane.add(btnNewButton);
	}
	
}
