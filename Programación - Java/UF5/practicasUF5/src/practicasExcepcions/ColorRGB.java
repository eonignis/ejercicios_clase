package practicasExcepcions;

import java.util.ArrayList;

public class ColorRGB {
	int red;
	int green;
	int blue;

	public ColorRGB(int red, int green, int blue) throws Exception {
		asignarColorRed(red);
		asignarColorGreen(green);
		asignarColorBlue(blue);
	}

	public void asignarColor(int red, int green, int blue) throws Exception {
		asignarColorRed(red);
		asignarColorGreen(green);
		asignarColorBlue(blue);
	}

	public ArrayList<ColorRGB> obtenerColor() throws Exception {
		ArrayList<ColorRGB> newColor = new ArrayList<ColorRGB>();
		return newColor;
	}

	// GETTERS Y SETTERS
	public int obtenerColorRed() {
		return red;
	}

	public int obtenerColorGreen() {
		return green;
	}

	public int obtenerColorBlue() {
		return blue;
	}

	public void asignarColorRed(int red) throws Exception {
		if (red < 0 && red > 250) {
			throw new Exception("El número ha de ser major o igual a 0 i menor o igual a 250");
		} else {
			this.red = red;
		}
	}

	public void asignarColorGreen(int green) throws Exception {
		if (green < 0 && green > 250) {
			throw new Exception("El número ha de ser major o igual a 0 i menor o igual a 250");
		} else {
			this.green = green;
		}
	}

	public void asignarColorBlue(int blue) throws Exception {
		if (blue < 0 && blue > 250) {
			throw new Exception("El número ha de ser major o igual a 0 i menor o igual a 250");
		} else {
			this.blue = blue;
		}
	}

}
