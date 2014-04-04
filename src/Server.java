/**
 * import org.json.simple.*;
 */
import java.net.*;
import java.io.*;
//import org.json.simple.*;




public class Server {
    private final int serverPort = 10000;
    private Antikvarium antikvarium;
    
    public static void main(String[] args){
        Server prog = new Server();
        prog.start();
    }
    
 
    
    public void start(){
         antikvarium = new Antikvarium();
         HirdetesKezelo hk = antikvarium.getHirdetesKezelo();
         hk.addLicitesHirdetes(new LicitesHirdetes(
                                 new Konyv("George R. R. Martin", "Tronok harca", 
                                  new Datum(2012,10,2), "Hibatlan allapot"), 
                                   100,200,300));
        //Felhasznalok fh = antikvarium.getFelhasznalok();
        //fh.addFelhasznalo(new Felhasznalo("Kezes Csaba", 
               // new Cim("Veszprem", "Hovirag", "25", "8200"), "12345", 
                    // new Datum(1990,5,13), "kezscsaba@gmail.com"));
        
       
        System.out.println("Server program");
        try{
            ServerSocket server = new ServerSocket(serverPort);
            while(true){
                System.out.println("Kliensre var ..");
                Socket client = server.accept();
                System.out.println("Kliens csatlakozott");
                ServiceThread t = new ServiceThread(client, antikvarium);
                t.start();
             
                
            }
            //server.close();  
        }catch(IOException e){
        }
    }
}
