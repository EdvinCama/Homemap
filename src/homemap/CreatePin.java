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

public class CreatePin extends JFrame {

	private JPanel contentPane;
	private JTextField txtPhoneNumberField;
	private JTextField txtTypeOfPin;
	private JTextField txtRoomNumber;
	private JTextField txtAccessories;
	private JTextField txtDescription;
	private JTextField txtPhoneNumber;
	private JLabel lblPinLogo;
	private JTextField txtCreatePin;
	private JButton btnRestoreDown;
	private JButton btnMinimize;
	private JButton btnClose;
	private JLabel lblHomePic;
	private JLabel lblPinPic;
	private JLabel lblEarthPic;
	private JButton btnSave;
	private JComboBox comboBoxRoomNumber;
	private JTextField txtSurface;
	private JTextField textField;
	private JTextField txtX;
	private JTextField txtXField;
	private JTextField txtY;
	private JTextField txtYField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatePin frame = new CreatePin();
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
	public CreatePin() {
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
		btnRestoreDown.setIcon(new ImageIcon(CreatePin.class.getResource("/icons8_advertisement_page_30px.png")));
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
		btnClose.setIcon(new ImageIcon(CreatePin.class.getResource("/icons8_exit_24px.png")));
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
		btnMinimize.setIcon(new ImageIcon(CreatePin.class.getResource("/icons8_minimize_window_32px.png")));
		btnMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinimize.setBounds(930, 2, 38, 26);
		contentPane.add(btnMinimize);
		
		JLabel lblMenu = new JLabel("Home Map");
		lblMenu.setIcon(new ImageIcon(CreatePin.class.getResource("/icons8_home_32px_1.png")));
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setForeground(UIManager.getColor("Button.highlight"));
		lblMenu.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 19));
		lblMenu.setBackground(Color.DARK_GRAY);
		lblMenu.setOpaque(true);
		lblMenu.setBounds(0, 0, 1050, 30);
		contentPane.add(lblMenu);
		
		lblPinLogo = new JLabel("");
		lblPinLogo.setIcon(new ImageIcon(CreatePin.class.getResource("/icons8_address_100px.png")));
		lblPinLogo.setBounds(125, 130, 100, 100);
		contentPane.add(lblPinLogo);
		
		txtCreatePin = new JTextField();
		txtCreatePin.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtCreatePin.setHorizontalAlignment(SwingConstants.CENTER);
		txtCreatePin.setBorder(null);
		txtCreatePin.setBackground(new Color(255, 165, 0));
		txtCreatePin.setForeground(Color.DARK_GRAY);
		txtCreatePin.setText("CREATE PIN");
		txtCreatePin.setBounds(100, 250, 150, 30);
		contentPane.add(txtCreatePin);
		txtCreatePin.setColumns(10);
		
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
		
		btnSave = new JButton("SAVE");
		btnSave.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnSave.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSave.setForeground(Color.DARK_GRAY);
		btnSave.setBounds(30, 515, 290, 40);
		contentPane.add(btnSave);
		
		JLabel lblSignUp = new JLabel("");
		lblSignUp.setOpaque(true);
		lblSignUp.setForeground(new Color(255, 165, 0));
		lblSignUp.setBackground(new Color(255, 165, 0));
		lblSignUp.setBorder(new MatteBorder(1, 1, 2, 2, (Color) Color.DARK_GRAY));
		lblSignUp.setBounds(0, 0, 350, 655);
		contentPane.add(lblSignUp);
		
		txtTypeOfPin = new JTextField();
		txtTypeOfPin.setHorizontalAlignment(SwingConstants.LEFT);
		txtTypeOfPin.setForeground(UIManager.getColor("Button.highlight"));
		txtTypeOfPin.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtTypeOfPin.setBackground(UIManager.getColor("Button.darkShadow"));
		txtTypeOfPin.setBorder(null);
		txtTypeOfPin.setText("Type of pin :");
		txtTypeOfPin.setBounds(430, 80, 200, 20);
		contentPane.add(txtTypeOfPin);
		txtTypeOfPin.setColumns(10);
		
		txtDescription = new JTextField();
		txtDescription.setHorizontalAlignment(SwingConstants.LEFT);
		txtDescription.setForeground(UIManager.getColor("Button.highlight"));
		txtDescription.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtDescription.setBackground(UIManager.getColor("Button.darkShadow"));
		txtDescription.setBorder(null);
		txtDescription.setText("Description :");
		txtDescription.setBounds(430, 378, 200, 20);
		contentPane.add(txtDescription);
		txtDescription.setColumns(10);
		
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
		
		txtAccessories = new JTextField();
		txtAccessories.setHorizontalAlignment(SwingConstants.LEFT);
		txtAccessories.setForeground(UIManager.getColor("Button.highlight"));
		txtAccessories.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtAccessories.setBackground(UIManager.getColor("Button.darkShadow"));
		txtAccessories.setBorder(null);
		txtAccessories.setText("Accessories :");
		txtAccessories.setBounds(790, 180, 200, 20);
		contentPane.add(txtAccessories);
		txtAccessories.setColumns(10);
		
		txtRoomNumber = new JTextField();
		txtRoomNumber.setHorizontalAlignment(SwingConstants.LEFT);
		txtRoomNumber.setForeground(UIManager.getColor("Button.highlight"));
		txtRoomNumber.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtRoomNumber.setBackground(UIManager.getColor("Button.darkShadow"));
		txtRoomNumber.setBorder(null);
		txtRoomNumber.setText("Number of rooms :");
		txtRoomNumber.setBounds(790, 80, 218, 20);
		contentPane.add(txtRoomNumber);
		txtRoomNumber.setColumns(10);
		
		txtPhoneNumberField = new JTextField();
		txtPhoneNumberField.setHorizontalAlignment(SwingConstants.LEFT);
		txtPhoneNumberField.setDisabledTextColor(Color.DARK_GRAY);
		txtPhoneNumberField.setSelectionColor(Color.LIGHT_GRAY);
		txtPhoneNumberField.setForeground(UIManager.getColor("Button.highlight"));
		txtPhoneNumberField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtPhoneNumberField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtPhoneNumberField.setCaretColor(UIManager.getColor("Button.highlight"));
		txtPhoneNumberField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtPhoneNumberField.setBounds(790, 303, 200, 30);
		contentPane.add(txtPhoneNumberField);
		txtPhoneNumberField.setColumns(10);
		
		lblHomePic = new JLabel("");
		lblHomePic.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePic.setIcon(new ImageIcon(CreatePin.class.getResource("/icons8_home_64px_1.png")));
		lblHomePic.setBounds(498, 570, 64, 64);
		contentPane.add(lblHomePic);
		
		lblPinPic = new JLabel("");
		lblPinPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPinPic.setIcon(new ImageIcon(CreatePin.class.getResource("/icons8_address_64px.png")));
		lblPinPic.setBounds(678, 570, 64, 64);
		contentPane.add(lblPinPic);
		
		lblEarthPic = new JLabel("");
		lblEarthPic.setIcon(new ImageIcon(CreatePin.class.getResource("/icons8_europe_64px.png")));
		lblEarthPic.setBounds(858, 570, 64, 64);
		contentPane.add(lblEarthPic);
		
		JComboBox comboBoxPinType = new JComboBox();
		comboBoxPinType.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		comboBoxPinType.addItem("Flat");
		comboBoxPinType.addItem("House");
		comboBoxPinType.addItem("Room");
		comboBoxPinType.addItem("Office");
		comboBoxPinType.addItem("Garage");
		comboBoxPinType.addItem("Other");
		comboBoxPinType.setSelectedItem(null);
		comboBoxPinType.setForeground(UIManager.getColor("Button.highlight"));
		comboBoxPinType.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		comboBoxPinType.setBackground(UIManager.getColor("Button.darkShadow"));
		comboBoxPinType.setBounds(430, 103, 200, 30);
		contentPane.add(comboBoxPinType);
		
		comboBoxRoomNumber = new JComboBox();
		comboBoxRoomNumber.addItem("1");
		comboBoxRoomNumber.addItem("2");
		comboBoxRoomNumber.addItem("3");
		comboBoxRoomNumber.addItem("4");
		comboBoxRoomNumber.addItem("5");
		comboBoxRoomNumber.addItem("Other");
		comboBoxRoomNumber.setSelectedItem(null);
		comboBoxRoomNumber.setForeground(UIManager.getColor("Button.highlight"));
		comboBoxRoomNumber.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		comboBoxRoomNumber.setBackground(UIManager.getColor("Button.darkShadow"));
		comboBoxRoomNumber.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		comboBoxRoomNumber.setBounds(790, 103, 200, 30);
		contentPane.add(comboBoxRoomNumber);
		
		JList listAccessories = new JList();
		listAccessories.setForeground(UIManager.getColor("Button.highlight"));
		listAccessories.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		listAccessories.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		listAccessories.setBackground(UIManager.getColor("Button.darkShadow"));
		listAccessories.setBounds(790, 200, 200, 30);
		contentPane.add(listAccessories);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setCaretColor(UIManager.getColor("Button.highlight"));
		editorPane.setForeground(UIManager.getColor("Button.highlight"));
		editorPane.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 17));
		editorPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 165, 0)));
		editorPane.setBackground(UIManager.getColor("Button.darkShadow"));
		editorPane.setBounds(430, 409, 580, 120);
		contentPane.add(editorPane);
		
		txtSurface = new JTextField();
		txtSurface.setBorder(null);
		txtSurface.setText("Surface :");
		txtSurface.setForeground(UIManager.getColor("CheckBox.highlight"));
		txtSurface.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtSurface.setBackground(UIManager.getColor("Button.darkShadow"));
		txtSurface.setBounds(430, 280, 200, 30);
		contentPane.add(txtSurface);
		txtSurface.setColumns(10);
		
		textField = new JTextField();
		textField.setCaretColor(UIManager.getColor("Button.highlight"));
		textField.setSelectionColor(Color.LIGHT_GRAY);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(UIManager.getColor("Button.highlight"));
		textField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		textField.setBackground(UIManager.getColor("Button.darkShadow"));
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		textField.setBounds(430, 303, 200, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtX = new JTextField();
		txtX.setText("X :");
		txtX.setHorizontalAlignment(SwingConstants.LEFT);
		txtX.setForeground(Color.WHITE);
		txtX.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtX.setColumns(10);
		txtX.setBorder(null);
		txtX.setBackground(SystemColor.controlDkShadow);
		txtX.setBounds(430, 180, 90, 20);
		contentPane.add(txtX);
		
		txtXField = new JTextField();
		txtXField.setSelectionColor(Color.LIGHT_GRAY);
		txtXField.setHorizontalAlignment(SwingConstants.LEFT);
		txtXField.setForeground(Color.WHITE);
		txtXField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtXField.setDisabledTextColor(Color.DARK_GRAY);
		txtXField.setColumns(10);
		txtXField.setCaretColor(Color.WHITE);
		txtXField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtXField.setBackground(SystemColor.controlDkShadow);
		txtXField.setBounds(430, 200, 90, 30);
		contentPane.add(txtXField);
		
		txtY = new JTextField();
		txtY.setText("Y :");
		txtY.setHorizontalAlignment(SwingConstants.LEFT);
		txtY.setForeground(Color.WHITE);
		txtY.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtY.setColumns(10);
		txtY.setBorder(null);
		txtY.setBackground(SystemColor.controlDkShadow);
		txtY.setBounds(540, 180, 90, 20);
		contentPane.add(txtY);
		
		txtYField = new JTextField();
		txtYField.setSelectionColor(Color.LIGHT_GRAY);
		txtYField.setHorizontalAlignment(SwingConstants.LEFT);
		txtYField.setForeground(Color.WHITE);
		txtYField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtYField.setDisabledTextColor(Color.DARK_GRAY);
		txtYField.setColumns(10);
		txtYField.setCaretColor(Color.WHITE);
		txtYField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtYField.setBackground(SystemColor.controlDkShadow);
		txtYField.setBounds(540, 200, 90, 30);
		contentPane.add(txtYField);
		
		setUndecorated(true);
	}
}
