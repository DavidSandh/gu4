package gu4;

import java.awt.BorderLayout;

import javax.swing.*;

public class Moment4Viewer extends JComponent {
	private Moment4 listener;
	private JFrame frame;
	private JSlider sliderR = new JSlider(JSlider.HORIZONTAL,0,250,125);
	private JSlider sliderB = new JSlider(JSlider.HORIZONTAL,0,250,125);
	private JSlider sliderG = new JSlider(JSlider.HORIZONTAL,0,250,125);
	private JTextField tfInput = new JTextField();
	private JButton btnSlumpa = new JButton("Slumpa");
	private JPanel panelSliders = new JPanel(new BorderLayout());
	

	public Moment4Viewer(Moment4 listener,JFrame frame) {
		this.listener = listener;
		this.frame = frame;
		panelSliders.add(sliderR,BorderLayout.NORTH);
		panelSliders.add(sliderB, BorderLayout.CENTER);
		panelSliders.add(sliderG, BorderLayout.SOUTH);
		frame.add(panelSliders);
	
		
	}


}
