package comp.comp152;

public class Summing {
    public static void main(String[] args) {
        int n = 5;
        int answer = sumRecursive(n);
        System.out.println(answer);
    }

    public static int sumRecursive(int n) {
        if (n < 2)
            return n;
        else
            return n + sumRecursive(n-1);
    }
}
