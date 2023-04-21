import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("ideaold.log"));
        ArrayList text = new ArrayList();
        while (in.hasNext()) {
            text.add(in.nextLine());
        }
        int Error = Errors(text);
        System.out.println(Error);
        ArrayList GitActivity = Git(text);
        for (int i = 0; i < GitActivity.size(); i++){
            System.out.println(String.valueOf(GitActivity.get(i)));
        }

    }
    public static int Errors(ArrayList text){
        int Error = 0;
        for(int i = 0; i < text.size(); i++){
            String line = String.valueOf(text.get(i));
            if (line.contains("Error")) Error++;
        }
        return Error;
    }

    public static ArrayList Git(ArrayList text){
        ArrayList GitStuff = new ArrayList();

        for(int i = 0; i < text.size(); i++){
            String line = String.valueOf(text.get(i));
            if (line.contains("github")){ GitStuff.add(line);
                System.out.println(line);}

    }
        return GitStuff;
}

}

