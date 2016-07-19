package calculator;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Calc {

	private JFrame frame;
	private JTextField Previous;
	private JTextField Current;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 341, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 302, 65);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		Previous = new JTextField();
		Previous.setEditable(false);
		Previous.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(Previous);
		Previous.setColumns(10);
		
		Current = new JTextField();
		Current.setEditable(false);
		Current.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(Current);
		Current.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 87, 302, 284);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(5, 4, 0, 0));
		
		JButton ClearCurrent = new JButton("CE");
		panel_1.add(ClearCurrent);
		
		JButton ClearAll = new JButton("C");
		panel_1.add(ClearAll);
		
		JButton Backspace = new JButton("<=");
		panel_1.add(Backspace);
		
		JButton Divide = new JButton("/");
		panel_1.add(Divide);
		
		JButton Seven = new JButton("7");
		panel_1.add(Seven);
		
		JButton Eight = new JButton("8");
		panel_1.add(Eight);
		
		JButton Nine = new JButton("9");
		panel_1.add(Nine);
		
		JButton Times = new JButton("X");
		panel_1.add(Times);
		
		JButton Four = new JButton("4");
		panel_1.add(Four);
		
		JButton Five = new JButton("5");
		panel_1.add(Five);
		
		JButton Six = new JButton("6");
		panel_1.add(Six);
		
		JButton Subtraction = new JButton("-");
		panel_1.add(Subtraction);
		
		JButton One = new JButton("1");
		panel_1.add(One);
		
		JButton Two = new JButton("2");
		panel_1.add(Two);
		
		JButton Three = new JButton("3");
		panel_1.add(Three);
		
		JButton Addition = new JButton("+");
		panel_1.add(Addition);
		
		JButton Neg = new JButton("+/-");
		panel_1.add(Neg);
		
		JButton Zero = new JButton("0");
		panel_1.add(Zero);
		
		JButton Decimal = new JButton(".");
		panel_1.add(Decimal);
		
		JButton Equals = new JButton("=");
		panel_1.add(Equals);
	}
}
