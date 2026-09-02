class Student{
    String name;
    int age;
    double average;

    void setInfo(String n, int a, double avg){
        name = n;
        age = a;
        average = avg;
    }

    String getAchievementLevel(){
        if(average >= 90){
            return "우수";
        }
        else if (average >= 70) {
            return "보통";
        }
        else{
            return "노력 필요";
        }
    }

    void printInfo(){
        System.out.print("학생: " + name + ", ");
        System.out.print("나이: " + age + ", ");
        System.out.print("평균: " + average + ", ");
        System.out.print("성취도: " + getAchievementLevel());
    }
}

public class Students{
    static void main() {
        Student st = new Student();

        st.setInfo("서윤", 17, 83.5);
        st.printInfo();
    }
}