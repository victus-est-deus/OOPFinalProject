package Project;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

import  Enums.*; 

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
    private boolean isLoggedIn;

    // Constructor 
    public User(String id, String password, String firstName, String lastName, 
                String userInfo, int age, boolean status, Language language,boolean isLoggedIn) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userInfo = userInfo;
        this.age = age;
        this.status = status;
        this.language = language;
        this.isLoggedIn = isLoggedIn;
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
    public void viewNews() {
        ArrayList<News> allNews = new ArrayList<>();
        Database.news.values().forEach(allNews::addAll);
        allNews.sort(Comparator.comparing(News::getDate));

        for (News newsItem : allNews) {
            System.out.println("Date: " + newsItem.getDate() + ", Topic: " + newsItem.getTopic() + ", Content: " + newsItem.getContent());
        }
    }
    public abstract void viewProfile();
    public abstract void sendRequest();

    
    public void logIn() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        String enteredId = scanner.nextLine();

        System.out.print("Enter Password: ");
        String enteredPassword = scanner.nextLine();

        boolean loginSuccessful = false;

        for (TypeUser userType : Database.users.keySet()) {
            for (User user : Database.users.get(userType)) {
                if (user.getId().equals(enteredId) && user.getPassword().equals(enteredPassword)) {
                    loginSuccessful = true;
                    isLoggedIn = true;
                    break;
                }
            }
            if (loginSuccessful) {
                break;
            }
        }

        if (loginSuccessful) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed.");
        }
    }



    public void logOut() {
    	if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("You have successfully logged out.");
        } else {
            System.out.println("You are not logged in.");
        }  
    }

    public void subscribeToMagazine() {
       
    }

    public void searchNews(String searchTopic) {
        for (Vector<News> newsVector : Database.news.values()) {
            for (News newsItem : newsVector) {
                if (newsItem.getTopic().equalsIgnoreCase(searchTopic)) {
                    System.out.println("Date: " + newsItem.getDate() + ", Topic: " + newsItem.getTopic() + ", Content: " + newsItem.getContent());
                }
            }
        }
    }
    public void viewRequest() {
       
    }

    public void changePassword() {
       
    }
    
}

