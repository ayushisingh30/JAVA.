class Bank {
    void RateOfInterest() {
        System.out.println("rate of interest of bank is 5%");
    }
}

class SBI extends Bank {
    @Override
    void RateOfInterest() {
        System.out.println("rate of interest of SBI is 6%");
    }
}

class PNB extends Bank {
    @Override
    void RateOfInterest() {
        System.out.println("rate of interest of PNB is 5.5%");
    }
}

public class Main1{
    public static void main(String[] args) {

        Bank obj = new Bank();
        PNB obj1 = new PNB();
        SBI obj2 = new SBI();

        obj.RateOfInterest();
        obj1.RateOfInterest();
        obj2.RateOfInterest();
    }
}