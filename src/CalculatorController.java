import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {
	CalculatorModel model;
	CalculatorView view;
	String display="";
	private Double Temp;
	private boolean add;
	private boolean subtract;
	private boolean multiply;
	private boolean divide;
	private Double FinalTemp;
	

	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("C")) {
			display= "";
			view.setText(display);
			Temp=(double) 0;
			FinalTemp=(double) 0;
		}else if(e.getActionCommand().equals("0")) {
			display = view.getText();
			view.setText(display + "0");
		}else if(e.getActionCommand().equals("1")) {
			display = view.getText();
			view.setText(display + "1");
		}else if(e.getActionCommand().equals("2")) {
			display = view.getText();
			view.setText(display + "2");
		}else if(e.getActionCommand().equals("3")) {
			display = view.getText();
			view.setText(display + "3");
		}else if(e.getActionCommand().equals("4")) {
			display = view.getText();
			view.setText(display + "4");
		}else if(e.getActionCommand().equals("5")) {
			display = view.getText();
			view.setText(display + "5");
		}else if(e.getActionCommand().equals("6")) {
			display = view.getText();
			view.setText(display + "6");
		}else if(e.getActionCommand().equals("7")) {
			display = view.getText();
			view.setText(display + "7");
		}else if(e.getActionCommand().equals("8")) {
			display = view.getText();
			view.setText(display + "8");
		}else if(e.getActionCommand().equals("9")) {
			display = view.getText();
			view.setText(display + "9");
		}else if(e.getActionCommand().equals("+")) {
			display="";
			Temp = Double.parseDouble(view.getText());
			view.setText("");
			add= true;
		}else if(e.getActionCommand().equals("-")) {
			display="";
			Temp = Double.parseDouble(view.getText());
			view.setText("");
			subtract= true;
		}else if(e.getActionCommand().equals("*")) {
			display="";
			Temp = Double.parseDouble(view.getText());
			view.setText("");
			multiply= true;
		}else if(e.getActionCommand().equals("/")) {
			display="";
			Temp = Double.parseDouble(view.getText());
			view.setText("");
			divide= true;
		}else if(e.getActionCommand().equals("=")) {
			FinalTemp=  Double.parseDouble(view.getText());
			view.setText("");
			if(add) {
				FinalTemp= model.Add(Temp, FinalTemp);
			}else if(subtract) {
				FinalTemp= model.Subtract(Temp, FinalTemp);
			}else if(multiply) {
				FinalTemp= model.multiply(Temp, FinalTemp);
			}else if(divide){
				FinalTemp= model.divide(Temp, FinalTemp);
			}
			
			view.setText(Double.toString(FinalTemp));
			subtract=false;
			multiply=false;
			add=false;
			divide=false;
		}
		
	}

}
