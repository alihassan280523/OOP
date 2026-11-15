import Packages.*;

public class Main{
    public static void main(String[] args) {
        GameCategory racing=new GameCategory("Racing", 500);
        GameCategory football=new GameCategory("Football", 700);
        GameCategory battleRoyale=new GameCategory("Battle Royale", 1000);

        ESportsTournament list=new ESportsTournament();

        Participants part1=new Participants("401", "PixelAce");
        part1.setAge(18);
        part1.setCategory(racing);

        System.out.println("\nBefore adding participant, list size is: "+list.getSize());
        list.addParticipant(part1);
        
        System.out.println("\nAfter adding participant, list size is: "+list.getSize());
        part1.displayInfo();

        part1.setCategory(football);
        System.out.println(part1.getRegistartionFee());
        part1.makePayment(700);
        part1.setCardStatus(true);
        part1.setCategory(racing);

        part1.displayInfo();


        System.out.println(part1.getCardStatus());

        Participants shallowCopyPart1=new Participants(part1,false);//SHALLOW
        Participants deepCopyPart1=new Participants(part1,true);//DEEP

        part1.setPracticeScore(0, 95);

        System.out.println("Original Object score at index 0: "+part1.getPracticeScore(0));
        System.out.println("Shallow copy Object score at index 0: "+shallowCopyPart1.getPracticeScore(0));
        System.out.println("Deep copy Object score at index 0: "+deepCopyPart1.getPracticeScore(0));

        //DELETING LIST DOES NOT DELETE THE PARTICIPANT RECORD 
        // list=null;
        // part1.displayInfo();
    }
}