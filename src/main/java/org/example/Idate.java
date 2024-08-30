package org.example;  // Déclare que cette classe fait partie du package org.example

import java.time.LocalDateTime;  // Importe la classe LocalDateTime du package java.time pour travailler avec les dates et heures

// Déclare l'interface Idate
public interface Idate {
    LocalDateTime getDate();  // Méthode abstraite pour obtenir la date et l'heure
}
