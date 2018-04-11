package handlers;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import handlers.api.ACreateHandler;
import handlers.api.CreateHandler;
import handlers.api.impl.ACreateHandler;

public class Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(CreateHandler.class).annotatedWith(Names.named("Please, create A")).to(ACreateHandler.class);
    }
}
