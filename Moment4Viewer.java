package gu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Dictionary;

import javax.swing.*;

public class Moment4Viewer extends JComponent {
	private Moment4 listener;
	private JSlider sliderR = new JSlider(JSlider.HORIZONTAL,0,250,125);
	private JSlider sliderB = new JSlider(JSlider.HORIZONTAL,0,250,125);
	private JSlider sliderG = new JSlider(JSlider.HORIZONTAL,0,250,125);
	private JTextField tfInput = new JTextField();
	private JButton btnSlumpa = new JButton("Slumpa");
	private JPanel panelSliders = new JPanel(new BorderLayout());
	private JPanel panel = new JPanel(new BorderLayout());
	private JLabel red = new JLabel("RÖD");
	private JLabel blue = new JLabel("BLÅ");
	private JLabel green = new JLabel("GRÖN");
	private JPanel labelPanel = new JPanel(new BorderLayout());
	private JPanel sliders = new JPanel(new BorderLayout());
	
	private JFrame frame = new JFrame( "Moment4" );
	

	public Moment4Viewer(Moment4 listener) {
		this.listener = listener;
		//labelPanel.setPreferredSize(new Dimension(50,50));
		labelPanel.add(red, BorderLayout.NORTH);
		labelPanel.add(blue, BorderLayout.CENTER);
		labelPanel.add(green, BorderLayout.SOUTH);
		sliders.add(sliderR, BorderLayout.NORTH);
		sliders.add(sliderB, BorderLayout.CENTER);
		sliders.add(sliderG, BorderLayout.SOUTH);
		panelSliders.add(labelPanel, BorderLayout.WEST);
		panelSliders.add(sliders,BorderLayout.CENTER);
		panel.add(panelSliders, BorderLayout.SOUTH);
		panel.add(listener, BorderLayout.CENTER);
		frame.add(panel);
		frame.setPreferredSize(new Dimension(800,800));
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible( true );
		listener.Test();
	
		
	}


}
