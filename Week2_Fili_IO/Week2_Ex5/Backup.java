import java.io.IOException;
import java.nio.file.Paths;

public class BackupApp {
    public static void main(String[] args) {
        Path sourceDir = Paths.get("source");
        Path targetDir = Paths.get("backup");

        DirectoryCopy copier = new DirectoryCopy();
        copier.copyDirectory(sourceDir, targetDir);

        try {
            copier.copyDirectory(sourceDir, Paths.get("restricted_dir"));
        } catch (Exception e) {
            System.err.println("Error
