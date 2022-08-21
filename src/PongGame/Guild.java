package PongGame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Guild extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Guild dialog = new Guild();
			dialog.setTitle("HowToPlay");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Guild() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Player 1 W,S : To move up and down");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(69, 72, 345, 52);
		contentPanel.add(lblNewLabel);
		{
			JLabel lblNewLabel_1 = new JLabel("How to play");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
			lblNewLabel_1.setBounds(151, 10, 184, 52);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblV = new JLabel("Player 2 ^, v : To move up and down");
			lblV.setForeground(Color.WHITE);
			lblV.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblV.setBounds(69, 114, 332, 52);
			contentPanel.add(lblV);
		}
		{
			JLabel lblPressSpaceTo = new JLabel("Press Space to play and ESC to exit.");
			lblPressSpaceTo.setForeground(Color.WHITE);
			lblPressSpaceTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblPressSpaceTo.setBounds(69, 170, 332, 52);
			contentPanel.add(lblPressSpaceTo);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.DARK_GRAY);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setBackground(Color.BLACK);
				okButton.setForeground(Color.WHITE);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Menu frame = new Menu();
						frame.setTitle("Pong Game");
						frame.setVisible(true);
						dispose();
							
					}
				});
				getRootPane().setDefaultButton(okButton);
				okButton.setBorderPainted (false);
				okButton.setFocusPainted (false); 
			}
		}
	}
}
