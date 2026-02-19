public class Q2LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        // just return first element if size is 1.
        if(len == 1) {
            return strs[0];
        }
        // find index of smallest string
        int idx_min = 0;
        for(int i=0; i < len; i++) {
            if(strs[i].length() < strs[idx_min].length()) {
                idx_min = i;
            }
        }
        // compare a letter from word with all strings from array, then move to next
        // repeat until no match is found.
        String word = strs[idx_min];
        int i=0, j=0; // for indexing
        while(true) { // keep running
            if(i < strs.length && j < word.length()){ // prevent index overflow issue
                if(word.charAt(j) != strs[i].charAt(j)) { // break when letters don't match.
                    break;
                }
                i++; // move to next word for comparision
            } else { // in case overflow happens, this statement will run
                i = 0; // reseting start point
                if(j == word.length()) { // if word length reached simply break loop
                    break;
                }
                j++; // move to next letter in the word to compare.
            }
        }
        // return prefix string
        return word.substring(0, j);
    }

    public static void main(String [] args) {
        String[] strs = {"flower","flow","flight"};
        String[] strs1 = {"dog","racecar","car"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
        String res1 = longestCommonPrefix(strs1);
        System.out.println(res1);
    }
}