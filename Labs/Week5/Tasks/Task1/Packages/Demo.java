package Labs.Week5.Tasks.Task1.Packages;

public class Demo {
    
    private final String userName;
    private String displayName;
    private String bio;
    private int[] postLikes;
    private boolean isPrivate;
    private static int acctCount;

    public Demo(String userName,String displayName,String bio,int[] postLikes,boolean val){
        this.userName=userName;
        this.displayName=displayName;
        this.bio=bio;
        this.postLikes=postLikes;
        this.isPrivate=val;
        Demo.acctCount=1;
    }

}
