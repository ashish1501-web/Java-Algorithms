package Recursion;
import java.lang.*;
public class Remove_strings_duplicates {
    public static boolean arr[]=new boolean[27];

    public static void removeDuplicates(String str,int idx,String newString)
    {
        if(idx==str.length()) {
            System.out.println(newString);
        }
        if(arr[str.charAt(idx)-'a']==true)
        {
            removeDuplicates(str,idx+1,newString);
        }
        else{
            newString+=str.charAt(idx);
            arr[str.charAt(idx)-'a']=true;
            removeDuplicates(str,idx+1,newString);
        }
    }

    public static void main(String[] args) {
        removeDuplicates("abbccdcccb",0,"");
    }
}
