package com.IMarinette.flashchatnewfirebase;

/**
 * Created by Myn1023 on 11/19/2017.
 */

class InstantMessage {

    private String message;
    private String author;

    InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {



    }

    String getMessage() {
        return message;
    }

    String getAuthor() {
        return author;
    }
}
