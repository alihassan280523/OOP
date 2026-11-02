package Labs.Week6.Tasks.Task1;
import Labs.Week6.Tasks.Task1.Packages.*;

public class Main {
    
    public static void main(String[] args) {
        
        InstaAccount sara=new InstaAccount("@sara.cs","Sara","Software Engineer",new int[] {40,60,80},true);
        InstaAccount areeba=new InstaAccount("@areeba.tech","Areeba","Data Scientist",new int[] {20,30,40},true);


        sara.display();
        areeba.display();


        System.out.println("\n"+sara.getMoreEngaging(areeba).getUserName()+" is more engaging");
        sara.setBio("Tech creator");

        areeba.updatePostLikes(2, -12);


        InstaAccount copy1=new InstaAccount(sara);
        InstaAccount copy2=new InstaAccount(sara,true);

        sara.updatePostLikes(0, 100);

        System.out.println("\nSara avg post likes: "+sara.calculateAverageLikes());
        System.out.println("shallow copy avg likes: "+copy1.calculateAverageLikes());
        System.out.println("Deep copy avg likes: "+copy2.calculateAverageLikes());

        
        System.out.println("Instagram Users: "+InstaAccount.getAccountCount());

        HashTag hashtag=new HashTag("H-01", "#CampusLife", 5);
        hashtag.display();
        hashtag.recordUse();
        hashtag.display();
    }
}
