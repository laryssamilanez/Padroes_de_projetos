package exercicio02;
import java.util.List;
import java.util.ArrayList;

class CompositeGraphic implements Graphic{
	
	private List<Graphic> childGraphics = new ArrayList<Graphic>();

	public void print() {
		for (Graphic graphic : childGraphics) {
			graphic.print();
		}
	}

	public double area() {
		double areaTotal = 0;
		for (Graphic graphic : childGraphics) {
			areaTotal += graphic.area();
		}
		return areaTotal;
	}
	
	public void add(Graphic g) {
		childGraphics.add(g);
	}
}