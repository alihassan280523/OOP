package Packages;
import java.util.ArrayList;

public class Competition {
    private String competitionId;
    private String title;
    private String venue;
    private String startTime;
    private ArrayList<Participant> participantList;
    private int size;

    public Competition(String id,String title,String venue,String time,int size){
        this.competitionId=id;
        this.title=title;
        this.venue=venue;
        this.startTime=time;
        this.size=size;
        this.participantList=new ArrayList<>(1);
    }

    public void addParticipant(Participant obj){
        participantList.add(obj);
        obj.registerCompetition(this);
    }

    public void getParticipants(){
        for(int i=0;i<participantList.size();i++){
            System.out.println(participantList.get(i).getName());
        }
    }

    public String getTitle(){
        return title;
    }
}
