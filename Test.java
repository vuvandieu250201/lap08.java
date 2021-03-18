package Person;
  public class Test {
    public static void main(String[]args){
      //test class sutudent
      Student s1 = new Student("Tan An Teck", "1 Happy Ave");
      s1.addCourseGrade("IM101",97);
      s1.addCourseGrade("Im102", 68);
      s1.printGrades();
      System.out.println("Average is" +s1.getAverageGrade());
      // test class teacher
      Teacher t1 = new Teacher("paul tan","8 sunset wuay");
      System.out.print(t1);
      String [] courses = {"IM101","IM102","IM101"};
      for (String course : courses){
        if (t1.addCourse(course)) {
          System.out.println(course + "added");
        }else{
          System.out.println(course +" cannot be added");
        }
      }
      for (String course :courses){
        if (t1.removeCourse(course)){
          System.out.println(course + "removed");
        }else {
          System.out.println(course + "cannot removed");
        }
      }
    }

}

