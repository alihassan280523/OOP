package Labs.Week6.Tasks.Task1.Packages;

public class HashTag {
    
    private final String id;
    private String hashTagText;
    private int count;

    public HashTag(String id,String hashTagText,int count){
        this.id=id;
        this.hashTagText=hashTagText;
        this.count=count;
    }

    public void recordUse(){
        count++;
    }

    public void display(){
        System.out.println(id+" | "+hashTagText+" | "+count);
    }

}
