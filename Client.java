import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client {
    private final String serverName = "localhost";
    private final int serverPort = 10000;
    
    public static void main(String[] args){
        Client prog = new Client();
        prog.start();
    }
    
    public void start(){
        try {
            System.out.println("Client program");
            System.out.println("Kapcsolodas a " + serverName +
                    ": " + serverPort + " ...");
            
            Socket server = new Socket(serverName, serverPort);
            System.out.println("Kapcsolodva a szerverhez");
            BufferedReader fromServer = new BufferedReader(
                    new InputStreamReader(server.getInputStream()));
            PrintStream toServer = new PrintStream(server.getOutputStream());
            
            toServer.println("Hello!");
            System.out.println("Valasz a szervertol: " + fromServer.readLine());
            
            
            fromServer.close();
            toServer.close();
            server.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
