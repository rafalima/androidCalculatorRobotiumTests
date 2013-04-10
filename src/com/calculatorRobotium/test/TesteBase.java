package com.calculatorRobotium.test;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;



public abstract class TesteBase<T extends Activity> extends ActivityInstrumentationTestCase2<T> {
	
	protected Solo solo;
	
	public TesteBase(Class<T> activityClass) {
		super(activityClass);
	}	
	
	@Override
	public void setUp() {
		solo = new Solo(getInstrumentation(), getActivity());				
	}
	
	@Override
	public void tearDown() {
		solo.finishOpenedActivities();
	}
	
	


}
