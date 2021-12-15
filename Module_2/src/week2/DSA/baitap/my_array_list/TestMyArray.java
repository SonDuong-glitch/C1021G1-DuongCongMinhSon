package week2.DSA.baitap.my_array_list;

public class TestMyArray {

    public static class Student{
         private String id;
         private String name;

        public Student() {
        }

        public Student(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        Student std1 = new Student("Son" ,"duong");
        Student std2 = new Student("Son1" ,"duong1");
        Student std3 = new Student("Son2" ,"duong2");
        Student std4 = new Student("Son3" ,"duong3");
        Student std5 = new Student("Son4" ,"duong4");
        Student std6 = new Student("Son5" ,"duong5");
        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(std1);
        studentMyList.add(std2);
        studentMyList.add(std3);
        studentMyList.add(std4);
        studentMyList.add(std5);
        studentMyList.add(std6);
     for (int i = 0 ; i < studentMyList.size() ; i++){
         Student student = (Student) studentMyList.elements[i];
         System.out.println(student);
     }
    }
}
