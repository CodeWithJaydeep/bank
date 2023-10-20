public class TryAndCatch {

    public static void main(String[] args) {

        int a = 1200;
        int b = 0;

//        Without Try
//        int c = a/b;
//        System.out.println(c);

//        With Try
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("We failed to drive .Reason:");
            System.out.println(e);
        }
        System.out.println("End of the Program");

    }
}
