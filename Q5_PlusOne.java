public class Q5_PlusOne {

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int num[] = new int[digits.length+1];
        num[0] = 1;
        return num;
    }

    public static void main(String[] args) {
        int digits[] = {1,2,3};
        int num[] = plusOne(digits);
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
}
