public class HeroApplication {

    public static void main(String[] args) {

// Variable initialization
        String heroName;
        String heroCity;

        String heroPower1, heroPower2, heroPower3;

        boolean isEvil;

        double heroSalary;
        String realName;

        String universe;

// Variable assignment
        heroName = "SuperGuide";
        heroCity = "Riga";
        heroPower1 = "Knowing hidden gems";
        heroPower2 = "Telling exciting stories";
        heroPower3 = "Friendly service";
        isEvil = false;
        heroSalary = 99.99;
        realName = "Zanda";
        universe = "Hidden";

        // Print out hero information card
        System.out.println("********************************");
        System.out.println("*** HERO INFORMATION ***");
        System.out.println("********************************");

        System.out.println("Hero name: "+ heroName);
        System.out.println("This hero lives in " + heroCity);
        System.out.println("Hero Superpowers:");
        System.out.println("---" + heroPower1);
        System.out.println("---" + heroPower2);
        System.out.println("---" + heroPower3);

        System.out.println("This Super Hero is evil? " + isEvil);

        System.out.println("This hero earns: " + heroSalary + " EUR");
        System.out.println( realName + " hides her identity");
        System.out.println("Hero lives in " + universe + " universe");
        System.out.println();
        System.out.println("**************************");

    }
}
