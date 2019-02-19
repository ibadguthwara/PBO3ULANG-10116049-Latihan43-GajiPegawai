/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan43.gajipegawai;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Membuat Program Gaji Pegawai
 *  
 */
public class PBO3ULANG10116049Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GajiPegawai gajipegawai = new GajiPegawai();
        gajipegawai.setNama("M. Ibad Guthwara");
        gajipegawai.setAlamat("Jalan Dago Pojok 36");
        gajipegawai.setUangTransport(250000);
        gajipegawai.setUangTunjangan(300000);
        gajipegawai.setGajiPokok(4500000);
        gajipegawai.setTotalGaji(gajipegawai.totalGaji(
                    gajipegawai.getUangTunjangan(),
                    gajipegawai.getUangTransport(), 
                    gajipegawai.getGajiPokok()));
        gajipegawai.tampilData(gajipegawai.getNama(), gajipegawai.getAlamat(), 
                               gajipegawai.getUangTunjangan(), 
                               gajipegawai.getUangTransport(), 
                               gajipegawai.getGajiPokok(), 
                               gajipegawai.getTotalGaji());
    }
    
}
