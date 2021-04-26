package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public final class RevisionFormatter implements RevisionImplementation{

    @Override
    public String format(Revision revision) {
        String[] localDateTime = LocalDateTime.ofInstant(revision.timestamp, ZoneOffset.UTC).toString().split("T");
        return String.format("At %s, %s made a change on the date of %s",
                localDateTime[1],
                revision.name,
                localDateTime[0]);
    }
    
}
