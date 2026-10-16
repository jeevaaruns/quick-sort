import java.util.Scanner;

public class Quicksort{
    
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int Partition(int[] arr , int low , int high){
        int pivot = arr[high];
        
        int i = (low - 1);
        
        for(int j = low ; j <= high - 1 ; j++ ){
            if(arr[j] < pivot){
                i++;
                swap(arr , i , j);
            }
            
        }
        
        swap(arr , i + 1 , high);
        return (i + 1);
    }
    
    static void quicksort(int[] arr , int low , int high){
        if(low < high){
            int pi = Partition(arr , low , high);
            quicksort(arr , low , pi - 1);
            quicksort(arr , pi + 1 , high );
        }
    }
    
    static void Printarray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number of elements : ");
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the Elements of your array : ");
        
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        
        quicksort(arr , 0 , n - 1);
        
        System.out.print("Sorted array : ");
        Printarray(arr);
    }
}