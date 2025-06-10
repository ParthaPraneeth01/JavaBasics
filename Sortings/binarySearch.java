import java.util.*;
public class Main {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int scrh = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == scrh) {
                System.out.println("Element found at: " + mid);
                System.exit(0);
            }
            if(arr[mid] > scrh) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println("Element Not Found");
    }
}
