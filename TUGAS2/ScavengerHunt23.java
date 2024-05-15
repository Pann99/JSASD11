package TUGAS2;

public class ScavengerHunt23 {
    String soal, kunci;
    ScavengerHunt23 next;

    ScavengerHunt23() {}

    ScavengerHunt23(String soal, String kunci, ScavengerHunt23 next) {
        this.soal = soal;
        this.kunci = kunci;
        this.next = next;
    }
}