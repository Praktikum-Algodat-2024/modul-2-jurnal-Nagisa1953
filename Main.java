package PACKAGE_NAME;

public class Main {
    public static void main(String[] args) {
        LinkedList modul2 = new LinkedList();

        modul2.enqueue(new Antrian("Kazuma", 2, "ada"));
        modul2.enqueue(new Antrian("Hu Tao", 3, "ada"));
        modul2.enqueue(new Antrian("kafka", 3, "Tida Ada"));
        modul2.enqueue(new Antrian("Xiangling", 1, "Tidak Ada"));
        modul2.push(new Buku("Belajar Java", "Raysen", "Edukasi", "Buku Biasa"));
        modul2.push(new Buku("Cara Menjadi Orang Kaya", "Teguh", "Fantasy", "Buku Biasa"));
        modul2.displayQueue();
        modul2.displayStack();

        modul2.dequeue();
        modul2.pop();
        modul2.pop();

        modul2.push(new Buku("Cara Tidur Cepat", "Teguh", "Edukasi Kayaknya", "Cursed"));
        modul2.push(new Buku("Belajar C++", "Raysen", "Edukasi", "Buku Biasa"));
        modul2.push(new Buku("Belajar Ilmu Hitam", "Megumin", "Unknown", "Cursed"));
        modul2.displayStack();
        modul2.dequeue();
        modul2.pop();
        modul2.pop();
        modul2.pop();

        modul2.displayQueue();
        modul2.enqueue(new Antrian("Sucrose", 3, "ada"));
        modul2.displayQueue();

        modul2.deleteQueue(2);
        modul2.displayQueue();

        modul2.swapQueue(1,2);
        modul2.displayQueue();

        modul2.push(new Buku("Resurection", "Unknown", "Unknown", "Cursed"));
        modul2.push(new Buku("Alchemy", "Albedo", "Sience", "Cursed"));
        modul2.push(new Buku("Durin the Forgotten Dragon", "Gold", "Misteri", "Buku Biasa"));
        modul2.displayStack();
        modul2.dequeue();
        modul2.pop();
        modul2.pop();
        modul2.pop();

        modul2.displayQueue();
        modul2.push(new Buku("Raysen the Forgotten One", "Unknown", "Sejarah", "Cursed"));
        modul2.push(new Buku("Misteri Menghilangnya Nasi Puyung", "Optimus", "Misteri", "Buku Biasa"));
        modul2.push(new Buku("Cara Menjadi milioner Dalam 1 Jam", "Master Oogway", "Edukasi", "Buku Biasa"));
        modul2.displayStack();
        modul2.swapStack(1,3);
        modul2.displayStack();
        modul2.pop();
        modul2.displayStack();
        modul2.pop();
        modul2.pop();
        modul2.displayQueue();
    }
}