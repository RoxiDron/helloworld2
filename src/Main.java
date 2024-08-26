public class Main {
    public static void main(String[] args) {
        // Задание 1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        // Задание 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        // Задание 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        // Задание 4
        var frend = 19;
        System.out.println((frend + 2) / 7);
        // Задание 5
        var frog = 3.5;
        System.out.println(((frog + 10) / 3.5) + 4);
        // Задание 6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var TheTotalWeightOfTheTwoFighters = boxerWeight1 + boxerWeight2;
        var TheDifferenceBetweenTheTwoFighters = boxerWeight2 - boxerWeight1;
        System.out.println("Первый боксёр весит " + boxerWeight1 + "кг");
        System.out.println("Второй боксёр весит " + boxerWeight2 + "кг");
        System.out.println("Общая масса двух бойцов в " + TheTotalWeightOfTheTwoFighters + "кг");
        System.out.println("Разность между двух бойцов в " + TheDifferenceBetweenTheTwoFighters + "кг");
        // Задание 7
        var RemainderFromDivision = boxerWeight2 % boxerWeight1;
        System.out.println ("Остаток от делания равен " + RemainderFromDivision);
        // Задание 8
        var TotalHours = 640;
        var HoursPerWorker = 8;
        System.out.println("Всего работников в компании - " + TotalHours / HoursPerWorker + " человек ");
        var empвoyees = 94;
        System.out.println("Если в компании работает " + ((TotalHours / HoursPerWorker) + empвoyees) + " человек, то всего " + ((TotalHours / HoursPerWorker) + empвoyees) * HoursPerWorker + " часов работы может быть поделено между сотрудниками");
    }
}