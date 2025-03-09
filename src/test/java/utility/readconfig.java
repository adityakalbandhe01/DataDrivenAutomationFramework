package utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import lombok.val;

public class readconfig {

    Properties Prop;

    // Use constructor
    String path = "C:\\Users\\v-akalbandhe\\Desktop\\mystorename\\Configuration\\config.properties";

    Public readconfig() {
        Properties Prop = new Properties();
        FileInputStream fis;
        try {
            fis = new FileInputStream(path);
            prop.load(fis);
        } catch (Exception e) {
            // TODO: handle exception'
            e.printStackTrace();

        }
    }

    Public String getBaseUrl(){
     String valueString =   prop.getProperty("baseURL");
if valueString !=null){
    return valueString;
}
else{
    throw new RuntimeException("URL not specified");
    
}
    }
    Public String getBrowser(){
     String valueString =   prop.getProperty("browser");
if valueString !=null){
    return valueString;
}
else{
    throw new RuntimeException("URL not specified in config class");
    
}
    }
}
