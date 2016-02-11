package math.model;

public class RecursionTool
{
	public double fibonacciNumber(double d)
	{
		if(d < 0)
		{
			return Double.MIN_VALUE;
		}
	
		if(d == 0 || d ==1)
		{
			return 1;
		}
		else
		{
			return fibonacciNumber(d - 1) + fibonacciNumber(d -2);
		}
	}


public double factorialNumber(double pos)
{
	if(pos < 0)
	{
		return Integer.MIN_VALUE;
	}



	if(pos == 0)
	{
		return 1;
	}

	else
	{
		return pos * factorialNumber(pos - 1);
	}
}




}
