package lab5;

public class task16 {
    public static class Employee {
        String surname, name, patronymic, date_of_birth, gender, education,
                educational_institution_that_issued_the_document, date_of_employment, home_address;
        int educational_document_number;

        public Employee(String surname, String name, String patronymic, String date_of_birth, String gender,
                        String education, String educational_institution_that_issued_the_document,
                        String date_of_employment, String home_address, int educational_document_number) {
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.date_of_birth = date_of_birth;
            this.gender = gender;
            this.education = education;
            this.educational_institution_that_issued_the_document = educational_institution_that_issued_the_document;
            this.date_of_employment = date_of_employment;
            this.home_address = home_address;
            this.educational_document_number = educational_document_number;
        }


        public void setName(String name) {
            try {
                this.name = name;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public String getName() {
            return this.name;
        }

        public void setSurname(String surname) {
            try {
                this.surname = surname;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public String getSurname() {
            return this.surname;
        }


        public void setPatronymic(String patronymic) {
            try {
                this.patronymic = patronymic;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public String getPatronymic() {
            return this.patronymic;
        }

        public String getDate_of_birth()
        {
            return this.date_of_birth;
        }

        public void setDate_of_birth(String date_of_birth)
        {
            try {
                this.date_of_birth = date_of_birth;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public void setGender(String gender)
        {
            try {
                this.gender = gender;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public String getGender()
        {
            return this.gender;
        }



        public String getEducation()
        {
            return this.education;
        }

        public void setEducation(String education)
        {
            try {
                this.education = education;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public String getEducational_institution_that_issued_the_document()
        {
            return this.educational_institution_that_issued_the_document;
        }

        public void setEducational_institution_that_issued_the_document(String educational_institution_that_issued_the_document)
        {
            try {
                this.educational_institution_that_issued_the_document = educational_institution_that_issued_the_document;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public String getDate_of_employment()
        {
            return this.date_of_employment;
        }

        public void setDate_of_employment(String date_of_employment)
        {
            try {
                this.date_of_employment = date_of_employment;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public String getHome_address()
        {
            return this.home_address;
        }

        public void setHome_address(String home_address)
        {
            try {
                this.home_address = home_address;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        public int getEducational_document_number()
        {
            return this.educational_document_number;
        }

        public void setEducational_document_number(int educational_document_number)
        {
            try {
                this.educational_document_number = educational_document_number;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        @Override
        public String toString() {
            return "surname = " + this.surname + '\n' +
                    "name = " + this.name + '\'' +
                    "patronymic = " + this.patronymic + '\n' +
                    "date_of_birth = " + this.date_of_birth + '\n' +
                    "gender = " + this.gender + '\n' +
                    "education = " + this.education + '\n' +
                    "educational_institution_that_issued_the_document = " + this.educational_institution_that_issued_the_document + '\n' +
                    "date_of_employment = " + this.date_of_employment + '\n' +
                    "home_address = " + this.home_address + '\n' +
                    "educational_document_number = " + this.educational_document_number;
        }
    }

    public static void main(String[] args) {
        Employee Max = new Employee("Bredyuk", "Max", "Oleksandrovich", "27-08-2003",
                "male", "the average", "gymnasium ¹283",
                "11-11-2021", "Mayakovsky 3", 1456789 );

        System.out.println(Max.getDate_of_birth());
        System.out.println(Max.toString());
    }
}
