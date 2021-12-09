package lab5;

public interface About {
    void setName(String name);
    String getName();
    void setSurname(String surname);
    String getSurname();
    void setPatronymic(String patronymic);
    String getPatronymic();
    String getDate_of_birth();
    void setDate_of_birth(String date_of_birth);
    void setGender(String gender);
    String getGender();
    String getEducation();
    void setEducation(String education);
    String getEducational_institution_that_issued_the_document();
    void setEducational_institution_that_issued_the_document(String educational_institution_that_issued_the_document);
    String getDate_of_employment();
    void setDate_of_employment(String date_of_employment);
    String getHome_address();
    void setHome_address(String home_address);
    int getEducational_document_number();
    void setEducational_document_number(int educational_document_number);
    String toString();
    boolean equals(Object o);
    int hashCode();
}
