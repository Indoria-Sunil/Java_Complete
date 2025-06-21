class StudentToString {
    String name;
    int age;
    String rollNo;
    String house;

    public StudentToString(String name, int age, String rollNo, String house) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.house = house;
    }

//    @Override
//    public String toString() {
//        return "StudentToString{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", rollNo='" + rollNo + '\'' +
//                ", house='" + house + '\'' +
//                '}';
//    }

    public static void main(String[] args) {
        StudentToString stu = new StudentToString("Sunil" , 31, "001", "Vividha");
        System.out.println(stu);
    }
}
