package com.utils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 8/27/2016.
 */
public class Constants {
    public static String TOASTCOLOR="#6E6E70",TOASTCOLOR_TEXT="#FFFFFF";


    public static SharedPreferences sp;
    public static SharedPreferences.Editor editor;
    public static String prefName="pref2";

    public static int width, height;
    public static String RATE_ID = "com.indapp.daroodapp";

    static Typeface tf = null, tf_arabic;
    public static int fontSize = 15;
    public static String surehname_arabic[] =
            {
                    "سُوْرَۃُ الْفَاتِحَۃ", "سُوْرَۃُ الْبَقَرَۃ", "سُوْرَۃُ اٰلِ عِمْرٰن", "سُوْرَۃُ النِّسَآء", "سُوْرَۃُ الْمَآٮِٕدَۃ", "سُوْرَۃُ الْاَنْعَام", "سُوْرَۃُ الْاَعْرَاف", "سُوْرَۃُ الْاَنْفَال", "سُوْرَۃُ التَّوْبَۃ", "سُوْرَۃُ یُوْنُس", "سُوْرَۃُ ھُوْد", "سُوْرَۃُ یُوْسُف", "سُوْرَۃُ الرَّعْد", "سُوْرَۃُ اِبْرٰھِیْم", "سُوْرَۃُ الْحِجْر", "سُوْرَۃُ النَّحْل", "سُوْرَۃُ بَنِیْۤ اِسْرَآءِیْل", "سُوْرَۃُ الْکَھْف", "سُوْرَۃُ مَرْیَم", "سُوْرَۃُ طٰہٰ", "سُوْرَۃُ الْاَنْۘبِیَآء", "سُوْرَۃُ الْحَجّ", "سُوْرَۃُ الْمُؤْمِنُوْن", "سُوْرَۃُ النُّوْر", "سُوْرَۃُ الْفُرْقَان", "سُوْرَۃُ الشُّعَرَآء", "سُوْرَۃُ النَّمْل", "سُوْرَۃُ الْقَصَص", "سُوْرَۃُ الْعَنْکَبُوْت", "سُوْرَۃُ الرُّوْم", "سُوْرَۃُ لُقْمٰن", "سُوْرَۃُ السَّجْدَۃ", "سُوْرَۃُ الْاَحْزَاب", "سُوْرَۃُ سَبَا", "سُوْرَۃُ فَاطِر", "سُوْرَۃُ یٰسٓ", "سُوْرَۃُ الصّٰٓفّٰت", "سُوْرَۃُ صٓ", "سُوْرَۃُ الزُّمَر", "سُوْرَۃُ الْمُؤْمِن", "سُوْرَۃُ حٰمٓ السَّجْدَۃ", "سُوْرَۃُ الشُّوْرٰی", "سُوْرَۃُ الزُّخْرُف", "سُوْرَۃُ الدُّخَان", "سُوْرَۃُ الْجَاثِیَۃ", "سُوْرَۃُ الْاَحْقَاف", "سُوْرَۃُ مُحَمَّد ", "سُوْرَۃُ الْفَتْح", "سُوْرَۃُ الْحُجُرٰ ت", "سُوْرَۃُ قٓ", "سُوْرَۃُ الذّٰرِیٰت", "سُوْرَۃُ الطُّوْر", "سُوْرَۃُ النَّجْم", "سُوْرَۃُ الْقَمَر", "سُوْرَۃُ الرَّحْمٰن", "سُوْرَۃُ الْوَاقِعَۃ", "سُوْرَۃُ الْحَدِیْد", "سُوْرَۃُ الْمُجَادَلَۃ", "سُوْرَۃُ الْحَشْر", "سُوْرَۃُ الْمُمْتَحِنَۃ", "سُوْرَۃُ الصَّف", "سُوْرَۃُ الْجُمُعَۃ", "سُوْرَۃُ الْمُنٰفِقُوْن", "سُوْرَۃُ التَّغَابُن", "سُوْرَۃُ الطَّلَاق", "سُوْرَۃُ التَّحْرِیْم", "سُوْرَۃُ الْمُلْك", "سُوْرَۃُ الْقَلَم", "سُوْرَۃُ الْحَآقَّۃ", "سُوْرَۃُ الْمَعَارِج", "سُوْرَۃُ نُوْ ح", "سُوْرَۃُ الْجِنّ", "سُوْرَۃُ الْمُزَّمِّل", "سُوْرَۃُ الْمُدَّثِّر", "سُوْرَۃُ الْقِیٰمَۃ", "سُوْرَۃُ الدَّھْر", "سُوْرَۃُ الْمُرْسَلٰت", "سُوْرَۃُ النَّبَا", "سُوْرَۃُ النّٰزِعٰت", "سُوْرَۃُ عَبَسَ", "سُوْرَۃُ التَّکْوِیْر", "سُوْرَۃُ الْاِنْفِطَار", "سُوْرَۃُ الْمُطَفِّفِیْن", "سُوْرَۃُ الْاِنْشِقَاق", "سُوْرَۃُ الْبُرُوْج", "سُوْرَۃُ الطَّارِق", "سُوْرَۃُ الْاَعْلٰی", "سُوْرَۃُ الْغَاشِیَۃ", "سُوْرَۃُ الْفَجْر", "سُوْرَۃُ الْبَلَد", "سُوْرَۃُ الشَّمْس", "سُوْرَۃُ الَّیْل", "سُوْرَۃُ الضُّحٰی", "سُوْرَۃُ الْاِنْشِرَاح", "سُوْرَۃُ التِّیْن", "سُوْرَۃُ الْعَلَق", "سُوْرَۃُ الْقَدْر", "سُوْرَۃُ الْبَیِّنَۃ", "سُوْرَۃُ الزِّلْزَال", "سُوْرَۃُ الْعٰدِیٰت", "سُوْرَۃُ الْقَارِعَۃ", "سُوْرَۃُ التَّکَاثُر", "سُوْرَۃُ الْعَصْر", "سُوْرَۃُ الْھُمَزَۃ", "سُوْرَۃُ الْفِیْل", "سُوْرَۃُ قُرَیْش", "سُوْرَۃُ الْمَاعُوْن", "سُوْرَۃُ الْکَوْثَر", "سُوْرَۃُ الْکٰفِرُوْن", "سُوْرَۃُ النَّصْر", "سُوْرَۃُ اللَّھَب", "سُوْرَۃُ الْاِخْلَاص", "سُوْرَۃُ الْفَلَق", "سُوْرَۃُ النَّاس",
            };

    public static String surehname_english[] =
            {
                    "Al-Fatihah", "Al-Baqarah", "Aali Imran", "An-Nisa’", "Al-Ma’idah", "Al-An’am", "Al-A’raf", "Al-Anfal", "At-Taubah", "Yunus", "Hud", "Yusuf", "Ar-Ra’d", "Ibrahim", "Al-Hijr", "An-Nahl", "Al-Isra’", "Al-Kahf", "Maryam", "Ta-Ha", " Al-Anbiya", "Al-Haj", "Al-Mu’minun", "An-Nur", "Al-Furqan", "Ash-Shu’ara’ ", "An-Naml ", "Al-Qasas ", "Al-Ankabut ", "Ar-Rum", "Luqman ", "As-Sajdah", "Al-Ahzab", "Saba’ ", "Al-Fatir", "Ya-Sin ", "As-Saffah", "Saad", "Az-Zumar", "Ghafar ", "Fusilat ", "Ash-Shura", "Az-Zukhruf", "Ad-Dukhan ", "Al-Jathiyah ", "Al-Ahqaf ", "Muhammad ", "Al-Fat’h", "Al-Hujurat ", "Qaaf ", "Adz-Dzariyah ", "At-Tur ", "An-Najm", "Al-Qamar", "Ar-Rahman ", "Al-Waqi’ah ", "Al-Hadid ", "Al-Mujadilah ", "Al-Hashr ", "Al-Mumtahanah", "As-Saf", "Al-Jum’ah ", "Al-Munafiqun ", "At-Taghabun ", "At-Talaq ", "At-Tahrim ", "Al-Mulk ", "Al-Qalam ", "Al-Haqqah", "Al-Ma’arij", "Nuh", "Al-Jinn", "Al-Muzammil", "Al-Mudaththir", "Al-Qiyamah", "Al-Insan", "Al-Mursalat", "An-Naba’", "An-Nazi’at", "‘Abasa", "At-Takwir", "Al-Infitar", "Al-Mutaffifin", "Al-Inshiqaq", "Al-Buruj", "At-Tariq", "Al-A’la", "Al-Ghashiyah", "Al-Fajr", "Al-Balad", "Ash-Shams", "Al-Layl", "Adh-Dhuha", "Al-Inshirah", "At-Teen", "Al-‘Alaq", "Al-Qadar", "Al-Bayinah", "Az-Zalzalah", "Al-‘Adiyah", "Al-Qaari’ah", "At-Takathur", "Al-‘Asr", "Al-Humazah", "Al-Feel", "Quraish", "Al-Maa’un", "Al-Kauthar", "Al-Kafirun", "An-Nasr", "Al-Masad", "Al-Ikhlaas", "Al-Falaq", "An-Naas"
//		"Al-Fatiha ", "Al-Baqara ", "Aal-e-Imran ", "An-Nisa ", "Al-Maeda ", "Al-Anaam ", "Al-Araf ", "Al-Anfal ", "At-Taubah ", "Yunus ", "Hud ", "Yusuf ", "Ar-Rad ", "Ibrahim ", "Al-Hijr ", "An-Nahl ", "Al-Isra ", "Al-Kahf ", "Maryam ", "Taha ", "Al-Anbiya ", "Al-Hajj ", "Al-Mumenoon ", "An-Noor ", "Al-Furqan ", "Ash-Shuara ", "An-Naml ", "Al-Qasas ", "Al-Ankaboot ", "Ar-Room ", "Luqman ", "As-Sajda ", "Al-Ahzab ", "Saba ", "Fatir ", "Ya Seen ", "As-Saaffat ", "Sad ", "Az-Zumar ", "Al Momin ", "Ha Mim Sajda ", "Ash-Shura ", "Az-Zukhruf ", "Ad-Dukhan ", "Al-Jathiya ", "Al-Ahqaf ", "Muhammad ", "Al-Fath ", "Al-Hujraat ", "Qaf ", "Adh-Dhariyat ", "At-tur ", "An-Najm ", "Al-Qamar ", "Ar-Rahman ", "Al-Waqia ", "Al-Hadid ", "Al-Mujadila ", "Al-Hashr ", "Al-Mumtahana ", "As-Saff ", "Al-Jumua ", "Al-Munafiqoon ", "At-Taghabun ", "At-Talaq ", "At-Tahrim ", "Al-Mulk ", "Al-Qalam ", "Al-Haaqqa ", "Al-Maarij ", "Nooh ", "Al-Jinn ", "Al-Muzzammil ", "Al-Muddathir ", "Al-Qiyama ", "Al-Insan ", "Al-Mursalat ", "An-Naba ", "An-Naziat ", "Abasa ", "At-Takwir ", "AL-Infitar ", "Al-Mutaffifin ", "Al-Inshiqaq ", "Al-Burooj ", "At-Tariq ", "Al-Ala ", "Al-Ghashiya ", "Al-Fajr ", "Al-Balad ", "Ash-Shams ", "Al-Lail ", "Ad-Dhuha ", "Al-Inshirah ", "At-Tin ", "Al-Alaq ", "Al-Qadr ", "Al-Bayyina ", "Al-Zalzala ", "Al-Adiyat ", "Al-Qaria ", "At-Takathur ", "Al-Asr ", "Al-Humaza ", "Al-fil ", "Quraish ", "Al-Maun ", "Al-Kauther ", "Al-Kafiroon ", "An-Nasr ", "Al-Masadd ", "Al-Ikhlas ", "Al-Falaq ", "An-Nas ",
            };
    public static String paraname_english[] = {

//		"Alif Lam Meem", "Sayaqool", "Tilkal Rusull", "Lan Tana Loo", "Wal Mohsanat", "La Yuhibbullah", "Wa Iza Samiu", "Wa Lau Annana", "Qalal Malao", "Wa A'lamu", "Yatazeroon", "Wa Mamin Da'abat", "Wa Ma Ubrioo", "Rubama", "Subhanallazi", "Qal Alam", "Aqtarabo", "Qadd Aflaha", "Wa Qalallazina", "A'man Khalaq", "Utlu Ma Oohi", "Wa Manyaqnut", "Wa Mali", "Faman Azlam", "Elahe Yuruddo", "Ha'a Meem", "Qala Fama Khatbukum", "Qadd Sami Allah", "Tabarakallazi", "Amma Yatasa'aloon"
            "Alif Laam Meem", "Sayaqoolu", "Tilkar rusulu", "Lan tanaloo", "Wal mohsinaatu", "La yuhibbullahu", "Wa izaa sami'u", "Walau annana", "Qaalalmalao", "Wa'alamoo", "Ya'taziroona", "Wamaa min daabbatin", "Wamaa obarrioo", "Rubama", "Subhaanallazee", "Qaala alam", "Iqtaraba", "Qad aflaha", "Wa qaalallazeena", "Amman khalaqa", "Utlo ma Oohiya", "Wa maiyaqnut", "Wa maaliya", "Faman azlamu", "Elaihi yuraddu", "Haa meem", "Qaala fama khatbukum", "Qad sami 'allahu", "Tabaarakal lazee", "Amma",

    };
    public static String paraname_arabic[] = {

            "الٓمّ", "سَيَقُوْل", "تِلْكَ الرُّسُل", "لَنْ تَنَالُوا", "وَالْمُحْصَنٰت", "لَا يُحِبُّ الله", "وَاِذَا سَمِعُوْا", "وَلَوْ اَنَّنَا", "قَالَ الْمَلَا", "وَاعْلَمُوْا", "يَعْتَذِرُوْن", "وَمَا مِنْ دَابَّة", "وَمَا اُبَرِّیٔ", "رُبَمَا", "سُبْحٰنَ الَّذِي", "قَالَ اَلَم", "اِقْتَرَب", "قَدْ اَفْلَح", "وَقَالَ الَّذِيْن", "اَمَّنْ خَلَق", "اُتْلُ مَا اُوْحِي", "وَمَنْ يَّقْنُت", "وَمَا لِي", "فَمَنْ اَظْلَم", "اِلَيْهِ يُرَدُّ", "حٓمٓ", "قَالَ فَمَا خَطْبُكُم", "قَدْ سَمِعَ الله", "تَبٰرَكَ الَّذِي", "عَمَّ",
//		"الم", "سَيَقُولُ", "تِلْكَ الرُّسُلُ", "لَنْ تَنَالُوا", "وَالْمُحْصَنَاتُ", "لَا يُحِبُّ اللَّهُ", "وَإِذَا سَمِعُوا", "وَلَوْ أَنَّنَا", "قَالَ الْمَلَأُ", "وَاعْلَمُوا", "يَعْتَذِرُونَ", "وَمَا مِنْ دَابَّةٍ", "وَمَا أُبَرِّئُ", "رُبَمَا", "سُبْحَانَ الَّذِي", "قَالَ أَلَمْ", "اقْتَرَبَ", "قَدْ أَفْلَحَ", "وَقَالَ الَّذِينَ", "أَمَّنْ خَلَقَ", "اتْلُ مَا أُوحِيَ", "وَمَنْ يَقْنُتْ", "وَمَا لِيَ", "فَمَنْ أَظْلَمُ", "إِلَيْهِ يُرَدُّ", "حم", "قَالَ فَمَا خَطْبُكُمْ", "قَدْ سَمِعَ اللَّهُ", "تَبَارَكَ الَّذِي", "عَمَّ يَتَسَاءَلُونَ"


    };
    public static String INDEX_URDU[]={
            "۱  درود شریف ",
            "۲  درود شریف ",
            "۳  درود شریف ",
            "۴  درود شریف ",
            "۵  درود شریف ",
            "۶  درود شریف ",
            "۷  درود شریف ",
            "۸  درود شریف ",
            "۹  درود شریف ",
            "۱۰  درود شریف ",
            "۱۱  درود شریف ",
            "۱۲  درود شریف ",
            "۱۳  درود شریف ",
            "۱۴  درود شریف ",
            "۱۵  درود شریف ",
            "۱۶  درود شریف ",
            "۱۷  درود شریف ",
            "۱۸  درود شریف ",
            "۱۹  درود شریف ",
            "۲۰  درود شریف ",
            "۱-۲۱  درود شریف ",
            "۲-۲۱  درود شریف ",
            "۲۲  درود شریف ",
            "۲۳  درود شریف ",
            "۲۴  درود شریف ",
            "۲۵  درود شریف ",
            "۲۶ صیغ السلام",
            "۲۷ صیغ السلام",
            "۲۸ صیغ السلام",
            "۲۹ صیغ السلام",
            "۳۰ صیغ السلام",
            "۳۱ صیغ السلام",
            "۳۲ صیغ السلام",
            "۳۳ صیغ السلام",
            "۳۴ صیغ السلام",
            "۳۵ صیغ السلام",
            "۳۶ صیغ السلام",
            "۳۷ صیغ السلام",
            "۳۸ صیغ السلام",
            "۳۹ صیغ السلام",
            "۴۰ صیغ السلام",
            "روضۂ اطہر پر سلام پڑھنے کا طریقہ ",
            "نبیٔ اکرم شفیع اعظم ﷺ",
            "میں تو اس قابل نہ تھا",
            "نعت لکھنے کا یہ سامان بنا لوں تو لکھوں",
            "کس طرح نعت کے لکھنے کی شروعات کروں",
            "تجھ سا کوئی نہیں ",
    };
//    public static int surehindex[]={2, 3, 107, 166, 231, 281, 333, 394, 416,463,495,529,560,575,590,603,638,666,693,710,734,755,778,797,821,837,862,882,907,925,941,951,958,981,996,1010,1024,1041,1055,1076,1098,1112,1128,1144,1151,1161,1172,1183,1194,1201,1208,1215,1220,1227,1233,1240,1249,1260,1268,1276,1282,1287,1291,1293,1298,1304,1309,1315,1320,1325,1329,1333,1338,1342,1346,1350,1354,1358,1361,1365,1368,1370,1372,1375,1377,1380,1381,1383,1385,1388,1389,1391,1392,1393,1394,1395,1396,1397,1399,1400,1401,1402,1403,1403,1404,1405,1405,1406,1406,1407,1408,1408,1409,1409,1410};
//    public static int surehindex[]={2, 3, 22, 32, 44, 53, 62, 73, 77, 85, 90, 96, 101, 104, 106, 109, 115, 119, 124, 127, 131, 135, 139, 142, 146, 148, 152, 156, 160, 164, 166, 168, 169, 173, 176, 178, 180, 183, 185, 189, 192, 195, 197, 200, 201, 203, 204, 206, 208, 209, 210, 211, 212, 213, 214, 215, 217, 219, 220, 221, 222, 223, 224, 224, 225, 226, 227, 227, 228, 229, 231, 231, 231, 232, 233, 233, 234, 235, 235, 236, 236, 237, 237, 237, 238, 238, 238, 239, 239, 239, 240, 240, 240, 240, 240, 241, 241, 241, 241, 242, 242, 242, 242, 242, 242, 242, 243, 243, 243, 243, 243, 243, 243, 243};
//    public static int paraIndex[]={2, 11, 19, 27, 35, 43, 51, 59, 67, 75, 83, 91, 99, 107, 115, 123, 131, 139, 147, 155, 163, 171, 179, 187, 195, 203, 211, 219, 227, 235};
    public static int INDEX[]={ 7, 7, 8, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 23, 24, 25, 26, 27, 28, 30, 31, 32, 33, 34, 35, 36, 37, 38, 40, 41, 43, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 56};
    public static void setFont_Poppins(TextView t, Context context)
    {
        if(tf==null)
            tf= Typeface.createFromAsset(context.getAssets(),"Poppins-Medium.ttf");
//        t.setTypeface(tf, Typeface.BOLD);
    }
    public  static String readRawTextFile(Context ctx, int resId) {
        InputStream inputStream = ctx.getResources().openRawResource(resId);

        InputStreamReader inputreader;
        try {
            inputreader = new InputStreamReader(inputStream, "UTF-8");
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
            return null;
        }
        BufferedReader buffreader = new BufferedReader(inputreader);
        String line;
        StringBuilder text = new StringBuilder();

        try {
            while ((line = buffreader.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
        } catch (IOException e) {
            return null;
        }
        return text.toString();
    }
    public static void chalngeImageColor(ImageView imageView, String COLOR) {
        try {
            int color = Color.parseColor(COLOR);//getResources().getColor(R.color.));
            imageView.setColorFilter(color);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public static void startWebStiteAct(Context context)
{
//    Intent intent=new Intent(Intent.ACTION_VIEW);
//    intent.setData(Uri.parse("http://wwww.google.com"));
//    context.startActivity(intent);





}
    public static void startShareAct(Context context)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(android.content.Intent.EXTRA_TEXT, Constants.share_data);
                    context.startActivity(intent);
    }
    public static void startRateUsAct(Context context)
    {
        try {
                        context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + Constants.RATE_ID)));
        } catch (android.content.ActivityNotFoundException anfe) {
                        context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?"+ Constants.RATE_ID)));
                    }
    }

    public static String share_data="\uD83C\uDF38Good News\uD83C\uDF38\n\n" +

            "Download the Chahal Durood Application for Android from the link below.\n https://play.google.com/store/apps/details?id="+RATE_ID+"\n\n" +
            "Share this message as much as possible. You will get the reward for people downloading and reading the Chahal Darud Insha Allah.\n";


    public static int EXIT_APP=1;
    public static int HOME=2;

    public static int LANGUAGE_ID=0;//0 =Urdu 1= English
    public static int ENGLISH=0,URDU=1;
    public static String FAZILT_TEXT="Fazail-e-Quran",MUTTARIFAQ="Mutafarriqaat";

    public static String urdu_array[]={

            "زبان منتخب کریں",
            "دوبارہ شروع/نشاندہی",
            "پاروں کی فہرست",
            "سورتوں کی فہرست",
            "صفحہ پر جائیں",
//	"نشاندہی ",
            "دوبارہ شروع/نشاندہی",
            "مدد اور درخواست",
            "قرآن کریم",
            "کیا آپ کا وضو ہے ؟  کیا آپ با وضو ہے ؟",
            "ہاں نہیں",
            "خالی نشاندہی",
            "کوئی نشاندہی نہیں ہے، اگر آپ پڑھنے کے درمیان نشان رکھنا چاہتےہے تو آوازکے کم زیادہ کرنے والی بٹن یا مینو بٹن کو استعمال کریں۔",
            "عنوان",
            "محفوظ کریں، منسوخ ",
            "صفحہ نمبر",
            "آخری مرتبہ پڑھاہوا",
            "آگےبڑھے ، منسوخ کریں",
            "سیٹینگ (ترتیب)",
            "برائے کرم کسی ایک کا انتخاب کریں",
            "یاد داشت شامل کریں",
            "پڑھنے کا انداز تبدیل کریں",
            "منسوخ کریں",
            "پڑھنے کا انداز تبدیل کریں",
            "ہمارے دیگر اپلیکیشن",
            "ویب سائٹ ملاحظہ کریں",
            "دوسروں کو بهیجیں",
            "ہمیں سراہیں",
            "باہر نکلیں",
            "مینو  سکری",
            "درست صفحے کے نمبر درج",
            "لاگو",
            "صفحہ نمبر درج کریں",
            "کیا آّپ کا وضو ہے",
            "ہاں" ,
            "نہیں",
            "کیا آپ واقعی بک مارکس سے اس اندراج حذف کرنا چاہتے ہیں ؟",
            "تصدیقی خارج کر دیں",
            "آپ نل طرف سے ایک موجودہ بک مارک اندراج خارج کر دیں اور آپ حذف کرنا چاہتے بک مارک پر پکڑ کر سکتے ہو",

    };
    public static int TOTAL_PAGES=252;
    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }

}