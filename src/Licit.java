/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Zsanett
 */
public class Licit {
    private int osszeg;
    private Felhasznalo licitalo;
    private Date idopont;
    private int hirdetesID;
    
    Licit(int osszeg, Felhasznalo l, Date ido, int id){
        this.osszeg = osszeg;
        this.licitalo = l;
        this.idopont = ido;
        this.hirdetesID = id;         
    }

    /**
     * @return the osszeg
     */
    public int getOsszeg() {
        return osszeg;
    }

    /**
     * @param osszeg the osszeg to set
     */
    public void setOsszeg(int osszeg) {
        this.osszeg = osszeg;
    }

    /**
     * @return the licitalo
     */
    public Felhasznalo getLicitalo() {
        return licitalo;
    }

    /**
     * @param licitalo the licitalo to set
     */
    public void setLicitalo(Felhasznalo licitalo) {
        this.licitalo = licitalo;
    }

    /**
     * @return the idopont
     */
    public Date getIdopont() {
        return idopont;
    }

    /**
     * @param idopont the idopont to set
     */
    public void setIdopont(Date idopont) {
        this.idopont = idopont;
    }

    /**
     * @return the hirdetesID
     */
    public int getHirdetesID() {
        return hirdetesID;
    }

    /**
     * @param hirdetesID the hirdetesID to set
     */
    public void setHirdetesID(int hirdetesID) {
        this.hirdetesID = hirdetesID;
    }
}
