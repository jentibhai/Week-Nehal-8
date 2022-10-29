package week8nehal;

public class Programme25 {



        int id;
        String name;
        int age;
        Programme25 (int i,String n){
            id=i;
            name=n;
        }
        Programme25(int i,String n,int a){
            id=i;
            name=n;
            age=a;
        }
        public void display(){System.out.println(id+""+name+"");}

        public static void main(String[] args) {
            Programme25 s1 = new Programme25(29,"Karan");
            Programme25 s2=new Programme25(92,"Nehal",30);
            s1.display();
            s2.display();


        }



    }


