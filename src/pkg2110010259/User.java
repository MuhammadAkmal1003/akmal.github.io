/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010259;


/**
 *
 * @author mal
 */
public class User {
        public static void main(String[] args) {

        }
        private int id_user;
        private String username;
        private String password;
        private String bioskop;
        private String level;

        public User(int id_user, String username, String password, String bioskop, String level) {
            this.id_user = id_user;
            this.username = username;
            this.password = password;
            this.bioskop = bioskop;
            this.level = level;
        }

        // getter dan setter
        public int getId_user() {
            return id_user;
        }

        public void setId_user(int id_user) {
            this.id_user = id_user;
        }

        public String getNama_pengguna() {
            return username;
        }

        public void setNama_pengguna(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getBioskop() {
            return bioskop;
        }

        public void setBioskop(String bioskop) {
            this.bioskop = bioskop;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        // method
        public void updateInfo(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }