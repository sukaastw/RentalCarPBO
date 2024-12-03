/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conect {
    private static Connection mysqlconfig;

    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/rencarpbo"; // Sesuaikan nama database
            String user = "root"; // Sesuaikan username database
            String pass = ""; // Sesuaikan password database

            // Pastikan driver terdaftar
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Buat koneksi ke database
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi berhasil!");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Koneksi gagal: " + e.getMessage());
            throw e; // Lempar ulang SQLException
        }
        return mysqlconfig;
    }
}


