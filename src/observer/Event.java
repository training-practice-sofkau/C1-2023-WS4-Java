package observer;


class Event {
    private String name;
    private String startTime;
    private String endTime;

    private NotificationService notificationService = new NotificationService();


    public Event(String name, String startTime, String endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public String getName() {
        return name;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setName(String name) {
        this.name = name;
        notificationService.notifyObservers("Name updated");
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
        notificationService.notifyObservers("Start time updated");
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
        notificationService.notifyObservers("End time updated");
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
