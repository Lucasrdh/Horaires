package org.example;

import java.time.LocalDateTime;

public class RealDate implements Idate {

    @Override
    public LocalDateTime getDate() {
        return LocalDateTime.now();
    }
}
