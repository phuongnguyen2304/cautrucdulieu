public class LinearSearch {
    // Hàm tìm kiếm tuyến tính
    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // trả về vị trí tìm thấy
            }
        }
        return -1; // không tìm thấy
    }

    public static void main(String[] args) {
        int[] array = {10, 97, 24, 29, 23};
        int target = 24;

        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Phần tử " + target + "được tìm thấy tại vị trí : " + result);
        }else {
            System.out.println("Không tìm thấy phần tử " + target + "trong mảng");
        }
    }

}
