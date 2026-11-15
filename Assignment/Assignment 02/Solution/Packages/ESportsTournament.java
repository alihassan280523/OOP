package Packages;
import java.util.ArrayList;

public class ESportsTournament {
    private ArrayList<Participants> participantList;

    public ESportsTournament(){
        participantList=new ArrayList<>();
    }

    public void addParticipant(Participants participant){
        participantList.add(participant);
        System.out.println("\nParticipant added successfully to the list!!");
    }

    public int getSize(){
        return participantList.size();
    }
}
