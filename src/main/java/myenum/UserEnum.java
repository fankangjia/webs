/**
 * 
 */
package myenum;

/**
 * @author da_fa
 *
 */
public enum UserEnum {
	NN(),YN(),TN();
	private long number=0l;

	public long getNumber() {
		return number;
	}
	
	public void addNumber() {
		this.number++;
	}
	
	public void outNumber() {
		number--;
	}
}
