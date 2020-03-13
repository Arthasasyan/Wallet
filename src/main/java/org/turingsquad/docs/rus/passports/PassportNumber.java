package org.turingsquad.docs.rus.passports;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PassportNumber {
    private final String series;
    private final String number;

    @Override
    public String toString() {
        return String.format("%s%s", series, number);
    }
}
