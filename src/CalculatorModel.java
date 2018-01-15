
public class CalculatorModel {
	Double result;
	
	public CalculatorModel() {
		result = (double) 0;
	}
	public Double Add(Double temp,Double finalTemp) {
		return result = (double) (temp+finalTemp);
		
	}
	public Double Subtract(Double temp,Double finalTemp) {
		return result = (double) (temp-finalTemp);
		
	}
	
	public Double multiply(Double temp,Double finalTemp) {
		return result =  (double) (temp*finalTemp);
		
	}
	public Double divide(Double temp,Double finalTemp) {
		return result = (double) (temp/finalTemp);
		
	}
	
	
}
