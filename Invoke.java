import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.*;
import java.io.IOException;
public class Invoke {
    public static void main(String[] args)  {
        
        //Element e =Utill.getElementByProperty(doc,"http://mw:8090/browse/PP-1274");
        Set<Set<String>> st;
        try{
            String html = Utill.readFile(args[0]);
            Document doc = Jsoup.parse(html);
            Parser p = new Parser();
            st = p.parse(doc);
            int counter=0;
            for(Set<String> b : st){
                for(String x : b){
                    if(counter==0){
                        System.out.println("INSERT command \n");
                        System.out.println("");
                        System.out.println(x);
                    }else{
                        System.out.println("DELETE");
                        System.out.println(x);
                    }
                    
                }
                counter=counter+1;
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
