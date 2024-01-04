package org.launchcode;

import java.util.Comparator;

public class ConesComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone cone1, Cone cone2) {
        return cone1.getName().compareTo(cone2.getName());
    }
}
