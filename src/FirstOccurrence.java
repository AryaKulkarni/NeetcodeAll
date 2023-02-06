public class FirstOccurrence {
    public static int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++) {
            if(needle.equals("")) {
                return 0;
            }
            if(haystack.startsWith(needle,i)) {
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println(strStr("sadbutsad","sad"));
    }
}
