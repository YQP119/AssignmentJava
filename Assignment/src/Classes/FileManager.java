package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static final String USERS_FILE = "Database/Users.txt";
    public static final String SERVICES_FILE = "Database/Services.txt";
    public static final String APPOINTMENTS_FILE = "Database/Appointments.txt";
    public static final String FEEDBACK_FILE = "Database/Feedback.txt";
    public static final String PAYMENTS_FILE = "Database/Payments.txt";

    public static ArrayList<User> readUsers() {
        ArrayList<User> users = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(USERS_FILE));

            if (scanner.hasNextLine()) {
                scanner.nextLine(); // skip columns
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",", -1);

                User user = new User();

                user.setUserId(data[0]);
                user.setRole(data[1]);
                user.setUsername(data[2]);
                user.setName(data[3]);
                user.setPassword(data[4]);
                user.setEmail(data[5]);
                user.setPhoneNumber(data[6]);
                user.setIsActive(Boolean.parseBoolean(data[7]));

                users.add(user);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Users file not found: " + USERS_FILE);
        }

        return users;
    }

    public static ArrayList<Service> readServices() {
        ArrayList<Service> services = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(SERVICES_FILE));

            if (scanner.hasNextLine()) {
                scanner.nextLine(); // skip columns
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",", -1);

                Service service = new Service();

                service.setServiceId(data[0]);
                service.setServiceName(data[1]);
                service.setType(data[2]);
                service.setDuration(Integer.parseInt(data[3]));
                service.setPrice(Float.parseFloat(data[4]));
                service.setActive(Boolean.parseBoolean(data[5]));

                services.add(service);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Services file not found: " + SERVICES_FILE);
        }

        return services;
    }

    public static ArrayList<Appointment> readAppointments() {
        ArrayList<Appointment> appointments = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(APPOINTMENTS_FILE));

            if (scanner.hasNextLine()) {
                scanner.nextLine(); // skip columns
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",", -1);

                Appointment appointment = new Appointment();

                appointment.setAppointmentId(data[0]);
                appointment.setTechId(data[1]);
                appointment.setCustomerId(data[2]);
                appointment.setCounterStaffId(data[3]);
                appointment.setServiceId(data[4]);
                appointment.setDate(data[5]);
                appointment.setStatus(data[6]);

                appointments.add(appointment);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Appointments file not found: " + APPOINTMENTS_FILE);
        }

        return appointments;
    }

    public static ArrayList<Feedback> readFeedbacks() {
        ArrayList<Feedback> feedbacks = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(FEEDBACK_FILE));

            if (scanner.hasNextLine()) {
                scanner.nextLine(); // skip columns
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",", -1);

                Feedback feedback = new Feedback();

                feedback.setFeedbackId(data[0]);
                feedback.setUserId(data[1]);
                feedback.setText(data[2]);
                feedback.setAppointmentId(data[3]);
                feedback.setDate(data[4]);
                feedback.setType(data[5]);

                feedbacks.add(feedback);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Feedback file not found: " + FEEDBACK_FILE);
        }

        return feedbacks;
    }

    public static ArrayList<Payment> readPayments() {
        ArrayList<Payment> payments = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(PAYMENTS_FILE));

            if (scanner.hasNextLine()) {
                scanner.nextLine(); // skip columns
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",", -1);

                Payment payment = new Payment();

                payment.setPaymentId(data[0]);
                payment.setCustomerId(data[1]);
                payment.setAppointmentId(data[2]);
                payment.setDate(data[3]);
                payment.setStatus(data[4]);
                payment.setTotalPrice(Double.parseDouble(data[5]));

                payments.add(payment);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Payments file not found: " + PAYMENTS_FILE);
        }

        return payments;
    }

    public static User findUserById(ArrayList<User> users, String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public static Service findServiceById(ArrayList<Service> services, String serviceId) {
        for (Service service : services) {
            if (service.getServiceId().equals(serviceId)) {
                return service;
            }
        }
        return null;
    }

    public static Appointment findAppointmentById(ArrayList<Appointment> appointments, String appointmentId) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId().equals(appointmentId)) {
                return appointment;
            }
        }
        return null;
    }

    public static Payment findPaymentById(ArrayList<Payment> payments, String paymentId) {
        for (Payment payment : payments) {
            if (payment.getPaymentId().equals(paymentId)) {
                return payment;
            }
        }
        return null;
    }

    public static Feedback findFeedbackById(ArrayList<Feedback> feedbacks, String feedbackId) {
        for (Feedback feedback : feedbacks) {
            if (feedback.getFeedbackId().equals(feedbackId)) {
                return feedback;
            }
        }
        return null;
    }

    public static void saveUser(User user) {
        try {
            FileWriter writer = new FileWriter(USERS_FILE, true);

            writer.write(
                    user.getUserId() + "," +
                            user.getRole() + "," +
                            user.getUsername() + "," +
                            user.getName() + "," +
                            user.getPassword() + "," +
                            user.getEmail() + "," +
                            user.getPhoneNumber() + "," +
                            user.getIsActive() + "\n"
            );

            writer.close();

        } catch (IOException e) {
            System.out.println("Error saving user.");
        }
    }

    public static String generateNextUserId() {
        ArrayList<User> users = readUsers();

        int maxId = 0;

        for (User user : users) {
            String id = user.getUserId(); // example U001

            int number = Integer.parseInt(id.substring(1)); // 001 -> 1

            if (number > maxId) {
                maxId = number;
            }
        }

        return String.format("U%03d", maxId + 1);
    }
}