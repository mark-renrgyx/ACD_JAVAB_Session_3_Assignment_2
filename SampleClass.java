package week1.day3.assignment2;

/**
 * Arbitrary class to demonstrate {@code this} and {@code super}
 * @author Mark
 *
 */
public class SampleClass {
	String tricky = "member tricky string";
	public String toString() {
		return super.toString();
	}
	
	public void printTricky() {
		String tricky = "inner, local tricky string";
		System.out.println(tricky);
		System.out.println(this.tricky);
	}
}
