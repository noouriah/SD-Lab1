//Array of objects (Students)
public class Ex7 {
    public static void main(String[] args) {
        Student [] s=new Student[3];
        Student student1=new Student("Ahmed",1);
        Student student2=new Student("Omar",2);
        s[0]=student1;
        s[0]=student2;
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }


    }}
