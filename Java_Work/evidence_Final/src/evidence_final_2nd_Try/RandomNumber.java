
package evidence_final_2nd_Try;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumber {
    public static void main(String[] args) {
//        Random rand = new Random(100);
//        Set<Integer>unique = new HashSet();
//        for (int i = 1; i <= 10; i++) {
//            int num = rand.nextInt(50)+50;
//            unique.add(num);
//        }
//        for(int i : unique)
//            System.out.print(i+" ");


/////////////////////////////////////////////////////
Random rand = new Random();
Set<Integer> unique = new HashSet();

        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(50)+50;
            unique.add(num);
        }
        for(int i : unique){
            System.out.println(i+" ");
        }

    }

}

