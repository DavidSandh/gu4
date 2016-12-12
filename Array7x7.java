package gu4;

public class Array7x7 {
	private int[][] arr = new int[7][7];
	
	public void setElement(int row,int col, int value) {
		arr[row][col] = value;
	}
	
	public int getElement(int row, int col, int value) {
		return arr[row][col];
	}
	public void setRow(int row, Array7 theRow) {
		for(int i = 0; i < 7; i ++){
			arr[row][i] = (theRow.getElement(i));
		}
	}
}