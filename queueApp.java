import java.util.LinkedList;
import java.util.Queue;

    public class QueueApp {
        public static void main(String[] args) {
            
            Queue<String> line = new LinkedList<>();
            Queue<String> line2 = new LinkedList<>();
            char let = 'A';
            int time = 0;
            int rn;
            String person = "" + let + let + let;
            line.add(person);

            while (time < 40)
            {
                rn = (int)(Math.random() * 12);

                if ((rn == 1) || (rn == 2)) {let++; person = "" + let + let + let; line.add(person);}
                if ((rn == 3) || (rn == 4) || (rn == 5)) {line.poll();}
                if ((rn == 6) || (rn == 7)) {let++; person = "" + let +let +let; line2.add(person);}
                if ((rn == 9) || (rn == 10) || (rn == 11)) {line2.poll();}
                System.out.println("Time " + time + " Line 1 : "  + line);
                System.out.println("Time " + time + " Line 2 : "  + line2);
                time ++;
            }

        }
    }
