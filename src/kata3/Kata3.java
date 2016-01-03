package kata3;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author Daniel
 */
public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histo= new Histogram<>();
        
        String name ="C:\\Users\\Daniel\\Desktop\\emailsfilev1.txt";
        
        try{
            BufferedReader fileIn = new BufferedReader(new FileReader(name));
            String mail;
            
            while((mail= fileIn.readLine())!= null){
                if(mail.contains("@")){
                    histo.increment(mail.split("@")[1]);
                }
            }
        } catch(Exception e){
            
        }
                
                
        HistogramDisplay histo1 = new HistogramDisplay(histo);
        
        histo1.execute();
    }
    
}
