/*
  	ISYS 320
  	Name(s): Antoine Payne
  	Date: 12/10/17
*/

// 1. Your predicted output 
//The code creates an equation so it will take 4 rows and divide the number by 2
//starting from 1 to 4



public class P5_OddStuff {
    public static void main( String[] args ) {
        int number = 4;
        for( int count = 1; count <= number; count++ ) {
            System.out.println( number );
            number = number / 2;
        }
    }
}



// 3. Were you correct? Explain any differences and what you learned.
// I was partially correct the int "number" was set to appear, there's steps 
// in the code that don't need to be there for this output, 2 appears because
// it is also stated in the line