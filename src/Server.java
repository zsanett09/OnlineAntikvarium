/**
 * import org.json.simple.*;
 */
import java.net.*;
import java.io.*;
//import org.json.simple.*;

public class Server {
    private final int serverPort = 10000;
   Antikvarium antikvarium;
    
    public static void main(String[] args){
        Server prog = new Server();
        prog.start();
    }
    
 
    
    public void start(){
         antikvarium = new Antikvarium();

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
