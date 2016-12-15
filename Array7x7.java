package gu4;

public class Array7x7 {
	private int[][] arr = new int[7][7];
	public Array7x7() {
	}
	public Array7x7(int nbr) {
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = nbr;
			}
		}
	}
	public Array7x7(int[][] arr){
		this.arr = arr;
	}
	public int[][] getArray() {
		return arr;
	}
	
	public void setElement(int row,int col, int value) {
		arr[row][col] = value;
	}
	
	public int getElement(int row, int col) {
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
	
	public Array7 getCol(int col) {
		Array7 arr7 = new Array7();
		for(int i = 0; i < 7; i++) {
			arr7.setElement(i, arr[i][col]);
		}
		return arr7;
	}
	
	public  Array7 shiftLeft(Array7 arr) {
		Array7 tempArr = arr;
		Array7 tempArr1;
		for(int i = 6; i >= 0; i--) {
				tempArr1 = getCol(i);
				setCol(i,tempArr);
				tempArr = tempArr1;
		}
		return tempArr;
		
	}
	
	public  Array7 shiftRight(Array7 arr) {
		Array7 tempArr = arr;
		Array7 tempArr1;
		for(int i = 0; i < 7; i++) {
				tempArr1 = getCol(i);
				setCol(i,tempArr);
				tempArr = tempArr1;
		}
		return tempArr;
		
	}
}