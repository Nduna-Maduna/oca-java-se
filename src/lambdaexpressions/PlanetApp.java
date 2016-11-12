package lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;


public class PlanetApp {

	public static void main(String[] args) {
		Planet mercury = new Planet("Mercury", Color.GRAY, 0, false);
		Planet venus = new Planet("Venus", Color.YELLOW, 0, false);
		Planet earth = new Planet("Earth", Color.BLUE, 1, false);
		Planet mars = new Planet("Mars", Color.RED, 2, false);
		Planet jupiter = new Planet("Jupiter", Color.YELLOW, 67, true);
		Planet saturn = new Planet("Saturn", Color.ORANGE, 62, true);
		Planet uranus = new Planet("Uranus", Color.TEAL, 27, true);
		Planet neptune = new Planet("Neptune", Color.BLUE, 14, true);
		
		List<Planet> planetList = new ArrayList<>();
		planetList.add(mercury);
		planetList.add(venus);
		planetList.add(earth);
		planetList.add(mars);
		planetList.add(jupiter);
		planetList.add(saturn);
		planetList.add(uranus);
		planetList.add(neptune);
		
		// SCENARIO 1
		
	}

}
