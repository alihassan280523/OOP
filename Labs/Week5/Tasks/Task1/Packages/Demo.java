package Labs.Week5.Tasks.Task1.Packages;

public class Demo {
    
    private final String userName;
    private String displayName;
    private String bio;
    private int[] postLikes;
    private boolean isPrivate;
    private static int acctCount=0;

    public Demo(String userName,String displayName,String bio,int[] postLikes,boolean val){
        this.userName=userName;
        this.displayName=displayName;
        this.bio=bio;
        this.postLikes=postLikes;
        this.isPrivate=val;
        Demo.acctCount++;
    }

    public String getUserName(){
        return userName;
    }

    public String getBio(){
        return bio;
    }

    public void setBio(String bio){
        this.bio=bio;
    }

    public void setPrivate(){
        this.isPrivate=true;
    }

    public void setPublic(){
        this.isPrivate=false;
    }

    public void updatePostLikes(int index,int likes){

        if(index<0||index>2){
            System.out.println("Index out of bound");
        }
        else if(likes<=0){
            System.out.println("Likes value is invalid");
        }
        else{

            postLikes[index]=likes;
        }
    }

    public double calculateAverageLikes(){

        double sum=0;
        for(int i:postLikes){
            sum+=i;
        }

        return (sum/3.0);
    }


    public static int getAcctCount(){
        return Demo.acctCount;
    }

    @Override 
    public String toString(){
        return(
          "\nName: "+displayName+
          "\nBio: "+bio+
          "\nStatus: "+((isPrivate)? "Private":"Public")
        );
    }
    

}
