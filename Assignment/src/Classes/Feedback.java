package Classes;

public class Feedback {

    protected String feedbackId;
    protected String userId;
    protected String text;
    protected String appointmentId;
    protected String date;
    protected String type;

    public Feedback(String userId, String text, String appointmentId, String date) {
        this.userId = userId;
        this.text = text;
        this.appointmentId = appointmentId;
        this.date = date;
    }

    public Feedback() {
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
