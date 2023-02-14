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
        int first = 30003;
        byte second = 55;
        short third = 4567;
        long fourth = 676_767_999l;
        float fifth = 5.879f;
        double sixth = 676.998_76;
        System.out.println("Значение переменной first" + " с типом int" + " равно "+ first);
        System.out.println("Значение переменной second" + " с типом byte" + " равно "+ second);
        System.out.println("Значение переменной third" + " с типом short" + " равно "+ third);
        System.out.println("Значение переменной fourth" + " с типом long" + " равно "+ fourth);
        System.out.println("Значение переменной fifth" + " с типом float" + " равно "+ fifth);
        System.out.println("Значение переменной sixth" + " с типом double" + " равно "+ sixth);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        long   p1 = 987_678_965_549l;
        byte   p2 = 67;
        int    p3 = 27897;
        double p4 = 2.786;
        short  p5 = 569;
        float  p6 = 27.12f;
        short  p7 = -159;

    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte LydmilasStudents = 23;
        byte AnnasStudents = 27;
        byte EkaterinasStudents = 30;
        short TotalPaper = 480;
        int EachStudent = TotalPaper/(LydmilasStudents+AnnasStudents+EkaterinasStudents);
        System.out.println("На каждого ученика рассчитано "+ EachStudent +  " листов бумаги");



    }
    public static void task4 () {
        System.out.println("Задача 4");
        short Result = 16;
        int Time = 2;
        int SpeedMinute = Result/Time;
        int FirstTime = 20;
        int SecondTime = 60*24;
        int ThirdTime = 60*24*3;
        int FouthTime = 60*24*30;    //Месяц = 30 дней

        System.out.println("За "+ FirstTime +" минут "+ " машина произвела "+ SpeedMinute*FirstTime + " штук бутылок");
        System.out.println("За "+ SecondTime +" минут "+ " машина произвела "+ SpeedMinute*SecondTime + " штук бутылок");
        System.out.println("За "+ ThirdTime +" минут "+ " машина произвела "+ SpeedMinute*ThirdTime + " штук бутылок");
        System.out.println("За "+ FouthTime +" минут "+ " машина произвела "+ SpeedMinute*FouthTime + " штук бутылок");





    }
    public static void task5 () {
        System.out.println("Задача 5");
        int JarTotal = 120; // Сколько банок всего
        byte WhiteClass = 2; // Сколько банок белой краски нужно для 1 класса
        byte BrownClass = 4; // Сколько банок коричневой краски нужно для 1 класса
        int TotalClasses = JarTotal/(WhiteClass+BrownClass); // Сколько всего классов в школе
        int WhiteJarTotal = TotalClasses*WhiteClass; // Сколько банок белой краски нужно для всех классов
        int BrownJarTotal = TotalClasses*BrownClass; // Сколько банок коричневой краски нужно для всех классов
        System.out.println("В школе, где " + TotalClasses +  " классов, нужно "+ WhiteJarTotal + " банок белой краски и " + BrownJarTotal+" банок коричневой краски");

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int Bananas = 5;
        int Milk = 200;
        int IceCream = 2;
        int Egg = 4;
        int BananaWeight = 80;
        float MilkWeight = 1.05f;
        int IceCreamWeight = 100;
        int EggWeight = 70;
        float TotalWeight = BananaWeight*Bananas + MilkWeight*Milk + IceCreamWeight*IceCream+ EggWeight*Egg;
        float Kg = TotalWeight/1000;
        System.out.println("Спортсмен примет "+ TotalWeight + " в граммах и " + Kg + " в киллограммах");


    }
    public static void task7 () {
        System.out.println("Задача 7");
        int TotalWeight = 7;
        int FirstProgram = 250;
        int SecondProgram = 500;
        int KgGr = TotalWeight*1000; //Переводим из кг в граммы
        int FirstWay = KgGr/FirstProgram; // Похудеет если будет терять по 250 грамм
        int SecondWay = KgGr/SecondProgram; // Похудеет если будет теряять по 500 грамм
        System.out.println("Если спортсмен будет терять по 250 грамм в день, он похудеет за " + FirstWay + " Дней");
        System.out.println("Если спортсмен будет терять по 500 грамм в день, он похудеет за " + SecondWay + " Дней");
        int Average = (FirstWay+SecondWay)/2;
        System.out.println("В среднем спорстмену понадобится "+ Average + " день чтобы похудеть");

    }
    public static void task8 () {
        System.out.println("Задача 8");
        int MashaSalary    = 67760;
        int DenisSalary    = 83690;
        int KristinaSalary = 76230;
        int MashaNew = MashaSalary + MashaSalary/10;
        int DenisNew = DenisSalary + DenisSalary/10;
        int KristinaNew = KristinaSalary + KristinaSalary/10;
        int MashaDif = MashaNew*12 - MashaSalary*12;
        int DenisDif = DenisNew*12 - DenisSalary*12;
        int KristinaDif = KristinaNew*12 - KristinaSalary*12;
        System.out.println("Маша теперь получает " + MashaNew + " рублей. Годовой доход вырос на " + MashaDif + " рублей");
        System.out.println("Денис теперь получает " +  DenisNew+ " рублей. Годовой доход вырос на " + DenisDif+ " рублей");
        System.out.println("Кристина теперь получает " + KristinaNew + " рублей. Годовой доход вырос на " + KristinaDif+ " рублей");





    }
}