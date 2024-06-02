package dgzf;

import java.security.spec.RSAOtherPrimeInfo;

public class Application {
    public static void main(String[] args) {
        Elka elka1 = new Elka();
        Igrushka igrushka1 = new Igrushka("red", 1);
        Igrushka igrushka2 = new Igrushka();
        Igrushka igrushka3 = new Igrushka();

        igrushka2.setColor("blue");
        igrushka2.setSize(1);

        elka1.povesitIgrushku(igrushka1);
        elka1.povesitIgrushku(igrushka2);
        elka1.povesitIgrushku(igrushka3);



        System.out.println(elka1.toString());

    }
}
