import java.awt.*;

import javax.swing.*;

public class CalculatorView extends JFrame {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton num0;
	private JButton num1;
	private JButton num2;
	private JButton num3;
	private JButton num4;
	private JButton num5;
	private JButton num6;
	private JButton num7;
	private JButton num8;
	private JButton num9;
	private JButton clear;
	private JTextField output;
	private JPanel panel1;
	private JPanel panel2;
	private JButton Add;
	private JButton Subtract;
	private JButton Multiply;
	private JButton Divide;
	private JButton Equal;
	public CalculatorView(){
		
		super("Calculator");
		CalculatorModel model = new CalculatorModel();
		CalculatorController Controller = new CalculatorController(model, this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(100, 100);
		this.setSize(new Dimension(1024, 450));
		this.setResizable(true);
		
		
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4,4));
		panel1.add(num7 = new JButton("7"));
		panel1.add(num8 = new JButton("8"));
		panel1.add(num9 = new JButton("9"));
		panel1.add(Add = new JButton("+"));
		panel1.add(num4 = new JButton("4"));
		panel1.add(num5 = new JButton("5"));
		panel1.add(num6 = new JButton("6"));
		panel1.add(Subtract = new JButton("-"));
		panel1.add(num1 = new JButton("1"));
		panel1.add(num2 = new JButton("2"));
		panel1.add(num3 = new JButton("3"));
		panel1.add(Multiply = new JButton("*"));
		panel1.add(num0 = new JButton("0"));
		panel1.add(clear = new JButton("C"));
		panel1.add(Equal= new JButton("="));
		panel1.add(Divide = new JButton("/"));
		
		
		
		
		
		output = new JTextField();
		output.setHorizontalAlignment(JTextField.RIGHT);
		output.setSize(500, 500);
		output.setEditable(false);
		
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(output, BorderLayout.NORTH);
		panel2.add(panel1, BorderLayout.CENTER);
		
		
	
		add(panel2);
		pack();
		num0.addActionListener(Controller);
		num1.addActionListener(Controller);
		output.addActionListener(Controller);
		num2.addActionListener(Controller);
		num3.addActionListener(Controller);
		num4.addActionListener(Controller);
		num5.addActionListener(Controller);
		num6.addActionListener(Controller);
		num7.addActionListener(Controller);
		num8.addActionListener(Controller);
		num9.addActionListener(Controller);
		clear.addActionListener(Controller);
		Subtract.addActionListener(Controller);
		Multiply.addActionListener(Controller);
		Divide.addActionListener(Controller);
		Add.addActionListener(Controller);
	
		Equal.addActionListener(Controller);
		
		
		
		this.setVisible(true);
	}
	
	public String getText() {
		return output.getText();
	}
	public void setText(String s) {
		output.setText(s);
	}
	
		public static void main(String args[]) {
			new CalculatorView();
		}
	
}
