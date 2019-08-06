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
}
