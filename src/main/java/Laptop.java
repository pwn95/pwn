public class Laptop {
    String laptopName;
    int laptopPrice;
    String laptopRam;

    public void Name(String modelName){
        this.laptopName=modelName;
        System.out.println(modelName);
    }
    public void Price(int modelPrice){
        this.laptopPrice=modelPrice;
        System.out.println(modelPrice);
    }
}
