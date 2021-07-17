package GitHub;

import java.util.Date;

public class Game {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cardboard[] children = new Cardboard[6];
		
		Date d = new Date();
		long startDate = d.getTime();
		
		children[0] = new Cardboard("John", d, new Drawing("Rectangle", "Blue", 30, 20));
		
		children[1] = (Cardboard)children[0].clone();
		children[1].setName("Jane");
		d = new Date();
		d.setTime(startDate + 2000);
		children[1].setDate(d);
		children[1].getDrawing().setColor("Purple");
		
		children[2] = (Cardboard)children[1].clone();
		children[2].setName("James");
		d = new Date();
		d.setTime(startDate + 34000);
		children[2].setDate(d);
		children[2].getDrawing().setHeight(25);
		
		children[3] = (Cardboard)children[2].clone();
		children[3].setName("Stephen");
		d = new Date();
		d.setTime(startDate + 12000);
		children[3].setDate(d);
		children[3].getDrawing().setGeoFigure("Triangle");;
		
		children[4] = (Cardboard)children[3].clone();
		children[4].setName("Austin");
		d = new Date();
		d.setTime(startDate + 1000);
		children[4].setDate(d);
		children[4].getDrawing().setWidth(33);
		
		children[5] = (Cardboard)children[4].clone();
		children[5].setName("Irene");
		d = new Date();
		d.setTime(startDate + 22000);
		children[5].setDate(d);
		children[5].getDrawing().setColor("Green");
		children[5].getDrawing().setGeoFigure("Sphere");
		
		System.out.println("The cards on each children are:\n-------------------------------");
		for(int i = 0; i < children.length; i++) {
			System.out.println((i + 1) + " " + children[i]);
		}
		
	}

}
