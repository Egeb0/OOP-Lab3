package Q1;

public class ESportsClubTest {

    public static void main(String [] args){
        ESportsClub e = new ESportsClub("Esport", 100);
        Club c = new ESportsClub("Esport", 100);

        e.advertise();
        System.out.println(e.determineBudget());
        System.out.println(e.getName());

        System.out.println();

        c.advertise();
        System.out.println(e.determineBudget());
        System.out.println(e.getName());
    }
}
