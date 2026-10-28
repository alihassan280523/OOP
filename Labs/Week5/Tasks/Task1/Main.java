package Labs.Week5.Tasks.Task1;
import Labs.Week5.Tasks.Task1.Packages.*;

public class Main {
    public static void main(String[] args) {
        
        Demo[] instaUser=new Demo[2];

        instaUser[0]=new Demo("@Sara.cs","Sara","XYZ",new int[]{40,60,80},true);
        instaUser[1]=new Demo("@Areeba.tech","Areeba","Tech Creator",new int[]{20,30,40},true);

        System.out.println("\n"+Demo.getAcctCount());
        System.out.println(instaUser[0].toString());
        
        Demo instaAlias=instaUser[0];
        
        System.out.println(Demo.getAcctCount());
        
        
        instaAlias.setBio("Daily Coding ");
        
        System.out.println(instaUser[0].toString());

        instaUser[0].updatePostLikes(2,-10 );
        

        HashTag hashTag=new HashTag("101", "#ComputerScience", 5);
        System.out.println("\nHASTAG:\n");
        System.out.println(hashTag.toString());
        hashTag.recordUse();
        System.out.println(hashTag.toString());
    }
}
