import java.util.Map;

public class SoalPG extends Soal {
    private Map<String, String> pilihan;

    public SoalPG(String soal, Map<String, String> pilihan, String jawaban) {
        super(soal, jawaban);
        this.pilihan = pilihan;
    }

    @Override
    public void tampilSoal() {
        System.out.println(getSoal());
        for (String pil : pilihan.keySet()) {
            System.out.println(pil + ". " + pilihan.get(pil));
        }
    }

    public int koreksi(String jawaban) {
        if (jawaban.equalsIgnoreCase(getJawaban())) {
            return 2;
        }
        return 0;
    }
}
