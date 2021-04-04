package com.happyPath.testcases;
import java.io.FileInputStream;
import java.util.Properties;  
public class DataStreamExample {  
	
	
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("D:\\Selenium\\HappyPath\\src\\main\\java\\com\\happyPath\\config\\config.properties");    
           Properties prop = new Properties();
            prop.load(fin);
            
  System.out.println(prop.getProperty("url"));
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  