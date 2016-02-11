package math.view;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

import math.controller.RecursionController; 


public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private JButton fibonaciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea resultsArea;
	private SpringLayout baseLayout;
	
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		fibonaciButton = new JButton("Calculate the fibonaci button");
		factorialButton = new JButton("N");
		inputField = new JTextField(5);
		resultsArea = new JTextArea(10,15);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}



	public void setupPanel()
	{
		this.add(fibonaciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(resultsArea);
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true);
		resultsArea.setEditable(false);
		this.setBackground(Color.CYAN);
		
	}
	
	public void setupLayout()
	{
		
		
	}
	
	
	public void setupListeners()
	{
		fibonaciButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if(checkInput(input))
				{
					resultsArea.setText(baseController.doFibonacci(input));
				}
			}
		});
		
		factorialButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if(checkInput(input))
				{
					resultsArea.setText(baseController.doFactorial(input));
				}
			}
		});
	}
	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		try
		{
			Integer.parseInt(input);
			isNumber = true;
		}
		catch(Exception numberException)
		{
			resultsArea.setText("use a number");
		}
		return isNumber;
	}


	





}


