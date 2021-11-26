package lab5;

import java.awt.print.Book;
import java.util.Date;

public class task5 {

    static class Message {
        String author, subject, text, time, date_of_creation, date_of_editing;

        public Message(String author, String subject, String text, String time, String date_of_creation) {//, String date_of_editing
            this.author = author;
            this.subject = subject;
            this.text = text;
            this.time = time;
            this.date_of_creation = date_of_creation;
            //this.date_of_editing = date_of_editing;
        }

        public void setAuthor(String author) {
            try {
                this.author = author;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public String getAuthor() {
            return this.author;
        }

        public void setSubject(String subject) {
            try {
                this.subject = subject;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public String getSubject() {
            return this.subject;
        }

        public void setText(String text) {
            try {
                this.text = text;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public String getText() {
            return this.text;
        }

        public void setDate_of_creation(String date_of_creation) {
            try {
                this.date_of_creation = date_of_creation;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public String getDate_of_creation() {
            return this.date_of_creation;
        }

        public void setDate_of_editing() {
            try {
                Date date = new Date();
                this.date_of_editing = date.toString();
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public String getDate_of_editing() {
            return this.date_of_editing;
        }

        @Override
        public String toString() {
            return "author = " + this.author + '\n' +
                    "subject = " + this.subject + '\n' +
                    "text = " + this.text + '\n' +
                    "time = " + this.time + '\n' +
                    "ate_of_creation = " + this.date_of_creation + '\n' +
                    "date_of_editing = " + this.date_of_editing;
        }
    }


    public static void main(String[] args) {
        Message message1 = new Message("Max", "purchase", "text message1", "12-10-00",
                "23-09-2021");

        message1.setDate_of_editing();
        System.out.println(message1.toString());
    }
}
