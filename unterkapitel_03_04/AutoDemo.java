package unterkapitel_03_04;

public class AutoDemo {

	public static void main(String args[]) {
		Auto batmobil = new Auto();
		batmobil.setSpeed(320);

		System.out.print("Batmobils Geschwindigkeit: ");
		System.out.println(batmobil.getSpeed() + "km/h");

		Auto test = new Auto();
		test.setMarke("sfdgsfg");

		System.out.println(test.getMarke());

		test.setPower(4);
		
		System.out.println(test.getPower());
	}
}