

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(
    		  CalorieMama.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
	
      System.out.println("Total testcases run: " + result.getRunCount());
      System.out.println("Total failed tests: " + result.getFailureCount());
      System.out.println("All tests successful? : " + result.wasSuccessful());
   }
}