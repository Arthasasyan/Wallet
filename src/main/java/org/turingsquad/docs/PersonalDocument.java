package org.turingsquad.docs;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
public abstract class PersonalDocument {
    protected final Date birthDate;
    protected final String personName;
}
