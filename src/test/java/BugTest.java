import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BugTest {
  @Test
  public void test() throws IOException {
    Path source = Paths.get(URI.create("gs://genomics-public-data/NA12878.chr20.sample.bam"));
    Path dest = Files.createTempFile("test", ".bam");
    Files.deleteIfExists(dest);
    Files.copy(source, dest);
    System.out.println("Copied");
    boolean isDirectory = Files.isDirectory(source);
    System.out.println("Is directory: " + isDirectory);
  }
}
