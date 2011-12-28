package testjes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextArea;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.Font;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JTextField;

public class MainWindow {

	private JFrame frmEenVenster;
	private JTextArea textArea;
	private JTextField txtGoogleWindowBuilder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmEenVenster.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEenVenster = new JFrame();
		frmEenVenster.getContentPane().setBackground(Color.WHITE);
		
		
		frmEenVenster.setTitle("een venster van G\u00E9rard");
		frmEenVenster.setResizable(true);
		frmEenVenster.setBounds(100, 100, 745, 540);
		frmEenVenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnKnopje = new JButton("knopje1");
		btnKnopje.setLocation(10, 92);
		btnKnopje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				disPlay();
			}
		});
		
		
		
		
		frmEenVenster.getContentPane().setLayout(null);
		//btnKnopje.setBackground(Color.PINK);
		btnKnopje.setSize(90, 37);
		frmEenVenster.getContentPane().add(btnKnopje);
		
		JButton btnKnopje_1 = new JButton("knopje2");
		btnKnopje_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnKnopje_1.setToolTipText("dit is een knoppie");
		btnKnopje_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("plop \n dit gaat \n een heleboel \n tekst opleveren! eens kijken ...");
			}
		});
		btnKnopje_1.setBounds(10, 44, 90, 37);
		frmEenVenster.getContentPane().add(btnKnopje_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 729, 21);
		frmEenVenster.getContentPane().add(menuBar);
		
		JButton btnKnopje_2 = new JButton("knopje3");
		menuBar.add(btnKnopje_2);
		btnKnopje_2.setToolTipText("dit is een knoppie");
		btnKnopje_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(326, 218, 123, 64);
		frmEenVenster.getContentPane().add(scrollPane);
		
		textArea = new JTextArea("This is a test", 0, 0);
		scrollPane.setViewportView(textArea);
		
		
		textArea.setBackground(Color.PINK);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(526, 387, 121, 62);
		frmEenVenster.getContentPane().add(scrollPane_2);
		
		JTextArea textArea_1 = new JTextArea("This is a test", 0, 0);
		scrollPane_2.setViewportView(textArea_1);
		textArea_1.setBackground(Color.PINK);
		
		txtGoogleWindowBuilder = new JTextField();
		txtGoogleWindowBuilder.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtGoogleWindowBuilder.setText("Google Window Builder Pro test");
		txtGoogleWindowBuilder.setBounds(274, 45, 254, 36);
		frmEenVenster.getContentPane().add(txtGoogleWindowBuilder);
		txtGoogleWindowBuilder.setColumns(10);
		

		

	}
void disPlay()

{
	System.out.println("hoi");
}
}

