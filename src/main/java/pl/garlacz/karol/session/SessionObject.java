package pl.garlacz.karol.session;

import org.springframework.stereotype.Component;

import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionObject {


    private String info = null;


    public SessionObject() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}