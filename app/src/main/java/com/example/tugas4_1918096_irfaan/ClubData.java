package com.example.tugas4_1918096_irfaan;

import java.util.ArrayList;

public class ClubData {
    private static String [] clubname = {
            "Arsenal",
            "Aston Villa",
            "Brighton & Hove Albion",
            "Burnley",
            "Chelsea",
            "Crystal Palace",
            "Everton",
            "Fulham",
            "Leeds United",
            "Leicester City",
            "Liverpool",
            "Manchester City",
            "Manchester United",
            "Newcastle United",
            "Sheffield United",
            "Southampton",
            "Tottenham Hotspur",
            "West Bromwich Albion",
            "West Ham United FC",
            "Wolverhampton Wanderers"
    };
    private static String [] clubDetail = {
                "Arsenal Football Club (dikenal pula sebagai Arsenal atau The Gunners) adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London",
                "Aston Villa berdiri tahun 1874 dan menggunakan stadion Villa Park dari tahun 1897 hingga sekarang. Aston Villa merupakan salah satu anggota pendiri Liga Sepak Bola (Football League) dan langsung mencapai kesuksesan, mereka memenangkan lima gelar dalam waktu tujuh musim.",
                "Brighton & Hove Albion Football Club adalah sebuah klub sepak bola profesional asal Inggris yang berbasis di kota pantai Brighton & Hove, di timur Sussex.",
                "Burnley Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Burnley, Lancashire. Klub ini sedang bermain di Liga Utama Inggris, kasta tertinggi sepak bola inggris di musim 2016-17 setelah memenangkan liga peringkat kedua yaitu Liga Championship Inggris di musim sebelumnya.",
                "Chelsea Football Club /ˈtʃɛlsiː/ adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris.",
                "Crystal Palace Football Club merupakan sebuah tim sepak bola Inggris yang bermarkas di London Borough of Croydon dan didirikan pada tahun 1905.",
                "Everton Football Club /ˈɛvərtən/ adalah sebuah klub sepak bola profesional yang bermarkas di Kota Liverpool, Inggris, dan merupakan klub rival dari klub sekota Liverpool.",
                "Fulham Football Club /ˈfʊləm/ adalah sebuah klub sepak bola Inggris yang didirikan pada tahun 1879. Klub ini bermarkas di daerah Fulham, London dan berkompetisi di Liga Utama Inggris.",
                "Leeds United Football Club adalah sebuah klub sepak bola asal Inggris yang berbasis di Beeston, Leeds, West Yorkshire. Pada akhir musim 2019–20, mereka mampu menjadi juara Kejuaraan EFL, sehingga akan promosi ke Liga Utama Inggris pada musim selanjutnya.",
                "Leicester City F.C. adalah sebuah tim sepak bola Inggris berbasis di Leicester. Leicester Dikenal juga dengan sebutan The Foxes. Klub ini memainkan pertandingan kandangnya di Stadion King Power yang berkapsitas 32.000 penonton.",
                "Liverpool Football Club /ˈlɪvərpuːl/ (dikenal pula sebagai Liverpool atau The Reds) adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool.",
                "Manchester City Football Club (dikenal pula sebagai Man City atau The Citizens) adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakaan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester.",
                "Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910.",
                "Newcastle United Football Club adalah klub sepak bola profesional Inggris yang berbasis di Newcastle upon Tyne, dan bermain di Liga Utama Inggris, kompetisi tingkat teratas dalam sepak bola Inggris.",
                "Sheffield United Football Club adalah sebuah tim sepak bola profesional Inggris yang bermarkas di kota Sheffield, Yorkshire Selatan, Inggris. Tim ini dibentuk tahun 1889.",
                "Southampton Football Club (berdiri dengan nama St. Mary's YMA) merupakan sebuah tim sepak bola Inggris yang didirikan tahun 1898. Bermarkas di Stadion St Mary's, Southampton, Hampshire, Southampton pada musim 2011-12 bermain di Football League Championship.",
                "Tottenham Hotspur Football Club /ˈtɒtənəm/, adalah klub sepak bola yang berasal dari Tottenham, sebuah daerah yang berada di wilayah utara London.",
                "West Bromwich Albion Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di West Bromwich, West Midlands. Didirikan pada tahun 1878.",
                "West Ham United Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di London. Sejak 2016, klub ini memainkan pertandingan kandangnya di London Stadium yang berkapasitas 80.000 kursi.",
                "Wolverhampton Wanderers Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Wolverhampton, Britania Raya yang bermain di Liga Utama Inggris."

    };
    private static int[] clubImage ={
            R.drawable.arsenal,
            R.drawable.aston,
            R.drawable.brighton,
            R.drawable.burnley,
            R.drawable.chelsea,
            R.drawable.crystal,
            R.drawable.everton,
            R.drawable.fulham,
            R.drawable.leeds,
            R.drawable.leicester,
            R.drawable.liverpool,
            R.drawable.mancity,
            R.drawable.manutd,
            R.drawable.newcastle,
            R.drawable.sheffield,
            R.drawable.southampton,
            R.drawable.tottenham,
            R.drawable.wba,
            R.drawable.westham,
            R.drawable.wolverhampton

    };
    static ArrayList<Club> getListData(){
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position <clubname.length; position++){
            Club club = new Club();
            club.setName(clubname[position]);
            club.setDetail(clubDetail[position]);
            club.setPhoto(clubImage[position]);
            list.add(club);
        }
        return list;

    }
}
