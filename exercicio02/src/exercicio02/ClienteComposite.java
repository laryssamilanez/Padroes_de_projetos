package exercicio02;
import java.util.List;
import java.util.ArrayList;

public class ClienteComposite {
	public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse();

        Ellipse ellipse2 = new Ellipse();

        Ellipse ellipse3 = new Ellipse();

        Ellipse ellipse4 = new Ellipse();

        Circle circle1 = new Circle();

        Circle circle2 = new Circle();
        
        Square square1 = new Square();

        Square square2 = new Square();

        CompositeGraphic graphic = new CompositeGraphic();

        CompositeGraphic graphic1 = new CompositeGraphic();

        CompositeGraphic graphic2 = new CompositeGraphic();
        
        graphic1.add(ellipse1);

        graphic1.add(ellipse2);

        graphic1.add(ellipse3);

        graphic1.add(ellipse4);

        System.out.println("Graphic1 Area: " + graphic1.area());



        graphic2.add(circle1);

        graphic2.add(circle2);

        System.out.println("Graphic2 Area: " + graphic2.area());



        graphic.add(graphic1);

        graphic.add(graphic2);

        graphic.add(new Square());

        graphic.print();

        System.out.println("Graphic Area: " + graphic.area());

    }
}
