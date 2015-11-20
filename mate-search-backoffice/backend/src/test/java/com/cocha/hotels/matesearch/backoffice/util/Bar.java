package com.cocha.hotels.matesearch.backoffice.util;

public class Bar extends Foo {

    private String propBar;

    public Bar() {
        super();
    }

    public Bar(Long id, String attr, String propBar) {
        super(id, attr);
        this.propBar = propBar;
    }

    public String getPropBar() {
        return propBar;
    }

    public void setPropBar(String propBar) {
        this.propBar = propBar;
    }
}
