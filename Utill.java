import java.lang.*;
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.List;

public class Utill {
    public static String readFile(String fName) throws Exception{
        StringBuilder sb = new StringBuilder();
        FileReader fr = new FileReader(fName); 
        int i; 
        while ((i=fr.read()) != -1){
            sb.append((char) i);
        }
        return sb.toString();
    }

    public static Element xpathToJsoupQuery(String id, Document document){
        Element content = document.getElementById(id);
        return content;
    }

    public static String getOwnContainingText(Element e){
        return e.text();
    }

    public static Element getElementByProperty(Document doc,String data){
        Element links = doc.select("a[href='"+data+"']").first();
        return links;
    }

    // public static Element getElement(String xPath){
    //     //xsoup == xpath 
    //     $x("//a[@href='']")
    //     Element e xsoup.compile(xPath).any();
    //     return e;
    // }
}