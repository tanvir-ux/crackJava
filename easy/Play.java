import java.util.ArrayList;
import java.util.Arrays;

class Play {
    public static void main(String[] args) {
        System.out.println(isPermutation("eat", "tea"));
        
    }

    public static boolean isPermutation(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }
    public static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public static boolean isUniqueCh(String str) {
        if (str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
        // time O(n), where n is the length of the string and spaace O(1)
    }
    
    public static boolean isPrime(int n) {
        for(int x = 2; x * x <= n ; x++) {
            if(n % x == 0) return false;
        }
        return true;
        //O(sqrt(n))
    }

    public static int factorial(int n) {
        if(n < 0) return -1;
        else if(n == 0) return 1;
        else return n * factorial(n - 1);
        // O(n)
    }

    public static void reverse(int[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            int last = array.length - i - 1;
            int temp = array[i];
            array[i] = array[last];
            array[last] = temp;           
        }
        // O(n)        
    }

    public static int sqrt(int n) {
        return sqrtHelper(n,1,n);
    }
    public static int sqrtHelper(int n, int min, int max) {
        if(max < min) return -1;// no square root
        int guess = (min + max) / 2;
        if(guess*guess == n) return guess;
        else if (guess * guess < n) {
            return sqrtHelper(n, guess + 1, max);
        }
        else {
            return sqrtHelper(n, min, guess - 1);
        }
    }


    public static ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for(String w: words) sentence.add(w);
        for(String w: more)  sentence.add(w);
        return sentence;
    }

    



}//end of class

