package Labs.Week5.Tasks.Task1.Packages;

public class HashTag {
    private final String code;
    private String text;
    private int count;

    public HashTag(String code,String text,int count){
        this.code=code;
        this.text=text;
        this.count=count;
    }

    public void recordUse(){
        count++;
    }

    @Override 
    public String toString(){
        return (
            "\nHashTag: "+text+
            "\nUse Count: "+count
        );
    }
}
