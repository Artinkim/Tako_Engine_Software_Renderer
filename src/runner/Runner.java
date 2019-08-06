package runner;

import java.util.ArrayList;

import Lighting.Diffuse;
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
		Diffuse diffuse = new Diffuse();	
	
		Vector3 vec = Diffuse.calculateTriangleNormal(new Vector3(0.0f,1.0f,0.0f),new Vector3(1.0f,0.0f,0.0f),new Vector3(-1.0f,0.0f,0.0f));
		System.out.println(vec.x);
		System.out.println(vec.y);
		System.out.println(vec.z);
		display.renderTriangle(new Vector2(1.0f,0.0f),new Vector2(0.0f,1.0f),new Vector2(-1.0f,0.0f),new Vector4(255f, 0, 0, 255f));
		
		display.swapBuffers();
	}
	
	public static void main(String[] args) {
		new Runner();
		
	}
	
}