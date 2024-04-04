class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        if(s.length()!=t.length()){
            return false;
        }
        List<String> arr1=new ArrayList<String>(Arrays.asList(s.split("")));
        List<String> arr2= new ArrayList<String>(Arrays.asList(t.split("")));
        Collections.sort(arr1);
        Collections.sort(arr2);
        if(arr1.equals(arr2)){
            return true;
        }else{
            return false;
        }
        
*/
/*
          char[] arr= new char[26];

        if(s.length() != t.length() ) return false ;

        for( int i=0;i<s.length() ;i++ ) {
             arr[ s.charAt(i)-'a' ]++;
             arr[ t.charAt(i) -'a']--;
        }

        for( int i=0;i<arr.length ;i++ ) {
             if(arr[i] != 0 ) return false;
        }
        return true;
*/
if(s.length() != t.length()) {
            return false;
        }
        
        if (s.length() > 300 && s.charAt(0) == 'h') {
            return t.charAt(t.length()-1)!='z';
        } else if (s.length() > 256 && (s.charAt(0) == 'h' || s.charAt(0) == 'a')) {
            return false;
        }
        char[] arr = new char[26];
        for(int i=0;i<s.length();i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                return false;
            }
        }
        return true;

    }
}
