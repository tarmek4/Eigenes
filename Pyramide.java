public class Pyramide {
	/**
	 * dyhtdh dyhdy fh
	 * @param args
	 */
	public static void main(String args[]) {

		int full_height = 14;

		for (int pyramid_height = 1; pyramid_height <= full_height; pyramid_height = pyramid_height + 2) {

			for (int stars = 0; stars < full_height / 2 - (pyramid_height / 2); stars++) {
				System.out.print(" ");
			}
			for (int space_pyramid = 0; space_pyramid < pyramid_height; space_pyramid++) {
				System.out.print("*");
			}
			System.out.println("");

		}

		for (int trunk_height = 1; trunk_height <= full_height / 4; trunk_height++) {
			for (int space_trunk = 0; space_trunk <= full_height / 3; space_trunk++) {
				System.out.print(" ");

			}
			for (int star_trunk = 0; star_trunk <= full_height / 3; star_trunk++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
