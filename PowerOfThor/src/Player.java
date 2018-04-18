import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        int TX=initialTX;
        int TY=initialTY;
        StringBuffer s=new StringBuffer();
        // game loop
        //System.out.println(TX);
        //System.out.println(lightX);
        while ((TX!=lightX)  || (TY!=lightY)) {
        	//System.out.println("c");
            //int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            s=new StringBuffer();
        	if (TY>lightY) {
        		TY-=1;
        		s.append("N");
        	}
        	else if (TY<lightY) {
        		TY+=1;
        		s.append("S");
        	}
            if (TX>lightX) {
        		TX-=1;
        		s.append("W");
        	}
        	else if (TX<lightX) {
        		TX+=1;
        		s.append("E");
        	}
            System.out.println(s);
            
        }
    }
}