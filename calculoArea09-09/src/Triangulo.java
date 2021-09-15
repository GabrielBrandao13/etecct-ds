
public class Triangulo extends Poligono {
	private double largura;
	private double altura;
	public Triangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getArea() {
		return (altura*largura)/2;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
