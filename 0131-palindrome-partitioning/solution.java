class Solution {
    public List<List<String>> partition(String s) {
List<List<String>> ans=new ArrayList<>();
List<String> p=new ArrayList<>();
 part(0,s,p,ans);
 return ans;
        
    }

    public void part(int ind,String s, List<String> p, List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(p));
            return;
        }
        for(int i=ind; i<s.length(); ++i){
            if(isPalindrom(s,ind,i)){
                p.add(s.substring(ind,i+1));
                part(i+1,s,p,ans);
                p.remove(p.size()-1);
            }
        }
    }

    public boolean isPalindrom(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
               return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
