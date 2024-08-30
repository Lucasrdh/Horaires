package org.example;

import java.time.LocalDateTime;

public class FakeDate implements Idate {

    private LocalDateTime fakeDate;

    public FakeDate(LocalDateTime fakeDate) {
        this.fakeDate = fakeDate;
    }

    @Override
    public LocalDateTime getDate() {
        return fakeDate;
    }
}
