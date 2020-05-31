import java.net.MalformedURLException;
import edu.princeton.cs.introcs.In;
import java.net.URL;

public class Driver {

    public static void main(String[] args) throws MalformedURLException{
        Trie test = new Trie();
        URL url = new URL("http://www.gutenberg.org/files/98/98-h/98-h.htm");

        if (url != null) {
            System.out.println("Reading from: " + url);
        } else {
            System.out.println("Couldn't find file: kap1.txt");
        }

        In input = new In(url);

        while (!input.isEmpty()) {
            String line = input.readLine().trim();
            String[] words = line.split("(\\. )|:|,|;|!|\\?|( - )|--|(\' )| ");
            String lastOfLine = words[words.length - 1];

            if (lastOfLine.endsWith(".")) {
                words[words.length - 1] = lastOfLine.substring(0, lastOfLine.length() - 1);
            }

            for (String word : words) {
                String word2 = word.replaceAll("\"|\\(|\\)", "");

                if (word2.isEmpty()) {
                    continue;
                }

                //System.out.println(word2);
                test.put(word2);
            }
        }
        System.out.println("th:" + test.count("th"));
        System.out.println("it:" + test.count("it"));
        System.out.println("an:" + test.count("an"));
        System.out.println("if:" + test.count("if"));

        System.out.println("s:" + test.distinct("s"));
        System.out.println("i:" + test.distinct("i"));
        System.out.println("a:" + test.distinct("a"));
        System.out.println("t:" + test.distinct("t"));


    }
}