package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.view.RevisionFormatter;
import edu.bsu.cs.view.RevisionImplementation;

public class RevisionModule extends AbstractModule {
    @Override
    protected void configure(){
        bind(RevisionImplementation.class).to(RevisionFormatter.class);
    }
}
