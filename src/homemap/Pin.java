package homemap;
//sve info o pinu koji je prethodno kliknut na home.java
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

public class Pin extends JFrame {

	private JPanel contentPane;
	private JTextField txtPhoneNumberField;
	private JTextField txtTypeOfPin;
	private JTextField txtRoomNumber;
	private JTextField txtAccessories;
	private JTextField txtDescription;
	private JTextField txtPhoneNumber;
	private JLabel lblPinLogo;
	private JTextField txtPin;
	private JButton btnRestoreDown;
	private JButton btnMinimize;
	private JButton btnClose;
	private JLabel lblHomePic;
	private JLabel lblPinPic;
	private JLabel lblEarthPic;
	private JButton btnMessage;
	private JTextField txtSurface;
	private JTextField txtSurfaceField;
	private JTextField txtTypeOfPinField;
	private JTextField txtRoomNumberField;
	private JTextField JlistAccessoriesField;
	private JButton btnNewButton;
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
					Pin frame = new Pin();
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
	public Pin() {
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
		btnRestoreDown.setIcon(new ImageIcon(Pin.class.getResource("/icons8_advertisement_page_30px.png")));
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
		btnClose.setIcon(new ImageIcon(Pin.class.getResource("/icons8_exit_24px.png")));
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
		btnMinimize.setIcon(new ImageIcon(Pin.class.getResource("/icons8_minimize_window_32px.png")));
		btnMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinimize.setBounds(930, 2, 38, 26);
		contentPane.add(btnMinimize);
		
		JLabel lblMenu = new JLabel("Home Map");
		lblMenu.setIcon(new ImageIcon(Pin.class.getResource("/icons8_home_32px_1.png")));
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setForeground(UIManager.getColor("Button.highlight"));
		lblMenu.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 19));
		lblMenu.setBackground(Color.DARK_GRAY);
		lblMenu.setOpaque(true);
		lblMenu.setBounds(0, 0, 1050, 30);
		contentPane.add(lblMenu);
		
		lblPinLogo = new JLabel("");
		lblPinLogo.setIcon(new ImageIcon(Pin.class.getResource("/icons8_address_100px.png")));
		lblPinLogo.setBounds(125, 130, 100, 100);
		contentPane.add(lblPinLogo);
		
		txtPin = new JTextField();
		txtPin.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPin.setHorizontalAlignment(SwingConstants.CENTER);
		txtPin.setBorder(null);
		txtPin.setBackground(new Color(255, 165, 0));
		txtPin.setForeground(Color.DARK_GRAY);
		txtPin.setText("PIN");
		txtPin.setBounds(100, 250, 150, 30);
		contentPane.add(txtPin);
		txtPin.setColumns(10);
		
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
		
		btnMessage = new JButton("MESSAGE OWNER");
		btnMessage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMessage.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnMessage.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnMessage.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMessage.setForeground(Color.DARK_GRAY);
		btnMessage.setBounds(30, 515, 290, 40);
		contentPane.add(btnMessage);
		
		btnNewButton = new JButton("BUY / RENT PIN");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnNewButton.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnNewButton.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(30, 455, 290, 40);
		contentPane.add(btnNewButton);
		
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
		txtTypeOfPin.setText("Type of pin ");
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
		txtPhoneNumber.setText("Phone number ");
		txtPhoneNumber.setBounds(790, 280, 200, 20);
		contentPane.add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		txtAccessories = new JTextField();
		txtAccessories.setHorizontalAlignment(SwingConstants.LEFT);
		txtAccessories.setForeground(UIManager.getColor("Button.highlight"));
		txtAccessories.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtAccessories.setBackground(UIManager.getColor("Button.darkShadow"));
		txtAccessories.setBorder(null);
		txtAccessories.setText("Accessories ");
		txtAccessories.setBounds(790, 180, 200, 20);
		contentPane.add(txtAccessories);
		txtAccessories.setColumns(10);
		
		txtRoomNumber = new JTextField();
		txtRoomNumber.setHorizontalAlignment(SwingConstants.LEFT);
		txtRoomNumber.setForeground(UIManager.getColor("Button.highlight"));
		txtRoomNumber.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtRoomNumber.setBackground(UIManager.getColor("Button.darkShadow"));
		txtRoomNumber.setBorder(null);
		txtRoomNumber.setText("Number of rooms ");
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
		lblHomePic.setIcon(new ImageIcon(Pin.class.getResource("/icons8_home_64px_1.png")));
		lblHomePic.setBounds(498, 570, 64, 64);
		contentPane.add(lblHomePic);
		
		lblPinPic = new JLabel("");
		lblPinPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPinPic.setIcon(new ImageIcon(Pin.class.getResource("/icons8_address_64px.png")));
		lblPinPic.setBounds(678, 570, 64, 64);
		contentPane.add(lblPinPic);
		
		lblEarthPic = new JLabel("");
		lblEarthPic.setIcon(new ImageIcon(Pin.class.getResource("/icons8_europe_64px.png")));
		lblEarthPic.setBounds(858, 570, 64, 64);
		contentPane.add(lblEarthPic);
		
		JEditorPane ePaneDescriptionField = new JEditorPane();
		ePaneDescriptionField.setSelectionColor(Color.LIGHT_GRAY);
		ePaneDescriptionField.setCaretColor(UIManager.getColor("Button.highlight"));
		ePaneDescriptionField.setForeground(UIManager.getColor("Button.highlight"));
		ePaneDescriptionField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 17));
		ePaneDescriptionField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 165, 0)));
		ePaneDescriptionField.setBackground(UIManager.getColor("Button.darkShadow"));
		ePaneDescriptionField.setBounds(430, 409, 580, 120);
		contentPane.add(ePaneDescriptionField);
		
		txtSurface = new JTextField();
		txtSurface.setBorder(null);
		txtSurface.setText("Surface ");
		txtSurface.setForeground(UIManager.getColor("Button.highlight"));
		txtSurface.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtSurface.setBackground(UIManager.getColor("Button.darkShadow"));
		txtSurface.setBounds(430, 280, 200, 30);
		contentPane.add(txtSurface);
		txtSurface.setColumns(10);
		
		txtSurfaceField = new JTextField();
		txtSurfaceField.setCaretColor(UIManager.getColor("Button.highlight"));
		txtSurfaceField.setSelectionColor(Color.LIGHT_GRAY);
		txtSurfaceField.setHorizontalAlignment(SwingConstants.LEFT);
		txtSurfaceField.setForeground(UIManager.getColor("Button.highlight"));
		txtSurfaceField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtSurfaceField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtSurfaceField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtSurfaceField.setBounds(430, 303, 200, 30);
		contentPane.add(txtSurfaceField);
		txtSurfaceField.setColumns(10);
		
		txtTypeOfPinField = new JTextField();
		txtTypeOfPinField.setHorizontalAlignment(SwingConstants.LEFT);
		txtTypeOfPinField.setForeground(UIManager.getColor("Button.highlight"));
		txtTypeOfPinField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtTypeOfPinField.setSelectionColor(Color.LIGHT_GRAY);
		txtTypeOfPinField.setCaretColor(UIManager.getColor("Button.highlight"));
		txtTypeOfPinField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtTypeOfPinField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtTypeOfPinField.setBounds(430, 100, 200, 30);
		contentPane.add(txtTypeOfPinField);
		txtTypeOfPinField.setColumns(10);
		
		txtRoomNumberField = new JTextField();
		txtRoomNumberField.setHorizontalAlignment(SwingConstants.LEFT);
		txtRoomNumberField.setForeground(UIManager.getColor("Button.highlight"));
		txtRoomNumberField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtRoomNumberField.setSelectionColor(Color.LIGHT_GRAY);
		txtRoomNumberField.setCaretColor(UIManager.getColor("Button.highlight"));
		txtRoomNumberField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtRoomNumberField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtRoomNumberField.setBounds(790, 100, 200, 30);
		contentPane.add(txtRoomNumberField);
		txtRoomNumberField.setColumns(10);
		
		JlistAccessoriesField = new JTextField();
		JlistAccessoriesField.setSelectionColor(Color.LIGHT_GRAY);
		JlistAccessoriesField.setHorizontalAlignment(SwingConstants.LEFT);
		JlistAccessoriesField.setForeground(UIManager.getColor("Button.highlight"));
		JlistAccessoriesField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		JlistAccessoriesField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		JlistAccessoriesField.setCaretColor(UIManager.getColor("Button.highlight"));
		JlistAccessoriesField.setBackground(UIManager.getColor("Button.darkShadow"));
		JlistAccessoriesField.setBounds(790, 200, 200, 30);
		contentPane.add(JlistAccessoriesField);
		JlistAccessoriesField.setColumns(10);
		
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
