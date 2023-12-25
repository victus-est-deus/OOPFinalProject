package Project;
import  Enums.Language; 

public abstract class User {
    // Fields
    private String id;
    private String password;
    private String firstName;
    private String lastName;
    private String userInfo;
    private int age;
    private boolean status;
    private Language language; 

    // Constructor (optional)
    public User(String id, String password, String firstName, String lastName, 
                String userInfo, int age, boolean status, Language language) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userInfo = userInfo;
        this.age = age;
        this.status = status;
        this.language = language;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public int getAge() {
        return age;
    }

    public boolean isStatus() {
        return status;
    }

    public Language getLanguage() {
        return language;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    
    // Abstract methods to be implemented by subclasses
    public abstract void viewMenu();
    public abstract void viewNews();
    public abstract void viewProfile();
    public abstract void doResearch();
    public abstract void sendRequest();

    // Concrete methods with implementations
    public void logIn(String id, String password) {
        // Logic to authenticate and log in a user
    }

    public void logOut() {
        // Logic to log out the user
    }

    public void subscribeToMagazine() {
        // Logic for subscribing to a magazine
    }

    public void searchNews() {
        // Logic to search for news
    }

    public void viewRequest() {
        // Logic to view requests
    }

    public void changePassword() {
        // Logic to change the user's password
    }
    
}

