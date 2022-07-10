import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int a[] = {2,32,4,5,6,3,54,3,4,32,456,7,87,6,45};
int even[] = new int[a.length];
int odd[] = new int[a.length];
int j=0;
int k=0;
int largestNumber = 0;
int secondlargest = 0;
for (int i=0; i< a.length; i++){
    if (largestNumber < a[i]){
        secondlargest=largestNumber;
        largestNumber = a[i];
    }
    else if (secondlargest<a[i]) {
        secondlargest=a[i];
    }
}
        System.out.println(largestNumber);
        System.out.println(secondlargest);
    }
}