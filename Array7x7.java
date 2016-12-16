package gu4;

public class Array7x7 {
	private int[][] arr = new int[7][7];

	public Array7x7() {
	}

	public Array7x7(int nbr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = nbr;
			}
		}
	}

	public Array7x7(int[][] arr) {
		this.arr = arr;
	}

	public int[][] getArray() {
		return arr;
	}

	public void setElement(int row, int col, int value) {
		arr[row][col] = value;
	}

	public int getElement(int row, int col) {
		return arr[row][col];
	}

	public void setRow(int row, Array7 theRow) {
		for (int i = 0; i < 7; i++) {
			arr[row][i] = theRow.getElement(i);
		}
	}

	public Array7 getRow(int row) {
		Array7 arr7 = new Array7();
		for (int i = 0; i < 7; i++) {
			arr7.setElement(i, arr[row][i]);
		}
		return arr7;
	}

	public void setCol(int col, Array7 theCol) {
		for (int i = 0; i < 7; i++) {
			arr[i][col] = theCol.getElement(i);
		}
	}

	public Array7 getCol(int col) {
		Array7 arr7 = new Array7();
		for (int i = 0; i < 7; i++) {
			arr7.setElement(i, arr[i][col]);
		}
		return arr7;
	}

	public Array7 shiftLeft(Array7 arr) {
		Array7 tempArr = arr;
		Array7 tempArr1;

		for (int i = 6; i >= 0; i--) {
			tempArr1 = getCol(i);
			setCol(i, tempArr);
			tempArr = tempArr1;
		}
		return tempArr;

	}

	public Array7 shiftRight(Array7 arr) {
		Array7 tempArr = arr;
		Array7 tempArr1;
		for (int i = 0; i < 7; i++) {
			tempArr1 = getCol(i);
			setCol(i, tempArr);
			tempArr = tempArr1;
		}
		return tempArr;

	}

	public static Array7x7 getChar(char chr) {
		Array7x7 res;
		switch (chr) {
		case 'A':
			res = new Array7x7(Chars.A);
			break;
		case 'B':
			res = new Array7x7(Chars.B);
			break;
		case 'C':
			res = new Array7x7(Chars.C);
			break;
		case 'D':
			res = new Array7x7(Chars.D);
			break;
		case 'E':
			res = new Array7x7(Chars.E);
			break;
		case 'F':
			res = new Array7x7(Chars.F);
			break;
		case 'G':
			res = new Array7x7(Chars.G);
			break;
		case 'H':
			res = new Array7x7(Chars.H);
			break;
		case 'I':
			res = new Array7x7(Chars.I);
			break;
		case 'J':
			res = new Array7x7(Chars.J);
			break;
		case 'K':
			res = new Array7x7(Chars.K);
			break;
		case 'L':
			res = new Array7x7(Chars.L);
			break;
		case 'M':
			res = new Array7x7(Chars.M);
			break;
		case 'N':
			res = new Array7x7(Chars.N);
			break;
		case 'O':
			res = new Array7x7(Chars.O);
			break;
		case 'P':
			res = new Array7x7(Chars.P);
			break;
		case 'Q':
			res = new Array7x7(Chars.Q);
			break;
		case 'R':
			res = new Array7x7(Chars.R);
			break;
		case 'S':
			res = new Array7x7(Chars.S);
			break;
		case 'T':
			res = new Array7x7(Chars.T);
			break;
		case 'U':
			res = new Array7x7(Chars.U);
			break;
		case 'V':
			res = new Array7x7(Chars.V);
			break;
		case 'X':
			res = new Array7x7(Chars.X);
			break;
		case 'Y':
			res = new Array7x7(Chars.Y);
			break;
		case 'Z':
			res = new Array7x7(Chars.Z);
			break;
		case 'Å':
			res = new Array7x7(Chars.Å);
			break;
		case 'Ä':
			res = new Array7x7(Chars.Ä);
			break;
		case 'Ö':
			res = new Array7x7(Chars.Ö);
			break;
		case '*':
			res = new Array7x7(Chars.ASTERISK);
			break;
		case '+':
			res = new Array7x7(Chars.PLUS);
			break;
		case '-':
			res = new Array7x7(Chars.MINUS);
			break;
		case '/':
			res = new Array7x7(Chars.FSLASH);
			break;
		case '.':
			res = new Array7x7(Chars.DOT);
			break;
		case ' ':
			res = new Array7x7(Chars.SPACE);
			break;
		case '1':
			res = new Array7x7(Chars.ONE);
			break;
		case '2':
			res = new Array7x7(Chars.TWO);
			break;
		case '3':
			res = new Array7x7(Chars.THREE);
			break;
		case '4':
			res = new Array7x7(Chars.FOUR);
			break;
		case '5':
			res = new Array7x7(Chars.FIVE);
			break;
		case '6':
			res = new Array7x7(Chars.SIX);
			break;
		case '7':
			res = new Array7x7(Chars.SEVEN);
			break;
		case '8':
			res = new Array7x7(Chars.EIGHT);
			break;
		case '9':
			res = new Array7x7(Chars.NINE);
			break;
		case '0':
			res = new Array7x7(Chars.ZERO);
			break;
		default:
			res = new Array7x7(Chars.UNKNOWN);
			break;

		}
		return res;
	}

}