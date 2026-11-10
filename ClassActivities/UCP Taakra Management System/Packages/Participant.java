package Packages;
import java.util.ArrayList;

public class Participant {
    private String registrationId;
    private String name;
    private String university;
    private String contact;
    private ArrayList<Competition> competitionList;

    public Participant(String id,String name,String uni,String phone){
        this.registrationId=id;
        this.name=name;
        this.university=uni;
        this.contact=phone;
        this.competitionList=new ArrayList<>(1);
    }

    public String getName(){
        return name;
    }

    public void showRegisteredCompetitions(){
        for(int i=0;i<competitionList.size();i++){
            System.out.println(competitionList.get(i).getTitle());
        }
    }

    public void registerCompetition(Competition obj){
        competitionList.add(obj);
    }
}
