package exc07.prb02;
public class Cli {
    private Shell shell;
    private String computerName;
    private String user;

    public Cli(String computerName, String user) {
        this.computerName = computerName;
        this.user = user;
    }

    public String processCommand(Command command) {
        return "";
    }


    public String getHeader() {
        String header = user+"@"+computerName+":~$";
        return header;
    }
}
