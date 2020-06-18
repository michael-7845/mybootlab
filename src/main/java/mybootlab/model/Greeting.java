package mybootlab.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.xml.ws.BindingType;

@Component
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting(long id) {
        this.id = id;
        this.content = "World";
    }

    public Greeting() {
        this.id = 0L;
        this.content = "World";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
