package Sorting;

public class Insertion {


    public void insertion(int arr[]){

        for (int out = 1; out < arr.length; out++) {

            int temp = arr[out];
            int in = out-1;

            while (in>=0 && arr[in]>temp) {
                arr[in+1] = arr[in];
                in=in-1;         
            }
            arr[in+1]=temp;

            // System.out.print("\nsorting step " + out +" " );
            // for (int i = 0; i < arr.length; i++) {
            //     System.out.print(arr[i]);
            // }
            
        }

        
    }
    
}
