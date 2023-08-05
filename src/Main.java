 public class Main {
            public static void main(String[] args) {
                System.out.println(checkGoOut(25, 10));
                System.out.println(checkGoOut(18, 15));
                System.out.println(checkGoOut(50, 20));
                System.out.println(checkGoOut(35, 35));
                System.out.println(checkGoOut(20, -5));
            }

            public static String checkGoOut(int age, int temperature) {
                if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30)
                        || (age < 20 && temperature >= 0 && temperature <= 28)
                        || (age > 45 && temperature >= -10 && temperature <= 25)) {
                    return "Можно идти гулять";
                } else {
                    return "Оставайтесь дома";
                }


            }
        }
