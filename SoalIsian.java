public class SoalIsian extends Soal {
    private int poin;

    public SoalIsian() {
    }
    
    public SoalIsian(String soal, String jawaban) {
        super(soal, jawaban);
        this.poin = 5;
    }

    public SoalIsian(String soal, String jawaban, int poin) {
        super(soal, jawaban);
        this.poin = poin;
    }

    public int koreksi(String jawaban) {
        if (jawaban.equalsIgnoreCase(getJawaban())) {
            return poin;
        }
        return 0;
    }
}
