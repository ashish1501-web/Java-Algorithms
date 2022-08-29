package Recursion;

import java.util.HashSet;

public class subsequences {
    public static void subsequence(String str,int idx,String newString,HashSet<String> set)
    {
        if(idx==str.length())
        {   if(set.contains(newString)){
                return;
            }
            else
            {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currchar=str.charAt(idx);
        //we have two choices for next level yes or no
        //include
        subsequence(str,idx+1,newString+currchar,set);
        //don't
        subsequence(str,idx+1,newString,set);
    }
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        subsequence("aca",0,"",set);

    }
}
