package homemap;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import java.awt.Insets;
import javax.swing.JSeparator;

public class Login extends JFrame {

	private JPanel loginPane;
	private JTextField userField;
	private JPasswordField passwordField;
	private JLabel homeMapLoginLogo;
	private JLabel lblMenu;
	private JButton btnMaximize;
	private JTextField txtHomeMapInfo;
	private JTextField txtHomeMapInfo1;
	private JTextField txtHomeMapInfo2;
	private JLabel lblPinPic;
	private JLabel lblLocationPic;
	private JTextField txtCopyrightBox;
	private JTextField txtVersionBox;
	private JLabel lblPasswordLogo;
	private JButton btnNewButton;
	private JButton btnNewButton_1;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		Login holder = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 1050, 655);
		loginPane = new JPanel();
		loginPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginPane.setForeground(Color.DARK_GRAY);
		loginPane.setBackground(new Color(255, 165, 0));
		loginPane.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(64, 64, 64)));
		setContentPane(loginPane);
		loginPane.setLayout(null);
		
		JButton btnClose = new JButton("");
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnClose.setIcon(new ImageIcon(Login.class.getResource("/icons8_exit_24px.png")));
		btnClose.setBounds(1010, 2, 38, 26);
		loginPane.add(btnClose);
		
		btnMaximize = new JButton("");
		btnMaximize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMaximize.setIcon(new ImageIcon(Login.class.getResource("/icons8_advertisement_page_30px.png")));
		btnMaximize.setBounds(970, 2, 38, 26);
		loginPane.add(btnMaximize);
		
		JButton btnMinimize = new JButton("");
		btnMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnMinimize.setIcon(new ImageIcon(Login.class.getResource("/icons8_minimize_window_32px.png")));
		btnMinimize.setBounds(930, 2, 38, 26);
		loginPane.add(btnMinimize);
		
		lblMenu = new JLabel("Home Map");
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setIcon(new ImageIcon(Login.class.getResource("/icons8_home_32px_1.png")));
		lblMenu.setForeground(UIManager.getColor("Button.highlight"));
		lblMenu.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 19));
		lblMenu.setOpaque(true);
		lblMenu.setBackground(Color.DARK_GRAY);
		lblMenu.setBounds(0, 0, 1050, 30);
		loginPane.add(lblMenu);
		
		
		
		userField = new JTextField();
		userField.setForeground(Color.DARK_GRAY);
		userField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		userField.setSelectionColor(Color.LIGHT_GRAY);
		userField.setBackground(UIManager.getColor("CheckBox.background"));
		userField.setHorizontalAlignment(SwingConstants.CENTER);
		userField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.DARK_GRAY));
		userField.setBounds(550, 365, 300, 32);
		loginPane.add(userField);
		userField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 18));
		passwordField.setSelectionColor(Color.LIGHT_GRAY);
		passwordField.setBackground(UIManager.getColor("CheckBox.background"));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.DARK_GRAY));
		passwordField.setBounds(550, 445, 300, 32);
		loginPane.add(passwordField);

		
		txtHomeMapInfo = new JTextField();
		txtHomeMapInfo.setMargin(new Insets(2, 3, 2, 3));
		txtHomeMapInfo.setHorizontalAlignment(SwingConstants.CENTER);
		txtHomeMapInfo.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtHomeMapInfo.setText("  Home Map is a newly built application ");
		txtHomeMapInfo.setForeground(UIManager.getColor("Button.highlight"));
		txtHomeMapInfo.setBorder(null);
		txtHomeMapInfo.setBackground(UIManager.getColor("Button.darkShadow"));
		txtHomeMapInfo.setBounds(30, 288, 290, 45);
		loginPane.add(txtHomeMapInfo);
		txtHomeMapInfo.setColumns(10);
		
		txtHomeMapInfo1 = new JTextField();
		txtHomeMapInfo1.setHorizontalAlignment(SwingConstants.CENTER);
		txtHomeMapInfo1.setForeground(UIManager.getColor("Button.highlight"));
		txtHomeMapInfo1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtHomeMapInfo1.setText(" that allows you to search and publish");
		txtHomeMapInfo1.setBackground(UIManager.getColor("Button.darkShadow"));
		txtHomeMapInfo1.setBorder(null);
		txtHomeMapInfo1.setBounds(30, 333, 290, 45);
		loginPane.add(txtHomeMapInfo1);
		txtHomeMapInfo1.setColumns(10);
		
		txtHomeMapInfo2 = new JTextField();
		txtHomeMapInfo2.setText("your desired properties.");
		txtHomeMapInfo2.setHorizontalAlignment(SwingConstants.CENTER);
		txtHomeMapInfo2.setForeground(UIManager.getColor("Button.highlight"));
		txtHomeMapInfo2.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtHomeMapInfo2.setBorder(null);
		txtHomeMapInfo2.setBackground(UIManager.getColor("Button.darkShadow"));
		txtHomeMapInfo2.setBounds(30, 378, 290, 45);
		loginPane.add(txtHomeMapInfo2);
		txtHomeMapInfo2.setColumns(10);
		
		JLabel lblHomePic = new JLabel("");
		lblHomePic.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHomePic.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePic.setIcon(new ImageIcon(Login.class.getResource("/icons8_home_64px_1.png")));
		lblHomePic.setBounds(30, 132, 64, 64);
		loginPane.add(lblHomePic);
		
		lblPinPic = new JLabel("");
		lblPinPic.setIcon(new ImageIcon(Login.class.getResource("/icons8_address_64px.png")));
		lblPinPic.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPinPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPinPic.setBounds(143, 132, 64, 64);
		loginPane.add(lblPinPic);
		
		lblLocationPic = new JLabel("");
		lblLocationPic.setIcon(new ImageIcon(Login.class.getResource("/icons8_europe_64px.png")));
		lblLocationPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocationPic.setBounds(256, 132, 64, 64);
		loginPane.add(lblLocationPic);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 165, 0));
		separator.setBounds(30, 207, 290, 2);
		loginPane.add(separator);
		
		btnNewButton = new JButton("LOGIN");
		btnNewButton.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(30, 515, 290, 40);
		loginPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("SIGN UP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        holder.setVisible(false);
			        new Register().setVisible(true);	
			}
		});
		btnNewButton_1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(30, 575, 290, 40);
		loginPane.add(btnNewButton_1);
		
		JLabel lblExeInfo = new JLabel("");
		lblExeInfo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblExeInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblExeInfo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblExeInfo.setForeground(UIManager.getColor("Button.highlight"));
		lblExeInfo.setBorder(new MatteBorder(1, 1, 2, 2, (Color) Color.DARK_GRAY));
		lblExeInfo.setOpaque(true);
		lblExeInfo.setBackground(UIManager.getColor("Button.darkShadow"));
		lblExeInfo.setBounds(0, 0, 350, 655);
		loginPane.add(lblExeInfo);
		
		homeMapLoginLogo = new JLabel("");
		homeMapLoginLogo.setIcon(new ImageIcon(Login.class.getResource("/HomeMap_Logo.png")));
		homeMapLoginLogo.setHorizontalAlignment(SwingConstants.LEFT);
		homeMapLoginLogo.setBounds(540, 33, 320, 320);
		loginPane.add(homeMapLoginLogo);
		
		txtCopyrightBox = new JTextField();
		txtCopyrightBox.setDisabledTextColor(Color.DARK_GRAY);
		txtCopyrightBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtCopyrightBox.setForeground(Color.DARK_GRAY);
		txtCopyrightBox.setHorizontalAlignment(SwingConstants.CENTER);
		txtCopyrightBox.setText("Copyright | Edvin Cama");
		txtCopyrightBox.setBackground(new Color(255, 165, 0));
		txtCopyrightBox.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		txtCopyrightBox.setBounds(850, 615, 170, 25);
		loginPane.add(txtCopyrightBox);
		txtCopyrightBox.setColumns(10);
		
		txtVersionBox = new JTextField();
		txtVersionBox.setHorizontalAlignment(SwingConstants.CENTER);
		txtVersionBox.setForeground(Color.DARK_GRAY);
		txtVersionBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtVersionBox.setText("V . 1 . 0 . 0");
		txtVersionBox.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
		txtVersionBox.setBackground(new Color(255, 165, 0));
		txtVersionBox.setBounds(380, 615, 86, 25);
		loginPane.add(txtVersionBox);
		txtVersionBox.setColumns(10);
		
		JLabel lblEmailLogo = new JLabel(":");
		lblEmailLogo.setForeground(Color.DARK_GRAY);
		lblEmailLogo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmailLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailLogo.setIcon(new ImageIcon(Login.class.getResource("/icons8_email_32px.png")));
		lblEmailLogo.setBounds(490, 365, 45, 32);
		loginPane.add(lblEmailLogo);
		
		lblPasswordLogo = new JLabel(":");
		lblPasswordLogo.setIcon(new ImageIcon(Login.class.getResource("/icons8_password_32px.png")));
		lblPasswordLogo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPasswordLogo.setForeground(Color.DARK_GRAY);
		lblPasswordLogo.setBounds(490, 445, 45, 32);
		loginPane.add(lblPasswordLogo);
		
		setUndecorated(true); //to remove the frame outLine
	}
}
