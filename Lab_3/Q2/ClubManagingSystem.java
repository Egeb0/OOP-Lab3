package Q2;
import Q1.Club;

public class ClubManagingSystem {
    private Club[] clubList;

    public ClubManagingSystem(Club[] clubList){
        this.clubList = clubList;
    }

    public int determineAllBudget(){
        int total = 0;

        for(Club club : clubList){
            total += club.determineBudget();
        }
        return total;
    }

    public int getAllMembers() {
        int total = 0;

        for (Club club : clubList) {
            total += club.getNumMember();
        }

        return total;
    }

    public Club getHighestMemberClub(){
        if(clubList.length == 0){
            return null;
        }

        Club highest = clubList[0];

        for(Club club: clubList){

        }
        return highest;
    }
}
