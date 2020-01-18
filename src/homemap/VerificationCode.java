package homemap;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class VerificationCode extends JFrame {

	private JPanel contentPane;
	private JTextField txtVerificationCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerificationCode frame = new VerificationCode();
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
	public VerificationCode() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 1050, 655);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new MatteBorder(1, 1, 2, 2, (Color) Color.DARK_GRAY));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClose = new JButton("");
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnClose.setIcon(new ImageIcon(VerificationCode.class.getResource("/icons8_exit_24px.png")));
		btnClose.setBounds(1010, 2, 38, 26);
		contentPane.add(btnClose);
		
		JButton btnMaximize = new JButton("");
		btnMaximize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMaximize.setIcon(new ImageIcon(VerificationCode.class.getResource("/icons8_advertisement_page_30px.png")));
		btnMaximize.setBounds(970, 2, 38, 26);
		contentPane.add(btnMaximize);
		
		JButton btnMinimize = new JButton("");
		btnMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMinimize.setIcon(new ImageIcon(VerificationCode.class.getResource("/icons8_minimize_window_32px.png")));
		btnMinimize.setBounds(930, 2, 38, 26);
		contentPane.add(btnMinimize);
		
		JLabel lblMenu = new JLabel("Home Map");
		lblMenu.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 19));
		lblMenu.setForeground(UIManager.getColor("Button.highlight"));
		lblMenu.setBackground(Color.DARK_GRAY);
		lblMenu.setIcon(new ImageIcon(VerificationCode.class.getResource("/icons8_home_32px_1.png")));
		lblMenu.setOpaque(true);
		lblMenu.setBounds(0, 0, 1050, 30);
		contentPane.add(lblMenu);
		
		JButton btnVerify = new JButton("VERIFY");
		btnVerify.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnVerify.setForeground(Color.DARK_GRAY);
		btnVerify.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVerify.setBackground(new Color(169, 169, 169));
		btnVerify.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnVerify.setBounds(555, 345, 290, 40);
		contentPane.add(btnVerify);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setForeground(Color.DARK_GRAY);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnCancel.setBackground(Color.GRAY);
		btnCancel.setBounds(30, 575, 290, 40);
		contentPane.add(btnCancel);
		
		JButton btnResendEmail = new JButton("SEND EMAIL AGAIN");
		btnResendEmail.setForeground(Color.DARK_GRAY);
		btnResendEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnResendEmail.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnResendEmail.setBackground(Color.GRAY);
		btnResendEmail.setBounds(30, 515, 290, 40);
		contentPane.add(btnResendEmail);
		
		JTextPane txtCodeInfo = new JTextPane();
		txtCodeInfo.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(64, 64, 64)));
		txtCodeInfo.setForeground(Color.DARK_GRAY);
		txtCodeInfo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtCodeInfo.setText("  You have received verification code on your   email.");
		txtCodeInfo.setBackground(new Color(255, 165, 0));
		txtCodeInfo.setBounds(30, 330, 290, 88);
		contentPane.add(txtCodeInfo);
		
		JLabel lblHomeMapLogo = new JLabel("");
		lblHomeMapLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomeMapLogo.setIcon(new ImageIcon(VerificationCode.class.getResource("/HomeMap_Logo.png")));
		lblHomeMapLogo.setBounds(10, 60, 330, 220);
		contentPane.add(lblHomeMapLogo);
		
		JLabel lblVerificationMenu = new JLabel("");
		lblVerificationMenu.setBorder(new MatteBorder(1, 1, 2, 2, (Color) Color.DARK_GRAY));
		lblVerificationMenu.setOpaque(true);
		lblVerificationMenu.setBackground(new Color(255, 165, 0));
		lblVerificationMenu.setBounds(0, 0, 350, 655);
		contentPane.add(lblVerificationMenu);
		
		txtVerificationCode = new JTextField();
		txtVerificationCode.setHorizontalAlignment(SwingConstants.CENTER);
		txtVerificationCode.setForeground(UIManager.getColor("Button.highlight"));
		txtVerificationCode.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 25));
		txtVerificationCode.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtVerificationCode.setBackground(UIManager.getColor("Button.darkShadow"));
		txtVerificationCode.setBounds(555, 280, 290, 30);
		contentPane.add(txtVerificationCode);
		txtVerificationCode.setColumns(10);
		
		JLabel lblPinPic = new JLabel("");
		lblPinPic.setBackground(UIManager.getColor("Button.darkShadow"));
		lblPinPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPinPic.setIcon(new ImageIcon(VerificationCode.class.getResource("/icons8_address_64px.png")));
		lblPinPic.setOpaque(true);
		lblPinPic.setBounds(678, 505, 64, 64);
		contentPane.add(lblPinPic);
		
		JLabel lblHomePic = new JLabel("");
		lblHomePic.setBackground(UIManager.getColor("Button.darkShadow"));
		lblHomePic.setIcon(new ImageIcon(VerificationCode.class.getResource("/icons8_home_64px_1.png")));
		lblHomePic.setOpaque(true);
		lblHomePic.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePic.setBounds(459, 505, 64, 64);
		contentPane.add(lblHomePic);
		
		JLabel lblEarthPic = new JLabel("");
		lblEarthPic.setBackground(UIManager.getColor("Button.darkShadow"));
		lblEarthPic.setOpaque(true);
		lblEarthPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblEarthPic.setIcon(new ImageIcon(VerificationCode.class.getResource("/icons8_europe_64px.png")));
		lblEarthPic.setBounds(881, 505, 64, 64);
		contentPane.add(lblEarthPic);
		
		JTextArea txtrenterVerificationCode = new JTextArea();
		txtrenterVerificationCode.setSelectedTextColor(UIManager.getColor("Button.light"));
		txtrenterVerificationCode.setSelectionColor(UIManager.getColor("Button.light"));
		txtrenterVerificationCode.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 19));
		txtrenterVerificationCode.setForeground(UIManager.getColor("Button.highlight"));
		txtrenterVerificationCode.setText(" *Enter verification code :");
		txtrenterVerificationCode.setBorder(new MatteBorder(1, 1, 1, 1, (Color) UIManager.getColor("Button.highlight")));
		txtrenterVerificationCode.setBackground(UIManager.getColor("Button.darkShadow"));
		txtrenterVerificationCode.setBounds(573, 230, 254, 30);
		contentPane.add(txtrenterVerificationCode);
		
		setUndecorated(true);
	}
}
