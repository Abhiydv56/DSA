class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr=word1.toCharArray();
        char[] arr2=word2.toCharArray();
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(i<arr.length && j<arr2.length){
             sb.append(arr[i]);
             i++;
             sb.append(arr2[j]);
             j++;
        }
        if(i==arr.length && j!=arr2.length){
            while(j<arr2.length){
                sb.append(arr2[j]);
                j++;
            }
        } else if(j==arr2.length && i!=arr.length){
            while(i<arr.length){
                sb.append(arr[i]);
                i++;
            }
        }
        String st=sb.toString();
    return st;
    } 
}