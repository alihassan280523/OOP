package Packages;

public class GameCategory {
    private String categoryName;
    private double fee;

    public GameCategory(String name,double fee){
        this.categoryName=name;
        this.fee=fee;
    }

    public String getCategoryName(){
        return categoryName;
    }

    public double getCategoryFee(){
        return fee;
    }

    public void displayInfo(){
        System.out.println(categoryName+" | "+fee);
    }
}
