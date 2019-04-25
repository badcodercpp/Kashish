import java.io.*;
public class Parser {
    public static List<String> parse(Document doc){
        List<String> lt = new List<String>();
        for (Element element : doc.getAllElements()) {
            if(element.nodeName().equals("pre") && element.childNode(0).nodeName().equals("#text")){
                //System.out.println(element.toString());
                if(element.text().toUpperCase().indexOf("insert".toUpperCase())>-1){
                    lt.add(element.text())
                }
            }
        }
        // this will give yoy the all text of the dom which have Insert word
        return lt;
    }
}
