package pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Implmt1 implements ReadFile {

  @Override
  public void read(String path) throws IOException {
    BufferedReader br ; 
    br = new BufferedReader( new FileReader(path) );
    String line;
    while ((line=br.readLine())!=null){
      if (line.length() ==0) {
        continue; 
      }
      //System.out.println(line);
    }
    br.close();
  }
  
  
  static public void main(String[] args) throws IOException {
    Implmt1 im1 = new Implmt1();
    im1.read("/Users/kaiwenshen/Desktop/test/Ruby Basic Tutorial.html");
  }
}
