package gu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Moment2 extends JPanel {
	private JLabel labelArr[][] = new JLabel[7][7];
	private JPanel grid7x7 = new JPanel(new GridLayout(7,7, 5, 5));
	private JPanel txtGridBtm = new JPanel(new GridLayout(1,7));
	private JPanel txtGridLeft = new JPanel(new GridLayout(7,1));
	private Font font1 = new Font("Calibri", Font.BOLD, 50);
	private JTextField txtFieldArr1[] = new JTextField[7];
	private JTextField txtFieldArr2[] = new JTextField[7];
	public Moment2() {
		setPreferredSize(new Dimension(800,800));
		setLayout(new BorderLayout());
	}
	public void paint2D(Array7x7 array7x7) {
		for(int i = 0; i < labelArr.length; i++) {
			txtFieldArr1[i] = new JTextField();
			txtGridLeft.add(txtFieldArr1[i]);
			txtGridLeft.setPreferredSize(new Dimension(10, 10));
			txtGridBtm.setPreferredSize(new Dimension(10, 10));
			for(int j = 0; j < labelArr[i].length; j++) {
				labelArr[i][j] = new JLabel(array7x7.getElement(i,j) + "");
				labelArr[i][j].setFont(font1);
				txtFieldArr2[j] = new JTextField();
				grid7x7.add(labelArr[i][j]);
				txtGridBtm.add(txtFieldArr2[j]);
			}
		}
		add(grid7x7, BorderLayout.CENTER);
		add(txtGridBtm);
		add(txtGridLeft);
	}

}
