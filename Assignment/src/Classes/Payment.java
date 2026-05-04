package Classes;

public class Payment {

    protected String paymentId;
    protected String customerId;
    protected String appointmentId;
    protected String date;
    protected double totalPrice;
    protected String status;

    public Payment(String paymentId, String customerId, String appointmentId,
                   String date, double totalPrice, String status) {

        this.paymentId = paymentId;
        this.customerId = customerId;
        this.appointmentId = appointmentId;
        this.date = date;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public Payment() {
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
