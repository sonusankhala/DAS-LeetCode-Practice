class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int m=0;
       List<Character> arr=new ArrayList<>();
       arr.add('a');
        arr.add('e');
         arr.add('i');
          arr.add('o');
           arr.add('u');
            arr.add('A');
        arr.add('E');
         arr.add('I');
          arr.add('O');
           arr.add('U');

           char [] sc=s.toCharArray();

        while(m<n){
            while (m < n-1 && !arr.contains(sc[m])) {
                m++;
            }

            while (m < n-1 && !arr.contains(sc[n-1])) {
                n--;
            }

            char temp = sc[m];
            sc[m] = sc[n-1];
            sc[n-1] = temp;

            m++;
            n--;
        }

        String str=new String(sc);

        return str;
        
    }
}
