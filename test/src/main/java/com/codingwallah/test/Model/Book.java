package com.codingwallah.test.Model;

//model -> it use in application life cycle
public class Book {
        private int id;
        private String title;
        private String author;


    //getter & setters
        public String getAuthor() {
            return author;
        }

        public int getId() {
            return id;
        }
        public String getTitle() {
            return title;
        }
        public void setId(int id) {
            this.id = id;
        }
        public void setAuthor(String author) {
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }
}
