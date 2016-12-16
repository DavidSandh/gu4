package gu4;

public class Moment4 extends ColorDisplay {
	//private Array7x7 arr = new Array7x7(9);

	public Moment4(int background, int grid) {
		super(background, grid);
	}
	
	public void Test() {
		super.setDisplay(Chars.getChar('c', Color.RED).getArray());
		super.updateDisplay();
	}
	

}
