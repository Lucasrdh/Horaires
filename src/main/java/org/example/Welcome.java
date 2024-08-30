package org.example;  // Déclare que cette classe fait partie du package org.example

// Importe les classes nécessaires pour travailler avec les dates et heures
import java.time.LocalDateTime;
import java.time.DayOfWeek;

// Classe Welcome
public class Welcome {

   final private LocalDateTime date;  // Variable membre pour stocker la date et l'heure

    // Constructeur de la classe Welcome qui prend un Idate en paramètre
    public Welcome(Idate date) {
        this.date = date.getDate();  // Initialise la date avec la date obtenue à partir de l'interface Idate
    }

    // Méthode pour obtenir le message de bienvenue en fonction de la date et de l'heure
    public String getMessage() {
        String message = "";  // Initialise le message par défaut

        DayOfWeek day = this.date.getDayOfWeek();  // Obtient le jour de la semaine
        int hour = this.date.getHour();  // Obtient l'heure du jour

        // Condition pour vérifier si c'est le week-end
        if ((day == DayOfWeek.FRIDAY && hour >= 18) || (day == DayOfWeek.MONDAY && hour < 9)) {
            message = "Bon week-end";
        }
        // Si ce n'est pas le week-end et ce n'est pas samedi ou dimanche
        else if (day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
            // Vérifie si l'heure est entre 9h et 13h
            if (hour >= 9 && hour < 13) {
                message = "Bonjour";
            }
            // Vérifie si l'heure est entre 13h et 18h
            else if (hour >= 13 && hour < 18) {
                message = "Bon après-midi";
            }
            // Si l'heure est après 18h ou avant 9h le jour n'est pas Vendredi
            else if (day != DayOfWeek.FRIDAY) {
                if (hour >= 18 || hour < 9) {
                    message = "Bonsoir";
                }
            }
        } else {
            message = "Bon week-end";  // Pour le week-end (Samedi et Dimanche)
        }

        return message;  // Retourne le message approprié
    }
}
