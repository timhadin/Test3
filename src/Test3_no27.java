class Test3_no27 {
    class Student {
        int id;
        String name;

        public Student() {
            System.out.println("****학생 주소록*****");
            System.out.println("기본 생성자 Student() 호출");
        }

        public void insertRecord(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void printInfo() {
            System.out.println("아이디 : " + id);
            System.out.println("이름 : " + name);
        }
    }
    public static void main(String[] args) {
        Test3_no27 t = new Test3_no27();
        Student stobj = t.new Student();

        stobj.insertRecord(20221004, "홍길순");

        stobj.printInfo();
    }
}