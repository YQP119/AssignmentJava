package Classes;

public class Appointment {

    protected String appointmentId;
    protected String techId;
    protected String customerId;
    protected String counterStaffId;
    protected String serviceId;
    protected String date;
    protected String status;

    public Appointment(String appointmentId, String techId, String customerId,
                       String counterStaffId, String serviceId, String date, String status) {

        this.appointmentId = appointmentId;
        this.techId = techId;
        this.customerId = customerId;
        this.counterStaffId = counterStaffId;
        this.serviceId = serviceId;
        this.date = date;
        this.status = status;
    }

    public Appointment() {
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getTechId() {
        return techId;
    }

    public void setTechId(String techId) {
        this.techId = techId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCounterStaffId() {
        return counterStaffId;
    }

    public void setCounterStaffId(String counterStaffId) {
        this.counterStaffId = counterStaffId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
