package Sorting;

public class Bubble {
    //Bubble sort method
    public void BubbleSort(int arr[]){

        for(int o = arr.length;o>1;o--){        // Outer loop 

            for(int i=0;i<arr.length-i;i++){    // Inner loop

                if(arr[i]>arr[i+1]){            // Checking before index grater than next index

                    swap(arr, i);               // call swap method to swap indexes
                }
            }
        } 
    }

    //Swap method
    public void swap(int arr[],int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;

    }

    //Print method
    public void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(i+".Index - "+arr[i]);
        }
    }
    
    
}
