package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.io.IOException;

public interface RevisionImplementation {
    String format(Revision revision) throws IOException;
}
