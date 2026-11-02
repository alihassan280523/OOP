package Labs.Week6.Tasks.Task1.Packages;

public class InstaAccount {
    
    private final String userName;
    private String displayName;
    private String bio;
    private int[] recentLikes; 
    private boolean isPrivate;
    private static int accountCount=0;

    public InstaAccount(String userName,String displayName,String bio,int[] likes,boolean val){
        this.userName=userName;
        this.displayName=displayName;
        this.bio=bio;
        this.recentLikes=likes;
        this.isPrivate=val;
        InstaAccount.accountCount++;
    }

    public InstaAccount(InstaAccount otherAccount){

        this.userName=otherAccount.userName;
        this.displayName=otherAccount.displayName;
        this.bio=otherAccount.bio;
        this.recentLikes=otherAccount.recentLikes;
        this.isPrivate=otherAccount.isPrivate;
        InstaAccount.accountCount++;
    }

    public InstaAccount(InstaAccount otherAccount,boolean deep){

        this.userName=otherAccount.userName;
        this.displayName=otherAccount.displayName;
        this.bio=otherAccount.bio;
        this.recentLikes=new int[3];

        for(int i=0;i<3;i++){
            this.recentLikes[i]=otherAccount.recentLikes[i];
        }

        this.isPrivate=otherAccount.isPrivate;
        InstaAccount.accountCount++;
    }

    public void setBio(String bio){
        if(bio!=null){
            this.bio=bio;
        }
        else{
            System.out.println("\nBio Should contain something");
        }

    }

    public void setPrivate(boolean val){
        if(isPrivate){
            System.out.println("\nProfile already private");
        }
        else{
            isPrivate=val;
        }
    }

    public void updatePostLikes(int index,int likes){
        if(index<0||index>2){
            System.out.println("Index out of bound");
        }
        else if(likes<=0){
            System.out.println("\nInvlid likes");
        }
        else{
            recentLikes[index]=likes;
        }
    }

    public double calculateAverageLikes(){
        double total=0;

        for(int i:recentLikes){
            total+=i;
        }

        return (total/3);
    }


    public void copyBioFrom(InstaAccount otherAccount){
        this.bio=otherAccount.bio;
    }

    public static int getAccountCount(){
        return InstaAccount.accountCount;
    } 

    public InstaAccount getMoreEngaging(InstaAccount otherAccount){
        if(this.calculateAverageLikes()>otherAccount.calculateAverageLikes()){
            return this;
        }
        else{
            return otherAccount;
        }
    }

    public void display(){
        System.out.println("\nUser Name: "+userName);
        System.out.println("Display Name: "+displayName);
        System.out.println("Bio: "+bio);
        System.out.println("Avg Likes: "+calculateAverageLikes());
        System.out.println("Profile: "+(isPrivate? "Private":"Public"));
    }

    public String getUserName(){
        return userName;
    }

}
