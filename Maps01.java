package aa_takim_odevleri.mapHarfTekrari;

import java.util.HashMap;
import java.util.Map;

public class Maps01 {

    /*
        ---Task---

     String bir cumledeki harflerin kac adet kullanildigini; olusturdugunuz bir Map'te gosteriniz.

     */

    public static void main(String[] args) {

        String cumle = "İstikbal göklerdedir.";
        harfleriSay(cumle);


    }
    public static void harfleriSay(String cumle){

        String yeniCumle = cumle.replaceAll("\\p{Punct}","").toLowerCase();
        String arr[] = yeniCumle.split("");

        Map<String, Integer> map = new HashMap<>();

        for(String w: arr){
            if(!map.containsKey(w)){
                map.put(w,1);
            }else {
                map.put(w,map.get(w)+1);
            }
        }
        System.out.println("Map: "+ map);

    }

}
