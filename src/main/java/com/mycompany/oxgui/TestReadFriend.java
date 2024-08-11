/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oxgui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class TestReadFriend {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            File file = new File("friend.dat");
            fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Friend f1 = ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestReadFriend.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestReadFriend.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestReadFriend.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(TestReadFriend.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
}
