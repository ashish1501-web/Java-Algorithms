package Recursion;

public class keypad {
    public static String[] keypad={"","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombinations(String str,int idx,String combinations)
    {
        if(idx==str.length())
        {
            System.out.println(combinations);
            return;
        }
        char c=str.charAt(idx);
        String currstr=keypad[c-'0'];

        for(int i=0;i<currstr.length();i++) {
            printCombinations(str, idx + 1, combinations+currstr.charAt(i));
        }
    }

    public static void main(String[] args) {
        float a=(float)10/3;
        System.out.println(a);
        printCombinations("23",0,"");
    }
}
