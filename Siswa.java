public final class Siswa {
    private String nama;
    private int nilai;

    public Siswa(String nama) {
        this.nama = nama;
    }

    public void jawab(Soal soal, String jawaban) {
        soal.tampilSoal();
        System.out.println("Jawaban Anda: " + jawaban);
        int poin = soal.koreksi(jawaban);
        if (poin > 0) {
            System.out.println("Jawaban benar");
            nilai += poin;
        } else {
            System.out.println("Jawaban salah");
        }
    }

    public void tampilData() {
        System.out.println("Nama\t: " + nama);
        System.out.println("Nilai\t: " + nilai);
    }
}
