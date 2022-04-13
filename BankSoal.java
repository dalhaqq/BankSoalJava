import java.util.Map;
import java.util.HashMap;

public class BankSoal {
    public static void main(String[] args) {
        Soal soal1 = new SoalIsian("Hewan pemakan daging disebut ...", "Karnivora");
        Map<String, String> pilihan2 = new HashMap<String, String>();
        pilihan2.put("A", "Herbivora");
        pilihan2.put("B", "Karnivora");
        pilihan2.put("C", "Omnivora");
        Soal soal2 = new SoalPG("Hewan pemakan segala disebut", pilihan2, "C");

        Siswa andi = new Siswa("Anto Nurandi");
        andi.jawab(soal1, "karnivora");
        andi.jawab(soal2, "b");

        andi.tampilData();
    }
}
