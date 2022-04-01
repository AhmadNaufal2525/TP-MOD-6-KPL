import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class KuliahMahasiswa_1302204115 {
    public static void ReadJSON() {
        try {
            Object obj = new JSONParser().parse(new FileReader("/Users/jeremiacarlo/Code/Java/KPL/TP/KPL_TP_MOD6_SE4403_1302204115/src/tp6_2_1302204115.json"));
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
        KuliahMahasiswa_1302204115.ReadJSON();
    }
}
