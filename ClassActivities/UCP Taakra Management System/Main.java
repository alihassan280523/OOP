import Packages.*;

public class Main {
    public static void main(String[] args) {
        Participant ali=new Participant("A100", "Ali Hassan", "UCP", "03104814478");
        Participant farhan=new Participant("A101", "Farhan Ibrahim", "UCP", "0317665443");
        Participant ayesha=new Participant("A102", "Ayesha khan", "UMT", "03224512245");
        Participant ahmed=new Participant("A103", "Ahmed Khan", "UOL", "03445678896");
        Participant imran=new Participant("A104", "Imran Ahmed", "UMT", "0344577321");

        Competition speedProgramming=new Competition("COM100", "Speed Programming", "ACL-203", "12:00", 5);

        speedProgramming.addParticipant(ali);
        speedProgramming.addParticipant(farhan);
        speedProgramming.addParticipant(imran);

        speedProgramming.getParticipants();

        ali.showRegisteredCompetitions();
    }
}
