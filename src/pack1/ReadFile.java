package pack1;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ReadFile {

  public void read(String path) throws FileNotFoundException, IOException;
  
}
