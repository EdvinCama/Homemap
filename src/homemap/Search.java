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


public class Search extends JFrame {

	private JPanel contentPane;
	private JTextField txtXField;
	private JTextField txtTypeOfPin;
	private JTextField txtRoomNumber;
	private JTextField txtAccessories;
	private JTextField txtX;
	private JTextField txtFurniture;
	private JLabel lblPinLogo;
	private JTextField txtSearchPin;
	private JButton btnRestoreDown;
	private JButton btnMinimize;
	private JButton btnClose;
	private JLabel lblHomePic;
	private JLabel lblPinPic;
	private JLabel lblEarthPic;
	private JButton btnSearch;
	private JComboBox comboBoxRoomNumber;
	private JTextField txtSurface;
	private JTextField txtSurfaceField;
	private JTextField txtYField;
	private JTextField txtY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
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
	public Search() {
		
		Search holder = this;
		
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
		btnRestoreDown.setIcon(new ImageIcon(Search.class.getResource("/icons8_advertisement_page_30px.png")));
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
		btnClose.setIcon(new ImageIcon(Search.class.getResource("/icons8_exit_24px.png")));
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
		btnMinimize.setIcon(new ImageIcon(Search.class.getResource("/icons8_minimize_window_32px.png")));
		btnMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinimize.setBounds(930, 2, 38, 26);
		contentPane.add(btnMinimize);
		
		JLabel lblMenu = new JLabel("Home Map");
		lblMenu.setIcon(new ImageIcon(Search.class.getResource("/icons8_home_32px_1.png")));
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setForeground(UIManager.getColor("Button.highlight"));
		lblMenu.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 19));
		lblMenu.setBackground(Color.DARK_GRAY);
		lblMenu.setOpaque(true);
		lblMenu.setBounds(0, 0, 1050, 30);
		contentPane.add(lblMenu);
		
		lblPinLogo = new JLabel("");
		lblPinLogo.setIcon(new ImageIcon(Search.class.getResource("/icons8_address_100px.png")));
		lblPinLogo.setBounds(125, 130, 100, 100);
		contentPane.add(lblPinLogo);
		
		txtSearchPin = new JTextField();
		txtSearchPin.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtSearchPin.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearchPin.setBorder(null);
		txtSearchPin.setBackground(new Color(255, 165, 0));
		txtSearchPin.setForeground(Color.DARK_GRAY);
		txtSearchPin.setText("PIN SEARCH");
		txtSearchPin.setBounds(100, 250, 150, 30);
		contentPane.add(txtSearchPin);
		txtSearchPin.setColumns(10);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCancel.setForeground(Color.DARK_GRAY);
		btnCancel.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnCancel.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(64, 64, 64)));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBounds(30, 575, 290, 40);
		contentPane.add(btnCancel);
		
		btnSearch = new JButton("SEARCH");
		btnSearch.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnSearch.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSearch.setForeground(Color.DARK_GRAY);
		btnSearch.setBounds(30, 515, 290, 40);
		contentPane.add(btnSearch);
		
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
		txtTypeOfPin.setBounds(430, 135, 200, 20);
		contentPane.add(txtTypeOfPin);
		txtTypeOfPin.setColumns(10);
		
		txtFurniture = new JTextField();
		txtFurniture.setHorizontalAlignment(SwingConstants.LEFT);
		txtFurniture.setForeground(UIManager.getColor("Button.highlight"));
		txtFurniture.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtFurniture.setBackground(UIManager.getColor("Button.darkShadow"));
		txtFurniture.setBorder(null);
		txtFurniture.setText("Furnished :");
		txtFurniture.setBounds(790, 335, 200, 20);
		contentPane.add(txtFurniture);
		txtFurniture.setColumns(10);
		
		txtX = new JTextField();
		txtX.setHorizontalAlignment(SwingConstants.LEFT);
		txtX.setForeground(UIManager.getColor("Button.highlight"));
		txtX.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtX.setBackground(UIManager.getColor("Button.darkShadow"));
		txtX.setBorder(null);
		txtX.setText("X :");
		txtX.setBounds(430, 235, 90, 20);
		contentPane.add(txtX);
		txtX.setColumns(10);
		
		txtAccessories = new JTextField();
		txtAccessories.setHorizontalAlignment(SwingConstants.LEFT);
		txtAccessories.setForeground(UIManager.getColor("Button.highlight"));
		txtAccessories.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtAccessories.setBackground(UIManager.getColor("Button.darkShadow"));
		txtAccessories.setBorder(null);
		txtAccessories.setText("Accessories :");
		txtAccessories.setBounds(790, 235, 200, 20);
		contentPane.add(txtAccessories);
		txtAccessories.setColumns(10);
		
		txtRoomNumber = new JTextField();
		txtRoomNumber.setHorizontalAlignment(SwingConstants.LEFT);
		txtRoomNumber.setForeground(UIManager.getColor("Button.highlight"));
		txtRoomNumber.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtRoomNumber.setBackground(UIManager.getColor("Button.darkShadow"));
		txtRoomNumber.setBorder(null);
		txtRoomNumber.setText("Number of rooms :");
		txtRoomNumber.setBounds(790, 135, 218, 20);
		contentPane.add(txtRoomNumber);
		txtRoomNumber.setColumns(10);
		
		txtXField = new JTextField();
		txtXField.setHorizontalAlignment(SwingConstants.LEFT);
		txtXField.setDisabledTextColor(Color.DARK_GRAY);
		txtXField.setSelectionColor(Color.LIGHT_GRAY);
		txtXField.setForeground(UIManager.getColor("Button.highlight"));
		txtXField.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		txtXField.setBackground(UIManager.getColor("Button.darkShadow"));
		txtXField.setCaretColor(UIManager.getColor("Button.highlight"));
		txtXField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		txtXField.setBounds(430, 255, 90, 30);
		contentPane.add(txtXField);
		txtXField.setColumns(10);
		
		lblHomePic = new JLabel("");
		lblHomePic.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePic.setIcon(new ImageIcon(Search.class.getResource("/icons8_home_64px_1.png")));
		lblHomePic.setBounds(498, 545, 64, 64);
		contentPane.add(lblHomePic);
		
		lblPinPic = new JLabel("");
		lblPinPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPinPic.setIcon(new ImageIcon(Search.class.getResource("/icons8_address_64px.png")));
		lblPinPic.setBounds(678, 545, 64, 64);
		contentPane.add(lblPinPic);
		
		lblEarthPic = new JLabel("");
		lblEarthPic.setIcon(new ImageIcon(Search.class.getResource("/icons8_europe_64px.png")));
		lblEarthPic.setBounds(858, 545, 64, 64);
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
		comboBoxPinType.setBounds(430, 158, 200, 30);
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
		comboBoxRoomNumber.setBounds(790, 158, 200, 30);
		contentPane.add(comboBoxRoomNumber);
		
		JList listAccessories = new JList();
		listAccessories.setForeground(UIManager.getColor("Button.highlight"));
		listAccessories.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		listAccessories.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		listAccessories.setBackground(UIManager.getColor("Button.darkShadow"));
		listAccessories.setBounds(790, 255, 200, 30);
		contentPane.add(listAccessories);
		
		txtSurface = new JTextField();
		txtSurface.setBorder(null);
		txtSurface.setText("Surface :");
		txtSurface.setForeground(UIManager.getColor("CheckBox.highlight"));
		txtSurface.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtSurface.setBackground(UIManager.getColor("Button.darkShadow"));
		txtSurface.setBounds(430, 335, 200, 30);
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
		txtSurfaceField.setBounds(430, 358, 200, 30);
		contentPane.add(txtSurfaceField);
		txtSurfaceField.setColumns(10);
		
		JComboBox comboBoxFurniture = new JComboBox();
		comboBoxFurniture.addItem("Yes");
		comboBoxFurniture.addItem("No");
		comboBoxFurniture.setSelectedItem(null);
		comboBoxFurniture.setForeground(UIManager.getColor("Button.highlight"));
		comboBoxFurniture.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
		comboBoxFurniture.setBackground(UIManager.getColor("Button.darkShadow"));
		comboBoxFurniture.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 165, 0)));
		comboBoxFurniture.setBounds(790, 358, 200, 30);
		contentPane.add(comboBoxFurniture);
		
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
		txtYField.setBounds(540, 255, 90, 30);
		contentPane.add(txtYField);
		
		txtY = new JTextField();
		txtY.setText("Y :");
		txtY.setHorizontalAlignment(SwingConstants.LEFT);
		txtY.setForeground(Color.WHITE);
		txtY.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 22));
		txtY.setColumns(10);
		txtY.setBorder(null);
		txtY.setBackground(SystemColor.controlDkShadow);
		txtY.setBounds(540, 235, 90, 20);
		contentPane.add(txtY);
		
		setUndecorated(true);
	}
}
