import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Math;

public class Tests{    
    public static void main(String[] args) {
	    ArrayList<Double> targetIndices = new ArrayList<Double>();
	    targetIndices.add(2.00);
	    targetIndices.add(4.00);
	    System.out.println("Test 1 Distance.....");
	    System.out.println(distance(targetIndices, 1.00));
        System.out.println("Should be 1");
        System.out.println(distance(targetIndices, 7));
        System.out.println("Should be 3");
        ArrayList<Double> targetIndices2 = new ArrayList<Double>();
        targetIndices2.add(2.00);
        targetIndices2.add(5.00);
        System.out.println(distance(targetIndices2, 3));
        System.out.println("Should be 1.0");
        System.out.println(distance(targetIndices2, 4));
        System.out.println("Should be 1.0");
        ArrayList<Double> targetIndices3 = new ArrayList<Double>();
        targetIndices3.add(0.00);
        targetIndices3.add(7.00);
        System.out.println(distance(targetIndices3, 3));
        System.out.println("Should be 3.0");
        System.out.println(distance(targetIndices3, 4));
        System.out.println("Should be 3.0");
        ArrayList<Double> targetIndices4 = new ArrayList<Double>();
        targetIndices4.add(2.00);
        targetIndices4.add(3.00);
        System.out.println("Test 4 Distance.....");
        System.out.println(distance(targetIndices4, 4));
        System.out.println("Should be 1.0");
        System.out.println(distance(targetIndices4, 5));
        System.out.println("Should be 2.0");
    }


    private static double distance(ArrayList<Double> targetIndices, double currentIndex) {
        double minDistance = Double.POSITIVE_INFINITY;
        for (int i=0; i<targetIndices.size(); i++) {
            double current = Math.abs(targetIndices.get(i) - currentIndex);
            if (current < minDistance) {
                minDistance = current;
            }
        }
        return minDistance;
    }

}