package gu4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Moment2UserInput extends JFrame implements ActionListener {
	private Array7x7 arr;
	private Moment2 viewer;

	public Moment2UserInput() {

	}

	public void setController(Array7x7 arr, Moment2 viewer) {
		this.arr = arr;
		this.viewer = viewer;
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println(command);
		if (command.equals("Läs Rad")) {
			try {
				Array7 tempArr = arr.getRow(Integer.parseInt(viewer.inputFieldRow.getText()) - 1);
				for (int i = 0; i < 7; i++) {
					viewer.txtFieldArr2[i].setText(String.valueOf(tempArr.getElement(i)));
				}
			} catch (NumberFormatException error) {
				System.out.println("Skriv in ett nummer.");
			}
		}
		// skriv rad
		if(command.equals("Skriv Rad")) {
			try{
				Array7 tempArr = new Array7();
				for(int i = 0; i < 7; i++) {
					tempArr.setElement(i, Integer.parseInt(viewer.txtFieldArr2[i].getText()));
				}
					arr.setRow(Integer.parseInt(viewer.inputFieldRow.getText())-1, tempArr);
					viewer.update();
			}
			catch(NumberFormatException error) {
				System.out.println("Skriv in ett nummer");
			}
		}

		// läs kol
		if (command.equals("Läs Kol")) {
			try {
				Array7 tempArr = arr.getCol(Integer.parseInt(viewer.inputFieldCol.getText()) - 1);
				for (int i = 0; i < 7; i++) {
					viewer.txtFieldArr1[i].setText(String.valueOf(tempArr.getElement(i)));
				}
			} catch (NumberFormatException error) {
				System.out.println("Skriv in ett nummer.");
			}
		}
		// skriv kol
		if(command.equals("Skriv Kol")) {
			try{
				Array7 tempArr = new Array7();
				for(int i = 0; i < 7; i++) {
					tempArr.setElement(i, Integer.parseInt(viewer.txtFieldArr1[i].getText()));
				}
					arr.setCol(Integer.parseInt(viewer.inputFieldCol.getText())-1, tempArr);
					viewer.update();
			}
			catch(NumberFormatException error) {
				System.out.println("Skriv in ett nummer");
			}
		}
		//shift left
		if(command.equals("Shift left")) {
			Array7 tempArr = new Array7();
			try{
				for(int i = 0; i < 7; i++) {
					tempArr.setElement(i, Integer.parseInt(viewer.txtFieldArr3[i].getText()));
				}
				tempArr = arr.shiftLeft(tempArr);
				for(int i = 0; i < 7; i++) {
					viewer.txtFieldArr1[i].setText(String.valueOf(tempArr.getElement(i)));
				}
				viewer.update();
			}
			catch(NumberFormatException error) {
				System.out.println("Skriv in nummer i arrayen till höger.");
			}
		}
		
		if(command.equals("Shift right")) {
			Array7 tempArr = new Array7();
			try{
				for(int i = 0; i < 7; i++) {
					tempArr.setElement(i, Integer.parseInt(viewer.txtFieldArr1[i].getText()));
				}
				tempArr = arr.shiftRight(tempArr);
				for(int i = 0; i < 7; i++) {
					viewer.txtFieldArr3[i].setText(String.valueOf(tempArr.getElement(i)));
				}
				viewer.update();
			}
			catch(NumberFormatException error) {
				System.out.println("Skriv in nummer i arrayen till höger.");
			}
		}
			
	}
}
