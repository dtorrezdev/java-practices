package com.dtorrez.concurrency.synchronize;

public class SynchronizedDocument {

        //private String content = ""; // considerar cambiar por StringBuilder
        private final StringBuilder content = new StringBuilder();
      // lock protege el StringBuilder, que es mutable y no es thread-safe
      // final solamente significa que la referencia no puede apuntar a otro objeto.

        private final Object documentLock = new Object();

        public void append(String text) {

            synchronized (documentLock) {
                //content += text;
                content.append(text);
            }
        }

        public String getContent() {

            synchronized (documentLock) {
                return content.toString();
            }
        }
}
