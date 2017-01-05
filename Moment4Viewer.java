package gu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Moment4Viewer extends JComponent {
	private Moment4 m4;
	private JSlider sliderR = new JSlider(JSlider.HORIZONTAL, 0, 255, 125);
	private JSlider sliderB = new JSlider(JSlider.HORIZONTAL, 0, 255, 125);
	private JSlider sliderG = new JSlider(JSlider.HORIZONTAL, 0, 255, 125);
	private JTextField tfInput = new JTextField("Skriv en text");
	private JButton btnInput = new JButton("Enter");
	private JButton btnRandom = new JButton("Random");
	private JPanel panelSliders = new JPanel(new BorderLayout());
	private JPanel panel = new JPanel(new BorderLayout());
	private JLabel red = new JLabel("RÖD");
	private JLabel blue = new JLabel("BLÅ");
	private JLabel green = new JLabel("GRÖN");
	private JPanel labelPanel = new JPanel(new BorderLayout());
	private JPanel sliders = new JPanel(new BorderLayout());
	private JPanel btnPanel = new JPanel(new BorderLayout());
	private JFrame frame = new JFrame("Moment4");
	
	
	public int getSliderR() {
		return sliderR.getValue();
	}

	public int getSliderB() {
		return sliderB.getValue();
	}

	public int getSliderG() {
		return sliderG.getValue();
	}

	public String getTfInput() {
		return tfInput.getText();
	}

	public Moment4Viewer(Moment4 m4) {
		this.m4 = m4;
		m4.addViewer(this);
		ButtonListener bl = new ButtonListener();
		// labelPanel.setPreferredSize(new Dimension(50,50));
		btnPanel.add(tfInput, BorderLayout.NORTH);
		btnPanel.add(btnInput, BorderLayout.CENTER);
		btnPanel.add(btnRandom, BorderLayout.SOUTH);
		labelPanel.add(red, BorderLayout.NORTH);
		labelPanel.add(blue, BorderLayout.CENTER);
		labelPanel.add(green, BorderLayout.SOUTH);
		sliders.add(sliderR, BorderLayout.NORTH);
		sliders.add(sliderB, BorderLayout.CENTER);
		sliders.add(sliderG, BorderLayout.SOUTH);
		panelSliders.add(btnPanel, BorderLayout.EAST);
		panelSliders.add(labelPanel, BorderLayout.WEST);
		panelSliders.add(sliders, BorderLayout.CENTER);
		panel.add(panelSliders, BorderLayout.SOUTH);
		panel.add(m4, BorderLayout.CENTER);
		frame.add(panel);
		frame.setPreferredSize(new Dimension(800, 800));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		btnInput.addActionListener(bl);
		btnRandom.addActionListener(bl);
	}
	
	public void toggleBtns(boolean toggle) {
			btnInput.setEnabled(toggle);
			btnRandom.setEnabled(toggle);
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnInput) {
				toggleBtns(false);
				m4.addStuff(getTfInput(), Color.rgb(getSliderR(), getSliderG(), getSliderB()));
			}
			if (e.getSource() == btnRandom){
				m4.randomColor();	
			}
		}

	}
}
