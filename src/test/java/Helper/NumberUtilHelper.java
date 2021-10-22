package Helper;

public class NumberUtilHelper {

	public int getVariance(float f1 , float f2)
	{
		int var=0;
		if(Float.compare(f1, f2)>=0)
		{
			var=(int) (f1-f2);
		}
		else 
		{
			var=(int) (f2-f1);
		}
		return var;
	}
}
