import java.util.Arrays;

public class Tester{
  public static void main(String[] args){
    int[]arr1Empty=new int[0];
    int[][]arr2Empty=new int[0][];
    int[]arrSingle=new int[1];
    int[]arr1={0,1,2,1,-5};
    int[][]  A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
                 };
    int[]  B  =   {  1, 3, 5 };
    System.out.println(ArrayOps.sum(arr1));
    System.out.println(ArrayOps.sum(arr1Empty));
    System.out.println(ArrayOps.largest(arr1));
    System.out.println(ArrayOps.largest(arrSingle));
    System.out.println(Arrays.toString(ArrayOps.sumRows(arr2Empty)));
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
    System.out.println(ArrayOps.sum(B));
    System.out.println(ArrayOps.sum(A));//this calls the overloaded 2d array version!
    System.out.println(ArrayOps.sum(arr2Empty));
  }
}
