/**
 * 
 */
package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * @author TSS
 *
 */
public class ModelCalculator {
	Button delete;
	Label result;
	public float calculate(long num1,long num2,String ope)
	{
		switch (ope){
		case "+" :
			return num1+num2;
		case "-" :
			return num1-num2;
		case "*" :
			return num1*num2;
		case "/" :
			if(num2==0)
				return 0;
			return num1/num2;
		case "%" :
			if(num2==0)
				return 0;
			return num1%num2;
		
		default:
			return 0;
		}
	}

}
