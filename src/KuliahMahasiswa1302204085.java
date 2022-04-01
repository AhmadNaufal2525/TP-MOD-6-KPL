import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class KuliahMahasiswa1302204085 {
    public static void ReadJSON() {
        try {
            Object obj = new JSONParser().parse(new FileReader("F:\\Kuliah\\Kuliah\\Semester 4\\Konstruksi Perangkat Lunak\\praktikum_kpl\\MOD 6\\tpmodul6_kelompok_4\\src\\tp6_2_1302204085.json"));
            JSONArray jsonarray = (JSONArray) obj;
            Iterator itr = jsonarray.iterator();
            System.out.println("Daftar mata kuliah yang diambil");
            int i = 1;
            while (itr.hasNext()) {
                JSONObject atr = (JSONObject) itr.next();
                System.out.println("MK "+i+" "+atr.get("kode_mk")+" - "+atr.get("nama_mk"));
                i +=1;
            }

        } catch (FileNotFoundException FE) {
            System.out.println("File tidak ditemukan, periksa ulang path dari file json kembali!");
            FE.printStackTrace();
        } catch (IOException IE) {
            System.out.println("Error "+IE);
            IE.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Gagal parsing");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        KuliahMahasiswa1302204085.ReadJSON();
    }
}
