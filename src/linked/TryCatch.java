package linked;

public class TryCatch {
    public static void main(String[] args) {


        try{
            int num = 4/0;
        }catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}
