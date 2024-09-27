package p71018;
import java.util.Scanner;
import java.util.*;
public class PMain {
	//caden finley
	static double[][] m;
	static Scanner in = new Scanner(System.in);
	static int nMatrix;
	public static void main(String[] args) {
		 takeDimension();
		 takeRowInput();
		 output();
		 print2D();
		}    
    private static void takeDimension() {
    	System.out.println("Enter dimension n of nxn matrix:");		
		nMatrix = in.nextInt();
    }
    private static void takeRowInput() {
    	m = new double[nMatrix][nMatrix];        
		for (int i = 0; i < m.length; i++) {
			System.out.println("Enter row " + i + ":");
		    for (int j = 0; j < m[0].length; j++) {
		        m[i][j] = in.nextDouble();
		    }
		}
    }    
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0.0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}
	private static void output() {
    	System.out.println("Sum of the slements in the major diagonal is "+sumMajorDiagonal(m));
    }
	private static void print2D() { 
        for (double[] row : m) {
        	System.out.println(Arrays.toString(row));
        }           
    }
	
    
}


