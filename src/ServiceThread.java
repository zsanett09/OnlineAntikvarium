import java.net.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceThread extends Thread {
 
    private Socket client;
    private Controller controller;
    
    public ServiceThread(Socket client, Antikvarium a){
        this.client = client;
        this.controller = new Controller(a);
    }
    
    @Override
    public void run(){
        service(client);
    }
    
      void menu(BufferedReader fromClient, PrintStream toClient) throws IOException{
       String valasz = "";
       
       //beegetett vevo
        Felhasznalo temp = new Felhasznalo("Kezes Csaba", 
                             new Cim("Veszprem", "Hovirag", "25", "8200"), "12345", 
                                 new Datum(1990,5,13), "kezscsaba@gmail.com", 
                                    controller.getAntikvarium());
        controller.getAntikvarium().getFelhasznalok().addFelhasznalo(temp);
        
        //beegetett tulaj
        Felhasznalo temp2 = new Felhasznalo("Tulaj Aladar", 
                             new Cim("Veszprem", "Hovirag", "50", "8200"), "54321", 
                                 new Datum(1991,3,23), "aladar@gmail.com", 
                                    controller.getAntikvarium());
        controller.getAntikvarium().getFelhasznalok().addFelhasznalo(temp2);
        
        //beegetett hirdetesunk
        LicitesHirdetes lc = new LicitesHirdetes( 
                new Konyv("George R. R. Martin", "Tronok harca", 
                  new Datum(2012,10,2), "Hibatlan allapot"), 100,200,300, temp2);
        controller.getAntikvarium().getHirdetesKezelo().addLicitesHirdetes(lc);
        
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
                    
                    break;
                case "licital": 
                    // csak h ne keljen listazni ott-ideiglenes
                    toClient.println(lc.gethirdetesID());
                    
                    licitalas(fromClient, toClient);
 
                    break;
                case "kilep": break;
                default:
                    break;
            }
            
        }while( ! valasz.equalsIgnoreCase("kilep"));
        
            
    }
  
     public void  licitalas(BufferedReader fromClient, PrintStream toClient)
              throws IOException{
                          
            boolean b;
            Felhasznalok fhk = controller.getAntikvarium().getFelhasznalok();

            VevoController licitalo = fhk.getVevoC(fhk.getFelhasznalo(0).getfID()); 
            // van 1 vevonk mostmar a felhasznalonkbol

            //id bekeres
            String id = fromClient.readLine();
            int intID = Integer.parseInt(id);

            HirdetesKezelo hk = controller.getAntikvarium().getHirdetesKezelo();
            LicitesHirdetes licitalandoHirdetes =  null;
            licitalandoHirdetes = hk.keresIDalapjan(intID);

  
            if(licitalandoHirdetes == null){
                toClient.println("BAD");
            }else{
                 toClient.println("GOOD");
            
                //licit osszeg bekeres
                String osszeg = fromClient.readLine();
                int intOsszeg = Integer.parseInt(osszeg);

                b = licitalo.Licitalas(licitalandoHirdetes, intOsszeg);

                if(b == true){
                    toClient.println("Sikeres licitalas!");
                }else{
                    toClient.println("Nem siekrult a licitalas!");
                }
            } 
      }
      
      void listazas(BufferedReader fromClient, PrintStream toClient )throws IOException{
          HirdetesKezelo hk = controller.getAntikvarium().getHirdetesKezelo();
          ArrayList<LicitesHirdetes> hirdetesekLista = hk.getLicitesHirdetesek();
          
          for(int i = 0; i < hirdetesekLista.size(); i++){
              LicitesHirdetes lh = hirdetesekLista.get(i);
                  toClient.println("Hirdetes ID: " + lh.gethirdetesID());
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
      
      
    
    private void service(Socket client){
         BufferedReader fromClient;
         
        try {
            fromClient = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
              PrintStream toClient = new PrintStream(client.getOutputStream());

            String request = fromClient.readLine();
            System.out.println("a keres: " + request);
            toClient.println("Kiszolgalas!");
            
            menu(fromClient, toClient);
            
            fromClient.close();
            toClient.close();
            client.close();
    
        } catch (IOException ex) {
            Logger.getLogger(ServiceThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }       
}
