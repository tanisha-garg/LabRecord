package labrecord.flowcontrol;

public class TrafficLight {

	public static void main(String args[]) {
		TrafficLight app = new TrafficLight();
		app.start();
	}

	void start() {

		String light = "Red";

		switch (light) {
		case "Red":
			System.out.print("Stop");
			break;
		case "Yellow":
			System.out.print("Ready");
			break;
		case "Green":
			System.out.print("Go");
		}
	}

}
