
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.*;
public class Parser {
    private List < String > lts;
    private List < String > keyWord;
    public Parser() {
        this.lts = new ArrayList < String > ();
        this.lts.add("pre");
        this.lts.add("p");
        this.keyWord = new ArrayList < String > ();
        this.keyWord.add("insert");
        this.keyWord.add("delete");
    }
    public Set < Set < String >> parse(Document doc) {
        Set < Set < String >> st = new HashSet < Set < String >> ();
        Set < String > ins = new HashSet < String > ();
        Set < String > del = new HashSet < String > ();
        List < String > lt = new ArrayList < String > ();
        for (Element element: doc.getAllElements()) {
            for (String str: this.lts) {
                for (String kw: this.keyWord) {
                    if (element.nodeName().equals(str)) {
                        if (element.text().toUpperCase().indexOf(kw.toUpperCase()) > -1) {
                            if (kw.toUpperCase().equals("insert".toUpperCase())) {
                                ins.add(element.text());
                            } else if (kw.toUpperCase().equals("delete".toUpperCase())) {
                                del.add(element.text());
                            }
                        }
                    }
                }
            }
        }
        st.add(ins);
        st.add(del);
        return st;
    }
}
