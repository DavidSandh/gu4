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
		for(int i = 0; i < 5; i++) {
			arr[i] = new Array7x7();
		}
		for (int i = 0; i < text.length(); i++) {
			arr[5] = Chars.getChar(text.charAt(i), Color.RED);
			int counter2 = 0;
			for(int j = 0; j < 7; j++) {
				int counter = 4;
				//int counter2 = 0;
				temparr = arr[5].getCol(counter2);
				for(int k = 5; k > 0; k--) {
					
					temparr = arr[counter].shiftLeft(temparr);
//					for(int display = 5; display > 0; display--) {
//						super.setDisplay(arr[display].getArray(),0,display);
//						super.updateDisplay();
//						try{
//							Thread.sleep(100);
//						}
//						catch(InterruptedException e) {}
//					}
					counter--;
					//counter2++;
				}
				counter2++;
				for(int display = 5; display > 0; display--) {
					super.setDisplay(arr[display].getArray(),0,display);
					super.updateDisplay();
					try{
						Thread.sleep(100);
					}
					catch(InterruptedException e) {}
				}
			}
		}
//		for(int i = 0; i < text.length(); i++) {
//			arr[5] = Chars.getChar(text.charAt(i), Color.RED);
//			super.setDisplay(arr[super.getHorizontalPages()].getArray(), 0, super.getHorizontalPages()-1);
//			for(int j = 0; j < 6; j++) {
//				for(int k = 0; k < arr.length; k++) {
//					arr[k].shiftLeft(arr[5].getRow(k));
//					for(int h = 0; h < super.getHorizontalPages(); h++) {
//						super.setDisplay(arr[h].getArray(), 0, h);
//						
//					}
//				}
//			}
//		}
	//	super.setDisplay(Chars.getChar('C', Color.RED).getArray(), 0, 3);
		super.updateDisplay();
	}
	

}
