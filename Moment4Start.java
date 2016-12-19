package gu4;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Moment4Start extends JPanel {
	public static void main(String[] args) {
		Moment4 m4 = new Moment4(1,5,Color.WHITE,Color.BLACK,1,10);
		//Moment4Viewer m4Viewer = new Moment4Viewer(m4);
		JFrame frame = new JFrame( "Moment4" );
		frame.setPreferredSize(new Dimension(800,800));
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.add( m4 );
		frame.pack();
		frame.setLocationRelativeTo(null);
		Moment4Viewer m4Viewer = new Moment4Viewer(m4,frame);
		frame.setVisible( true );
		m4.Test();
	}

}
