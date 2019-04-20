import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.List;
import java.io.IOException;
public class Invoke {
    public static void main(String[] args) throws Exception {
        String html = Utill.readFile("demo.html");
        System.out.println("file reading completed");
        System.out.println("analyzing html now");
        Document doc = Jsoup.parse(html);
        Element e = Utill.xpathToJsoupQuery("hi_4",doc);
        String s = Utill.getOwnContainingText(e);
        System.out.println(s);
        // now execute command x with jdbc
    }
}
