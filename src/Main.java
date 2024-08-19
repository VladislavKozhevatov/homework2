public class Main {
    public static void main(String[] args) {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = (int) (dog-3.5);
        cat = (int) (cat-1.6);
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var bouthBoxersWeight = boxerWeight1+boxerWeight2;
        System.out.println("Общий вес двух бойцов " + bouthBoxersWeight +" кг");
        var BoxersWeight = boxerWeight1 - boxerWeight2;
        System.out.println("Разница в весе двух бойцов " + BoxersWeight +" кг");
        //Задча 7
        var Weight = boxerWeight2 % boxerWeight1;
        System.out.println("Остаток между двумя весами " + Weight +" кг");
        //Задча 8
        var totalWorkTime = 640;
        var shiftWorkTime = 8;
        var numberEmployes = totalWorkTime / shiftWorkTime;
        System.out.println("Всего работников в компании " + numberEmployes + " человек");
        var numberEmployes2 = numberEmployes + 94;
        var totalWorkTime2 = numberEmployes2 * shiftWorkTime;
        System.out.println("Если в компании работает " + numberEmployes2 + " человек,то всего часов работы может быть поделено между сотрудниками "+totalWorkTime2);
    }
}