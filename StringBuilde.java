import java.lang.*;
//import java.util.concurrent.LinkedBlockingQueue;
public class StringBuilde{

    public static void main(String[] args){

        StringBuilder sb=new StringBuilder("Ashish");

        System.out.println(sb);
        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'t');
        System.out.println(sb);
        //To insert an element
        sb.insert(1,'a');
        System.out.println(sb);
        //to delete an element
        sb.delete(1,3);
        //Append at last insert
        System.out.println(sb);
        sb.append("harakuni");

        System.out.println(sb);
        System.out.println(sb.length());

    }
}
