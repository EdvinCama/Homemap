package homemap;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;

public class ContactInteraction extends JFrame {

	private JPanel contentPane;
	private JLabel lblContactLogo;
	private JTextField txtContact;
	private JButton btnRestoreDown;
	private JButton btnMinimize;
	private JButton btnClose;
	private JLabel lblHomePic;
	private JLabel lblPinPic;
	private JLabel lblEarthPic;
	private JButton btnContact;
	private JTextField txtFirstname;
	private JTextField txtFirstnameField;
	private JTextField txtUsername;
	private JTextField txtUsernameField;
	private JTextField txtAddress;
	private JTextField txtAddressField;
	private JTextField txtLastname;
	private JTextField txtLastnameField;
	private JTextField txtEmail;
	private JTextField txtEmailField;
	private JTextField txtPhoneNumber;
	private JTextField txtPhoneNumberField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactInteraction frame = new ContactInteraction();
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
	public ContactInteraction() {
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
		btnRestoreDown.setIcon(new ImageIcon(ContactInteraction.class.getResource("/icons8_advertisement_page_30px.png")));
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
		btnClose.setIcon(new ImageIcon(ContactInteraction.class.getResource("/icons8_exit_24px.png")));
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
		btnMinimize.setIcon(new ImageIcon(ContactInteraction.class.getResource("/icons8_minimize_window_32px.png")));
		btnMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinimize.setBounds(930, 2, 38, 26);
		contentPane.add(btnMinimize);
		
		JLabel lblMenu = new JLabel("Home Map");
		lblMenu.setIcon(new ImageIcon(ContactInteraction.class.getResource("/icons8_home_32px_1.png")));
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setForeground(UIManager.getColor("Button.highlight"));
		lblMenu.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 19));
		lblMenu.setBackground(Color.DARK_GRAY);
		lblMenu.setOpaque(true);
		lblMenu.setBounds(0, 0, 1050, 30);
		contentPane.add(lblMenu);
		
		lblContactLogo = new JLabel("");
		lblContactLogo.setIcon(new ImageIcon(ContactInteraction.class.getResource("/icons8_contact_100px.png")));
		lblContactLogo.setBounds(125, 130, 100, 100);
		contentPane.add(lblContactLogo);
		
		txtContact = new JTextField();
		txtContact.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtContact.setHorizontalAlignment(SwingConstants.CENTER);
		txtContact.setBorder(null);
		txtContact.setBackground(new Color(255, 165, 0));
		txtContact.setForeground(Color.DARK_GRAY);
		txtContact.setText("CONTACT");
		txtContact.setBounds(75, 250, 200, 30);
		contentPane.add(txtContact);
		txtContact.setColumns(10);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnCancel.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCancel.setForeground(Color.DARK_GRAY);
		btnCancel.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnCancel.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(64, 64, 64)));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBounds(30, 575, 290, 40);
		contentPane.add(btnCancel);
		
		btnContact = new JButton("CONTACT");
		btnContact.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnContact.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnContact.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnContact.setForeground(Color.DARK_GRAY);
		btnContact.setBounds(30, 515, 290, 40);
		contentPane.add(btnContact);
		
		JLabel lblSignUp = new JLabel("");
		lblSignUp.setOpaque(true);
		lblSignUp.setForeground(new Color(255, 165, 0));
		lblSignUp.setBackground(new Color(255, 165, 0));
		lblSignUp.setBorder(new MatteBorder(1, 1, 2, 2, (Color) Color.DARK_GRAY));
		lblSignUp.setBounds(0, 0, 350, 655);
		contentPane.add(lblSignUp);
		
		lblHomePic = new JLabel("");
		lblHomePic.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePic.setIcon(new ImageIcon(ContactInteraction.class.getResource("/icons8_home_64px_1.png")));
		lblHomePic.setBounds(498, 545, 64, 64);
		contentPane.add(lblHomePic);
		
		lblPinPic = new JLabel("");
		lblPinPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPinPic.setIcon(new ImageIcon(ContactInteraction.class.getResource("/icons8_address_64px.png")));
		lblPinPic.setBounds(678, 545, 64, 64);
		contentPane.add(lblPinPic);
		
		lblEarthPic = new JLabel("");
		lblEarthPic.setIcon(new ImageIcon(ContactInteraction.class.getResource("/icons8_europe_64px.png")));
		lblEarthPic.setBounds(858, 545, 64, 64);
		contentPane.add(lblEarthPic);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 165, 0));
		separator.setBounds(350, 530, 698, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 165, 0));
		separator_1.setBounds(350, 531, 698, 2);
		contentPane.add(separator_1);
		
		txtFirstname = new JTextField();
		txtFirstname.setText("First name ");
		txtFirstname.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstname.setForeground(Color.WHITE);
		txtFirstname.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtFirstname.setColumns(10);
		txtFirstname.setBorder(null);
		txtFirstname.setBackground(SystemColor.controlDkShadow);
		txtFirstname.setBounds(420, 130, 200, 20);
		contentPane.add(txtFirstname);
		
		txtFirstnameField = new JTextField();
		txtFirstnameField.setSelectionColor(Color.LIGHT_GRAY);
		txtFirstnameField.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstnameField.setForeground(Color.WHITE);
		txtFirstnameField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtFirstnameField.setDisabledTextColor(Color.DARK_GRAY);
		txtFirstnameField.setColumns(10);
		txtFirstnameField.setCaretColor(new Color(255, 165, 0));
		txtFirstnameField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtFirstnameField.setBackground(SystemColor.controlDkShadow);
		txtFirstnameField.setBounds(420, 150, 200, 30);
		contentPane.add(txtFirstnameField);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username ");
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		txtUsername.setBackground(SystemColor.controlDkShadow);
		txtUsername.setBounds(420, 230, 200, 20);
		contentPane.add(txtUsername);
		
		txtUsernameField = new JTextField();
		txtUsernameField.setSelectionColor(Color.LIGHT_GRAY);
		txtUsernameField.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsernameField.setForeground(Color.WHITE);
		txtUsernameField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtUsernameField.setDisabledTextColor(Color.DARK_GRAY);
		txtUsernameField.setColumns(10);
		txtUsernameField.setCaretColor(new Color(255, 165, 0));
		txtUsernameField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtUsernameField.setBackground(SystemColor.controlDkShadow);
		txtUsernameField.setBounds(420, 250, 200, 30);
		contentPane.add(txtUsernameField);
		
		txtAddress = new JTextField();
		txtAddress.setText("Address ");
		txtAddress.setHorizontalAlignment(SwingConstants.LEFT);
		txtAddress.setForeground(Color.WHITE);
		txtAddress.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtAddress.setColumns(10);
		txtAddress.setBorder(null);
		txtAddress.setBackground(SystemColor.controlDkShadow);
		txtAddress.setBounds(420, 330, 200, 20);
		contentPane.add(txtAddress);
		
		txtAddressField = new JTextField();
		txtAddressField.setSelectionColor(Color.LIGHT_GRAY);
		txtAddressField.setHorizontalAlignment(SwingConstants.LEFT);
		txtAddressField.setForeground(Color.WHITE);
		txtAddressField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtAddressField.setDisabledTextColor(Color.DARK_GRAY);
		txtAddressField.setColumns(10);
		txtAddressField.setCaretColor(new Color(255, 165, 0));
		txtAddressField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtAddressField.setBackground(SystemColor.controlDkShadow);
		txtAddressField.setBounds(420, 350, 200, 30);
		contentPane.add(txtAddressField);
		
		txtLastname = new JTextField();
		txtLastname.setText("Last name ");
		txtLastname.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastname.setForeground(Color.WHITE);
		txtLastname.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtLastname.setColumns(10);
		txtLastname.setBorder(null);
		txtLastname.setBackground(SystemColor.controlDkShadow);
		txtLastname.setBounds(780, 130, 200, 20);
		contentPane.add(txtLastname);
		
		txtLastnameField = new JTextField();
		txtLastnameField.setSelectionColor(Color.LIGHT_GRAY);
		txtLastnameField.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastnameField.setForeground(Color.WHITE);
		txtLastnameField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtLastnameField.setDisabledTextColor(Color.DARK_GRAY);
		txtLastnameField.setColumns(10);
		txtLastnameField.setCaretColor(new Color(255, 165, 0));
		txtLastnameField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtLastnameField.setBackground(SystemColor.controlDkShadow);
		txtLastnameField.setBounds(780, 150, 200, 30);
		contentPane.add(txtLastnameField);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail ");
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setForeground(Color.WHITE);
		txtEmail.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBackground(SystemColor.controlDkShadow);
		txtEmail.setBounds(780, 230, 200, 20);
		contentPane.add(txtEmail);
		
		txtEmailField = new JTextField();
		txtEmailField.setSelectionColor(Color.LIGHT_GRAY);
		txtEmailField.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmailField.setForeground(Color.WHITE);
		txtEmailField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtEmailField.setDisabledTextColor(Color.DARK_GRAY);
		txtEmailField.setColumns(10);
		txtEmailField.setCaretColor(new Color(255, 165, 0));
		txtEmailField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtEmailField.setBackground(SystemColor.controlDkShadow);
		txtEmailField.setBounds(780, 250, 200, 30);
		contentPane.add(txtEmailField);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("Phone number ");
		txtPhoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
		txtPhoneNumber.setForeground(Color.WHITE);
		txtPhoneNumber.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBorder(null);
		txtPhoneNumber.setBackground(SystemColor.controlDkShadow);
		txtPhoneNumber.setBounds(780, 330, 200, 20);
		contentPane.add(txtPhoneNumber);
		
		txtPhoneNumberField = new JTextField();
		txtPhoneNumberField.setSelectionColor(Color.LIGHT_GRAY);
		txtPhoneNumberField.setHorizontalAlignment(SwingConstants.LEFT);
		txtPhoneNumberField.setForeground(Color.WHITE);
		txtPhoneNumberField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtPhoneNumberField.setDisabledTextColor(Color.DARK_GRAY);
		txtPhoneNumberField.setColumns(10);
		txtPhoneNumberField.setCaretColor(new Color(255, 165, 0));
		txtPhoneNumberField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtPhoneNumberField.setBackground(SystemColor.controlDkShadow);
		txtPhoneNumberField.setBounds(780, 350, 200, 30);
		contentPane.add(txtPhoneNumberField);
		
		JLabel lblHome = new JLabel("");
		lblHome.setOpaque(true);
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setBackground(SystemColor.controlDkShadow);
		lblHome.setBounds(498, 545, 64, 64);
		contentPane.add(lblHome);
		
		JLabel lblPin = new JLabel("");
		lblPin.setOpaque(true);
		lblPin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPin.setBackground(SystemColor.controlDkShadow);
		lblPin.setBounds(678, 545, 64, 64);
		contentPane.add(lblPin);
		
		JLabel lblEurope = new JLabel("");
		lblEurope.setOpaque(true);
		lblEurope.setBackground(SystemColor.controlDkShadow);
		lblEurope.setBounds(858, 545, 64, 64);
		contentPane.add(lblEurope);
		
		setUndecorated(true);
	}
}
