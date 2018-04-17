package org.itstep;


public class App 
{
    public static void main( String[] args )
    {
        User user = new User();
        user.setLogin("Vikuha");
        
        System.out.println(user.getLogin());
    }
}
