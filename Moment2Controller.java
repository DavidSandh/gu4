package gu4;

public class Moment2Controller {
	private Moment2 viewer;
	private Array7x7 array7x7 = new Array7x7();
	public Moment2Controller(Moment2 viewer) {
		this.viewer = viewer;
		int counter = 0;
		for(int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++){
				array7x7.setElement(i, j, counter);
				counter++;
			}
		}
		viewer.paint2D(array7x7);
	}
	

}
