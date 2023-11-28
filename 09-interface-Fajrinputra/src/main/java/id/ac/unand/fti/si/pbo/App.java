package id.ac.unand.fti.si.pbo;

public class App {

    public static void main(String[] args) {
        MemberPlatinum memberPlatinum = new MemberPlatinum();
        MemberGold memberGold = new MemberGold();
        MemberSilver memberSilver = new MemberSilver();
        // Nama: Fajrin Putra Pratama
        // NIM: 2211523004
        // ini adalah polymorphism
        // yang di sebabkan dalam sebuah polymorphism antar kelas dapat memiliki method
        // yang sama
        // namun implementasi method berbeda, sehingga memberikan output yang berbeda
        // disini terlihat masing-masing object yang dibuat dari kelas berbeda
        // ketika memanggil method yang sama, maka akan memberikan output yang berbeda
        System.out.println("Total Bayar Platinum Rp" + memberPlatinum.hitungTotalBayar(100000));
        System.out.println("Total Bayar Gold Rp" + memberGold.hitungTotalBayar(100000));
        System.out.println("Total Bayar Silver Rp" + memberSilver.hitungTotalBayar(1000000));
    }

}
