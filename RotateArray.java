class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 2;

        int n = a.length;
        k = k % n;

        reverse(a, 0, n - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);

        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    static void reverse(int[] a, int s, int e) {
        while (s < e) {
            int t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++;
            e--;
        }
    }
}
