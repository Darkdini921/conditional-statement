public class Main {
    public static void main(String[] args) {
        // Задача 1

        byte age = 17;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        }else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }

        // Задача 2

        byte temperature = 8;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапкунужно надеть шапку.");
            }

        // Задача 3

        short speed = 90; // Выбрал переменную "short" т.к. на практике скорость может быть больше 127 км/ч , что превышает допустимое значение для переменной "byte"
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно.");
        }

        // Задача 4

        byte yearsOld = 40;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + " , то ему нужно ходить в детский сад.");
        } else if (yearsOld >= 7 && yearsOld <= 17) {
            System.out.println("Если возраст человека равен " + yearsOld + " , то ему нужно ходить в школу.");
        } else if (yearsOld >= 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + " , то ему нужно ходить в университет.");
        } else if ( yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + " , то ему нужно ходить на работу.");
        }

        // Задача 5

        byte childAge = 20;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему нельзя кататься на аттракционе.");
        } else if (childAge >= 5 && childAge < 14){
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему можно кататься на аттракционе в сопровождении.");
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему можно кататься на аттракционе без сопровождения.");
        }

        // Задача 6

        byte people = 60;
        byte total = 102;
        byte seating = 60;
        byte seatsRemaining = (byte) (total - people);

        if (total - people == 0){
            System.out.println("Вагон полностью заполнен.");
        } else if (total - people < seating) {
            System.out.println("В вагоне осталось свободных мест " + seatsRemaining + " , остались только стоячие места.");
        } else if (total - people >= seating) {
            System.out.println("В вагоне осталось свободных мест " + seatsRemaining + " , ещё остались сидячие места.");
        }

        // Задача 7

        int one = 1; // Присвоил значения для удобства и что-бы была возможность проверить код на работосбособность)
        int two = 2;
        int three = 3;

        boolean oneLargest = one > two && one > three;
        boolean twoLargest = two > one && two > three;
        boolean threeLargest = three > one && three > two;

        if (oneLargest){
            System.out.println("Число " + one + " самое большое");
        } else if (twoLargest) {
            System.out.println("Число " + two + " самое большое");
        } else if (threeLargest) {
            System.out.println("Число " + three + " самое большое");
        }


    }

}