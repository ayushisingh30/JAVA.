public class nested_if_age {
    public static void main(String[] args) {
        int age= 20;
        boolean isCitizen = true;

        if (age>=18){
            System.out.println("old enough to vote");

            if (isCitizen){
                System.out.println("and you are a citizen,so you can vote");
            }else{
                System.out.println("but you must be a citizen to vote");
            }
        }else{
            System.out.println("not old enough to vote");
        }
    }
}
