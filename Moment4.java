package gu4;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Controller
 * @author Lucas, David, John, Simon, Alexander
 *
 */
public class Moment4 extends ColorDisplay{
	private Moment4Viewer viewer;
	private String text;
	private Timer timer;
	private int color;
	/**
	 * Constructor 
	 * @param background background color in int
	 * @param grid grid color
	 */
	public Moment4(int background, int grid) {
		super(background, grid);
	}
	/**
	 * 
	 * @param verticalPages Size vertical
	 * @param horizontalpages Size horizontal
	 * @param background background color
	 * @param grid grid color
	 * @param gridStroke size of gridlines
	 * @param sideSize 
	 */
	public Moment4(int verticalPages, int horizontalpages, int background, int grid, int gridStroke, int sideSize) {
		super(verticalPages, horizontalpages, background, grid, gridStroke, sideSize);
	}
	/**
	 * adds viewer reference
	 * @param viewer reference to viewer
	 */
	public void addViewer(Moment4Viewer viewer){
		this.viewer = viewer;
	}
	/**
	 * Moves text to the left with a sleep time.
	 */
	public void textSlide() {
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
	/**
	 * Puts a random color value in every array field.
	 */
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
	/**
	 * Innerclass using TimerTask 
	 */
	public class Test extends TimerTask {

		/**
		 * runs textSlide() and cancel it after one iteration then toggleBtns to true.
		 */
		public void run() {
			textSlide();
			cancel();
			viewer.toggleBtns(true);
			
			
		}
		
	}
	/**
	 *  sets text and color to new values.
	 * @param text input text from textField
	 * @param color input color from sliders
	 */
	public void addStuff(String text, int color) {
		this.text = text;
		this.color = color;
		timer = new Timer();
		timer.schedule(new Test(), 500, 500);
		
	}
}