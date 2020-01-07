/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.suryafakhriyhasbi.latihanmvc.model;

import edu.suryafakhriyhasbi.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Azis Komara
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String notelepon;
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNotelepon() {
        return notelepon;
    }

    public void setNotelepon(String notelepon) {
        this.notelepon = notelepon;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if(pelangganListener!=null){
           pelangganListener.onChange(this); 
        }
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");   
        setNotelepon("");
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
    }
}
