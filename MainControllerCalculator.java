/**
 * 
 */
package application;

import com.sun.javafx.image.impl.ByteIndexed.Getter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * @author TSS
 *
 */
public class MainControllerCalculator {
	@FXML
	Label result;
	String operator ="",value;
	long num1=0,num2=0;
	float output;
	boolean start=true;
	ModelCalculator model=new ModelCalculator();
	
	@FXML
	public void processNumber(ActionEvent event)
	{
		if(start)
		{
			result.setText("");
			start=false;
		}
		value=((Button)event.getSource()).getText();
		
		if(result.getText()=="0")	//for AC
			result.setText("");
		result.setText(result.getText()+value);
		
	}
	
	@FXML
	public void processOperator(ActionEvent event)
	{
		value=((Button)event.getSource()).getText();
		
		if(!value.equals("AC") && !value.equals("Del") && !value.equals("."))	
		{
			if(!value.equals("="))
			{
				if(!operator.isEmpty())	//avoid multi-operators
					return;
				
				operator=value;
				num1=Long.parseLong(result.getText());
				result.setText("");	
				
			}
			
			else
			{
				if(operator.isEmpty()) //to keep operating
					return;
				
				num2=Long.parseLong(result.getText());
				output=model.calculate(num1, num2, operator);
				result.setText(String.valueOf(output));
				operator="";
				start=true;
			}
		}
		
		else if(value.equals("AC"))
		{
			result.setText("0");
		}
		
		else if(value.equals("Del"))
		{
			int i=result.getText().length();
			String str=result.getText();
			result.setText(str.substring(0,i-1));
		}
	}
	
}
