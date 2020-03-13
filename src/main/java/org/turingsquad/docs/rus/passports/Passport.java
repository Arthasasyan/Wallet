package org.turingsquad.docs.rus.passports;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.turingsquad.docs.PersonalDocument;
import org.turingsquad.docs.Sex;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@SuperBuilder
public abstract class Passport extends PersonalDocument {
    protected final Date issueDate;
    protected final PassportIssuePlace passportIssuePlace;
    protected final Sex sex;
    protected final String placeOfBirth;
}
