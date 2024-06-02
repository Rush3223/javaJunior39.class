package lesson10Home;

import java.util.Objects;

/**
 * 1) Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
 * 2) Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
 * 3) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 2000 руб,
 * иначе 1900. Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 2500 руб, иначе 2200.
 * 4) Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
 */
public abstract class Student {

   protected String firstName;
   protected String lastName;
   protected int group;
   protected double averageMark;

   public Student() {
   }

   public Student(String firstName, String lastName, int group, double averageMark) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.group = group;
      this.averageMark = averageMark;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public int getGroup() {
      return group;
   }

   public void setGroup(int group) {
      this.group = group;
   }

   public double getAverageMark() {
      return averageMark;
   }

   public void setAverageMark(double averageMark) {
      this.averageMark = averageMark;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Student student = (Student) o;
      return group == student.group && Double.compare(averageMark, student.averageMark) == 0 && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
   }

   @Override
   public int hashCode() {
      int result = Objects.hashCode(firstName);
      result = 31 * result + Objects.hashCode(lastName);
      result = 31 * result + group;
      result = 31 * result + Double.hashCode(averageMark);
      return result;
   }

   @Override
   public String toString() {
      return "Student{" +
              "firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", group=" + group +
              ", averageMark=" + averageMark +
              '}';
   }
   public abstract void getScholarship();
}
