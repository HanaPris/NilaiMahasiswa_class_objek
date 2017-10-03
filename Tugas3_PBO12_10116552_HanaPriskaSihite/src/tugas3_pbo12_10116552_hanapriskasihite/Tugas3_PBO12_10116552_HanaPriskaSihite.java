/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3_pbo12_10116552_hanapriskasihite;

/**
 *
 * @author Hana
 */
class Mahasiswa{
    private String nama, keter1, keter2, keter3, keter4, keter5;
    private int nim;
    private double quiz, uts, uas, na;
    private char index1, index2, index3, index4, index5;

    public String getKeter1() {
        return keter1;
    }

    public void setKeter1(String keter1) {
        this.keter1 = keter1;
    }

    public String getKeter2() {
        return keter2;
    }

    public void setKeter2(String keter2) {
        this.keter2 = keter2;
    }

    public String getKeter3() {
        return keter3;
    }

    public void setKeter3(String keter3) {
        this.keter3 = keter3;
    }

    public String getKeter4() {
        return keter4;
    }

    public void setKeter4(String keter4) {
        this.keter4 = keter4;
    }

    public String getKeter5() {
        return keter5;
    }

    public void setKeter5(String keter5) {
        this.keter5 = keter5;
    }

    public char getIndex1() {
        return index1;
    }

    public void setIndex1(char index1) {
        this.index1 = index1;
    }

    public char getIndex2() {
        return index2;
    }

    public void setIndex2(char index2) {
        this.index2 = index2;
    }

    public char getIndex3() {
        return index3;
    }

    public void setIndex3(char index3) {
        this.index3 = index3;
    }

    public char getIndex4() {
        return index4;
    }

    public void setIndex4(char index4) {
        this.index4 = index4;
    }

    public char getIndex5() {
        return index5;
    }

    public void setIndex5(char index5) {
        this.index5 = index5;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double Na(double quiz, double uts, double uas) {
        return 0.2 * quiz + 0.3 * uts + 0.5 * uas;
    }
}
public class Tugas3_PBO12_10116552_HanaPriskaSihite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j;
        Mahasiswa oNMHS = new Mahasiswa(); 
        oNMHS.setNama("Hana Priska Sihite");
        i = 1;
        while (i <= 4) {
            System.out.println("Nama ke " + i + " : " + oNMHS.getNama());
            i++;
        }
 
        oNMHS.setNim(1011655);
        j = 8;
        while (j >= 1) {
            System.out.println("NIM ke " + j + " : " + oNMHS.getNim()+j);
            j--;
        }
 
        oNMHS.setQuiz(75);
        oNMHS.setUts(80);
        oNMHS.setUas(90);
        System.out.println("\nQuiz = " + oNMHS.getQuiz());
        System.out.println("UTS = " + oNMHS.getUts());
        System.out.println("UAS = " + oNMHS.getUas());
        System.out.println("\nNilai akhir = " + oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()));
 
        if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 80 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 100) {
            oNMHS.setIndex1('A');
            oNMHS.setKeter1("Sangat Baik");
            System.out.println("\nIndex : " + oNMHS.getIndex1());
            System.out.println("Keterangan : " + oNMHS.getKeter1());
        } else if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 68 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 80) {
            oNMHS.setIndex2('B');
            oNMHS.setKeter2("Baik");
            System.out.println("\nIndex : " + oNMHS.getIndex2());
        } else if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 56 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 68) {
            oNMHS.setIndex3('C');
            oNMHS.setKeter3("Cukup Baik");
            System.out.println("\nIndex : " + oNMHS.getIndex3());
        } else if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 45 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 56) {
            oNMHS.setIndex4('D');
            oNMHS.setKeter4("Kurang Baik");
            System.out.println("\nIndex : " + oNMHS.getIndex4());
        } else if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 0 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 45) {
            oNMHS.setIndex5('D');
            oNMHS.setKeter5("Sangat Kurang Baik");
            System.out.println("\nIndex : " + oNMHS.getIndex5());
    }
    
}}
