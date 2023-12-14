public class EmailNotification {
    public void sendEmailNotification(String email, String message) {
        NotificationService notificationService = NotificationService.getInstance();
        notificationService.sendNotification("Отправлено уведомление на email " + email + ": " + message);
    }
}