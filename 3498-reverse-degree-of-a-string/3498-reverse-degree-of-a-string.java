class Solution {
    public int reverseDegree(String s) {

        int sum =0;
        for(int i = 0; i <= s.length()-1; i++ ){
            int position = 123 - s.charAt(i);
            int product = (i+1)*position;
            sum = sum + product;
        }
        return sum;
    }
}