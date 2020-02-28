package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ButtonFunction {
	public void ButtonFun(Button btn, TextField textField){
		String str = btn.getText();
		textField.setText(textField.getText() + str);

	}

}
