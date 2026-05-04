package Classes;

public class Service {

    protected String serviceId;
    protected String serviceName;
    protected String type;
    protected int duration;
    protected double price;
    protected Boolean isActive;

    public Service(String serviceName, String type, int duration, float price) {
        this.serviceName = serviceName;
        this.type = type;
        this.duration = duration;
        this.price = price;
    }

    public Service() {
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}