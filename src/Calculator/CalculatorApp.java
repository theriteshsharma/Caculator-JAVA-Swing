package Calculator;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CalculatorApp {
	public String expr="";
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp window = new CalculatorApp();
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
	public CalculatorApp() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 480, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 218, 466, 465);
		frame.getContentPane().add(panel);
		
		ImageIcon icon=new ImageIcon("F:\\Eclipse\\Calculator\\src\\img\\btn.png");
		
		JButton btnCancel = new JButton("C",icon);
		btnCancel.setHorizontalTextPosition(JButton.CENTER);
		btnCancel.setVerticalTextPosition(JButton.CENTER);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr="";
				textField.setText(expr);
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBorderPainted(false);
		
		JButton btnSign = new JButton("+/-",icon);
		btnSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="-";
				textField.setText(expr);
			}
		});
		btnSign.setHorizontalTextPosition(JButton.CENTER);
		btnSign.setVerticalTextPosition(JButton.CENTER);
		btnSign.setForeground(Color.WHITE);
		btnSign.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btnSign.setBorderPainted(false);
		btnSign.setBackground(Color.WHITE);
		
		JButton btnPer = new JButton("%",icon);
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="%";
				textField.setText(expr);
			}
		});
		btnPer.setHorizontalTextPosition(JButton.CENTER);
		btnPer.setVerticalTextPosition(JButton.CENTER);
		btnPer.setForeground(Color.WHITE);
		btnPer.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btnPer.setBorderPainted(false);
		btnPer.setBackground(Color.WHITE);
		
		JButton btnDiv = new JButton("/",icon);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="/";
				textField.setText(expr);
			}
		});
		btnDiv.setHorizontalTextPosition(JButton.CENTER);
		btnDiv.setVerticalTextPosition(JButton.CENTER);
		btnDiv.setForeground(Color.WHITE);
		btnDiv.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btnDiv.setBorderPainted(false);
		btnDiv.setBackground(Color.WHITE);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(expr);
				expr+="7";
				textField.setText(expr);
			}
			
		});
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btn7.setBorderPainted(false);
		btn7.setBackground(Color.WHITE);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="8";
				textField.setText(expr);
			}
		});
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btn8.setBorderPainted(false);
		btn8.setBackground(Color.WHITE);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="9";
				textField.setText(expr);
			}
		});
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btn9.setBorderPainted(false);
		btn9.setBackground(Color.WHITE);
		
		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="4";
				textField.setText(expr);
			}
		});
		
		JButton btnMul = new JButton("X",icon);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="*";
				textField.setText(expr);
			}
			
			
		});
		btnMul.setHorizontalTextPosition(JButton.CENTER);
		btnMul.setVerticalTextPosition(JButton.CENTER);
		btnMul.setForeground(Color.WHITE);
		btnMul.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btnMul.setBorderPainted(false);
		btnMul.setBackground(Color.WHITE);
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btn4.setBorderPainted(false);
		btn4.setBackground(Color.WHITE);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="5";
				textField.setText(expr);
			}
		});
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btn5.setBorderPainted(false);
		btn5.setBackground(Color.WHITE);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="6";
				textField.setText(expr);
			}
		});
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btn6.setBorderPainted(false);
		btn6.setBackground(Color.WHITE);
		
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="1";
				textField.setText(expr);
			}
		});
		
		JButton btnSub = new JButton("-",icon);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="+";
				textField.setText(expr);
			}
		});
		btnSub.setHorizontalTextPosition(JButton.CENTER);
		btnSub.setVerticalTextPosition(JButton.CENTER);
		btnSub.setForeground(Color.WHITE);
		btnSub.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btnSub.setBorderPainted(false);
		btnSub.setBackground(Color.WHITE);
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btn1.setBorderPainted(false);
		btn1.setBackground(Color.WHITE);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="2";
				textField.setText(expr);
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btn2.setBorderPainted(false);
		btn2.setBackground(Color.WHITE);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="3";
				textField.setText(expr);
			}
		});
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btn3.setBorderPainted(false);
		btn3.setBackground(Color.WHITE);
		
		
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+=".";
				textField.setText(expr);
			}
		});
		
		JButton btnAdd = new JButton("+",icon);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="+";
				textField.setText(expr);
			}
		});
		btnAdd.setHorizontalTextPosition(JButton.CENTER);
		btnAdd.setVerticalTextPosition(JButton.CENTER);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btnAdd.setBorderPainted(false);
		btnAdd.setBackground(Color.WHITE);
		btnDot.setForeground(Color.BLACK);
		btnDot.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btnDot.setBorderPainted(false);
		btnDot.setBackground(Color.WHITE);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expr+="0";
				textField.setText(expr);
			}
		});
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btn0.setBorderPainted(false);
		btn0.setBackground(Color.WHITE);
		
		JButton btnEq = new JButton("=",new ImageIcon("F:\\Eclipse\\Calculator\\src\\img\\btnlg.png"));
		btnEq.setHorizontalTextPosition(JButton.CENTER);
		btnEq.setVerticalTextPosition(JButton.CENTER);
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ExpEvaluator exp = new ExpEvaluator();
				String t = textField.getText();
				if(!t.equals(expr))
					expr = t;
				double x = exp.evaluate(expr);
				textField.setText(""+x);
				expr="";
			}
		});
		btnEq.setForeground(Color.WHITE);
		btnEq.setFont(new Font("Futura XBlk BT", Font.PLAIN, 30));
		btnEq.setBorderPainted(false);
		btnEq.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnSign, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnPer, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnDiv, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnMul, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnSub, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnDot, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEq, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSign, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPer, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDiv, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnMul, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSub, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnDot, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEq, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
		);
		panel.setLayout(gl_panel);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 466, 218);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\Eclipse\\Calculator\\src\\img\\fox.png"));
		lblNewLabel_1.setBounds(8, 10, 95, 77);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 50));
		textField.setBounds(44, 97, 396, 81);
		panel_1.add(textField);
		textField.setBorder(null);
		textField.setColumns(10);
		textField.setOpaque(false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 466, 218);
		lblNewLabel.setIcon(new ImageIcon("F:\\Eclipse\\Calculator\\src\\img\\top.png"));
		panel_1.add(lblNewLabel);
	}
}
