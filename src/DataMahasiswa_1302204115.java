import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class DataMahasiswa_1302204115 {
    public static void ReadJSON() {
        try {
            Object obj = new JSONParser().parse(new FileReader("/Users/jeremiacarlo/Code/Java/KPL/TP/KPL_TP_MOD6_SE4403_1302204115/src/tp6_1_1302204115.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Nama "+jsonObject.get("Nama")+" dengan NIM "+jsonObject.get("nim")+" dari Fakultas "+jsonObject.get("fakultas"));
        } catch (FileNotFoundException FE) {
            System.out.println("File tidak ditemukan, periksa ulang path dari file json kembali!");
            FE.printStackTrace();
        } catch (IOException IE) {
            System.out.println("Error "+IE);
            IE.printStackTrace();
        } catch (ParseException PE) {
            System.out.println("Gagal parsing");
            PE.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DataMahasiswa_1302204115.ReadJSON();
    }
}