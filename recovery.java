import java.util.*;
public class recovery{
    
static int twoArraysNthElement(int[] array1, int[] array2, int n) {

  class Helper {
    int lowerBound(int[] arr, int elem) {
      int l = -1;
      int r = arr.length;
      while (l + 1 < r) {
        int mid = (l + r) / 2;
        if (arr[mid] <= elem) {
          l = mid;
       //   System.out.println("l 0.1: "+l);
        }
        else {
          r = mid;
       //   System.out.println("r: "+r);
        }
      }
    //  System.out.println("l: "+l);
      return l;
    }
  };

  int l = -1;
  int r = array1.length;

  Helper h = new Helper();

  while (l + 1 < r) {
    int mid = (l + r) / 2;
    int pos = h.lowerBound(array2, array1[mid]);
    //System.out.println("pos: "+pos);
    if (mid + pos + 1 <= n) {
      l = mid;
    }
    else {
      r = mid;
    }
  }

  if (l > -1 && l + h.lowerBound(array2, array1[l]) + 1 == n) {
    return array1[l];
  }
  System.out.println("r: "+r);
  System.out.println("l : "+l);
  System.out.println(Arrays.toString(array1));
  System.out.println(Arrays.toString(array2));
  System.out.println("array[l] : "+array2[l]);
  return array2[r-l+1] ;
}
    
     public static void main(String []args){
        System.out.println("Hello World");
        int arr1[]={1,2,3};//{1,3,4};  //{1,3,5};   //{1,2,3};
        int arr2[]={4,5,6};//{2,6,8};  //{2,4};   //{4,5,6};
        System.out.println(twoArraysNthElement(arr1,arr2,3));
        
     }
}









