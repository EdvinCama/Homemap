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

public class PaymentMethod extends JFrame {

	private JPanel contentPane;
	private JLabel lblPaymentLogo;
	private JTextField txtPayment;
	private JButton btnRestoreDown;
	private JButton btnMinimize;
	private JButton btnClose;
	private JLabel lblHomePic;
	private JLabel lblPinPic;
	private JLabel lblEarthPic;
	private JButton btnPay;
	private JTextField txtFirstName;
	private JTextField txtLastname;
	private JTextField txtFirstnameField;
	private JTextField txtLastnameField;
	private JTextField txtCardNumber;
	private JTextField txtCardNumberField;
	private JTextField txtExpireDate;
	private JTextField txtEpireDateField;
	private JTextField txtCVV;
	private JTextField txtCVVField;
	private JTextField txtEmail;
	private JTextField txtEmailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentMethod frame = new PaymentMethod();
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
	public PaymentMethod() {
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
		btnRestoreDown.setIcon(new ImageIcon(PaymentMethod.class.getResource("/icons8_advertisement_page_30px.png")));
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
		btnClose.setIcon(new ImageIcon(PaymentMethod.class.getResource("/icons8_exit_24px.png")));
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
		btnMinimize.setIcon(new ImageIcon(PaymentMethod.class.getResource("/icons8_minimize_window_32px.png")));
		btnMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinimize.setBounds(930, 2, 38, 26);
		contentPane.add(btnMinimize);
		
		JLabel lblMenu = new JLabel("Home Map");
		lblMenu.setIcon(new ImageIcon(PaymentMethod.class.getResource("/icons8_home_32px_1.png")));
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setForeground(UIManager.getColor("Button.highlight"));
		lblMenu.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 19));
		lblMenu.setBackground(Color.DARK_GRAY);
		lblMenu.setOpaque(true);
		lblMenu.setBounds(0, 0, 1050, 30);
		contentPane.add(lblMenu);
		
		lblPaymentLogo = new JLabel("");
		lblPaymentLogo.setIcon(new ImageIcon(PaymentMethod.class.getResource("/icons8_card_payment_100px.png")));
		lblPaymentLogo.setBounds(125, 130, 100, 100);
		contentPane.add(lblPaymentLogo);
		
		txtPayment = new JTextField();
		txtPayment.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPayment.setHorizontalAlignment(SwingConstants.CENTER);
		txtPayment.setBorder(null);
		txtPayment.setBackground(new Color(255, 165, 0));
		txtPayment.setForeground(Color.DARK_GRAY);
		txtPayment.setText("PAYMENT METHOD");
		txtPayment.setBounds(75, 250, 200, 30);
		contentPane.add(txtPayment);
		txtPayment.setColumns(10);
		
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
		
		btnPay = new JButton("PAY");
		btnPay.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnPay.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnPay.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPay.setForeground(Color.DARK_GRAY);
		btnPay.setBounds(30, 515, 290, 40);
		contentPane.add(btnPay);
		
		JLabel lblSignUp = new JLabel("");
		lblSignUp.setOpaque(true);
		lblSignUp.setForeground(new Color(255, 165, 0));
		lblSignUp.setBackground(new Color(255, 165, 0));
		lblSignUp.setBorder(new MatteBorder(1, 1, 2, 2, (Color) Color.DARK_GRAY));
		lblSignUp.setBounds(0, 0, 350, 655);
		contentPane.add(lblSignUp);
		
		lblHomePic = new JLabel("");
		lblHomePic.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePic.setIcon(new ImageIcon(PaymentMethod.class.getResource("/icons8_home_64px_1.png")));
		lblHomePic.setBounds(498, 545, 64, 64);
		contentPane.add(lblHomePic);
		
		lblPinPic = new JLabel("");
		lblPinPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPinPic.setIcon(new ImageIcon(PaymentMethod.class.getResource("/icons8_address_64px.png")));
		lblPinPic.setBounds(678, 545, 64, 64);
		contentPane.add(lblPinPic);
		
		lblEarthPic = new JLabel("");
		lblEarthPic.setIcon(new ImageIcon(PaymentMethod.class.getResource("/icons8_europe_64px.png")));
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
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First name :");
		txtFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstName.setForeground(Color.WHITE);
		txtFirstName.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtFirstName.setColumns(10);
		txtFirstName.setBorder(null);
		txtFirstName.setBackground(SystemColor.controlDkShadow);
		txtFirstName.setBounds(423, 130, 200, 20);
		contentPane.add(txtFirstName);
		
		txtLastname = new JTextField();
		txtLastname.setText("Last name :");
		txtLastname.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastname.setForeground(Color.WHITE);
		txtLastname.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtLastname.setColumns(10);
		txtLastname.setBorder(null);
		txtLastname.setBackground(SystemColor.controlDkShadow);
		txtLastname.setBounds(783, 130, 200, 20);
		contentPane.add(txtLastname);
		
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
		txtFirstnameField.setBounds(423, 150, 200, 30);
		contentPane.add(txtFirstnameField);
		
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
		txtLastnameField.setBounds(783, 150, 200, 30);
		contentPane.add(txtLastnameField);
		
		txtCardNumber = new JTextField();
		txtCardNumber.setText("Card number :");
		txtCardNumber.setHorizontalAlignment(SwingConstants.LEFT);
		txtCardNumber.setForeground(Color.WHITE);
		txtCardNumber.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtCardNumber.setColumns(10);
		txtCardNumber.setBorder(null);
		txtCardNumber.setBackground(SystemColor.controlDkShadow);
		txtCardNumber.setBounds(423, 230, 200, 20);
		contentPane.add(txtCardNumber);
		
		txtCardNumberField = new JTextField();
		txtCardNumberField.setSelectionColor(Color.LIGHT_GRAY);
		txtCardNumberField.setHorizontalAlignment(SwingConstants.LEFT);
		txtCardNumberField.setForeground(Color.WHITE);
		txtCardNumberField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtCardNumberField.setDisabledTextColor(Color.DARK_GRAY);
		txtCardNumberField.setColumns(10);
		txtCardNumberField.setCaretColor(new Color(255, 165, 0));
		txtCardNumberField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtCardNumberField.setBackground(SystemColor.controlDkShadow);
		txtCardNumberField.setBounds(423, 250, 200, 30);
		contentPane.add(txtCardNumberField);
		
		txtExpireDate = new JTextField();
		txtExpireDate.setText("Expire date :");
		txtExpireDate.setHorizontalAlignment(SwingConstants.LEFT);
		txtExpireDate.setForeground(Color.WHITE);
		txtExpireDate.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtExpireDate.setColumns(10);
		txtExpireDate.setBorder(null);
		txtExpireDate.setBackground(SystemColor.controlDkShadow);
		txtExpireDate.setBounds(783, 230, 200, 20);
		contentPane.add(txtExpireDate);
		
		txtEpireDateField = new JTextField();
		txtEpireDateField.setSelectionColor(Color.LIGHT_GRAY);
		txtEpireDateField.setHorizontalAlignment(SwingConstants.LEFT);
		txtEpireDateField.setForeground(Color.WHITE);
		txtEpireDateField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtEpireDateField.setDisabledTextColor(Color.DARK_GRAY);
		txtEpireDateField.setColumns(10);
		txtEpireDateField.setCaretColor(new Color(255, 165, 0));
		txtEpireDateField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtEpireDateField.setBackground(SystemColor.controlDkShadow);
		txtEpireDateField.setBounds(783, 250, 200, 30);
		contentPane.add(txtEpireDateField);
		
		txtCVV = new JTextField();
		txtCVV.setText("CVV :");
		txtCVV.setHorizontalAlignment(SwingConstants.LEFT);
		txtCVV.setForeground(Color.WHITE);
		txtCVV.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtCVV.setColumns(10);
		txtCVV.setBorder(null);
		txtCVV.setBackground(SystemColor.controlDkShadow);
		txtCVV.setBounds(423, 330, 200, 20);
		contentPane.add(txtCVV);
		
		txtCVVField = new JTextField();
		txtCVVField.setSelectionColor(Color.LIGHT_GRAY);
		txtCVVField.setHorizontalAlignment(SwingConstants.LEFT);
		txtCVVField.setForeground(Color.WHITE);
		txtCVVField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtCVVField.setDisabledTextColor(Color.DARK_GRAY);
		txtCVVField.setColumns(10);
		txtCVVField.setCaretColor(new Color(255, 165, 0));
		txtCVVField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtCVVField.setBackground(SystemColor.controlDkShadow);
		txtCVVField.setBounds(423, 350, 200, 30);
		contentPane.add(txtCVVField);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail :");
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setForeground(Color.WHITE);
		txtEmail.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBackground(SystemColor.controlDkShadow);
		txtEmail.setBounds(783, 330, 200, 20);
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
		txtEmailField.setBounds(783, 350, 200, 30);
		contentPane.add(txtEmailField);
		
		setUndecorated(true);
	}
}
