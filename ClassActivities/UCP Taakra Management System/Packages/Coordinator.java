package Packages;

import java.util.ArrayList;

public class Coordinator {
    private String name;
    private String contact;
    private ArrayList<Competition> competitionList;

    public Coordinator(String name,String contact){
        this.name=name;
        this.contact=contact;
        competitionList=new ArrayList<>(1);
    }

    public void addCompetition(Competition obj){
        if(competitionList.contains(obj)){
            System.out.println("Competition exists already");
        }
        else{

            competitionList.add(obj);
            obj.addCoordinator(this);
        }
    }

    public String getName(){
        return name;
    }

    public void showCompetitions(){

        for(int i=0;i<competitionList.size();i++){
            System.out.println(competitionList.get(i).getTitle());
        }
    }

}
