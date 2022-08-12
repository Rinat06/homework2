public class Main {
    public static void main(String[] args) {
        System.out.println(home(23,22));
        System.out.println(home(33,22));
        System.out.println(home(53,22));
        System.out.println(home(13,22));

    }
        public static String home (int age , int temperature){

            String home1 = "Можно идти гулять";
            String home2 = ("Оставайтесь дома");

            if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 35){
                return home1;
            }else if (age < 20 && temperature >= 0 && temperature <= 28 ){
                return home1;
            }else if (age > 45 && temperature >= -10 && temperature <= 25){
                return home1;
            }else
                return home2;

        }
}