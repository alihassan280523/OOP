package Packages;

public class ViewingRecord {
    private final String id;
    private String title;
    private int duration;
    private int progress;

    public ViewingRecord(String id,String title,int duration){
        this.id=id;
        this.title=title;
        this.duration=duration;
        this.progress=0;
    }

    public int remainingMinutes(){
        return (duration-progress);
    }

    public void setProgress(int value){
        if(value<0||value>duration){
            System.out.println("\nInvalid value entered\n");
            return;
        }

        progress=value;
        System.out.println("\nProgress updated successfully\n");
    }

    public String getId(){
        return this.id;
    }

    public void displayDetails(){
        System.out.println("\n"+id+" | "+title+" | "+duration+" | "+progress+"\n");
    }

    
}
