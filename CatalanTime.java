package es.domotich.utils;

import java.time.LocalDateTime;

public class CatalanTime {

//    # Sistema campanar tradicional
    public String getTimeCampanarTraditional(int hour, int minute) {

        if (minute > 6)
            hour = hour + 1;

        if (minute == 0)
            return getArticle(hour) + " " + getHour(hour) + " en punt";
        if (minute == 1)
            return getArticle(hour) + " " + getHour(hour);
        if (minute == 2 || minute ==3 || minute ==4)
            return getArticle(hour) + " " + getHour(hour) + " " + getTocades(hour);
        if (minute == 5 || minute ==6)
            return getArticle(hour) + " " + getHour(hour) + " ben " + getTocades(hour);
        if (minute == 7 || minute ==8)
            return "Mig quart " + getDe(hour) + getHour(hour);
        if (minute == 9 || minute ==10 || minute ==11)
            return "Mig quart passat " + getDe(hour) + getHour(hour);
        if (minute == 12 || minute ==13)
            return "Mig quart ben passat " + getDe(hour) + getHour(hour);
        if (minute == 14 || minute ==15 || minute ==16)
            return "Un quart " + getDe(hour) + getHour(hour);

        if (minute == 17 || minute ==18 || minute ==19)
            return "Un quart tocat " + getDe(hour) + getHour(hour);
        if (minute == 20 || minute ==21)
            return "Un quart ben tocat " + getDe(hour) + getHour(hour);
        if (minute == 22 || minute ==23)
            return "Un quart i mig " + getDe(hour) + getHour(hour);
        if (minute == 24 || minute ==25 || minute ==26)
            return "Un quart i mig passat " + getDe(hour) + getHour(hour);
        if (minute == 27 || minute ==28)
            return "Un quart i mig ben passat " + getDe(hour) + getHour(hour);
        if (minute == 29 || minute ==30 || minute ==31)
            return "Dos quarts " + getDe(hour) + getHour(hour);

        if (minute == 32 || minute ==33 || minute ==34)
            return "Dos quarts tocats " + getDe(hour) + getHour(hour);
        if (minute == 35 || minute ==36)
            return "Dos quarts ben tocats " + getDe(hour) + getHour(hour);
        if (minute == 37 || minute ==38)
            return "Dos quarts i mig " + getDe(hour) + getHour(hour);
        if (minute == 39 || minute ==40 || minute ==41)
            return "Dos quarts i mig passats " + getDe(hour) + getHour(hour);
        if (minute == 42 || minute ==43)
            return "Dos quarts i mig ben passats " + getDe(hour) + getHour(hour);
        if (minute == 44 || minute ==45 || minute ==46)
            return "Tres quarts " + getDe(hour) + getHour(hour);

        if (minute == 47 || minute ==48 || minute ==49)
            return "Tres quarts tocats " + getDe(hour) + getHour(hour);
        if (minute == 50 || minute ==51)
            return "Tres quarts ben tocats " + getDe(hour) + getHour(hour);
        if (minute == 52 || minute ==53)
            return "Tres quarts i mig " + getDe(hour) + getHour(hour);
        if (minute == 54 || minute ==55 || minute ==56)
            return "Tres quarts i mig passats " + getDe(hour) + getHour(hour);
        if (minute == 57 || minute ==58)
            return "Tres quarts i mig ben passats " + getDe(hour) + getHour(hour);
        if (minute == 59)
            return getArticle(hour) + " " + getHour(hour);

        return "no ho sé";
    }


//    # Sistema campanar tal com està definit a la Gramàtica Essencial de la llengua catalana
//    # https://geiec.iec.cat/capitol_veure.asp?id_gelc=337&capitol=28
    public String getTimeCampanar(int hour, int minute) {
        if (minute > 14 || minute == 7 || minute == 8)
            hour = hour + 1;

        if (minute == 0)
            return getArticle(hour) + " " + getHour(hour) + " en punt";
        if (minute == 1)
            return getArticle(hour) + " " + getHour(hour) + " i un (minut)";
        if (minute == 2)
            return getArticle(hour) + " " + getHour(hour) + " i dos (minuts)";
        if (minute == 3)
            return getArticle(hour) + " " + getHour(hour) + " i tres (minuts)";
        if (minute == 4)
            return getArticle(hour) + " " + getHour(hour) + " i quatre (minuts)";
        if (minute == 5)
            return getArticle(hour) + " " + getHour(hour) + " i cinc (minuts)";
        if (minute == 6)
            return getArticle(hour) + " " + getHour(hour) + " i sis (minuts)";
        if (minute == 7)
            return "Mig quart " + getDe(hour) + getHour(hour);
        if (minute == 8)
            return "Mig quart " + getDe(hour) + getHour(hour);
        if (minute == 9)
            return getArticle(hour) + " " + getHour(hour) + " i nou (minuts)";
        if (minute == 10)
            return getArticle(hour) + " " + getHour(hour) + " i deu (minuts)";
        if (minute == 11)
            return getArticle(hour) + " " + getHour(hour) + " i onze (minuts)";
        if (minute == 12)
            return getArticle(hour) + " " + getHour(hour) + " i dotze (minuts)";
        if (minute == 13)
            return getArticle(hour) + " " + getHour(hour) + " i tretze (minuts)";
        if (minute == 14)
            return getArticle(hour) + " " + getHour(hour) + " i catorze (minuts)";
        if (minute == 15)
            return "Un quart " + getDe(hour) + getHour(hour);

        if (minute == 16)
            return "Un quart i un (minut) " + getDe(hour) + getHour(hour);
        if (minute == 17)
            return "Un quart i dos (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 18)
            return "Un quart i tres (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 19)
            return "Un quart i quatre (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 20)
            return "Un quart i cinc (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 21)
            return "Un quart i sis (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 22)
            return "Un quart i mig " + getDe(hour) + getHour(hour);
        if (minute == 23)
            return "Un quart i mig " + getDe(hour) + getHour(hour);
        if (minute == 24)
            return "Un quart i nou (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 25)
            return "Un quart i deu (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 26)
            return "Un quart i onze (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 27)
            return "Un quart i dotze (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 28)
            return "Un quart i tretze (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 29)
            return "Un quart i catorze (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 30)
            return "Dos quarts " + getDe(hour) + getHour(hour);

        if (minute == 31)
            return "Dos quarts i un (minut) " + getDe(hour) + getHour(hour);
        if (minute == 32)
            return "Dos quarts i dos (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 33)
            return "Dos quarts i tres (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 34)
            return "Dos quarts i quatre (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 35)
            return "Dos quarts i cinc (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 36)
            return "Dos quarts i sis (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 37)
            return "Dos quarts i mig " + getDe(hour) + getHour(hour);
        if (minute == 38)
            return "Dos quarts i mig " + getDe(hour) + getHour(hour);
        if (minute == 39)
            return "Dos quarts i nou (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 40)
            return "Dos quarts i deu (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 41)
            return "Dos quarts i onze (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 42)
            return "Dos quarts i dotze (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 43)
            return "Dos quarts i tretze (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 44)
            return "Dos quarts i catorze (minuts) " + getDe(hour) + getHour(hour);

        if (minute == 45)
            return "Tres quarts " + getDe(hour) + getHour(hour);
        if (minute == 46)
            return "Tres quarts i un (minut) " + getDe(hour) + getHour(hour);
        if (minute == 47)
            return "Tres quarts i dos (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 48)
            return "Tres quarts i tres (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 49)
            return "Tres quarts i quatre (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 50)
            return "Tres quarts i cinc (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 51)
            return "Tres quarts i sis (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 52)
            return "Tres quarts i mig " + getDe(hour) + getHour(hour);
        if (minute == 53)
            return "Tres quarts i mig " + getDe(hour) + getHour(hour);
        if (minute == 54)
            return "Tres quarts i nou (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 55)
            return "Tres quarts i deu (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 56)
            return "Tres quarts i onze (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 57)
            return "Tres quarts i dotze (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 58)
            return "Tres quarts i tretze (minuts) " + getDe(hour) + getHour(hour);
        if (minute == 59)
            return "Tres quarts i catorze (minuts) " + getDe(hour) + getHour(hour);

        return "no ho sé";
    }


    public String getTimeClock(int hour, int minute, boolean format12) {
        if (minute > 30)
            hour = hour + 1;

        if (minute == 0)
            return getArticle(hour) + " " + getHour(hour) + " en punt" + (format12 ? get12HFormat(hour) : "");
        if (minute == 1)
            return getArticle(hour) + " " + getHour(hour) + " i un (minut) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 2)
            return getArticle(hour) + " " + getHour(hour) + " i dos (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 3)
            return getArticle(hour) + " " + getHour(hour) + " i tres (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 4)
            return getArticle(hour) + " " + getHour(hour) + " i quatre (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 5)
            return getArticle(hour) + " " + getHour(hour) + " i cinc (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 6)
            return getArticle(hour) + " " + getHour(hour) + " i sis (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 7)
            return getArticle(hour) + " " + getHour(hour) + " i set (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 8)
            return getArticle(hour) + " " + getHour(hour) + " i vuit (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 9)
            return getArticle(hour) + " " + getHour(hour) + " i nou (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 10)
            return getArticle(hour) + " " + getHour(hour) + " i deu (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 11)
            return getArticle(hour) + " " + getHour(hour) + " i onze (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 12)
            return getArticle(hour) + " " + getHour(hour) + " i dotze (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 13)
            return getArticle(hour) + " " + getHour(hour) + " i tretze (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 14)
            return getArticle(hour) + " " + getHour(hour) + " i catorze (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 15)
            return getArticle(hour) + " " + getHour(hour) + " i quart " + (format12 ? get12HFormat(hour) : "");

        if (minute == 16)
            return getArticle(hour) + " " + getHour(hour) + " i setze (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 17)
            return getArticle(hour) + " " + getHour(hour) + " i disset (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 18)
            return getArticle(hour) + " " + getHour(hour) + " i divuit (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 19)
            return getArticle(hour) + " " + getHour(hour) + " i dinou (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 20)
            return getArticle(hour) + " " + getHour(hour) + " i vint (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 21)
            return getArticle(hour) + " " + getHour(hour) + " i vint-i-un (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 22)
            return getArticle(hour) + " " + getHour(hour) + " i vint-i-dos (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 23)
            return getArticle(hour) + " " + getHour(hour) + " i vint-i-tres (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 24)
            return getArticle(hour) + " " + getHour(hour) + " i vint-i-quatre (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 25)
            return getArticle(hour) + " " + getHour(hour) + " i vint-i-cinc (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 26)
            return getArticle(hour) + " " + getHour(hour) + " i vint-i-sis (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 27)
            return getArticle(hour) + " " + getHour(hour) + " i vint-i-set (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 28)
            return getArticle(hour) + " " + getHour(hour) + " i vint-i-vuit (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 29)
            return getArticle(hour) + " " + getHour(hour) + " i vint-i-nou (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 30)
            return getArticle(hour) + " " + getHour(hour) + " i mitja " + (format12 ? get12HFormat(hour) : "");

        if (minute == 31)
            return getArticle(hour) + " " + getHour(hour) + " menys vint-i-nou (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 32)
            return getArticle(hour) + " " + getHour(hour) + " menys vint-i-vuit (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 33)
            return getArticle(hour) + " " + getHour(hour) + " menys vint-i-set (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 34)
            return getArticle(hour) + " " + getHour(hour) + " menys vint-i-sis (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 35)
            return getArticle(hour) + " " + getHour(hour) + " menys vint-i-cinc (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 36)
            return getArticle(hour) + " " + getHour(hour) + " menys vint-i-quatre (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 37)
            return getArticle(hour) + " " + getHour(hour) + " menys vint-i-tres (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 38)
            return getArticle(hour) + " " + getHour(hour) + " menys vint-i-dos (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 39)
            return getArticle(hour) + " " + getHour(hour) + " menys vint-i-un (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 40)
            return getArticle(hour) + " " + getHour(hour) + " menys vint (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 41)
            return getArticle(hour) + " " + getHour(hour) + " menys dinou (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 42)
            return getArticle(hour) + " " + getHour(hour) + " menys divuit (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 43)
            return getArticle(hour) + " " + getHour(hour) + " menys disset (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 44)
            return getArticle(hour) + " " + getHour(hour) + " menys setze (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 45)
            return getArticle(hour) + " " + getHour(hour) + " menys quart " + (format12 ? get12HFormat(hour) : "");

        if (minute == 46)
            return getArticle(hour) + " " + getHour(hour) + " menys catorze (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 47)
            return getArticle(hour) + " " + getHour(hour) + " menys tretze (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 48)
            return getArticle(hour) + " " + getHour(hour) + " menys dotze (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 49)
            return getArticle(hour) + " " + getHour(hour) + " menys onze (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 50)
            return getArticle(hour) + " " + getHour(hour) + " menys deu (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 51)
            return getArticle(hour) + " " + getHour(hour) + " menys nou (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 52)
            return getArticle(hour) + " " + getHour(hour) + " menys vuit (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 53)
            return getArticle(hour) + " " + getHour(hour) + " menys set (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 54)
            return getArticle(hour) + " " + getHour(hour) + " menys sis (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 55)
            return getArticle(hour) + " " + getHour(hour) + " menys cinc (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 56)
            return getArticle(hour) + " " + getHour(hour) + " menys quatre (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 57)
            return getArticle(hour) + " " + getHour(hour) + " menys tres (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 58)
            return getArticle(hour) + " " + getHour(hour) + " menys dos (minuts) " + (format12 ? get12HFormat(hour) : "");
        if (minute == 59)
            return getArticle(hour) + " " + getHour(hour) + " menys un (minut) " + (format12 ? get12HFormat(hour) : "");

        return "no ho sé";
    }


    public String getDe(int hour) {
        if (hour == 1 || hour == 13 || hour == 11 || hour == 23)
            return "d'";

        return "de ";
    }


    public String getArticle(int hour) {
        if (hour == 1 || hour == 13)
            return "La";

        return "Les";
    }


    public String getTocades(int hour) {
        if (hour == 1 || hour == 13)
            return "tocada";

        return "tocades";
    }


    public String get12HFormat(int hour) {
        if (hour >= 0 && hour < 6) {
            return "de la matinada";
        } else if(hour >= 6 && hour < 12) {
            return "del matí";
        } else if(hour >= 12 && hour < 14) {
            return "del migdia";
        } else if(hour >= 14 && hour < 19) {
            return "de la tarda";
        } else if (hour >= 19 && hour < 24) {
            return "del vespre";
        }
        return " chupala ";
    }


//    # def get_article_lower(hour)
//    #     s = get_article(hour)
//    #     return s.charAt(0).toLowerCase() + s.slice(1)


    public String getHour(int hour) {
        if (hour == 1 || hour == 13)
            return "una";
        if (hour == 2 || hour == 14)
            return "dues";
        if (hour == 3 || hour == 15)
            return "tres";
        if (hour == 4 || hour == 16)
            return "quatre";
        if (hour == 5 || hour == 17)
            return "cinc";
        if (hour == 6 || hour == 18)
            return "sis";
        if (hour == 7 || hour == 19)
            return "set";
        if (hour == 8 || hour == 20)
            return "vuit";
        if (hour == 9 || hour == 21)
            return "nou";
        if (hour == 10 || hour == 22)
            return "deu";
        if (hour == 11 || hour == 23)
            return "onze";
        if (hour == 12 || hour == 24 || hour == 0)
            return "dotze";

        return "no sé noi";
    }

    public static void main(String[] args) {
        CatalanTime catalanTime = new CatalanTime();

        LocalDateTime localDateTime = LocalDateTime.now();
        String time = catalanTime.getTimeClock(localDateTime.getHour(), localDateTime.getMinute(), false);
        System.out.println(time);
    }

}
