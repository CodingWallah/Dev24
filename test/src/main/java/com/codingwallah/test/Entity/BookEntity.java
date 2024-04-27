package com.codingwallah.test.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//entity -> it use to store data into database
@Entity
// @Data -> lombok
public class BookEntity {

        @Id
      //  @GeneratedValue("home work")
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
