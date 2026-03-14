interface Car {
    public void start();
}

class electricCar implements Car{
    public void start (){
        System.out.println("electric car starts ");
    }
}

class dieselCar implements Car{
    public void start (){
        System.out.println("diesel car starts");
    }
}

public class example {
    public static void main(String[] args) {
        Car tesla = new electricCar();
        Car xuv = new dieselCar();
        tesla.start();
        xuv.start();
    }
    
}
