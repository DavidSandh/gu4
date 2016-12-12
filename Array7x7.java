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
			arr[row][i] = theRow.getElement(i);
		}
	}
	public Array7 getRow(int row) {
		Array7 arr7 = new Array7();
		for(int i = 0; i < 7; i++) {
			arr7.setElement(i, arr[row][i]);
		}
		return arr7;
	}
	public void setCol(int col, Array7 theCol) {
		for(int i = 0; i < 7; i++) {
			arr[i][col] = theCol.getElement(i);
		}
	}
	//test testeststststestsetestestes
	public Array7 getCol(int col) {
		Array7 arr7 = new Array7();
		for(int i = 0; i < 7; i++) {
			arr7.setElement(i, arr[col][i]);
		}
		return arr7;
	}
}