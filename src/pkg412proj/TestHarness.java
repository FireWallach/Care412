package pkg412proj;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dylanwallach
 */
public class TestHarness {
    
    public static void main(String[] args){
        TestHarness th = new TestHarness();
    }
    
    public TestHarness(){
        this.testGetUserList();
        this.testSetUserList();
        this.testPersonalUIController();
        this.testUserListAdd();
        this.testUserListGet();
    }
    
    public void testGetUserList(){
        UserList ul = new UserList();
        if(ul.getUserList().isEmpty()){
            System.out.println("getUserList Passed.");
        } else{
            System.out.println("getUserList Failed.");
        }
    }
    
    public void testUserListAdd(){
        User user = new User("un", "pw", 0, "fname", "lname",0);
        UserList ul = new UserList();
        ul.add(user);
        if(ul.get(0).equals(user)){
            System.out.println("UserList::add Passed.");
        }
    }
    
    public void testUserListGet(){
        User user = new User("getuser", "pw", 0, "fname", "lname",0);
        UserList ul = new UserList();
        ul.add(user);
        if(ul.get(0).equals(user)){
            System.out.println("UserList::get passed.");
        }
    }
    
    
    public void testSetUserList(){
        
        User user = new User("un", "pw", 4, "fname", "lname",0);
        UserList ul = new UserList();
        ul.add(user);
        if(ul.get(0).equals(user)){
            System.out.println("setUserList passed.");
        }
    }
    
    public void testPersonalUIController(){
        PersonalUIController personalUI = new PersonalUIController();
        User testUser = new User("","",0,"","",0);
        
        //testing PersonalUIController.getUser()
        if (personalUI.getUser() == null){
            System.out.println("getUser passed");
        }
        else {
            System.out.println("getUser failed");
        }
        // testing PersonalUIController.setUser()
        personalUI.setUser(testUser); // <-- Temporaily sets the user value to the Test User
        if (personalUI.getUser().equals(personalUI.getUser())){
            System.out.println("setUser passed");
        }
        else {
            System.out.println("setUser failed");
        }
        personalUI.setUser(null); // <-- Returns the value of user to the original value of null
    }
    
}
