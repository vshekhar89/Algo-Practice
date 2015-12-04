package facebook;

import java.awt.HeadlessException;
import java.util.Map;
import java.util.TreeMap;

public class EcuDistance {

	public class Point{
		
		public  int co1;
		public  int co2;
		
		
		public void Point(int val1, int val2){
		this.co1= val1;
		this.co2=val2;
		}
	}
	
	public static double distance(Point p1, Point p2){
		double dis=0;
		double diffx= Math.pow((double)(p1.co1-p2.co1),2);
		double diffy= Math.pow((double)(p1.co2-p2.co2),2);
		
		dis= Math.sqrt(diffx-diffy);
		return dis;
	}
	
	public static Point[] closestPoints(Point[] points, Point from, int k ){
		Point[] ans = new Point[k];
		
		Map<Double, Point> set = new TreeMap<Double, Point>();
		
		for(Point p :points){
			double distance= distance(p, from);
			set.put(distance, p);
		}
		
		int counter=0;
		for(Map.Entry<Double, Point> entry : set.entrySet()){
			if(counter ==k){
				break;
			}
			ans[counter]=entry.getValue();
			counter++;
			}
		return ans;
		
	}
}
