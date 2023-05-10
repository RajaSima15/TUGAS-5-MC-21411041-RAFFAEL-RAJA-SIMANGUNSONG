package com.example.tugas5_mc_21411041_raja;

import java.util.ArrayList;

public class MusicData {
    private static String[] MusicNames = {
            "The Scientist - Coldplay",
            "Superman - Eminem",
            "Fifty - Cupit",
    };

    private static String[] MusicDetails = {
            "The Scientist mengisahkan tentang seseorang yang mencoba untuk memperbaiki hubungannya dengan sang kekasih. Namun sekeras apa pun ia mencoba tetap terjadi permasalahan hingga membuat keduanya berpisah.",
            "Lagu Superman menceritakan tentang hubungan bebas dengan para gadis yang dimiliki Eminem dalam hidupnya. Superman dalam lirik lagu ini bisa diartikan sebagai pahlawan yang menyelamatkan wanita dari situasi berbahaya.",
            "Lagu Cupid menceritakan tentang ketidakberuntungan seseorang dalam percintaan, sehingga membuatnya tidak percaya dengan cinta.",
    };

    private static int[] MusicImages = {
            R.drawable.scientist,
            R.drawable.superman,
            R.drawable.cupid,
    };

    static ArrayList<MusicModel> getListData(){
        ArrayList<MusicModel> list = new ArrayList<>();
        for (int position = 0; position < MusicNames.length; position++){
            MusicModel musicmodel = new MusicModel();
            musicmodel.setName(MusicNames[position]);
            musicmodel.setDetail(MusicDetails[position]);
            musicmodel.setPhoto(MusicImages[position]);
            list.add(musicmodel);
        }
        return list;
    }
}
