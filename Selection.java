package Sorting;

public class Selection {
    public static void main(String[] args) {

        int arr[]={5,1,6,7,2,8};

        selection(arr);

        print(arr);
   
    }

    public static void selection(int arr[]){
        int in,out,min;

        for(out = 0;out<arr.length;out++){
            min = out;
            for(in=1;in<arr.length;in++){

                if(arr[in]<arr[min]){
                    min = in;
                    
                    int temp = arr[out];
                    arr[out] = arr[min];
                    arr[min] = temp;
                }  
            } 
        }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(i+".Index - "+arr[i]);
        }
    }
}
