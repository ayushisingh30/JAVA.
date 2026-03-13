
public class example3 {
    int modelYear;
    String modelName;

    public example3(int year,String name){
        modelYear = year ;
        modelName = name;
    }

    public static void main(String[] args) {
        example3 myCar = new example3(1969,"mustang");
        System.out.println(myCar.modelYear+" "+myCar.modelName);
    }
    
}
