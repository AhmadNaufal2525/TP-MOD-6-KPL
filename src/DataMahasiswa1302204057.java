import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class DataMahasiswa1302204057 {
    public static void ReadJSON() {
        try {
            Object obj = new JSONParser().parse(new FileReader("D:\\Kuliah\\Semester 4\\Konstruksi Perangkat Lunak\\TP\\TP-MOD-6-KPL\\src\\tp6_1_1302204057.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Nama "+jsonObject.get("nama")+" dengan nim "+jsonObject.get("nim")+" dari fakultas "+jsonObject.get("fakultas"));
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
        DataMahasiswa1302204057.ReadJSON();
    }
}