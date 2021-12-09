/*Построить программу для работы с классом для хранения данных о сообщении на форуме (автор, тема, текст, время,
дата создания и редактирование). Программа должна обеспечивать простейшие функции: ввод значений, редактирование,
вывод значений.
 */
package lab5;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;


public abstract class task_5 implements Information{
    /**
     * Class Message describes messages
     * **/
    static class Message implements Information{
        private String author;
        private String subject;
        private String text;
        private String time;
        private String date_of_creation;
        private String date_of_editing;

        /**
         * Constructor with arguments
         *
         * @param author   String
         * @param subject   String
         * @param text   String
         * @param time   String
         * @param date_of_creation   String
         */
        public Message(String author, String subject, String text, String time, String date_of_creation) {//, String date_of_editing
            this.author = author;
            this.subject = subject;
            this.text = text;
            this.time = time;
            this.date_of_creation = date_of_creation;
            //this.date_of_editing = date_of_editing;
        }

        /**
         * Setter of  author
         @param author String
         **/
        public void setAuthor(String author) {
            try {
                this.author = author;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Getter author
         @return author String
         **/
        public String getAuthor() {
            return this.author;
        }

        /**
         * Setter of  subject
         @param subject String
         **/
        public void setSubject(String subject) {
            try {
                this.subject = subject;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Getter subject
         @return subject String
         **/
        public String getSubject() {
            return this.subject;
        }

        /**
         * Setter of  text
         @param text String
         **/
        public void setText(String text) {
            try {
                this.text = text;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Getter text
         @return text String
         **/
        public String getText() {
            return this.text;
        }

        /**
         * Setter of  date_of_creation
         @param date_of_creation String
         **/
        public void setDate_of_creation(String date_of_creation) {
            try {
                this.date_of_creation = date_of_creation;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Getter date_of_creation
         @return date_of_creation String
         **/
        public String getDate_of_creation() {
            return this.date_of_creation;
        }

        /**
         * Setter date_of_editing
         **/
        private void setDate_of_editing() {
            try {
                Date date = new Date();
                this.date_of_editing = date.toString();
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Method that returns a string
         * **/
        @Override
        public String toString() {
            return "author = " + this.author + '\n' +
                    "subject = " + this.subject + '\n' +
                    "text = " + this.text + '\n' +
                    "time = " + this.time + '\n' +
                    "ate_of_creation = " + this.date_of_creation + '\n' +
                    "date_of_editing = " + this.date_of_editing;
        }

        /**
         * Object Comparing Method
         * @param o Object
         * **/
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Message that = (Message) o;
            return Objects.equals(author, that.author) && Objects.equals(time, that.time) &&
                    Objects.equals(date_of_creation, that.date_of_creation);
        }


        /**
         * Object Comparing Method
         * **/
        @Override
        public int hashCode() {
            return Objects.hash(author);
        }

    }

    /**
     * Makes communication with user
     * @param args cli arguments, no one expected
     */
    public static void main(String[] args) {
        Message message1 = new Message("Max", "purchase", "text message1", "12-10-00",
                "23-09-2021");

        Scanner sc= new Scanner(System.in);
        System.out.println("Введите автора: ");
        message1.author = sc.nextLine();
        System.out.println("Введите субъект: ");
        message1.subject = sc.nextLine();
        System.out.println("Введите текст: ");
        message1.text = sc.nextLine();
        System.out.println("Введите время: ");
        message1.time = sc.nextLine();
        System.out.println("Введите дату создания: ");
        message1.date_of_creation = sc.nextLine();
        message1.setDate_of_editing();
        System.out.println(message1);
    }
}
