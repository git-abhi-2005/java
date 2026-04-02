public class nine {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String s = String.valueOf(x);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        nine obj = new nine();

        int x = 121;
        boolean result = obj.isPalindrome(x);

        System.out.println(result);
    }
}