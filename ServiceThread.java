import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceThread extends Thread {
    private Socket client;
    private Controller controller;
    
    public ServiceThread(Socket client){
        this.client = client;
    }
    
    @Override
    public void run(){
        service(client);
    }
    
    private void service(Socket client){
         BufferedReader fromClient;
         controller = new Controller();
        try {
            fromClient = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
              PrintStream toClient = new PrintStream(client.getOutputStream());

            String request = fromClient.readLine();
            System.out.println("a keres: " + request);
            toClient.println("Kiszolgalas!  Viszlat!");
            
            fromClient.close();
            toClient.close();
            client.close();
    
        } catch (IOException ex) {
            Logger.getLogger(ServiceThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }       
}
