package com.dtorrez.concurrency.synchronize;

class Document {

    private String content = ""; // String es inmutable.

    public void append(String text) {
        content += text;
    }

    public String getContent() {
        return content;
    }
}
