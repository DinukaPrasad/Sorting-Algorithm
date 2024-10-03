package Sorting;

public class Bubble {
    public static void main(String[] args){

        int arr[] = {2,1,4,7,3,9};

        System.out.println("before Sorting array\n");

        print(arr);  //call print method to print Unsorted array;

        System.out.println("\n");

        try {

            BubbleSort(arr); 

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Bubble sort method
    public static void BubbleSort(int arr[]){

        for(int o = arr.length;o>1;o--){        // Outer loop 

            for(int i=0;i<arr.length-i;i++){    // Inner loop

                if(arr[i]>arr[i+1]){            // Checking before index grater than next index

                    swap(arr, i);               // call swap method to swap indexes
                }
            }
        }


        System.out.println("After Sorting\n");
        print(arr);                          // call print method to print sorted array
    }

    //Swap method
    public static void swap(int arr[],int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;

    }

    //Print method
    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(i+".Index - "+arr[i]);
        }
    }
    
    
}
