import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap do dai cua mang: ");
        int size = input.nextInt();
        int myArray[]= new int[size];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Them phan tu vao mang:");
            myArray[i]= input.nextInt();
        }
        int result= findMin(myArray);
        System.out.println("Phan tu gia tri nho nhat trong mang la :" + result);
    }
    static int findMin(int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}
