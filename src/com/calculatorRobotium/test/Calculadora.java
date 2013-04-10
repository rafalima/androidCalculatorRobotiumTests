package com.calculatorRobotium.test;

import android.widget.EditText;

import com.calculatorRobotium.R;
import com.jayway.android.robotium.solo.Solo;

public class Calculadora {
	
	private Solo solo;
	
	public Calculadora(Solo solo) {
		this.solo = solo;
	}
	
	public void inserirNumero(double num, int idCampo) {
		EditText editText = (EditText) solo.getView(idCampo);
		solo.enterText(editText,String.valueOf(num));
		
	}
	
	
	public void multiplicacao(double num1, double num2) {
		inserirNumero(num1,R.id.EditText01);
		inserirNumero(num2,R.id.EditText02);
				
		solo.clickOnButton("Multiply");
	}

}
