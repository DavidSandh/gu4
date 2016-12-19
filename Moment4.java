package gu4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class Moment4 extends ColorDisplay{
	private Moment4Viewer viewer;
	private String text;
	private Timer timer;
	private int color;
	public Moment4(int background, int grid) {
		super(background, grid);
	}

	public Moment4(int verticalPages, int horizontalpages, int background, int grid, int gridStroke, int sideSize) {
		super(verticalPages, horizontalpages, background, grid, gridStroke, sideSize);
	}

	public void Test() {
		String text = this.text;
		int color = this.color;
		Array7x7[] arr = new Array7x7[super.getHorizontalPages()];
		for(int sizeCheck = 0; sizeCheck < arr.length; sizeCheck++) {
			text += " ";
		}
		Array7x7 arrChar = new Array7x7();

		Array7 temparr = new Array7();
		System.out.println(arr.length + "");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Array7x7();
		}
		for (int i = 0; i < text.length(); i++) {
			arrChar = Chars.getChar(text.charAt(i), color);
			int counter2 = 0;
			for (int j = 0; j < 7; j++) {
				int counter = arr.length - 1;
				temparr = arrChar.getCol(counter2);
				for (int k = arr.length - 1; k >= 0; k--) {

					temparr = arr[counter].shiftLeft(temparr);
					counter--;
				}
				counter2++;
				for (int display = arr.length - 1; display >= 0; display--) {
					super.setDisplay(arr[display].getArray(), 0, display);
					super.updateDisplay();
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {

					}
				}
			}
		}
	}
	public class Test extends TimerTask {

		@Override
		public void run() {
			Test();
			cancel();
			
			
		}
		
	}
	public void addStuff(String text, int color) {
		this.text = text;
		this.color = color;
		timer = new Timer();
		timer.schedule(new Test(), 500, 500);
		
	}
}