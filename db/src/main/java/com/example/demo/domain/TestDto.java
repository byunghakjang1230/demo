package com.example.demo.domain;

import java.util.List;

public class TestDto {
    private Long id;
    private List<String> names;
    private String title;
    private String viewServer;
    private String appServer;

    protected TestDto() {
    }

    public TestDto(Long id, List<String> names, String title, String viewServer, String appServer) {
        this.id = id;
        this.names = names;
        this.title = title;
        this.viewServer = viewServer;
        this.appServer = appServer;
    }

    public Long getId() {
        return id;
    }

    public List<String> getNames() {
        return names;
    }

    public String getTitle() {
        return title;
    }

    public String getViewServer() {
        return viewServer;
    }

    public String getAppServer() {
        return appServer;
    }
}
