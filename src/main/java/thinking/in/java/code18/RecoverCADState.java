package thinking.in.java.code18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import javax.imageio.stream.FileImageInputStream;

public class RecoverCADState {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/txt/CADState.out"));
		List<Class<? extends Shape>> shapeTypes = (List<Class<? extends Shape>>) in.readObject();
		Line.deserializeStaticState(in);
		List<Shape> shapes = (List<Shape>) in.readObject();
		System.out.println(shapes);
	}

}
