package com.matrix.shikha.corejava.propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    //hardcoded values in method
    public void loginToApplication() {
        //write code to open http://www.google.com
        //Enter email address: "shikha.singh6@gmail.com"
        //Enter password: "Shikha11"
        //Click on login
    }

    public void login() throws IOException {
        String path = System.getProperty("user.dir");
        System.out.println("Path of project: "+path);

        File file = new File( path+"/src/main/java/com/matrix/shikha/corejava/propertiesfile/congif.properties");

        FileInputStream fin = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fin);

        String googleUrl = prop.getProperty("url");
        String emailId = prop.getProperty("emailId");
        String password = prop.getProperty("password");

        System.out.println(googleUrl);
        System.out.println(emailId);
        System.out.println(password);
    }

    public static void main(String[] args) throws IOException {
        TestProperties obj = new TestProperties();
        obj.loginToApplication();
        obj.login();
    }
}
