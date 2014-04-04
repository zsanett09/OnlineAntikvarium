import java.net.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceThread extends Thread {
    
    //menus fvg
    //kiiratos fvg
    
    private Socket client;
    Antikvarium antikvarium;
    private Controller controller;
    
    public ServiceThread(Socket client, Antikvarium antikvarium){
        this.client = client;
        this.antikvarium = antikvarium;
        controller = new Controller();
    }
    
    @Override
    public void run(){
        service(client, antikvarium);
    }
    
      void menu(BufferedReader fromClient, PrintStream toClient) throws IOException{
       String valasz = "";
        
        do{
            toClient.println("Menu");
            toClient.println("Listaz: listaz");
            toClient.println("Licital: licital");
            toClient.println("Kilep: kilep");
            toClient.flush();
           
            
            valasz = fromClient.readLine();
            System.out.println(valasz);
            
            switch(valasz){
                case "listaz":
                    listazas(fromClient, toClient);
                    System.out.println("Valami");
                    break;
                case "licital": 
                    
                    controller.ujVevoCont(new Felhasznalo("Kezes Csaba", 
                             new Cim("Veszprem", "Hovirag", "25", "8200"), "12345", 
                                 new Datum(1990,5,13), "kezscsaba@gmail.com"));
                    String id = fromClient.readLine();
                    int intID = Integer.parseInt(id);
                    
                    String osszeg = fromClient.readLine();
                    
                    int intOsszeg = 0;
                    if(osszeg.equalsIgnoreCase("LL")){
                        LicitesHirdetes lh = antikvarium.getHirdetesKezelo().keresIDalapjan(intID);
                        intOsszeg = Integer.parseInt(osszeg);
                        intOsszeg += lh.getLicitLepcso();
                    }else{
                        intOsszeg = Integer.parseInt(osszeg);
                    }
                    boolean b = licitalas(fromClient, toClient, intID, intOsszeg);
                    if(b == true){
                        toClient.println("Sikeres licitalas!");
                    }else{
                        toClient.println("Nem siekrult a licitalas!");
                    }
                    break;
                case "kilep": break;
                default:
                    //toClient.println("Rosz parancsot irtal be!");
                    break;
            }
            
        }while( ! valasz.equalsIgnoreCase("kilep"));
        //toClient.println("vege");
            
    }
  
      boolean licitalas(BufferedReader fromClient, PrintStream toClient, int id, int osszeg )
              throws IOException{
          
          boolean b = controller.Licitalas(antikvarium.getHirdetesKezelo().keresIDalapjan(id), osszeg);
          return b;
          //licitlepcso
      }
      
      void listazas(BufferedReader fromClient, PrintStream toClient )throws IOException{
          HirdetesKezelo hk = antikvarium.getHirdetesKezelo();
          ArrayList<LicitesHirdetes> hirdetesekLista = hk.getLicitesHirdetesek();
          
          for(int i = 0; i < hirdetesekLista.size(); i++){
              LicitesHirdetes lh = hirdetesekLista.get(i);
             // toClient.println(lh.getMinimalAr());

              toClient.println("Hirdetes ID: " + lh.getID());
              toClient.println(lh.getKonyv().getSzerz());
              toClient.println(lh.getKonyv().getCim());
              toClient.println(lh.getKonyv().getAllapot());
              toClient.println(lh.getKonyv().getKiadas().getDatum());
              toClient.println("Minimal ar: " + lh.getMinimalAr());
              toClient.println("Kikialltasi ar: " + lh.getKikialtasiAr());
              toClient.println("Aktualis ar: " + lh.getAktalisAr());
              toClient.println("Licit lepcso: " + lh.getLicitLepcso());
              
          }
          
      }
      
      
    
    private void service(Socket client, Antikvarium antikvarium){
         BufferedReader fromClient;
         controller = new Controller();
        try {
            fromClient = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
              PrintStream toClient = new PrintStream(client.getOutputStream());

            String request = fromClient.readLine();
            System.out.println("a keres: " + request);
            toClient.println("Kiszolgalas!");
            
            menu(fromClient, toClient);
           
            //kliens hivogatja a controllert
            
            fromClient.close();
            toClient.close();
            client.close();
    
        } catch (IOException ex) {
            Logger.getLogger(ServiceThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }       
}
