//Geography: estimate areas
package CH04;

public class CH04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double EARTH_AVERAGE_RADIUS = 6371.01;
		//將五點的座標轉為徑度
        double x1 = 35.2270869;
        double y1 = -80.8431267;
        double x1Radian = Math.toRadians(x1);
        double y1Radian = Math.toRadians(y1);

        double x2 = 33.7489954;
        double y2 = -84.3879824;
        double x2Radian = Math.toRadians(x2);
        double y2Radian = Math.toRadians(y2);

        double x3 = 32.0835407;
        double y3 = -81.0998342;
        double x3Radian = Math.toRadians(x3);
        double y3Radian = Math.toRadians(y3);

        double x4 = 28.5383355;
        double y4 = -81.3792365;
        double x4Radian = Math.toRadians(x4);
        double y4Radian = Math.toRadians(y4);
        
        //算出四邊長度+中間分成兩三角形的邊
        double d1 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x1Radian) * Math.sin(x2Radian)
                + Math.cos(x1Radian) * Math.cos(x2Radian) * Math.cos(y1Radian - y2Radian));

        double d2 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x1Radian) * Math.sin(x3Radian)
                + Math.cos(x1Radian) * Math.cos(x3Radian) * Math.cos(y1Radian - y3Radian));

        double d3 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x4Radian) * Math.sin(x2Radian)
                + Math.cos(x4Radian) * Math.cos(x2Radian) * Math.cos(y4Radian - y2Radian));

        double d4 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x3Radian) * Math.sin(x4Radian)
                + Math.cos(x3Radian) * Math.cos(x4Radian) * Math.cos(y3Radian - y4Radian));

        double d5 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x3Radian) * Math.sin(x2Radian)
                + Math.cos(x3Radian) * Math.cos(x2Radian) * Math.cos(y3Radian - y2Radian));
        
        //算出倆三角形周長
        double HalfSumLengthSide1 = (d1 + d2 + d5) / 2;
        double HalfSumLengthSide2 = (d3 + d4 + d5) / 2;
        
        //算出面積
        double A1 = Math.pow(HalfSumLengthSide1 * (HalfSumLengthSide1 - d1)
                * (HalfSumLengthSide1 - d2) * (HalfSumLengthSide1 - d5), 0.5);
        double A2 = Math.pow(HalfSumLengthSide2 * (HalfSumLengthSide2 - d3)
                * (HalfSumLengthSide2 - d4) * (HalfSumLengthSide2 - d5), 0.5);

        System.out.println("The estimated area enclosed by these four cities is " + (A1 + A2));
	
	}

}
