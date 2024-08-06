import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        class Person{
            int age;
            String name;

            public Person() {
                this.age = 0;
                this.name = " ";
            }



            public void setAge(int age) {
                this.age = age;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public String getName() {
                return name;
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Person[] per = new Person[n];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            per[i] = new Person();

            per[i].setAge(Integer.parseInt(st.nextToken()));
            per[i].setName(st.nextToken());


        }
        per = Arrays.stream(per).sorted(Comparator.comparingInt(person -> person.age)).toArray(Person[]::new);
        for(Person data:per){
            bw.write(data.age+" "+data.name+"\n");
        }
        bw.close();
    }
}