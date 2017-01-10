package gu4;

import java.util.Random;
/**
 * Class with 2d 7 field array.
 * @author Lucas, David, John, Simon, Alexander
 *
 */
public class Array7x7 {
	/**
	 * 2d array with [7][7]
	 */
	private int[][] arr = new int[7][7];

	public Array7x7() {
	}
	/**
	 * Constructor puts nbr in every field in Array7x7
	 * @param nbr value to put in every row and col in array
	 */
	public Array7x7(int nbr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = nbr;
			}
		}
	}
/**
 * Constructor gets an 2d array and replaces existing
 * @param arr 2d array 
 */
	public Array7x7(int[][] arr) {
		this.arr = arr;
	}
/**
 * Returns array7x7
 * @return arr 2d array [7][7]
 */
	public int[][] getArray() {
		return arr;
	}
/**
 * sets value in [row][col]
 * @param row row in array
 * @param col col in array
 * @param value value
 */
	public void setElement(int row, int col, int value) {
		arr[row][col] = value;
	}
	/**
	 * Returns arr[row][col]
	 * @param row row to return
	 * @param col col to return
	 * @return returns row and col
	 */
	public int getElement(int row, int col) {
		return arr[row][col];
	}
	/**
	 * replaces a row in 2d array to new row
	 * @param row row to replace
	 * @param theRow row to replace with
	 */
	public void setRow(int row, Array7 theRow) {
		for (int i = 0; i < 7; i++) {
			arr[row][i] = theRow.getElement(i);
		}
	}
	/**
	 * returns row in the 2d array
	 * @param row to return
	 * @return returns row as Array7
	 */
	public Array7 getRow(int row) {
		Array7 arr7 = new Array7();
		for (int i = 0; i < 7; i++) {
			arr7.setElement(i, arr[row][i]);
		}
		return arr7;
	}
	/**
	 * replaces a col in 2d array to new col
	 * @param col col to replace
	 * @param theCol col to replace with
	 */
	public void setCol(int col, Array7 theCol) {
		for (int i = 0; i < 7; i++) {
			arr[i][col] = theCol.getElement(i);
		}
	}
	/**
	 * returns col  in the 2d array
	 * @param col col to return
	 * @return returns col as a Array7
	 */
	public Array7 getCol(int col) {
		Array7 arr7 = new Array7();
		for (int i = 0; i < 7; i++) {
			arr7.setElement(i, arr[i][col]);
		}
		return arr7;
	}
	/**
	 * shifts all array value one step left
	 * @param arr sends in a Array7 which replaces far right col
	 * @return returns the array which got removed far left
	 */
	public Array7 shiftLeft(Array7 arr) {
		Array7 tempArr = arr;
		Array7 tempArr1;

		for (int i = 6; i >= 0; i--) {
			tempArr1 = getCol(i);
			setCol(i, tempArr);
			tempArr = tempArr1;
		}
		return tempArr;

	}
	/**
	 * shifts all array value one step right
	 * @param arr sends in a Array7 which replaces far left col
	 * @return returns the array which got removed far right
	 */
	public Array7 shiftRight(Array7 arr) {
		Array7 tempArr = arr;
		Array7 tempArr1;
		for (int i = 0; i < 7; i++) {
			tempArr1 = getCol(i);
			setCol(i, tempArr);
			tempArr = tempArr1;
		}
		return tempArr;

	}
}