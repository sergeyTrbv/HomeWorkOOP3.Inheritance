public class Main {
    public static void main(String[] args) {

        Transport chevrolet = new Car("Chevrolet", "Lacetti", 2007, "Korea", "Blue", 220, 1.4d, "MEX",
                "Hatchback", "С462ЕЕ64", 5, "Winter");

        Transport lastochka = new Train("Ласточка", "B-901", 2011, "Russia", null, 301, 3500, 0,
                "Белоруссикй вокзал", "Минск-Пассажирский", 11);

        Train leningrad = new Train("Ленинград", "D-125", 2019, "Russia", null, 270, 1700,
                0, "Ленинградский вокзал", "ленинград-Пассажирский", 8);

        Bus man = new Bus("Man", "Lion`s Coach", 2016, "Germany", "Blue", 120);
        Bus sityRitm = new Bus("SityRitm", "VolgaBus 5270GH", 2017, "Russia", "Yellow", 85);
        Bus hyundai = new Bus("Hyundai", "Universe", 2000, "Korea", "wihte", 142);

        System.out.println(chevrolet);
        chevrolet.refill();
        System.out.println(lastochka);
        lastochka.refill();
        System.out.println(leningrad);
        leningrad.refill();
        System.out.println(man);
        man.refill();
        System.out.println(sityRitm);
        sityRitm.refill();
        System.out.println(hyundai);
        hyundai.refill();

    }
}