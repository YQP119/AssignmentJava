package Classes;

public class Manager extends User {

    public Manager() {
        super();
    }

    public Manager(String userId, String role, String username, String name,
                   String password, String email, String phoneNumber, boolean isActive) {

        super(userId, role, username, name, password, email, phoneNumber, isActive);
    }

    public void addUser(String role, String username, String name,
                        String password, String email, String phoneNumber) {

        User newUser = new User();

        newUser.setUserId(FileManager.generateNextUserId());
        newUser.setRole(role);
        newUser.setUsername(username);
        newUser.setName(name);
        newUser.setPassword(password);
        newUser.setEmail(email);
        newUser.setPhoneNumber(phoneNumber);
        newUser.setIsActive(true);

        FileManager.saveUser(newUser);

        System.out.println("User added successfully.");
        System.out.println("New User ID: " + newUser.getUserId());
    }
}