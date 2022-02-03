package project;

public class multidimenstionalArray {
	public static void main (String[] args) {
	int [][]multidimenstionalArray= {{1,2}, {2,3}, {3,4} };
    
    for(int i = 0 ; i < 3 ; i++){
       //row
       for(int j = 0 ; j < 2; j++){
          System.out.print(multidimenstionalArray[i][j] + " ");
       }
       System.out.println();
    }
}
}
