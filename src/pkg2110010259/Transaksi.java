/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010259;

/**
 *
 * @author mal
 */
public class Transaksi {
    public static void main(String[] args){
        
    }
    private int id_Transaksi;
    private int Order_id;
    private String kodeBioskop;
    private String status;

    public Transaksi(int id_Transaksi, int Order_id, String kodeBioskop, String status) {
        this.id_Transaksi = id_Transaksi;
        this.Order_id = Order_id;
        this.kodeBioskop = kodeBioskop;
        this.status = status;
    }

    public int getIdTransaksi() {
        return id_Transaksi;
    }

    public int getOrderId() {
        return Order_id;
    }

    public String getKodeBioskop() {
        return kodeBioskop;
    }

    public String getStatus() {
        return status;
    }

    public void setIdTransaksi(int id_Transaksi) {
        this.id_Transaksi = id_Transaksi;
    }

    public void setOrderId(int Order_id) {
        this.Order_id = Order_id;
    }

    public void setKodeBioskop(String kodeBioskop) {
        this.kodeBioskop = kodeBioskop;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
