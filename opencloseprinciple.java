package wiprofirst.opencloseprinciple;


interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class WhatsAppNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending WhatsApp Message: " + message);
    }
}

class NotificationService {
    void notifyUser(Notification notification, String message) {
        notification.send(message);
    }
}

public class opencloseprinciple {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.notifyUser(new EmailNotification(), "Welcome to the app!");
        service.notifyUser(new SMSNotification(), "Your OTP is 123456");
        service.notifyUser(new WhatsAppNotification(), "New Offer: 50% Off!");
    }
}
