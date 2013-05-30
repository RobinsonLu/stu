package thinking.in.java.code16;

import java.util.Arrays;

public class MultidimensionalObjectArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[][] spheres = {{new BerylliumSphere(), new BerylliumSphere()},
				{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()},
				{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),
					new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()}};
		System.out.println(Arrays.deepToString(spheres));
	}

}
