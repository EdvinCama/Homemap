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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class HomeNoAccount extends JFrame {

	private JPanel contentPane;
	private JButton btnNavLogin;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeNoAccount frame = new HomeNoAccount();
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
	public HomeNoAccount() {
		
		HomeNoAccount holder = this ;
		
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
		
		
		
		
		JButton btnNavProfile = new JButton("           SIGN UP");
		btnNavProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        holder.setVisible(false);
			        new Register().setVisible(true);	
			}
		});
	
		btnNavProfile.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnNavProfile.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnNavProfile.setHorizontalAlignment(SwingConstants.LEFT);
		btnNavProfile.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNavProfile.setIcon(new ImageIcon(Home.class.getResource("/icons8_add_user_male_32px_1.png")));
		btnNavProfile.setForeground(Color.DARK_GRAY);
		btnNavProfile.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNavProfile.setBounds(30, 515, 290, 40);
		contentPane.add(btnNavProfile);
	
		
		btnNavLogin = new JButton("              LOGIN");
		btnNavLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        holder.setVisible(false);
			        new Login().setVisible(true);	
			}
		});
		btnNavLogin.setRequestFocusEnabled(false);
		btnNavLogin.setRolloverEnabled(false);
		btnNavLogin.setHorizontalAlignment(SwingConstants.LEFT);
		btnNavLogin.setMargin(new Insets(2, 5, 2, 19));
		btnNavLogin.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnNavLogin.setBackground(UIManager.getColor("CheckBox.highlight"));
		btnNavLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNavLogin.setForeground(Color.DARK_GRAY);
		btnNavLogin.setIcon(new ImageIcon(Home.class.getResource("/icons8_exit_24px.png")));
		btnNavLogin.setBounds(30, 575, 290, 40);
		contentPane.add(btnNavLogin);
		
		
		
		JButton btnSearch = new JButton("            SEARCH");
		btnSearch.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent e) {
		        holder.setVisible(false);
		        new Search().setVisible(true);
		    }
		});
		btnSearch.setBorder(new MatteBorder(0, 0, 1, 1, (Color) Color.DARK_GRAY));
		btnSearch.setHorizontalAlignment(SwingConstants.LEFT);
		btnSearch.setIcon(new ImageIcon(HomeNoAccount.class.getResource("/icons8_search_26px.png")));
		btnSearch.setForeground(Color.DARK_GRAY);
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSearch.setBounds(30, 445, 290, 40);
		contentPane.add(btnSearch);
		
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
		lblMapPreview.setIcon(new ImageIcon(HomeNoAccount.class.getResource("/map_noacc.jpg")));
		lblMapPreview.setHorizontalAlignment(SwingConstants.CENTER);
		lblMapPreview.setBounds(350, 28, 698, 625);
		contentPane.add(lblMapPreview);
		
		setUndecorated(true);
	}

	private void HorizontalTextPosition(int center) {
		// TODO Auto-generated method stub
		
	}
}
