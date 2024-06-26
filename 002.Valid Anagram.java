class Solution {
    public boolean isAnagram(String s, String t) {
        Scanner scan=new Scanner(System.in);
        char[] sarr=s.toCharArray();
        Arrays.sort(sarr);
        String news=new String(sarr);

        char[] tarr=t.toCharArray();
        Arrays.sort(tarr);
        String newt=new String(tarr);

        if(news.equals(newt)){
            return true;
        }
        return false;
                
    }
}
