## 🚫 Remove Duplicate Elements in a Sorted Array using Temporary Array

```java
public class RemoveDuplicateInArrayExample {
    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1];

        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 40, 50, 50};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);

        // Printing array elements
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

### 🧪 Output:
```
10 20 30 40 50
```

## Second Largest Element in an Array (Java)


```java
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 25};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest = " + secondLargest);
        }
    }
}
```

### 🧪 Output
```
Second Largest = 25
```



