class Solution {
    public String intToRoman(int num) {

        StringBuilder ans=new StringBuilder();
        List<String> sy=List.of("M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I");

        List<Integer> number=List.of(1000,900,500,400,100,90,50,40,10,9,5,4,1);

        for(int i=0;i<sy.size();i++){

            while(num>=number.get(i)){
                num-=number.get(i);
                ans.append(sy.get(i));
            }

        }
        return ans.toString();
    }
}
