package texc01;
import java.io.PrintStream;
import java.util.Scanner;
public class prb05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream sysout = System.out;
        String  sentence,dashR,equalR,space1,space2,space3,space4;
        sentence = sc.nextLine();
        dashR= new String(new char[sentence.length()+2]).replace("\0", "-");
        equalR = new String(new char[sentence.length()+2]).replace("\0", "=");
        space1 = new String(new char[sentence.length()]).replace("\0", " ");
        space2 = new String(new char[sentence.length()+1]).replace("\0", " ");
        space3 = new String(new char[sentence.length()+2]).replace("\0", " ");
        space4 = new String(new char[sentence.length()+6]).replace("\0", " ");
        sysout.println(" " + dashR);
        sysout.println("| " + sentence + " |");
        sysout.println(" " + equalR);
        sysout.println(space1 + "\\");
        sysout.println(space2 + "\\");
        sysout.println(space3 + "^__^");
        sysout.println(space3 + "(oo)\\_______");
        sysout.println(space3 + "(__)\\       )\\/\\");
        sysout.println(space4 + "||----w |");
        sysout.println(space4 + "||     ||");
    }
}
