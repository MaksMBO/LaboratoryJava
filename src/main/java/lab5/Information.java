package lab5;

public interface Information {
    void setAuthor(String author);
    String getAuthor();
    void setSubject(String subject);
    String getSubject();
    void setText(String text);
    String getText();
    void setDate_of_creation(String date_of_creation);
    String getDate_of_creation();
    String toString();
    boolean equals(Object o);
    int hashCode();
}
