package math.model;

public class RecursionTool
{

	public double fibonacciNumber(double pos)
	{	

		double prevPos = 1;
		double prevPrevPos = 0;
		int loopValue = 1;
		double curPos = 0;
		
		if(pos < 0)
		{
			return Integer.MIN_VALUE;
		}

		while(loopValue < pos)
		{
			curPos = prevPos + prevPrevPos;
			prevPrevPos = prevPos;
			prevPos = curPos;
			loopValue++;
		}
		if(pos == 0 || pos == 1)
		{
			curPos =1;
		}

		
		return curPos;

	}


public double factorialNumber(double pos)
{
	double resultValue = 1;
	
	if(pos < 0)
	{
		return Integer.MIN_VALUE;
	}



	if(pos == 0)
	{
		return 1;
	}

	
	for(int loopValue = 1; loopValue <= pos; loopValue++)
	{
		resultValue = resultValue * loopValue;
	}
	
	return resultValue;

}



}
