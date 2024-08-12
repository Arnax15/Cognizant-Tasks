import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryCopy {
    public void copyDirectory(Path sourceDir, Path targetDir) {
        try {
            Files.walk(sourceDir)
                    .forEach(source -> {
                        Path target = targetDir.resolve(sourceDir.relativize(source));
                        try {
                            Files.copy(source, target);
                        } catch (IOException e) {
                            System.err.println("Error copying file: " + e.getMessage());
                        }
                    });
        } catch (IOException e) {
            System.err.println("Error copying directory: " + e.getMessage());
        }
    }
}
