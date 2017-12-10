/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

// 1. Your predicted output 
// The code will perform a countdown untill blastoff



public class P8_Launch {
    public static void main( String[] args ) {
        System.out.println("T-minus ");
        for( int i = 5; i >= 1; i-- ) {
            System.out.print( i + ", " );
        }
        System.out.println("Blastoff!");
    }
}



// 3. Were you correct? Explain any differences and what you learned.
// Yes 5 was set as i which was then set to the greatest value and indicated to
//decrease from there.