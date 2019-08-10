package Lighting;

import math.Vector3;

public class Diffuse { 
	Vector3 Normal;
	
	public static Vector3 calculateTriangleNormal(Vector3 v1,Vector3 v2,Vector3 v3) {
		float normalx;
		float normaly;
		float normalz;
		Vector3 U = Vector3.sub(v2,v1);
		Vector3 V = Vector3.sub(v3,v1);
		normalx = (U.y*V.z)-(U.z*V.y);
		normaly = (U.z*V.x)-(U.x*V.z);
		normalz = (U.x*V.y)-(U.y*V.x);
		return new Vector3(normalx,normaly,normalz);
	}
	public static Vector3 calculateTrianglCenter(Vector3 v1,Vector3 v2,Vector3 v3) {
		return new Vector3((v1.x+v2.x+v3.x)/3,(v1.y+v2.y+v3.y)/3,(v1.z+v2.z+v3.z)/3);
	}
	public static Vector3 calculateLightVectorFromPoint(Light light,Vector3 v) {
		return Vector3.sub(light.pos,v);
	}
	public static float calculateAngleBetweenVectors(Vector3 triangleVector,Vector3 lightVector) {
		float triangleMagnatude = (float) Math.sqrt(triangleVector.x*triangleVector.x+triangleVector.y*triangleVector.y+triangleVector.z*triangleVector.z);
		float lightMagnatude = (float) Math.sqrt(lightVector.x*lightVector.x+lightVector.y*lightVector.y+lightVector.z*lightVector.z);
		float dot = triangleVector.x*lightVector.x+triangleVector.y*lightVector.y+triangleVector.z*lightVector.z;
		System.out.println("dot:"+dot);
		System.out.println("lightMagnatude:"+lightMagnatude);
		System.out.println("triangleMagnatude:"+triangleMagnatude);
		System.out.println((1/Math.cos(dot/lightMagnatude*triangleMagnatude)));
		return (float) ((Math.acos(dot/Math.abs(lightMagnatude)*Math.abs(triangleMagnatude)))*180/Math.PI);
	}
}
