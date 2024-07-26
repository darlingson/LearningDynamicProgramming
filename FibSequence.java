import java.util.HashMap;

public class FibSequence {
    public static void main(String[] args) {
        int n = 10;
        int result = fib(n);
        System.out.println(result);
    }

    public static int fib(int n) {
        return fib(n,new HashMap<>());
    }
    public static int fib(int n,HashMap<Integer,Integer> memo) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        // memo.put(n,fib(n - 1,memo) + fib(n - 2,memo)); 

        int result =  fib(n - 1,memo) + fib(n - 2,memo);
        memo.put(n,result);
        return result;
    } 
}
