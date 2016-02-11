package math.controller;

import math.model.RecursionTool;
import math.view.RecursionFrame;

public class RecursionController
{
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private String caculatedValue;
	public RecursionController()
	{
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
		caculatedValue = "";
	}
	
	public void start()
	{
		
	}

	
	public String doFibonacci(String input)
	{
		caculatedValue = "the fibonacci sequnece at " + input + " is "
				+ Double.toString(mathTool.fibonacciNumber(Double.parseDouble(input)));
		return caculatedValue;
	}
	
	public String doFactorial(String input)
	{
		caculatedValue = "the fibonacci sequnece at " + input + " is "
				+ Double.toString(mathTool.factorialNumber(Double.parseDouble(input)));
		return caculatedValue;
	}
}
