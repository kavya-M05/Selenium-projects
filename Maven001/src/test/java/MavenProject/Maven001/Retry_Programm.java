package MavenProject.Maven001;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Programm implements IRetryAnalyzer{
 int count=0;
 int retry=3;
	@Override
	public boolean retry(ITestResult result) 
	{
		while (count<retry)
		{
			count++;
			return true;
		}
		return false;
	}
	

}
