package Q2;

import Q1.Club;
import Q1.SportsClub;
import Q1.ESportsClub;
import Q1.MarketingClub;
public class ClubManagingSystemTest {
    public static void main(String[] args){
        Club student = new Club("Student", 10);
        SportsClub football = new SportsClub("Football", 22);
        ESportsClub RoV = new ESportsClub("RoV", 1);
        MarketingClub advertising = new MarketingClub("Advertising",2,100);

        student.addMember(190);
        football.addMember(18);
        RoV.addMember(4);
        advertising.addMember(8);

        Club[] clubs = {student, football, RoV, advertising};

        ClubManagingSystem system = new ClubManagingSystem(clubs);

        System.out.println(system.getHighestMemberClub().getName());
        System.out.println(system.determineAllBudget());
        System.out.println(system.getAllMembers());
    }
}
