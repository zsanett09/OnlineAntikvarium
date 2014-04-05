/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Hiba extends Exception{
    
    public Hiba(String msg){
        super(msg);
    }
    
    public String getHibauzenet(){
        return super.getMessage();
    }
}
