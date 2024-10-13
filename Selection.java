package Sorting;

public class Selection {

    public void selection(int arr[]){
        
        int in,out,min;

        for(out = 0;out<arr.length;out++){

            min = out;

            for(in=arr.length-1;in>out;in--){
                

                if(arr[in]<arr[min]){
                    min = in;
                }  
            }
            swap(out, min, arr); 
        }
    }

    public void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(i+".Index - "+arr[i]);
        }
    }

    public void swap(int x,int y,int[]arr){
        int temp;

        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
