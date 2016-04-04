

package headfirst.decorator.io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.File;

public class FileDemoMain{
  public static void main(String[] args) throws Exception {
    File readme=null;
    InputStream isReadme=null;
    InputStreamReader isrReadme =null;
    BufferedReader brReadme=null;
    int i;
    char c;
    String str;
    StringBuffer sbuffer = new StringBuffer();
    
    try {
      File myhome=new File(System.getProperty("user.home"));
      System.out.println("My home is "+myhome);
      
      String cwd=new File(".").getCanonicalPath();
      System.out.println("cwd is "+cwd);
      
      readme=new File(cwd, "HelloWorld.java");
      System.out.println("readme is "+readme);
      
      isReadme = new FileInputStream(readme);
      while ((i=isReadme.read()) != -1){
        c=(char)i;
        System.out.print(c);
      }
    } catch(Exception e){
      e.printStackTrace();
    } finally {
      if(isReadme != null)
        isReadme.close();
    }
  }
}
          