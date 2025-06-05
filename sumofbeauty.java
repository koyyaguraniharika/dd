class Solution {
        public int beautySum(String s) {
            int count=0;//counts the sum of total beauty of all the substrings in a string
            for(int i=0;i<s.length();i++){//loop to start from every index of the string
             int freq[]=new int [26];//it will store the frequency of characters in every substring starting from a given index i
             for(int j=i;j<s.length();j++){//loop where j denotes the last index of all the different substrings starting from a given index i
              freq[s.charAt(j)-'a']++;//increasing the frequency of the current character
              int maxf=Integer.MIN_VALUE;//to store the frequency of the character occuring most number of times in the substring
              int minf=Integer.MAX_VALUE;//to store the frequency of the character occuring least number of times in the substring(but not 0)
              for(int f=0;f<26;f++){
                if(freq[f] > 0){
                  maxf=Math.max(maxf, freq[f]);
                  minf=Math.min(minf, freq[f]);
                }
              }
              count+=maxf-minf;
             }
            }
        return count;
    }
}
