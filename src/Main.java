public class Main {
    public static void main(String[] args) {
        System.out.println("Задание1");
        int age = 18;
        if (age >= 18) {
            System.out.println("«Если возраст человека равен " + age + " то он совершеннолетний».");

        } else {

            System.out.println(" «Если возраст человека равен " + age + " то он не достиг совершеннолетия," +
                    " нужно немного подождать».");
        }

        System.out.println("Задание2");
        int degrees = -10;
        if (degrees >= 5) {
            System.out.println("«На улице " + degrees + " градусов, можно идти без шапки»");
        } else {
            System.out.println("«На улице " + degrees + " градусов, нужно надеть шапку");

        }
        System.out.println("Задание3");
        int transportSpeed = 73;
        if (transportSpeed > 60) {
            System.out.println("«Если скорость " + transportSpeed + " то придется заплатить штраф»");

        } else {
            System.out.println("«Если скорость " + transportSpeed + " то можно ездить спокойно»");
        }
        System.out.println("Задание4");

        int years = 17;
        if (years > 2 && years <= 6) {
            System.out.println("«Если возраст человека равен " + years + ", то ему нужно ходить в детский сад»");

        }
        if (years > 6 && years <= 17) {
            System.out.println("«Если возраст человека равен " + years + ", то ему нужно ходить в школу»");
        }
        if (years > 17 && years <= 24) {
            System.out.println("«Если возраст человека равен " + years + ", то ему нужно ходить в университет»");
        }
        if (years > 24) {
            System.out.println("«Если возраст человека равен " + years + ", то ему нужно ходить на работу»");
        }
        System.out.println("Задание5");

        int personsAge = 5;
        if (personsAge < 5) {
            System.out.println("«Если возраст ребенка равен " + personsAge + " то ему нельзя кататься на аттракционе».");
        }
        if (personsAge >= 5 && personsAge <= 14) {
            System.out.println("«Если возраст ребенка равен " + personsAge + " то ему можно кататься на аттракционе в сопровождении».");

        }
        if (personsAge > 14) {
            System.out.println("«Если возраст ребенка равен " + personsAge + " то ему можно кататься без сопровождения взрослого».");
        }

        System.out.println("Задание6");
        int capacityOneCarriage = 102;
        int seatPlaceCarriage = 60;
        int gotIntoTheCarriage = 103;

        if (gotIntoTheCarriage <= seatPlaceCarriage) {
            System.out.println("Можно посидеть");

        }
        if (gotIntoTheCarriage > seatPlaceCarriage && gotIntoTheCarriage <= capacityOneCarriage) {
            System.out.println("Можно стоять");
        }
        if (gotIntoTheCarriage > capacityOneCarriage) {
            System.out.println("Нет мест");
        }
        System.out.println("Задание7");
        int first = 1;
        int second = 2;
        int third = 3;

        if (first > second && first > third) {
            System.out.println("first больше всех");

        }
        if (second > first && second > third) {
            System.out.println("second больше всех");
        }
        if (third > second && third > first) {
            System.out.println("third больше всех");
        }


    }


}