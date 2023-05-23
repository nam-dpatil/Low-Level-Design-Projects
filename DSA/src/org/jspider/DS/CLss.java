package org.jspider.DS;

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String str1="";
        int count=0;
       for(int j=0; j<S.length();j++)
       {
            String str="";
        for(int i=count; i<S.length(); i++)
        {
            if(S.charAt(i)=='.')
            {
                count++;
                str='.'+str;
                break;
            }
            if(S.charAt(i)!='.')
            {
                count++;
                str=str+S.charAt(i);
            }
           
        }
        str1=str+str1;
        if(S.length()==count-1)
        {
            break;
        }
        
       }
       return str1;
        
    }
}

public class CLss {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.reverseWords("namzy.comzy.mzy.aa"));
	}

}
