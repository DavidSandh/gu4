package gu4;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

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
	public void addViewer(Moment4Viewer viewer){
		this.viewer = viewer;
	}

	public void Test() {
		String text = this.text;
		Array7x7[] arr = new Array7x7[super.getHorizontalPages()];
		Array7x7 arrChar = new Array7x7();
		Array7 temparr = new Array7();
		for(int sizeCheck = 0; sizeCheck < arr.length; sizeCheck++) {
			text += " ";
		}
		
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
	public void randomColor(){
		Random rand = new Random();
		Array7x7[] arr = new Array7x7[super.getHorizontalPages()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Array7x7();
		}
		for(int i = 0; i < super.getHorizontalPages(); i++) {
			for(int row = 0; row < 7; row++) {
				for(int col = 0; col < 7; col++) {
					arr[i].setElement(row, col, Color.rgb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
				}
			}
			super.setDisplay(arr[i].getArray(), 0, i);
			super.updateDisplay();
		}
		
	}
	public class Test extends TimerTask {

		
		public void run() {
			Test();
			cancel();
			viewer.toggleBtns(true);
			
			
		}
		
	}
	public void addStuff(String text, int color) {
		this.text = text;
		this.color = color;
		timer = new Timer();
		timer.schedule(new Test(), 500, 500);
		
	}
}