package gu4;

import javax.swing.JFrame;

public class Moment2Start {
	public static void main( String[] args ) {
		
		 Moment2UserInput userInput = new Moment2UserInput();
		 Moment2 viewer = new Moment2(userInput);
		 Moment2Controller controller = new Moment2Controller(viewer, userInput);
		 JFrame frame = new JFrame( "Moment2" );
		 frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		 frame.add( viewer );
		 frame.pack();
		 frame.setLocationRelativeTo(null);
		 frame.setVisible( true );
		}

}
