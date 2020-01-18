package homemap;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import java.awt.TextArea;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import javax.swing.JPasswordField;

public class Profile extends JFrame {

	private JPanel contentPane;
	private JTextField txtProfileInformation;
	private JTextField txtFirstName;
	private JTextField txtUsername;
	private JTextField txtAddress;
	private JTextField txtLastName;
	private JTextField txtEmail;
	private JTextField txtPhoneNumber;
	private JTextField txtFirstNameField;
	private JTextField txtUsernameField;
	private JTextField txtAddressField;
	private JTextField txtLastNameField;
	private JTextField txtEmailField;
	private JTextField txtPhoneNumberField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 1050, 655);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(230, 230, 250));
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new MatteBorder(1, 1, 2, 2, (Color) Color.DARK_GRAY));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClose = new JButton("");
		btnClose.setIcon(new ImageIcon(Profile.class.getResource("/icons8_exit_24px.png")));
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(1010, 2, 38, 26);
		contentPane.add(btnClose);
		
		JButton btnMaximize = new JButton("");
		btnMaximize.setIcon(new ImageIcon(Profile.class.getResource("/icons8_advertisement_page_30px.png")));
		btnMaximize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//maximize naci na netu
			}
		});
		btnMaximize.setBounds(970, 2, 38, 26);
		contentPane.add(btnMaximize);
		
		JButton btnMinimize = new JButton("");
		btnMinimize.setIcon(new ImageIcon(Profile.class.getResource("/icons8_minimize_window_32px.png")));
		btnMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//minimize naci na netu
			}
		});
		btnMinimize.setBounds(930, 2, 38, 26);
		contentPane.add(btnMinimize);
		
		JLabel lblMenu = new JLabel("Home Map");
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setForeground(UIManager.getColor("Button.highlight"));
		lblMenu.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 19));
		lblMenu.setIcon(new ImageIcon(Profile.class.getResource("/icons8_home_32px_1.png")));
	
		lblMenu.setOpaque(true);
		lblMenu.setBackground(Color.DARK_GRAY);
		lblMenu.setBounds(0, 0, 1050, 30);
		contentPane.add(lblMenu);
		
		txtProfileInformation = new JTextField();
		txtProfileInformation.setForeground(Color.DARK_GRAY);
		txtProfileInformation.setHorizontalAlignment(SwingConstants.CENTER);
		txtProfileInformation.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtProfileInformation.setCaretColor(new Color(255, 255, 224));
		txtProfileInformation.setBorder(null);
		txtProfileInformation.setOpaque(false);
		txtProfileInformation.setText("PROFILE INFORMATION");
		txtProfileInformation.setBounds(30, 250, 290, 50);
		contentPane.add(txtProfileInformation);
		txtProfileInformation.setColumns(10);
		
		JButton btnEditInfo = new JButton("EDIT INFO");
		btnEditInfo.setForeground(Color.DARK_GRAY);
		btnEditInfo.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEditInfo.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnEditInfo.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnEditInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnEditInfo.setBounds(30, 515, 290, 40);
		contentPane.add(btnEditInfo);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setForeground(Color.DARK_GRAY);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnCancel.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnCancel.setBounds(30, 575, 290, 40);
		contentPane.add(btnCancel);
		
		JLabel lblProfileLogo = new JLabel("");
		lblProfileLogo.setBackground(new Color(255, 165, 0));
		lblProfileLogo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblProfileLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfileLogo.setOpaque(true);
		lblProfileLogo.setIcon(new ImageIcon(Profile.class.getResource("/sign_up_logo.png")));
		lblProfileLogo.setBounds(111, 100, 128, 128);
		contentPane.add(lblProfileLogo);
		
		JLabel lblHomeProfile = new JLabel("");
		lblHomeProfile.setBorder(new MatteBorder(1, 1, 2, 2, (Color) Color.DARK_GRAY));
		lblHomeProfile.setOpaque(true);
		lblHomeProfile.setBackground(new Color(255, 165, 0));
		lblHomeProfile.setBounds(0, 0, 350, 655);
		contentPane.add(lblHomeProfile);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First name ");
		txtFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstName.setForeground(Color.WHITE);
		txtFirstName.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtFirstName.setColumns(10);
		txtFirstName.setBorder(null);
		txtFirstName.setBackground(UIManager.getColor("Button.darkShadow"));
		txtFirstName.setBounds(429, 130, 200, 20);
		contentPane.add(txtFirstName);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username ");
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		txtUsername.setBackground(UIManager.getColor("Button.darkShadow"));
		txtUsername.setBounds(429, 230, 200, 20);
		contentPane.add(txtUsername);
		
		txtAddress = new JTextField();
		txtAddress.setText("Address ");
		txtAddress.setHorizontalAlignment(SwingConstants.LEFT);
		txtAddress.setForeground(Color.WHITE);
		txtAddress.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtAddress.setColumns(10);
		txtAddress.setBorder(null);
		txtAddress.setBackground(UIManager.getColor("Button.darkShadow"));
		txtAddress.setBounds(429, 330, 200, 20);
		contentPane.add(txtAddress);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last name ");
		txtLastName.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastName.setForeground(Color.WHITE);
		txtLastName.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtLastName.setColumns(10);
		txtLastName.setBorder(null);
		txtLastName.setBackground(UIManager.getColor("Button.darkShadow"));
		txtLastName.setBounds(789, 130, 200, 20);
		contentPane.add(txtLastName);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail ");
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setForeground(Color.WHITE);
		txtEmail.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBackground(UIManager.getColor("Button.darkShadow"));
		txtEmail.setBounds(789, 230, 200, 20);
		contentPane.add(txtEmail);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("Phone number ");
		txtPhoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
		txtPhoneNumber.setForeground(Color.WHITE);
		txtPhoneNumber.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBorder(null);
		txtPhoneNumber.setBackground(UIManager.getColor("Button.darkShadow"));
		txtPhoneNumber.setBounds(789, 330, 200, 20);
		contentPane.add(txtPhoneNumber);
		
		txtFirstNameField = new JTextField();
		txtFirstNameField.setSelectionColor(Color.LIGHT_GRAY);
		txtFirstNameField.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstNameField.setForeground(Color.WHITE);
		txtFirstNameField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtFirstNameField.setDisabledTextColor(Color.DARK_GRAY);
		txtFirstNameField.setColumns(10);
		txtFirstNameField.setCaretColor(new Color(255, 165, 0));
		txtFirstNameField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtFirstNameField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtFirstNameField.setBounds(429, 150, 200, 30);
		contentPane.add(txtFirstNameField);
		
		txtUsernameField = new JTextField();
		txtUsernameField.setSelectionColor(Color.LIGHT_GRAY);
		txtUsernameField.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsernameField.setForeground(Color.WHITE);
		txtUsernameField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtUsernameField.setDisabledTextColor(Color.DARK_GRAY);
		txtUsernameField.setColumns(10);
		txtUsernameField.setCaretColor(new Color(255, 165, 0));
		txtUsernameField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtUsernameField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtUsernameField.setBounds(429, 250, 200, 30);
		contentPane.add(txtUsernameField);
		
		txtAddressField = new JTextField();
		txtAddressField.setSelectionColor(Color.LIGHT_GRAY);
		txtAddressField.setHorizontalAlignment(SwingConstants.LEFT);
		txtAddressField.setForeground(Color.WHITE);
		txtAddressField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtAddressField.setDisabledTextColor(Color.DARK_GRAY);
		txtAddressField.setColumns(10);
		txtAddressField.setCaretColor(new Color(255, 165, 0));
		txtAddressField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtAddressField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtAddressField.setBounds(429, 350, 200, 30);
		contentPane.add(txtAddressField);
		
		txtLastNameField = new JTextField();
		txtLastNameField.setSelectionColor(Color.LIGHT_GRAY);
		txtLastNameField.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastNameField.setForeground(Color.WHITE);
		txtLastNameField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtLastNameField.setDisabledTextColor(Color.DARK_GRAY);
		txtLastNameField.setColumns(10);
		txtLastNameField.setCaretColor(new Color(255, 165, 0));
		txtLastNameField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtLastNameField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtLastNameField.setBounds(789, 150, 200, 30);
		contentPane.add(txtLastNameField);
		
		txtEmailField = new JTextField();
		txtEmailField.setSelectionColor(Color.LIGHT_GRAY);
		txtEmailField.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmailField.setForeground(Color.WHITE);
		txtEmailField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtEmailField.setDisabledTextColor(Color.DARK_GRAY);
		txtEmailField.setColumns(10);
		txtEmailField.setCaretColor(new Color(255, 165, 0));
		txtEmailField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtEmailField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtEmailField.setBounds(789, 250, 200, 30);
		contentPane.add(txtEmailField);
		
		txtPhoneNumberField = new JTextField();
		txtPhoneNumberField.setSelectionColor(Color.LIGHT_GRAY);
		txtPhoneNumberField.setHorizontalAlignment(SwingConstants.LEFT);
		txtPhoneNumberField.setForeground(Color.WHITE);
		txtPhoneNumberField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtPhoneNumberField.setDisabledTextColor(Color.DARK_GRAY);
		txtPhoneNumberField.setColumns(10);
		txtPhoneNumberField.setCaretColor(new Color(255, 165, 0));
		txtPhoneNumberField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtPhoneNumberField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtPhoneNumberField.setBounds(789, 350, 200, 30);
		contentPane.add(txtPhoneNumberField);
		
		JLabel lblHomePic = new JLabel("");
		lblHomePic.setBackground(UIManager.getColor("Button.darkShadow"));
		lblHomePic.setIcon(new ImageIcon(Profile.class.getResource("/icons8_home_64px_1.png")));
		lblHomePic.setOpaque(true);
		lblHomePic.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePic.setBounds(505, 491, 64, 64);
		contentPane.add(lblHomePic);
		
		JLabel lblPinPic = new JLabel("");
		lblPinPic.setBackground(UIManager.getColor("Button.darkShadow"));
		lblPinPic.setIcon(new ImageIcon(Profile.class.getResource("/icons8_address_64px.png")));
		lblPinPic.setOpaque(true);
		lblPinPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPinPic.setBounds(685, 491, 64, 64);
		contentPane.add(lblPinPic);
		
		JLabel lblEarthPic = new JLabel("");
		lblEarthPic.setBackground(UIManager.getColor("Button.darkShadow"));
		lblEarthPic.setIcon(new ImageIcon(Profile.class.getResource("/icons8_europe_64px.png")));
		lblEarthPic.setOpaque(true);
		lblEarthPic.setBounds(865, 491, 64, 64);
		contentPane.add(lblEarthPic);
		
		setUndecorated(true);
	}
}
