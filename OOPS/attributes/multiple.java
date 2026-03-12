public class multiple {
    int x = 6;
     
    public static void main(String[] args) {
        multiple myObj1 = new multiple();
        multiple myObj2 = new multiple();
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
    
}
