public class SmsNotification {
    public void sendSmsNotification(String phoneNumber, String message) {
        NotificationService notificationService = NotificationService.getInstance();
        notificationService.sendNotification("Отправлено SMS на номер " + phoneNumber + ": " + message);
    }
}