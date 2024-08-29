package org.example;

public class Welcome {
    public String day;
    public int time;

    public Welcome(String day, int time) {
        this.day = day;
        this.time = time;
    }

    public String getMessage() {

        final int FRIDAY_END = 18;
        final int MONDAY_START = 9;


        if (day.equals("Lundi") || day.equals("Mardi") || day.equals("Mercredi") || day.equals("Jeudi") || day.equals("Vendredi")) {
            if (time >= 9 && time < 13) {
                return "Bonjour";
            }
            if (time >= 13 && time < 18) {
                return "Bon après-midi";
            }
            if (time >= 18 || time < 9) {
                return "Bonsoir";
            }
        }


        if ((day.equals("Vendredi") && time >= FRIDAY_END) || (day.equals("Lundi") && time < MONDAY_START) ||
                (day.equals("Samedi")) || (day.equals("Dimanche"))) {
            return "Bon weekend";
        }


        return "Message non disponible";
    }
}
