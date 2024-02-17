package exc07.prb02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Cli cli = new Cli("test", "user");
        System.out.println(cli.getHeader());
        Shell shell = new Shell();
        shell.printWorkingDirectory();
        shell.createDirectory("test");
        shell.createFile("test");
        shell.removeDirectory("hd");
        shell.removeFile("test");
        shell.changeDirectory("src");
        shell.changeDirectory("..");
        shell.printWorkingDirectory();
        shell.listStatus();

    }
}
