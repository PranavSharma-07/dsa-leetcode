class Solution {
    public int fib(int n) {

        if(n  == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        int fn1 = fib(n-1);
        int fn2 = fib(n-2);
        return fn1+fn2;
        
    }
}