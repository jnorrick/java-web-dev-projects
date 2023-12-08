package org.launchcode;

import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    private ArrayList<MenuItem> menuItem = new ArrayList<> ();
    private LocalDate dateAdded;

    public LocalDate getDateAdded() {
        return dateAdded;
    }
    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }
}
