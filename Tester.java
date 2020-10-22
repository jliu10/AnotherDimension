public class Tester{
  public static void main(String[] args){
    int[]arrEmpty=new int[0];
    int[]arr1={0,1,2,1,-5};
    System.out.println(ArrayOps.sum(arr1));
    System.out.println(ArrayOps.sum(arrEmpty));
  }
}
