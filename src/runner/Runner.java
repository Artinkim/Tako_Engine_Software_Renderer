package runner;

import java.util.ArrayList;

import math.Matrix4;
import math.Vector2;
import math.Vector3;
import math.Vector4;
import renderEngine.Display;
import utilities.ObjReader;

public class Runner {

	Display display;
	
	public Runner() {
		display = new Display(720, 720);
		display.clearBackBuffer(0, 0, 0, 1);
		display.renderTriangle(new Vector2(-0.6f, 0.5f), new Vector2(0.6f, 0.8f), new Vector2(0f, -0.2f), new Vector4(255f, 0, 0, 255f));		
		display.swapBuffers();
		ArrayList<Vector3> verts = new ObjReader().getVerticesFromObjFile("C:\\Users\\Artin\\git\\Tako_Engine_Software_Renderer\\src\\utilities\\plane.obj");
		display.renderVertecies(verts);
	}
	
	public static void main(String[] args) {
		new Runner();
		
	}
	
}
