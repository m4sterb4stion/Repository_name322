public class Main {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.sendEmailNotification("example@email.com", "Тестовое уведомление по электронной почте");

        SmsNotification smsNotification = new SmsNotification();
        smsNotification.sendSmsNotification("+123456789", "Тестовое уведомление по SMS");
    }
}