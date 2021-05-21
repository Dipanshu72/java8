package dipanshu;

import static org.junit.Assert.assertThat;

import org.junit.Rule;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;
import org.junit.rules.ExpectedException;
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
		assertThat(StringCalculator.sum("//.\n2.3.1"), is(6));

		
	}
	
	
	
	
	@Rule
	public ExpectedException expectedExpection = ExpectedException.none();
	
	@Test
	public void throwsIfNegativeNumber() {
		expectedExpection.expect(IllegalArgumentException.class);
		expectedExpection.expectMessage("negative number: -3");

		StringCalculator.sum("-3");
	}
	
	@Test
	public void throwsonNegitiveNumbersWithAllNumbersInExceptionMessage() {
		expectedExpection.expect(IllegalArgumentException.class);
		expectedExpection.expectMessage("negative number: -3,-2,-15");
		
		StringCalculator.sum("-3,1,5,-2,-15");

	}
	@Test
	public void mapsNumberAbove1000ToLastThreeDigit() {
		assertThat(StringCalculator.sum("1002"), is(2));
		assertThat(StringCalculator.sum("1002,1057"), is(59));

	}
	
	@Test
	public void acceptDelimiterofArbitroryLength() {
		assertThat(StringCalculator.sum("//[***]\n1***2***3"), is(6));

	
	}
	
	@Test
	public void acceptsmultipleDelimiter() {
		assertThat(StringCalculator.sum("//[*][%]\n1*2%3"), is(6));
		assertThat(StringCalculator.sum("//[**][%%]\n1**2%%3"), is(6));
	}
	
	
	
	

}
