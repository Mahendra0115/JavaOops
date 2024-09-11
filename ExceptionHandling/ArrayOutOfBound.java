 import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
    try{
        int arr[] = {4,6,7,5,3};
        int number = arr[6];
        System.out.println(number);
    }catch(ArrayIndexOutOfBoundsException aie){
        System.out.println(aie);
    }
       System.out.println("array are executed: ");
    }
}


