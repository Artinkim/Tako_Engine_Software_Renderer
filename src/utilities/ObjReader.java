package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import math.Vector3;

public class ObjReader {
	public ArrayList<Vector3> vectors = new ArrayList<Vector3>();
	public void getVertices(String file){
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = br.readLine();
			int count = 0;
			String temp = "";
			float x = 0;
			float y = 0;
			float z = 0;
			while(str!=null) {
				count = 0;
				if(str.charAt(0) == 'v') {
					System.out.println(str);
					for(int i = 2;i<str.length();i++) {
						if(str.charAt(i) != ' ') {
							temp+=str.charAt(i);
						} else {
							if(count == 0) {
								x = Float.parseFloat(temp);
								System.out.println(x);
							} else if(count == 1){
								y = Float.parseFloat(temp);
							}
							count++;
							temp = "";
						}
					}
				}
				str = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ObjReader().getVertices("/Users/league/git/Tako_Engine_Software_Renderer/src/utilities/plane.obj");
		
	}
}
