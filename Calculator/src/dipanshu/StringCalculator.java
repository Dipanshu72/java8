package dipanshu;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {
	
	public static int sum(String input) {
		if(input.isEmpty())
		   return 0;
		Stream<String> numbers = Arrays.stream(input.split(","));
		return numbers.mapToInt(Integer::parseInt).sum();
			
		
	}
	

}
