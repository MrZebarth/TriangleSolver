package triangle;

public class RadianConverter {

	public static double toRadian(double angle) {
		//convert Angle to Radian measure
		angle=angle*Math.PI/180;
		return angle;
	}
	
	public static double toDegree(double angle) {
		//convert Angle to Degree measure
		angle=angle*180/Math.PI;
		return angle;
	}
}
