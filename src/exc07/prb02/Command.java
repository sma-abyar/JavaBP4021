package exc07.prb02;

public class Command {
    private String command;

    private String arg;

    public Command(String command,String arg) {
        this.command = command;
        this.arg = arg;
    }

    public String getCommand() {
        return command;
    }

    public String getArg() {
        return arg;
    }
}
