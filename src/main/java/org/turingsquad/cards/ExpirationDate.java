package org.turingsquad.cards;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Data
@AllArgsConstructor
public class ExpirationDate {
    private final int month;
    private final int year;

    public Date toDate() throws ParseException {
        DateFormat format = new SimpleDateFormat("MM/YY");
        return format.parse(this.toString());
    }

    @Override
    public String toString() {
        return String.format("%d/%d", month, year);
    }
}
