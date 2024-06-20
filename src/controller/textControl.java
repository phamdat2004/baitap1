/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.textView;

/**
 *
 * @author DELL
 */
public class textControl implements ActionListener{
    private textView tv;

    public textControl(textView tv) {
        this.tv = tv;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        tv.changebtn();
    }
    
}
