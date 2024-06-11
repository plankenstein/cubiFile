import java.lang.*;
import java.util.*;
import java.io.*;


public class cubiFile {
    File file = new File("C:\\Users\\barnjn\\Desktop\\cubilist.txt");
    
    ArrayList<String> arlist = new ArrayList<String>();
    int i;
    CharSequence seq = "X0";
    boolean x0 = false;
    int startItem;
    
    public int getStart(){
        return startItem;
    }
    public void setStart(int startItem){
        this.startItem = startItem;
    }
    
    //main
    public void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader(file));//reads txt file
        
        while(input.hasNextLine()){
            arlist.add(input.nextLine());
        }
        
        for(String list: arlist){
            if(list.contains(seq)){
                x0 = true;
            } else {
                x0 = false;
            }
            
            if(x0 == true){
                setStart(list.indexOf("X0"));
            } else if(x0 == false){
                setStart(list.indexOf("B0"));
            }
            int startBin = list.indexOf("P-1");
            int stopBin = startBin + 12;
            
            System.out.println(list.substring(getStart(), getStart() + 10));
            System.out.println(list.substring(startBin, stopBin));
        }
    }
}
