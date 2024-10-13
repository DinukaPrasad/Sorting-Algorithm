package Sorting;

public class Insertion {

    Insertion (int arr[]){

        for (int out = 1; out < arr.length; out++) {

            int temp = arr[out];
            int in = out-1;

            while (in>=0 && arr[in]>temp) {
                arr[in+1] = arr[in];
                in--;        
            }
            arr[in+1]=temp;
        }   
    }
}

