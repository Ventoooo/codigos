public class Produto{
    private int code;
    private String name;
    private String description;
    private double price;

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getCode(){
        return code;
    }
    public void setCode(int code){
        this.code = code;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){this.description = description;
    }

    public Produto(String name, double price){
        this.name= name;
        this.price = price;
    }
}
