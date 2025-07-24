package wiprofirst.opencloseprinciple;


interface MessageService {
    void sendMessage(String msg);
}

class EmailService implements MessageService {
    public void sendMessage(String msg) {
        System.out.println("Sending Email: " + msg);
    }
}

class SMSService implements MessageService {
    public void sendMessage(String msg) {
        System.out.println("Sending SMS: " + msg);
    }
}

class Notifier {
    private MessageService service;

    Notifier(MessageService service) {
        this.service = service;
    }

    void notifyUser(String message) {
        service.sendMessage(message);
    }
}

public class DIPExample {
    public static void main(String[] args) {
        MessageService email = new EmailService();
        MessageService sms = new SMSService();

        Notifier n1 = new Notifier(email);
        Notifier n2 = new Notifier(sms);

        n1.notifyUser("Welcome!");
        n2.notifyUser("OTP: 123456");
    }
}
