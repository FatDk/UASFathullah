package com.example.uts;

import android.content.Context;

import com.example.uts.R;
import com.example.uts.jenis.Anjing;
import com.example.uts.jenis.Hewan;
import com.example.uts.jenis.Kucing;
import com.example.uts.jenis.Tikus;

import java.util.ArrayList;
import java.util.List;

public class DataHewan {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        return anjings;
    }

    private static List<Tikus> iniDataTikus(Context ctx) {
        List<Tikus> Tikuss = new ArrayList<>();
        Tikuss.add(new Tikus("Mencit", "Asia dan Eropa", "Mencit (Mus musculus) adalah anggota Muridae (tikus-tikusan) yang berukuran kecil. Mencit mudah dijumpai di rumah-rumah dan dikenal sebagai hewan pengganggu karena kebiasaannya menggigiti mebel dan barang-barang kecil lainnya, serta bersarang di sudut-sudut lemari.", R.drawable.rat_mencit));
        Tikuss.add(new Tikus("Tikus Rumah", "Asia", "Tikus rumah (Rattus rattus) adalah hewan pengerat biasa yang mudah dijumpai di rumah-rumah dengan ekor yang panjang dan pandai memanjat serta melompat. Hewan ini termasuk dalam subsuku Murinae dan berasal dari Asia.", R.drawable.rat_house));
        Tikuss.add(new Tikus("Tikus Sawah", "Asia", "Tikus sawah, Rattus argentiventer, adalah tikus yang mudah dijumpai di pedesaan dan perkotaan di penjuru Asia Tenggara dan Asia.", R.drawable.rat_sawah)
        );;
        return Tikuss;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(iniDataTikus(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }
}
