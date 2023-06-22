

public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weightBoxers = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров = " + weightBoxers + " кг.");
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе = " + weightDifference + " кг.");

        // Задача 7
        // 1 Пункт задачи, был выполнен в задаче №6
        var weightDifferenceTwo = secondBoxer % firstBoxer;
        System.out.println(weightDifferenceTwo);

        // Задача 8
        var workHours = 640;
        var hoursWorker = 8;
        var worker = workHours / hoursWorker;
        System.out.println("Всего работников в компании - " + worker + " человек.");

        worker = worker + 94;
        var totalHours = worker * hoursWorker;
        System.out.println("Если в компании работает " + worker + " человека, то всего " + totalHours + " часа работы, может быть поделено между сотрудниками.");
    }
}