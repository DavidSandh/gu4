package gu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Moment2 extends JPanel {
	private JLabel labelArr[][] = new JLabel[7][7];
	private JPanel grid7x7 = new JPanel(new GridLayout(7,7));
	public Moment2() {
		setPreferredSize(new Dimension(800,800));
		
	}
	public void paint2D(Array7x7 array7x7) {
		for(int i = 0; i < labelArr.length; i++) {
			for(int j = 0; j < labelArr[i].length; j++) {
				labelArr[i][j] = new JLabel(array7x7.getElement(i,j) + "");
				grid7x7.add(labelArr[i][j]);
			}
		}
		add(grid7x7,BorderLayout.CENTER);
		
	}

}
