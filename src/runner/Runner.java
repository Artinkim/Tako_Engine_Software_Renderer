package runner;

import java.util.ArrayList;

import Lighting.Diffuse;
import Lighting.Light;
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
		Vector3 v1 = new Vector3(0.0f,0.0f,0.0f);
		Vector3 v2 = new Vector3(0.5f,1.0f,0.0f);
		Vector3 v3 = new Vector3(1.0f,0.0f,0.0f);
		Vector3 vec = Diffuse.calculateTriangleNormal(v1,v2,v3);
		System.out.println(vec.x);
		System.out.println(vec.y);
		System.out.println(vec.z);
		display.renderTriangle(new Vector2(v1.x,v1.y),new Vector2(v2.x,v2.y),new Vector2(v3.x,v3.y),new Vector4(255f, 0, 0, 255f));
		Vector3 center = Diffuse.calculateTrianglCenter(v1,v2,v3);
		display.renderPixel((int)center.x, (int)center.y,new Vector4(0, 255f, 0, 255f));
		System.out.println(center.x);
		System.out.println(center.y);
		System.out.println(center.z);
		Light l = new Light(0.9f,0.33333334f,1.0f);
		display.renderPixel((int)l.pos.x, (int)l.pos.y,new Vector4(0, 0, 255f, 255f));
		Vector3 lightVector = Diffuse.calculateLightVectorFromPoint(l,center);
		System.out.println(lightVector.x);
		System.out.println(lightVector.y);
		System.out.println(lightVector.z);
		System.out.println("Angle: "+Diffuse.calculateAngleBetweenVectors(vec,lightVector));
		display.swapBuffers();
	}
	
	public static void main(String[] args) {
		new Runner();
		
	}
	
}