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
				
		ArrayList<Vector3> verts = new ObjReader().getVerticesFromObjFile("/Users/league/git/Tako_Engine_Software_Renderer/src/utilities/monkey2.obj");
		display.renderVertecies(verts);
		display.swapBuffers();
	}
	
	public static void main(String[] args) {
		new Runner();
		
	}
	
}