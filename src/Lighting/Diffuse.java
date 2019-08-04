package Lighting;

public class Diffuse { 
	calculateTriangleNormal(Vector3 v1,Vector3 v2,Vector3 v3) {
		Vector U = v2-v1;
		Vector V = v3-v1;
	
		Set Normal.x to (multiply U.y by V.z) minus (multiply U.z by V.y)
		Set Normal.y to (multiply U.z by V.x) minus (multiply U.x by V.z)
		Set Normal.z to (multiply U.x by V.y) minus (multiply U.y by V.x)
	}
}
