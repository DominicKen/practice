package traintTest;

public class Count {

int ticket;
int round;

    public Count(int ticket, int round) {
        this.ticket = ticket;
        this.round = round;
    }

    public void print(){



        int one = (ticket-round)*1000;
        double discount = (round*2000)*0.9;
       double count = one+discount;
       Double c = count;
       int d = c.intValue();


        System.out.println("Total tickets: "+ticket);
        System.out.println("Round-trip: "+round);
        System.out.println("Total: "+d);
    }

}
