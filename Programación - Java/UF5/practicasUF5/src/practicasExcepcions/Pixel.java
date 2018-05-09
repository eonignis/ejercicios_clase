package practicasExcepcions;

import java.util.ArrayList;

public class Pixel extends ColorRGB {
	int x, y;
	ColorRGB color;

	public Pixel(int red, int green, int blue, int x, int y, ColorRGB color) throws Exception {
		super(red, green, blue);
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public void asignarPosicion(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void asignarPosicionX(int x) {
		this.x = x;
	}

	public void asignarPosicionY(int y) {
		this.y = y;
	}

	public void obtenerPosicion() {

	}

	public int obtenerPosicionX() {
		return x;
	}

	public int obtenerPosicionY() {
		return y;
	}

	public void assignarColor(int red, int green, int blue) throws Exception {
		asignarColorRed(red);
		asignarColorGreen(green);
		asignarColorBlue(blue);
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

	public ArrayList<ColorRGB> obtenerColor() {
		ArrayList<ColorRGB> newColor = new ArrayList<ColorRGB>();
		return newColor;
	}

	public int obtenerColorRed() {
		return red;
	}

	public int obtenerColorGreen() {
		return green;
	}

	public int obtenerColorBlue() {
		return blue;
	}

}
