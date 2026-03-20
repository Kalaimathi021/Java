import java.util.*;

class Frequency {
    int arr[];
    int n;

    Frequency(int n, int arr[]) {
        this.n = n;
        this.arr = arr;
    }

    void findFrequency() {

        for (int i = 0; i < n; i++) {

            int count = 1;
            boolean visited = false;

            // check if element already counted
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    visited = true;
                    break;
                }
            }

            if (visited)
                continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + "-" + count);
        }
    }
}

public class FrequencyMain {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Frequency obj = new Frequency(n, arr); // object creation
        obj.findFrequency();                   // method call
    }
}