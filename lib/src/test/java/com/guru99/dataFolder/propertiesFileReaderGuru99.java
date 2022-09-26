package com.guru99.dataFolder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

public class propertiesFileReaderGuru99 {

	private Properties properties;
    private final String path= "configGuru.properties";
    public propertiesFileReaderGuru99() {
        BufferedReader reader;
    try {
        reader=new BufferedReader(new FileReader(path));
        properties= new Properties();

    try {
            properties.load(reader);
            reader.close();
        }
        catch(IOException e) {
            e.printStackTrace();

        }
    }
    catch(FileNotFoundException f) {
        f.printStackTrace();
        throw new RuntimeException("file not found");
    }

}
    public String getUsername() {
        String username=properties.getProperty("Username");
            return username;
           /*byte[] encodedBytes = Base64.getEncoder().encode(username.getBytes());
            if(username!= null)
                return new String(encodedBytes);
            else
                throw new RuntimeException("Username not specified in the application.properties file.");*/
    }
    public String getPassword() {
        String password=properties.getProperty("Password");
        return password;
        /*byte[] encodedBytes = Base64.getEncoder().encode(password.getBytes());
        if(password!= null)
            return new String(encodedBytes);
        else
            throw new RuntimeException("Password not specified in the application.properties file.");*/
    }
}





