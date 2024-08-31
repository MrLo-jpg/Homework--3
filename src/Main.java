public class Main {
    public static void main(String[] args) {
        int age = 21;
        if ( age >= 18 ) {
            System.out.println ("Если возраст человека " + age + " то он совершеннолетний ");
        } else {
            System.out.println ("Если возраст человека " + age + " то он несовершеннолетний ");
        }
        System.out.println();

        int temperatura = 6;
        if (temperatura > 5) {
            System.out.println("На улице " + temperatura + " можно идти без шапки"); }
        else {
            System.out.println("На улице " + temperatura + " нужно одеть шапку"); }
        System.out.println();

        int speed = 70;
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + " придётся заплатить штраф ");}
        else {
            System.out.println(" Если скорость " + speed + " можно ездить спокойно ");}
        System.out.println();

        age = 25;
        if ( age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в садик ");}
        if (age >=7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу ");}
        if ( age >= 18 && age <= 24 ) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете ");}
        if ( age > 24) {
            System.out.println("Если возраст человека " + age + " то ему пора ходить на работу");}
        System.out.println();

        age = 16;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " нельзя кататься на аттракционе");}
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься только в сопровождении" +
                    " взрослого. Если взрослого нет, то кататься нельзя");}
        if (age > 14 ) {
            System.out.println("Если возраст ребенка равен " + age + " то он может" +
                    " кататься без сопровождения взрослого"); }
        System.out.println();
        int sitPlace = 60;
        int places =102;
        int piople =60;
        if (piople >= sitPlace && piople <places){
            System.out.println("Есть стоячие  места");}
        if (piople < sitPlace){
            System.out.println("Есть сидячие места"); }
        if (piople >= places) {
            System.out.println("Вагон полон"); }
        System.out.println();

        int one = 21;
        int two = 13;
        int three = 5;
        if (one > two && one > three) {
            System.out.println("Большее число " + one);}
        else {
            if (two > three) {
                System.out.println("Большее число " + two);
            } else {
                System.out.println("Большее число " + three);
            }
        }
    }
}


