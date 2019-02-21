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
        testGetUserList();
    }
    
    public void testGetUserList(){
        UserList ul = new UserList();
        if(ul.getUserList().isEmpty()){
            System.out.println("getUserList Passed.");
        } else{
            System.out.println("getUserList Failed.");
        }
    }
    
}
