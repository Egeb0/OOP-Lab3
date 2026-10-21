package Q1;

public class SportsClub extends Club{

    public SportsClub(String n, int m){
        super(n, m);
    }

    @Override
    public int determineBudget(){
        return (numMember * 1000)+
                (numMember - minNumMember) * 100;
    }

    @Override
    public void changeName(String newName){
    }

    public int getNumMember(){
        return numMember;
    }
}
