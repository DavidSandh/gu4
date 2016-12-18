package gu4;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class Moment4 extends ColorDisplay {
	//private Array7x7 arr = new Array7x7(9);

	public Moment4(int background, int grid) {
		super(background, grid);
	}
	
	public Moment4(int verticalPages, int horizontalpages, int background, int grid, int gridStroke, int sideSize) {
		super(verticalPages, horizontalpages, background, grid, gridStroke, sideSize);
	}

	public void Test() {
		String text = JOptionPane.showInputDialog("Skriv in något");
		Array7x7[] arr = new Array7x7[super.getHorizontalPages()+1];
		Array7 temparr = new Array7();
		System.out.println(arr.length + "");
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = new Array7x7();
		}
		for (int i = 0; i < text.length(); i++) {
			arr[arr.length-1] = Chars.getChar(text.charAt(i), Color.RED);
			int counter2 = 0;
			for(int j = 0; j < 7; j++) {
				int counter = arr.length-2;
				temparr = arr[arr.length-1].getCol(counter2);
				for(int k = arr.length-1; k > 0; k--) {
					
					temparr = arr[counter].shiftLeft(temparr);
					counter--;
				}
				counter2++;
				for(int display = arr.length-1; display >= 0; display--) {
					super.setDisplay(arr[display].getArray(),0,display);
					super.updateDisplay();
					try{
						Thread.sleep(10);
					}
					catch(InterruptedException e) {}
				}
			}
		}
		super.updateDisplay();
	}
	

}
