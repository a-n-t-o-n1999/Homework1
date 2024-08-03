public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир");
        //task 1
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task 2
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task 3
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task 4
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        //task 5
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        //task 6
        var boxerMass1=78.2;
        var boxerMass2=82.7;
        var sumMass = boxerMass1+boxerMass2;
        var differenceMass = Math.abs(boxerMass1-boxerMass2);
        System.out.println(sumMass + " Кг. Весят бойцы");
        System.out.println(differenceMass + " Кг. Разница в весе бойцов");
        //task 7
        var divisionRemainder=boxerMass2 % boxerMass1;
        System.out.println("Остаток от деления "+ divisionRemainder);
        //task 8
        var openingHours=160;
        var timeWork = 8;
        var totalWorker = openingHours/timeWork;
        System.out.println("Всего работников в компании "+ totalWorker + " человек");
        totalWorker=totalWorker+94;
        openingHours=timeWork*totalWorker;
        System.out.println("Если в компании работает "+ totalWorker + " человек, то всего "+  openingHours+" часов работы может быть поделено между сотрудниками");

    }
}