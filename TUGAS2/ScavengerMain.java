package TUGAS2;

import java.util.Scanner;

public class ScavengerMain {
    public static void menu() {
        System.out.println("=======================");
        System.out.println("PILIHAN MENU");
        System.out.println("=======================");
        System.out.println("1. Tampilkan pertanyaan");
        System.out.println("2. Jawab pertanyaan");
        System.out.println("3. Exit");
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList23 linkedList = new LinkedList23();
        int pil;

        do {
            menu();
            System.out.print("Pilih salah satu (1/2/3) : ");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    linkedList.addLast("Monumen apa yang tidak pernah jadi tua?", "Monumen Tugu Muda");
                    linkedList.addLast("Hewan apa yang berbuah?", "Buah Naga");
                    linkedList.addLast("Hp Termahal", "Goldvish Le Million");
                    linkedList.addLast("Presiden Pertama Indonesia", "Ir. Soekarno");
                    linkedList.print();
                    break;
                case 2:
                    linkedList.start();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia .");
                    break;
            }
        } while (pil == 1 || pil == 2 || pil == 3);
    }

}