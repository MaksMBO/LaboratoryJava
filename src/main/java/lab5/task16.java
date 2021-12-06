package lab5;

import java.util.Objects;
import java.util.Scanner;

public class task16 {
    /**
     * Class Employee describes employee
     * **/
    public static class Employee {
        private String surname, name, patronymic, date_of_birth, gender, education,
                educational_institution_that_issued_the_document, date_of_employment, home_address;
        private int educational_document_number;

        /**
         * Constructor with arguments
         *
         * @param surname   String
         * @param name   String
         * @param patronymic   String
         * @param date_of_birth   String
         * @param gender   String
         * @param education String
         * @param educational_institution_that_issued_the_document String
         * @param date_of_employment String
         * @param home_address String
         * @param educational_document_number int
         */
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
        /**
         * Setter of  name
        @param name String
        **/
        public void setName(String name) {
            try {
                this.name = name;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Getter name
         * @return name String
         **/

        public String getName() {
            return this.name;
        }

        /**
         * Setter of  surname
         * @param surname String
         **/
        public void setSurname(String surname) {
            try {
                this.surname = surname;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Getter surname
         * @return surname String
         **/
        public String getSurname() {
            return this.surname;
        }

        /**
         * Setter of  patronymic
         * @param patronymic String
         **/
        public void setPatronymic(String patronymic) {
            try {
                this.patronymic = patronymic;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Getter patronymic
         * @return patronymic
         */
        public String getPatronymic() {
            return this.patronymic;
        }

        public String getDate_of_birth() {
            return this.date_of_birth;
        }

        /**
         * Setter of  date_of_birth
         * @param date_of_birth String
         **/
        public void setDate_of_birth(String date_of_birth) {
            try {
                this.date_of_birth = date_of_birth;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Setter of  gender
         * @param gender String
         **/
        public void setGender(String gender) {
            try {
                this.gender = gender;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Getter gender
         * @return gender String
         **/
        public String getGender() {
            return this.gender;
        }


        /**
         * Getter education
         * @return education String
         **/
        public String getEducation() {
            return this.education;
        }


        /**
         * Setter of  education
         * @param education String
         **/
        public void setEducation(String education) {
            try {
                this.education = education;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Getter educational_institution_that_issued_the_document
         * @return educational_institution_that_issued_the_document String
         **/
        public String getEducational_institution_that_issued_the_document() {
            return this.educational_institution_that_issued_the_document;
        }

        /**
         * Setter of  educational_institution_that_issued_the_document
         * @param educational_institution_that_issued_the_document String
         **/
        public void setEducational_institution_that_issued_the_document(String educational_institution_that_issued_the_document) {
            try {
                this.educational_institution_that_issued_the_document = educational_institution_that_issued_the_document;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Getter date_of_employment
         * @return  date_of_employment String
         **/
        public String getDate_of_employment() {
            return this.date_of_employment;
        }

        /**
         * Setter of  date_of_employment
         * @param date_of_employment String
         **/
        public void setDate_of_employment(String date_of_employment) {
            try {
                this.date_of_employment = date_of_employment;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Getter home_address
         * @return  home_address String
         **/
        public String getHome_address() {
            return this.home_address;
        }

        /**
         * Setter of home_address
         * @param home_address String
         **/
        public void setHome_address(String home_address) {
            try {
                this.home_address = home_address;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         *  Getter educational_document_number
         * @return  educational_document_number String
         **/
        public int getEducational_document_number() {
            return this.educational_document_number;
        }

        /**
         * Setter of educational_document_number
         * @param educational_document_number String
         **/
        public void setEducational_document_number(int educational_document_number) {
            try {
                this.educational_document_number = educational_document_number;
            } catch (Exception e) {
                System.err.println("Invalid value");
            }
        }

        /**
         * Method that returns a string
         * **/
        @Override
        public String toString() {
            return "surname = " + this.getSurname() + '\n' +
                    "name = " + this.getName() + '\n' +
                    "patronymic = " + this.getPatronymic() + '\n' +
                    "date_of_birth = " + this.getDate_of_birth() + '\n' +
                    "gender = " + this.getGender() + '\n' +
                    "education = " + this.getEducation() + '\n' +
                    "educational_institution_that_issued_the_document = " + this.getEducational_institution_that_issued_the_document() + '\n' +
                    "date_of_employment = " + this.getDate_of_employment() + '\n' +
                    "home_address = " + this.getHome_address() + '\n' +
                    "educational_document_number = " + this.getEducational_document_number();
        }

        /**
         * Object Comparing Method
         * @param o Object
         * **/
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee that = (Employee) o;
            return Objects.equals(surname, that.surname) && Objects.equals(name, that.name) &&
                    Objects.equals(patronymic, that.patronymic) && Objects.equals(date_of_birth, that.date_of_birth) &&
                    Objects.equals(gender, that.gender) && Objects.equals(education, that.education) &&
                    Objects.equals(educational_institution_that_issued_the_document, that.educational_institution_that_issued_the_document)
                    && Objects.equals(date_of_employment, that.date_of_employment) &&
                    Objects.equals(home_address, that.home_address) &&
                    Objects.equals(educational_document_number, that.educational_document_number);
        }


        /**
         * Object Comparing Method
         * **/
        @Override
        public int hashCode() {
            return Objects.hash(surname);
        }
    }

    /**
     * Makes communication with user
     * @param args cli arguments, no one expected
     */
    public static void main(String[] args) {
        Employee Max = new Employee("Bredyuk", "Max", "Oleksandrovich", "27-08-2003",
                "male", "the average", "gymnasium є283",
                "11-11-2021", "Mayakovsky 3", 1456789);

        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите фамилию: ");
        Max.setSurname(sc.nextLine());

        System.out.println("¬ведите им€: ");
        Max.setName(sc.nextLine());

        System.out.println("¬ведите отчество: ");
        Max.setPatronymic(sc.nextLine());

        System.out.println("¬ведите дату: ");
        Max.setDate_of_birth(sc.nextLine());

        System.out.println("¬ведите гендер: ");
        Max.setGender(sc.nextLine());

        System.out.println("¬ведите уровень обучени€: ");
        Max.setEducation(sc.nextLine());

        System.out.println("¬ведите место получени€ образовани€: ");
        Max.setEducational_institution_that_issued_the_document(sc.nextLine());

        System.out.println("¬ведите дату: ");
        Max.setDate_of_employment(sc.nextLine());

        System.out.println("¬ведите домашний адрес: ");
        Max.setHome_address(sc.nextLine());

        System.out.println("¬ведите номер документа: ");
        Max.setEducational_document_number(sc.nextInt());

        System.out.println(Max.getDate_of_birth());
        System.out.println(Max);
    }
}
