package homemap;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;		

/*import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserFactory;*/

import javax.swing.*;

import java.awt.*;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		
		Home holder = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 1050, 655);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setToolTipText("");
		contentPane.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(64, 64, 64)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMinimize = new JButton("");
		btnMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMinimize.setIcon(new ImageIcon(Home.class.getResource("/icons8_minimize_window_32px.png")));
		btnMinimize.setBounds(930, 2, 38, 26);
		contentPane.add(btnMinimize);
		
		JButton btnMaximize = new JButton("");
		btnMaximize.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMaximize.setIcon(new ImageIcon(Home.class.getResource("/icons8_advertisement_page_30px.png")));
		btnMaximize.setBounds(970, 2, 38, 26);
		contentPane.add(btnMaximize);
		
		JButton btnClose = new JButton("");
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnClose.setIcon(new ImageIcon(Home.class.getResource("/icons8_exit_24px.png")));
		btnClose.setBounds(1010, 2, 38, 26);
		contentPane.add(btnClose);
		
		JLabel lblMenu = new JLabel("Home Map");
		lblMenu.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 19));
		lblMenu.setForeground(UIManager.getColor("Button.highlight"));
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setIcon(new ImageIcon(Home.class.getResource("/icons8_home_32px_1.png")));
		lblMenu.setOpaque(true);
		lblMenu.setBackground(Color.DARK_GRAY);
		lblMenu.setBounds(0, 0, 1050, 30);
		contentPane.add(lblMenu);
		
		JButton btnNavPayment = new JButton("             LOGOUT");
		btnNavPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        holder.setVisible(false);
			        new PaymentMethod().setVisible(true);	
			}
		});
		btnNavPayment.setRequestFocusEnabled(false);
		btnNavPayment.setOpaque(false);
		btnNavPayment.setRolloverEnabled(false);
		btnNavPayment.setHorizontalAlignment(SwingConstants.LEFT);
		btnNavPayment.setMargin(new Insets(2, 5, 2, 19));
		btnNavPayment.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNavPayment.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnNavPayment.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnNavPayment.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNavPayment.setForeground(Color.DARK_GRAY);
		btnNavPayment.setIcon(new ImageIcon(Home.class.getResource("/icons8_exit_24px.png")));
		btnNavPayment.setBounds(30, 575, 290, 40);
		contentPane.add(btnNavPayment);
		
		JButton btnNavProfile = new JButton("           PROFILE");
		btnNavProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        holder.setVisible(false);
			        new Profile().setVisible(true);	
			}
		});
		btnNavProfile.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnNavProfile.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnNavProfile.setHorizontalAlignment(SwingConstants.LEFT);
		btnNavProfile.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNavProfile.setIcon(new ImageIcon(Home.class.getResource("/icons8_registration_32px.png")));
		btnNavProfile.setForeground(Color.DARK_GRAY);
		btnNavProfile.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNavProfile.setBounds(30, 515, 290, 40);
		contentPane.add(btnNavProfile);
		
		JButton btnNavSearch = new JButton("             SEARCH");
		btnNavSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        holder.setVisible(false);
			        new Search().setVisible(true);	
			}
		});
		btnNavSearch.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnNavSearch.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNavSearch.setHorizontalAlignment(SwingConstants.LEFT);
		btnNavSearch.setIcon(new ImageIcon(Home.class.getResource("/icons8_search_26px.png")));
		btnNavSearch.setForeground(Color.DARK_GRAY);
		btnNavSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNavSearch.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnNavSearch.setBounds(30, 395, 290, 40);
		contentPane.add(btnNavSearch);
		
		JButton btnNavCreatePin = new JButton("        CREATE PIN");
		btnNavCreatePin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        holder.setVisible(false);
			        new CreatePin().setVisible(true);	
			}
		});
		btnNavCreatePin.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnNavCreatePin.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNavCreatePin.setHorizontalAlignment(SwingConstants.LEFT);
		btnNavCreatePin.setIcon(new ImageIcon(Home.class.getResource("/icons8_address_32px.png")));
		btnNavCreatePin.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnNavCreatePin.setForeground(Color.DARK_GRAY);
		btnNavCreatePin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNavCreatePin.setBounds(30, 455, 290, 40);
		contentPane.add(btnNavCreatePin);
		
		JButton btnContactOwner = new JButton(" CONTACT");
		btnContactOwner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        holder.setVisible(false);
			        new ContactInteraction().setVisible(true);	
			}
		});
		btnContactOwner.setIcon(new ImageIcon(Home.class.getResource("/icons8_contact_32px.png")));
		btnContactOwner.setHorizontalAlignment(SwingConstants.LEFT);
		btnContactOwner.setForeground(Color.DARK_GRAY);
		btnContactOwner.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnContactOwner.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnContactOwner.setBackground(UIManager.getColor("Button.highlight"));
		btnContactOwner.setBounds(805, 605, 150, 35);
		contentPane.add(btnContactOwner);
		
		JButton btnInbox = new JButton("   INBOX");
		btnInbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        holder.setVisible(false);
			        new Inbox().setVisible(true);	
			}
		});
		btnInbox.setIcon(new ImageIcon(Home.class.getResource("/icons8_secured_letter_32px.png")));
		btnInbox.setHorizontalAlignment(SwingConstants.LEFT);
		btnInbox.setForeground(Color.DARK_GRAY);
		btnInbox.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnInbox.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnInbox.setBackground(UIManager.getColor("Button.highlight"));
		btnInbox.setBounds(625, 605, 150, 35);
		contentPane.add(btnInbox);
		
		JButton btnSavePin = new JButton("SAVE PIN");
		btnSavePin.setIcon(new ImageIcon(Home.class.getResource("/icons8_save_as_32px.png")));
		btnSavePin.setHorizontalAlignment(SwingConstants.LEFT);
		btnSavePin.setForeground(Color.DARK_GRAY);
		btnSavePin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSavePin.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnSavePin.setBackground(UIManager.getColor("Button.highlight"));
		btnSavePin.setBounds(445, 605, 150, 35);
		contentPane.add(btnSavePin);
		
		JLabel lblNavLogo = new JLabel("");
		lblNavLogo.setBorder(null);
		lblNavLogo.setBackground(new Color(255, 165, 0));
		lblNavLogo.setIcon(new ImageIcon(Home.class.getResource("/HomeMap_Logo.png")));
		lblNavLogo.setForeground(Color.DARK_GRAY);
		lblNavLogo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNavLogo.setOpaque(true);
		lblNavLogo.setBounds(10, 60, 330, 220);
		contentPane.add(lblNavLogo);
		
		JLabel lblNavBar = new JLabel("");
		lblNavBar.setForeground(Color.LIGHT_GRAY);
		lblNavBar.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNavBar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNavBar.setInheritsPopupMenu(false);
		lblNavBar.setIconTextGap(10);
		lblNavBar.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(64, 64, 64)));
		lblNavBar.setOpaque(true);
		lblNavBar.setBackground(new Color(255, 165, 0));
		lblNavBar.setBounds(0, 0, 350, 655);
		contentPane.add(lblNavBar);
		
		JLabel lblMapPreview = new JLabel("");
		lblMapPreview.setHorizontalAlignment(SwingConstants.CENTER);
		lblMapPreview.setIcon(new ImageIcon(Home.class.getResource("/map_acc1.jpg")));
		lblMapPreview.setBounds(350, 30, 698, 558);
		contentPane.add(lblMapPreview);
		
		JSeparator separatorMenuTop = new JSeparator();
		separatorMenuTop.setForeground(new Color(255, 165, 0));
		separatorMenuTop.setBackground(new Color(255, 165, 0));
		separatorMenuTop.setBounds(350, 588, 698, 2);
		contentPane.add(separatorMenuTop);
		
		JSeparator separatorMenuTop2 = new JSeparator();
		separatorMenuTop2.setForeground(new Color(255, 140, 0));
		separatorMenuTop2.setBackground(new Color(255, 165, 0));
		separatorMenuTop2.setBounds(350, 590, 698, 1);
		contentPane.add(separatorMenuTop2);
		



    /*    Browser browser = BrowserFactory.create();
        JFrame frame = new JFrame("JxBrowser Google Maps");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(browser.getView().getComponent(), BorderLayout.CENTER);
        frame.setSize(700, 588);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        browser.loadURL("http://maps.google.com");*/

		
		setUndecorated(true);
	}
}
