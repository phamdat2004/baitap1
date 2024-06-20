/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.textControl;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.textModel;

/**
 *
 * @author DELL
 */
public class textView extends JFrame{
    private textModel tmd;
    private JTextArea jta;
    private JTextField jtf;
    private JLabel jlb3;

    public textView() {
        this.tmd = new textModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ActionListener ac = new textControl(this);
        
        JPanel jpn1 = new JPanel();
        JLabel jlb1 = new JLabel("Van ban");
        jta = new JTextArea();
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);
       
        jpn1.setLayout(new BorderLayout());
        jpn1.add(jlb1, BorderLayout.NORTH);
        jpn1.add(new JScrollPane(jta), BorderLayout.CENTER);
        
        JPanel jpn2 = new JPanel();
        JLabel jlb2 = new JLabel("Tu khoa");
        jtf = new JTextField();
        JButton btn = new JButton("Thong ke");
        btn.addActionListener(ac);
        jlb3 = new JLabel();
        jpn2.setLayout(new GridLayout(2,2));
        jpn2.add(jlb2);
        jpn2.add(jtf);
        jpn2.add(btn);
        jpn2.add(jlb3);
        this.setLayout(new BorderLayout());
        this.add(jpn1, BorderLayout.CENTER);
        this.add(jpn2, BorderLayout.SOUTH);
        
        
    }
    public void changebtn() {
        this.tmd.setVanBan(jta.getText());
        this.tmd.setTuKhoa(jtf.getText());
        this.tmd.timKiem();
        jlb3.setText(this.tmd.getKetQua());
    }
    
    
}
