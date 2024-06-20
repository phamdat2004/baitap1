/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class textModel {
    private String vanBan;
    private String tuKhoa;
    private String ketQua;

    public textModel() {
    }

    public void setVanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public String getKetQua() {
        return ketQua;
    }
    
    public void timKiem() {
        int dem=0;
        String []a = this.vanBan.split("\\s+");
        for(String x:a) {
            if(x.equals(this.tuKhoa)) {
                dem++;
            }
        }
        this.ketQua = dem+"";
    }
}
