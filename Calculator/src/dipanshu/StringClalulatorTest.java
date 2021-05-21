package dipanshu;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;
public class StringClalulatorTest {
	
	@Test
	public void sumsEmptyStringTo0() {
		assertThat(StringCalculator.sum(""), is(0));
	}
	
	@Test
	public void sumSingleNumberToItself() {
		assertThat(StringCalculator.sum("5"), is(5));
		assertThat(StringCalculator.sum("44"), is(44));

	}
	
	@Test
	public void sumTwoNumbersSeperatedByComma() {
		assertThat(StringCalculator.sum("1,2"), is(3));
	}
	
	@Test
	public void sumThreeNumberSepratedByComma() {
		assertThat(StringCalculator.sum("1,2,3"), is(6));
		
	}
	
	@Test
	public void sumNumberDelimitedCommaOrNewline() {
		assertThat(StringCalculator.sum("1\n2,3"), is (6));
	}
	
	@Test
	public void sumsNumberDelimitedByNewline() {
		assertThat(StringCalculator.sum("1\n2"), is(3));
	}
	
	@Test
	public void usesDelimiterSepcified() {
		assertThat(StringCalculator.sum("//;\n1;2"), is(3));
	}

}
