//Write Java programs to implement (i) multidimensional arrays, (ii) passing an array to a method, and (iii) cloning an array concepts. Read some values into the arrays and print each value to standard output in a descriptive format. (Note: This is an ordinary array, not an ArrayList). Upload your code to GitHub.

class Main {
  public static int[][] cloneArray(int[][] array){
  	return array.clone();
  }
  public static void printMultiArray(int[][] array){
  	System.out.println("\nArray start:");
  	for(int i=0;i<3;i++){
  		for(int j=0;j<2;j++){
  			System.out.println(array[i][j]);
  		}
  	}
  	System.out.println("---End of array---");
  }
  public static void main(String[] args) {
    int[][] multi = {{1, 2}, {3, 4}, {5, 6}};
    printMultiArray(multi);
    int[][] clonedMulti = cloneArray(multi);
    printMultiArray(clonedMulti);
  }
}
