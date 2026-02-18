public class RomanToInt {

    public static int roman(char ch) {
        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
        return 0;
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int counter = 0;
        for(int i=0; i<s.length(); i++) {
            if(i+1 < s.length() && roman(s.charAt(i)) < roman(s.charAt(i+1))){
                sum += (roman(s.charAt(i+1))-roman(s.charAt(i)));
                i++;
            } else {
                if( s.charAt(i-1) == 'I' && counter < 3 ) {
                    sum += roman(s.charAt(i));
                }
            }
        }
        return sum;
    }

    public static void main(String [] args) {
        String str = "MCMXCIV";
        System.out.println(romanToInt(str));
        str = "LVIII";
        System.out.println(romanToInt(str));
        str = "IIII";
        System.out.println(romanToInt(str));
    }
}