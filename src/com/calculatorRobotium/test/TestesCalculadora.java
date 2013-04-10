package com.calculatorRobotium.test;

import android.test.suitebuilder.annotation.SmallTest;

import com.calculatorRobotium.Main;

public class TestesCalculadora extends TesteBase<Main> {

	private Calculadora calculadora;
	
	public TestesCalculadora() {
		super(Main.class);
	}
		
	@SmallTest
	public void caminhoFeliz() {
		double num1 = 48;
		double num2 = 59;
		String resultado = String.valueOf(num1*num2);
		
		calculadora = new Calculadora(solo);
		calculadora.multiplicacao(num1, num2);
		
		assertTrue(solo.searchText(resultado));
	}

}
