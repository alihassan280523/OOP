package Packages;

public class Participants {
    private GameCategory category;
    private RegistrationCard card;
    private String id;
    private String playerName;
    private int age;
    private boolean status;
    private int[] practiceScores;

    public Participants(String id,String name){
        this.id=id;
        this.playerName=name;
        this.category=null;
        this.card=new RegistrationCard();
        this.practiceScores=new int[3];
        this.practiceScores[0]=70;
        this.status=false;
    }

    public Participants(Participants otherParticipant,boolean deep){
        if(deep){

            this.category=otherParticipant.category;
            this.card=new RegistrationCard();
            this.card.setStatus(otherParticipant.getStatus());
            this.id=otherParticipant.id;
            this.playerName=otherParticipant.playerName;
            this.age=otherParticipant.age;
            this.practiceScores=new int[3];
            for(int i=0;i<3;i++){
                this.practiceScores[i]=otherParticipant.practiceScores[i];
            }
            this.status=otherParticipant.status;
        }
        else{
            this.category=otherParticipant.category;
            this.card=new RegistrationCard();
            this.card.setStatus(otherParticipant.getStatus());
            this.id=otherParticipant.id;
            this.playerName=otherParticipant.playerName;
            this.age=otherParticipant.age;
            this.practiceScores=otherParticipant.practiceScores;
            this.status=otherParticipant.status;

        }
    }

    public String getCardStatus(){
        return "Registration Card for "+playerName+": "+(card.getStatus()? "Confirmed":"Pending");
    }

    public void setCardStatus(boolean value){
        card.setStatus(value);
    }

    public void setCategory(GameCategory category){
        if(status){
            System.out.println("Category can not be changed");
            return;
        }

        this.category=category;
        System.out.println("Category changed to "+category.getCategoryName());
    }

    public void setPracticeScore(int index,int score){
        if(index<0||index>3){
            System.out.println("\nIndex out of bound");
            return;
        }

        practiceScores[index]=score;
        System.out.println("\nScore updated sucessfully\n");
    }

    public boolean getStatus(){
        return status;
    }

    public void setAge(int age){
        if(age<16){
            System.out.println("player should be 16 or older");
        }
        else if(status){
            System.out.println("Registration is confirmed can not change age now");
        }
        else{
            this.age=age;
        }
    }

    public double getRegistartionFee(){
        return category.getCategoryFee();
    }

    public void makePayment(double amt){
        if(age<16){
            System.out.println("Player should be 16 or older");
        }
        else if(amt<category.getCategoryFee()){
            System.out.println("Insufficient funds");
        }
        else if(amt<0){
            System.out.println("Invalid amount");
        }
        else{
            System.out.println("Payment Made,check status to confirm");
            status=true;
        }
        
    }

    public int getPracticeScore(int index){
        return practiceScores[index];
    }

    public void displayInfo(){
        System.out.println("ID: "+id+" | Name: "+playerName+" | Age: "+age);
        System.out.println("Game: "+category.getCategoryName()+" | Fee: "+category.getCategoryFee()+" | Status: "+(status? "Confirmed":"Pending"));
    }


}
