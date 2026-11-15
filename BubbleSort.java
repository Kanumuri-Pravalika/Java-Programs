public class BubbleSort {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 13, 12, 15, 25, 23 };
        System.out.println("Elements Before Sorting");
        for (int i : a) {
            System.out.print(i + "\t");
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
        System.out.println("Elements After Sorting");
        for (int i : a) {
            System.out.print(i + "\t");
        }
    }
}