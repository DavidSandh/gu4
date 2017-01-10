package gu4;
/**
 * Class with 1d 7 field array.
 * @author Lucas, David, John, Simon, Alexander
 *
 */
public class Array7 {
	private int[] arr = new int[7];
	/**
	 * sets pos in array to value
	 * @param pos position in array
	 * @param value value of input 
	 */
	public void setElement(int pos, int value) {
		arr[pos] = value;
	}
	/**
	 * Returns value in pos.
	 * @param pos position in array
	 * @return value in input pos
	 */
	public int getElement(int pos) {
		return arr[pos];
	}
}
