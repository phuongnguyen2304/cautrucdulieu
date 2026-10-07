public class BubbleSort {
    // Hàm sắp xếp nổi bọt
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // cờ kiểm tra nếu không có hoán đổi nào thì dừng sớm
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++ ) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                }
            }
            // nếu không có hoán đổi nào , mảng đã được sắp xếp
            if (!swapped) break;
        }
    }
    // Hàm in mảng
    public static void printArray(int[] arr) {
        for (int num : arr ) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {23, 27, 29, 97, 14, 17};
        System.out.println("Mảng ban đầu: ");
        printArray(array);

        bubbleSort(array);

        System.out.println("Mảng sau khi sắp xếp: ");
        printArray(array);
    }

}
