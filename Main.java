public class Main{
  public static void main(String[] args) {
          int []i = {2,5,9,100,453,1000}; //Fill this array with any numbers in increasing order
          System.out.println(findNumber(i,2)); //Any number works
      }
  public static int findNumber(int[] array, int number){
          return(helper(array, number, 0));
      }

      public static int helper(int[] array, int number, int leftOf){
          int half = array.length/2;
          //System.out.println(array[half]);
          if (array[half]==number){
              return(half+leftOf);
          }
          else if (array[half]<number){
              return(
                      helper(Arrays.copyOfRange(array, half, array.length),number,leftOf+half));
          }
          else{
              return(
                      helper(Arrays.copyOfRange(array,0,array.length/2),number,leftOf));
          }
      }
}
