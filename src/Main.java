public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 12.0;
        var cat = 7.6;
        var paper = 763793;
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе у боксеров " + weightDifference + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var weightDifference1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе у боксеров " + weightDifference1 + " кг");
        var weightDifference2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе у боксеров " + weightDifference2 + " кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var totalHours = 640;
        var hoursForOneWorker = 8;
        var amountOfWorkers = totalHours / hoursForOneWorker;
        System.out.println("Всего работников в компании — " + amountOfWorkers + " человек");
        var anotherAmountOfWorkers = amountOfWorkers + 94;
        var anotherTotalHours =  anotherAmountOfWorkers * hoursForOneWorker;
        System.out.println("Если в компании работает " + anotherAmountOfWorkers + " человека, то всего " + anotherTotalHours +
                " часа работы может быть поделено между сотрудниками");
    }
}