package Jeeson;

public class Phone {

    class Apple {
        String model;

        public void message(String message) {
            System.out.println("Sending a message: " + message);
        }

        public void makeCall(String number) {
            System.out.println("Making a call to: " + number);
        }
    }

    class Google extends Apple {

        public Google(String r) {
            this.model = r;
        }

        @Override
        public void message(String m) {
            System.out.println(model + " sending message to: " + m);
        }

        @Override
        public void makeCall(String num) {
            System.out.println(model + " making call to: " + num);
        }
    }

    public static void main(String[] args) {
        Phone phone = new Phone();


        Google r = phone.new Google("Google");
        
        

        r.message("Hello World!");
        r.makeCall("1234567890");
    }
}
