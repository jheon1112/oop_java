import java.util.Scanner;

class Student{
    int studnum;
    String name;
    String major;
    Long phonenum;

    void setMajor(String major){
        this.major = major;
    }
    void setName(String name){
        this.name = name;
    }
    void setStudnum(int studnum){
        this.studnum = studnum;
    }
    void setPhonenum(Long phonenum){
        this.phonenum = phonenum;
    }

    int getStudnum(){
        return studnum;
    }
    Long getPhonenum(){
        return phonenum;
    }
    String getName(){
        return name;
    }
    String getMajor(){
        return major;
    }
    String getPhonenumFormat(){
        String phoneStr = Long.toString(getPhonenum());
        return "010-" + phoneStr.substring(2, 6) + "-" + phoneStr.substring(6);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stud = new Student[3];
        stud[0] = new Student();
        stud[1] = new Student();
        stud[2] = new Student();
        for (int i=0; i<3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요 : ");
            stud[i].setStudnum(sc.nextInt());
            stud[i].setName(sc.next());
            stud[i].setMajor(sc.next());
            stud[i].setPhonenum(sc.nextLong());
        }
        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        System.out.println("첫 번째 학생: " + stud[0].getStudnum() +
                " " + stud[0].getName() + " " +
                stud[0].getMajor() + " " + stud[0].getPhonenumFormat());

        System.out.println("두 번째 학생: " + stud[1].getStudnum() +
                " " + stud[1].getName() + " " +
                stud[1].getMajor() + " " + stud[1].getPhonenumFormat());

        System.out.println("세 번째 학생: " + stud[2].getStudnum() +
                " " + stud[2].getName() + " " +
                stud[2].getMajor() + " " + stud[2].getPhonenumFormat());

    }
}
