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
    
    void olvas(BufferedReader fromServer, PrintStream toServer) throws IOException{
        String valasz = "";
        String sor = null;
   
        do{
            String vv1, vv2, vv3,vv4;
            vv1 = fromServer.readLine();
            if( vv1.equalsIgnoreCase("Menu")){
                System.out.println("-----------------------------------------");
                System.out.println(vv1);
                vv2 = fromServer.readLine(); System.out.println(vv2);
                vv3 = fromServer.readLine(); System.out.println(vv3);
                vv4 = fromServer.readLine(); System.out.println(vv4);

                System.out.print("Valasz: "); 
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                valasz = input.readLine();

                toServer.println(valasz);
                System.out.println("*****************************************");
                switch(valasz){
                    case "listaz": 
                        for(int i = 0; i < 9; i++){
                            String v = fromServer.readLine(); 
                            System.out.println(v);
                        }
                        break;
                    case "licital":
                        //fogadjuk
                        boolean b;
                        b = LicitBeker(fromServer, toServer);
                        if(b == false){
                            System.out.println("Sikertelen licitalas!");
                        }
                        break;
                    case "kilep": break;
                    default:
                        System.out.println("Rosz valaszt adtal meg !");
                        break;
            }
            }else{
              
                System.out.println(vv1);
            }
        }while( ! valasz.equalsIgnoreCase("kilep"));
        
    }
    
    
    private boolean LicitBeker(BufferedReader fromServer, PrintStream toServer){
        
        try {        
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            
            String hirdetesid = fromServer.readLine();
            System.out.println(hirdetesid);
           
            System.out.print("Hirdetes ID: ");
            String id = input.readLine();
            toServer.println(id);
            
            String idOK = fromServer.readLine();
            //System.out.println(idOK);
            if( ! idOK.equalsIgnoreCase("GOOD") ){
                return false;
            }
            System.out.print("Licit osszeg: ");
            String osszeg = input.readLine();
            
            toServer.println(osszeg);

            String licitSiker =  fromServer.readLine();
            System.out.println(licitSiker);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
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
            
            
            olvas(fromServer, toServer);
            
            
            
            fromServer.close();
            toServer.close();
            server.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
