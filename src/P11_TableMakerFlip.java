/*
  	ISYS 320
  	Name(s): Antoine Payne
  	Date: 12/10/17
*/

public class P11_TableMakerFlip {

	public static void main(String[] args) {
		for( int rowNumber = 5; rowNumber >= 1; rowNumber-- ) {
			for( int columnNumber = 1; columnNumber <= 10; columnNumber++ ) {
				System.out.print( (columnNumber * rowNumber) + "\t");
			}
			System.out.println();
		}
	}

}
