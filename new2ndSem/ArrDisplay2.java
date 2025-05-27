import java.util.*;
	public class ArrDisplay2 {
		public static void main(String[]args){
			Scanner in = new Scanner(System.in);

			System.out.print("How many Students: ");
			int stu = in.nextInt();

			System.out.print("How many Test: ");
			int test = in.nextInt();
			int[][] scores = new int[stu][test];
					for ( int i =0; i < stu; i++){
					System.out.println("Student "+( i+1 ));
					for ( int j=0; j < test; j++){

						System.out.print("Test "+( j+1 )+ ":");
						scores[i][j] = in.nextInt();
						System.out.print(" ");

						}
					}


					for ( int i =0; i < scores.length; i++){
						int sum = 0;
						System.out.println("Student:"+(i+1));
						 	for ( int j =0; j < scores[i].length; j++){
								System.out.println("Test "+(j+1)+":" + scores[i][j] + " ");
								sum += scores[i][j];

							}

							double avg = (double) sum / scores[i].length;
							System.out.println("Average: " +avg);
							System.out.println( "  ");
							}


				}
}


