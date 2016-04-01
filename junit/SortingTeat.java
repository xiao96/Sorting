import static org.junit.Assert.*;

 

import org.junit.Test;

 

public class SortingTeat {

 

       @SuppressWarnings("static-access")

       @Test

       public void test() {

              int [] a = {1,2,3};

              int j =  1;

              int index1= 0;

              int index2=1;

              Object[ ] m = {2,1,3};

              

              int left=0;

              int right=2;

                     Sorting result = new Sorting();

                     result.insertionSort(a);

                     assertEquals(true,result.isSorted(a));

                     

                     result.quicksort(a);

                     result.swap(a, index1, index2);

                     result.swapReferences(m, index1, index1);

       

              result.median3(a,left,right);

            assertEquals(a,result.median3(a, index1, index2));

       

       }

       

 

       @SuppressWarnings("static-access")

       @Test

       public void test1() {

              int [] a = {4,3,5,7,9};

              int j =  1;

              int index1= 0;

              int index2=1;

              Object[ ] m = {3,4,5,7,9};

       

              int left=0;

              int right=2;

                     Sorting result = new Sorting();

                     result.insertionSort(a);

                     assertEquals(true,result.isSorted(a));

                     

                     result.quicksort(a);

                     result.swap(a, index1, index2);

                     result.swapReferences(m, index1, index1);

       

                result.median3(a,left,right);

            assertEquals(a,result.median3(a, index1, index2));

       

       }

 

 

}

 

 
