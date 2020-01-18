package homemap;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstnameField;
	private JTextField txtLastnameField;
	private JTextField txtEmailField;
	private JTextField txtUsernameField;
	private JTextField txtAddressField;
	private JTextField txtPhoneNumberField;
	private JTextField txtName;
	private JTextField txtLastName;
	private JTextField txtEmail;
	private JTextField txtUsername;
	private JTextField txtAddress;
	private JTextField txtPhoneNumber;
	private JTextField txtPassword;
	private JTextField txtRepeatPassword;
	private JLabel lblRegisterLogo;
	private JTextField txtSgnUp;
	private JPasswordField passwordField;
	private JPasswordField passwordRepeatField;
	private JButton btnRestoreDown;
	private JButton btnMinimize;
	private JButton btnClose;
	private JLabel lblHomePic;
	private JLabel lblPinPic;
	private JLabel lblEarthPic;
	private JButton btnPrivacyPolicy;
	private JTextPane txtCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 1050, 655);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.setForeground(new Color(230, 230, 250));
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setFocusTraversalKeysEnabled(false);
		contentPane.setFocusCycleRoot(true);
		contentPane.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(64, 64, 64)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnRestoreDown = new JButton("");
		btnRestoreDown.setForeground(new Color(230, 230, 250));
		btnRestoreDown.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnRestoreDown.setBackground(new Color(230, 230, 250));
		btnRestoreDown.setIcon(new ImageIcon(Register.class.getResource("/icons8_advertisement_page_30px.png")));
		btnRestoreDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnClose = new JButton("");
		btnClose.setBackground(new Color(230, 230, 250));
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnClose.setForeground(new Color(230, 230, 250));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClose.setIcon(new ImageIcon(Register.class.getResource("/icons8_exit_24px.png")));
		btnClose.setBounds(1010, 2, 38, 26);
		contentPane.add(btnClose);
		btnRestoreDown.setBounds(970, 2, 38, 26);
		contentPane.add(btnRestoreDown);
		
		btnMinimize = new JButton("");
		btnMinimize.setForeground(new Color(230, 230, 250));
		btnMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMinimize.setBackground(new Color(230, 230, 250));
		btnMinimize.setIcon(new ImageIcon(Register.class.getResource("/icons8_minimize_window_32px.png")));
		btnMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinimize.setBounds(930, 2, 38, 26);
		contentPane.add(btnMinimize);
		
		JLabel lblMenu = new JLabel("Home Map");
		lblMenu.setIcon(new ImageIcon(Register.class.getResource("/icons8_home_32px_1.png")));
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setForeground(UIManager.getColor("Button.highlight"));
		lblMenu.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 19));
		lblMenu.setBackground(Color.DARK_GRAY);
		lblMenu.setOpaque(true);
		lblMenu.setBounds(0, 0, 1050, 30);
		contentPane.add(lblMenu);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkBox.setForeground(Color.DARK_GRAY);
		checkBox.setBackground(new Color(255, 165, 0));
		checkBox.setBounds(30, 425, 21, 21);
		contentPane.add(checkBox);
		
		lblRegisterLogo = new JLabel("");
		lblRegisterLogo.setIcon(new ImageIcon(Register.class.getResource("/sign_up_logo.png")));
		lblRegisterLogo.setBounds(111, 100, 128, 128);
		contentPane.add(lblRegisterLogo);
		
		txtSgnUp = new JTextField();
		txtSgnUp.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtSgnUp.setHorizontalAlignment(SwingConstants.CENTER);
		txtSgnUp.setBorder(null);
		txtSgnUp.setBackground(new Color(255, 165, 0));
		txtSgnUp.setForeground(Color.DARK_GRAY);
		txtSgnUp.setText("SIGN UP");
		txtSgnUp.setBounds(125, 250, 100, 30);
		contentPane.add(txtSgnUp);
		txtSgnUp.setColumns(10);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Fname = txtFirstnameField.getText();
				String Lname = txtLastnameField.getText();
				String Username = txtUsernameField.getText();
				String Email = txtEmailField.getText();
				String Address = txtAddressField.getText();
				String Number = txtPhoneNumberField.getText();
				String Password = passwordField.getText();
				String PasswordRepeat = passwordRepeatField.getText();
				if(Fname.equals("")) {
					JOptionPane.showMessageDialog(null, "First name is required.");
				}
				if(Lname.equals("")) {
					JOptionPane.showMessageDialog(null, "Last name is required.");
				}
				if(Username.equals("")) {
					JOptionPane.showMessageDialog(null, "Username is required.");
				}
				if(Email.equals("")) {
					JOptionPane.showMessageDialog(null, "Email is required.");
				}
				if(Address.equals("")) {
					JOptionPane.showMessageDialog(null, "Address is required.");
				}
				if(Number.equals("")) {
					JOptionPane.showMessageDialog(null, "Phone number is required.");
				}
				if(Password.equals("")) {
					JOptionPane.showMessageDialog(null, "Password is required.");
				}
				if(PasswordRepeat.equals("")) {
					JOptionPane.showMessageDialog(null, "You need to re-type the password..");
				}
				else {
					JOptionPane.showMessageDialog(null, "Sign up successful!");
				}
			}
		});
		btnSignUp.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSignUp.setForeground(Color.DARK_GRAY);
		btnSignUp.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnSignUp.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(64, 64, 64)));
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSignUp.setBounds(30, 575, 290, 40);
		contentPane.add(btnSignUp);
		
		btnPrivacyPolicy = new JButton("PRIVACY POLICY");
		btnPrivacyPolicy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnPrivacyPolicy.setForeground(Color.DARK_GRAY);
		btnPrivacyPolicy.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrivacyPolicy.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnPrivacyPolicy.setBounds(30, 515, 290, 40);
		contentPane.add(btnPrivacyPolicy);
		
		txtCheckBox = new JTextPane();
		txtCheckBox.setBackground(new Color(255, 165, 0));
		txtCheckBox.setForeground(Color.DARK_GRAY);
		txtCheckBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtCheckBox.setText("I agree to terms of service.");
		txtCheckBox.setBounds(65, 420, 255, 40);
		contentPane.add(txtCheckBox);
		//String CheckBox = txtCheckBox.getState();
		
		
		JLabel lblSignUp = new JLabel("");
		lblSignUp.setOpaque(true);
		lblSignUp.setForeground(new Color(255, 165, 0));
		lblSignUp.setBackground(new Color(255, 165, 0));
		lblSignUp.setBorder(new MatteBorder(1, 1, 2, 2, (Color) Color.DARK_GRAY));
		lblSignUp.setBounds(0, 0, 350, 655);
		contentPane.add(lblSignUp);
		
		txtName = new JTextField();
		txtName.setHorizontalAlignment(SwingConstants.LEFT);
		txtName.setForeground(UIManager.getColor("Button.highlight"));
		txtName.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtName.setBackground(UIManager.getColor("Button.darkShadow"));
		txtName.setBorder(null);
		txtName.setText("First name :");
		txtName.setBounds(430, 80, 200, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtRepeatPassword = new JTextField();
		txtRepeatPassword.setHorizontalAlignment(SwingConstants.LEFT);
		txtRepeatPassword.setForeground(UIManager.getColor("Button.highlight"));
		txtRepeatPassword.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtRepeatPassword.setBackground(UIManager.getColor("Button.darkShadow"));
		txtRepeatPassword.setBorder(null);
		txtRepeatPassword.setText("Repeat password :");
		txtRepeatPassword.setBounds(790, 380, 200, 20);
		contentPane.add(txtRepeatPassword);
		txtRepeatPassword.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setForeground(UIManager.getColor("Button.highlight"));
		txtUsername.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtUsername.setBackground(UIManager.getColor("Button.darkShadow"));
		txtUsername.setBorder(null);
		txtUsername.setText("Username :");
		txtUsername.setBounds(430, 180, 200, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
		txtPhoneNumber.setForeground(UIManager.getColor("Button.highlight"));
		txtPhoneNumber.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtPhoneNumber.setBackground(UIManager.getColor("Button.darkShadow"));
		txtPhoneNumber.setBorder(null);
		txtPhoneNumber.setText("Phone number :");
		txtPhoneNumber.setBounds(790, 280, 200, 20);
		contentPane.add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setHorizontalAlignment(SwingConstants.LEFT);
		txtAddress.setForeground(UIManager.getColor("Button.highlight"));
		txtAddress.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtAddress.setBackground(UIManager.getColor("Button.darkShadow"));
		txtAddress.setBorder(null);
		txtAddress.setText("Address :");
		txtAddress.setBounds(430, 280, 200, 20);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setForeground(UIManager.getColor("Button.highlight"));
		txtPassword.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtPassword.setBackground(UIManager.getColor("Button.darkShadow"));
		txtPassword.setBorder(null);
		txtPassword.setHorizontalAlignment(SwingConstants.LEFT);
		txtPassword.setText("Password :");
		txtPassword.setBounds(430, 380, 200, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setForeground(UIManager.getColor("Button.highlight"));
		txtEmail.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtEmail.setBackground(UIManager.getColor("Button.darkShadow"));
		txtEmail.setBorder(null);
		txtEmail.setText("E-mail :");
		txtEmail.setBounds(790, 180, 200, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastName.setForeground(UIManager.getColor("Button.highlight"));
		txtLastName.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtLastName.setBackground(UIManager.getColor("Button.darkShadow"));
		txtLastName.setBorder(null);
		txtLastName.setText("Last name :");
		txtLastName.setBounds(790, 80, 200, 20);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		
		
		txtFirstnameField = new JTextField();
		txtFirstnameField.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstnameField.setDisabledTextColor(Color.DARK_GRAY);
		txtFirstnameField.setSelectionColor(Color.LIGHT_GRAY);
		txtFirstnameField.setForeground(UIManager.getColor("Button.highlight"));
		txtFirstnameField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtFirstnameField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtFirstnameField.setCaretColor(new Color(255, 165, 0));
		txtFirstnameField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtFirstnameField.setBounds(430, 100, 200, 30);
		contentPane.add(txtFirstnameField);
		txtFirstnameField.setColumns(10);
		
		txtLastnameField = new JTextField();
		txtLastnameField.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastnameField.setDisabledTextColor(Color.DARK_GRAY);
		txtLastnameField.setSelectionColor(Color.LIGHT_GRAY);
		txtLastnameField.setForeground(UIManager.getColor("Button.highlight"));
		txtLastnameField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtLastnameField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtLastnameField.setCaretColor(new Color(255, 165, 0));
		txtLastnameField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtLastnameField.setBounds(790, 100, 200, 30);
		contentPane.add(txtLastnameField);
		txtLastnameField.setColumns(10);
		
		txtEmailField = new JTextField();
		txtEmailField.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmailField.setDisabledTextColor(Color.DARK_GRAY);
		txtEmailField.setSelectionColor(Color.LIGHT_GRAY);
		txtEmailField.setForeground(UIManager.getColor("Button.highlight"));
		txtEmailField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtEmailField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtEmailField.setCaretColor(new Color(255, 165, 0));
		txtEmailField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtEmailField.setBounds(790, 200, 200, 30);
		contentPane.add(txtEmailField);
		txtEmailField.setColumns(10);
		
		txtUsernameField = new JTextField();
		txtUsernameField.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsernameField.setDisabledTextColor(Color.DARK_GRAY);
		txtUsernameField.setSelectionColor(Color.LIGHT_GRAY);
		txtUsernameField.setForeground(UIManager.getColor("Button.highlight"));
		txtUsernameField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtUsernameField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtUsernameField.setCaretColor(new Color(255, 165, 0));
		txtUsernameField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtUsernameField.setBounds(430, 200, 200, 30);
		contentPane.add(txtUsernameField);
		txtUsernameField.setColumns(10);
		
		txtAddressField = new JTextField();
		txtAddressField.setHorizontalAlignment(SwingConstants.LEFT);
		txtAddressField.setDisabledTextColor(Color.DARK_GRAY);
		txtAddressField.setSelectionColor(Color.LIGHT_GRAY);
		txtAddressField.setForeground(UIManager.getColor("Button.highlight"));
		txtAddressField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtAddressField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtAddressField.setCaretColor(new Color(255, 165, 0));
		txtAddressField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtAddressField.setBounds(430, 300, 200, 30);
		contentPane.add(txtAddressField);
		txtAddressField.setColumns(10);
		
		txtPhoneNumberField = new JTextField();
		txtPhoneNumberField.setHorizontalAlignment(SwingConstants.LEFT);
		txtPhoneNumberField.setDisabledTextColor(Color.DARK_GRAY);
		txtPhoneNumberField.setSelectionColor(Color.LIGHT_GRAY);
		txtPhoneNumberField.setForeground(UIManager.getColor("Button.highlight"));
		txtPhoneNumberField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtPhoneNumberField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtPhoneNumberField.setCaretColor(new Color(255, 165, 0));
		txtPhoneNumberField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtPhoneNumberField.setBounds(790, 300, 200, 30);
		contentPane.add(txtPhoneNumberField);
		txtPhoneNumberField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setDisabledTextColor(Color.DARK_GRAY);
		passwordField.setSelectionColor(Color.LIGHT_GRAY);
		passwordField.setForeground(UIManager.getColor("Button.highlight"));
		passwordField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		passwordField.setBackground(UIManager.getColor("Button.darkShadow"));
		passwordField.setBounds(430, 401, 200, 30);
		contentPane.add(passwordField);
		
		passwordRepeatField = new JPasswordField();
		passwordRepeatField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordRepeatField.setDisabledTextColor(Color.DARK_GRAY);
		passwordRepeatField.setSelectionColor(Color.LIGHT_GRAY);
		passwordRepeatField.setForeground(UIManager.getColor("Button.highlight"));
		passwordRepeatField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		passwordRepeatField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		passwordRepeatField.setBackground(UIManager.getColor("Button.darkShadow"));
		passwordRepeatField.setBounds(790, 401, 200, 30);
		contentPane.add(passwordRepeatField);
		
		lblHomePic = new JLabel("");
		lblHomePic.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePic.setIcon(new ImageIcon(Register.class.getResource("/icons8_home_64px_1.png")));
		lblHomePic.setBounds(498, 505, 64, 64);
		contentPane.add(lblHomePic);
		
		lblPinPic = new JLabel("");
		lblPinPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPinPic.setIcon(new ImageIcon(Register.class.getResource("/icons8_address_64px.png")));
		lblPinPic.setBounds(678, 505, 64, 64);
		contentPane.add(lblPinPic);
		
		lblEarthPic = new JLabel("");
		lblEarthPic.setIcon(new ImageIcon(Register.class.getResource("/icons8_europe_64px.png")));
		lblEarthPic.setBounds(858, 505, 64, 64);
		contentPane.add(lblEarthPic);
		
		setUndecorated(true);
	}
}
