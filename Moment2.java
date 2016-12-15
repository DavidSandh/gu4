package gu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Moment2 extends JPanel implements ActionListener {
	private JLabel labelArr[][] = new JLabel[7][7];
	private JPanel grid7x7 = new JPanel(new GridLayout(7, 7, 5, 5));
	private JPanel txtGridBtm = new JPanel(new GridLayout(1, 7));
	private JPanel txtGridLeft = new JPanel(new GridLayout(7, 1));
	private JPanel btnGrid = new JPanel(new GridLayout(7, 1));
	private Font font1 = new Font("Calibri", Font.BOLD, 50);
	protected JTextField txtFieldArr1[] = new JTextField[7];
	protected JTextField txtFieldArr2[] = new JTextField[7];
	protected JTextField inputFieldRow = new JTextField();
	protected JTextField inputFieldCol = new JTextField();
	private JButton testBtns[] = new JButton[4];
	private Moment2UserInput listener;
	private Array7x7 arr;

	public Moment2(Moment2UserInput listener) {
		// setPreferredSize(new Dimension(800,800));
		this.listener = listener;
		setLayout(new BorderLayout());
		txtGridLeft.setPreferredSize(new Dimension(50, 50));
		txtGridBtm.setPreferredSize(new Dimension(50, 50));
		testBtns[0] = new JButton("Läs Rad");
		testBtns[1] = new JButton("Skriv Rad");
		testBtns[2] = new JButton("Läs Kol");
		testBtns[3] = new JButton("Skriv Kol");
		inputFieldRow = new JTextField("Input rad nr");
		inputFieldCol = new JTextField("Input kol nr");
		testBtns[0].addActionListener(listener);
		testBtns[1].addActionListener(listener);
		testBtns[2].addActionListener(listener);
		testBtns[3].addActionListener(listener);

	}

	public void paint2D(Array7x7 array7x7) {
		this.arr = array7x7;
		for (int i = 0; i < labelArr.length; i++) {
			txtFieldArr1[i] = new JTextField();
			txtFieldArr2[i] = new JTextField();
			txtGridLeft.add(txtFieldArr1[i]);
			txtGridBtm.add(txtFieldArr2[i]);
			for (int j = 0; j < labelArr[i].length; j++) {
				labelArr[i][j] = new JLabel(array7x7.getElement(i, j) + "");
				labelArr[i][j].setFont(font1);

				grid7x7.add(labelArr[i][j]);

			}
		}
		btnGrid.add(testBtns[0]);
		btnGrid.add(testBtns[1]);
		btnGrid.add(inputFieldRow);
		btnGrid.add(testBtns[2]);
		btnGrid.add(testBtns[3]);
		btnGrid.add(inputFieldCol);
		add(grid7x7, BorderLayout.CENTER);
		add(txtGridBtm, BorderLayout.SOUTH);
		add(txtGridLeft, BorderLayout.WEST);
		add(btnGrid, BorderLayout.EAST);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void update() {
		for (int i = 0; i < labelArr.length; i++) {
			for (int j = 0; j < labelArr[i].length; j++) {
				labelArr[i][j].setText(arr.getElement(i, j) + "");
			}
		}
		repaint();
	}
}