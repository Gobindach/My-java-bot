import java.io.*;

class TwoDimensionArray {
    public static void main(String args[]) throws Exception {
        try {
            int array[][] = new int[2][5]; // Declare 2x5 array

            // Initialize values
            array[0][0] = 2;
            array[0][1] = 5;
            array[0][2] = 13;
            array[0][3] = 11;
            array[0][4] = 15;
            array[1][0] = 13;
            array[1][1] = 10;
            array[1][2] = 9;
            array[1][3] = 4;
            array[1][4] = 19;

            // Print the 2D array
        	 for (int i = 0; i < 2; i++) 
			{
				System.out.print("\n");

                for (int j = 0; j < 5; j++) {
                    System.out.print(array[i][j]+"\t");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}