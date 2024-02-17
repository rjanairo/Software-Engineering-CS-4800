import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create the folder structure
        Folder root = new Folder("php_demo1");

        Folder sourceFiles = new Folder("Source Files");
        root.addFolder(sourceFiles);

        Folder app = new Folder("app");
        sourceFiles.addFolder(app);
        app.addFile(new File("controllers"));
        app.addFile(new File("models"));
        app.addFile(new File("views"));

        Folder config = new Folder("config");
        sourceFiles.addFolder(config);

        Folder library = new Folder("library");
        sourceFiles.addFolder(library);

        Folder migrations = new Folder("migrations");
        sourceFiles.addFolder(migrations);

        Folder publicFolder = new Folder("public");
        sourceFiles.addFolder(publicFolder);
        publicFolder.addFile(new File(".htaccess"));
        publicFolder.addFile(new File("index.html"));
        publicFolder.addFile(new File("router.php"));

        // Print the initial structure
        System.out.println("Initial Folder Structure:");
        root.printStructure("");

        // Delete the folder 'app' and print the structure
        sourceFiles.removeFolder("app");
        System.out.println("\nFolder Structure after deleting 'app':");
        root.printStructure("");

        // Delete the folder 'public' and print the structure
        sourceFiles.removeFolder("public");
        System.out.println("\nFolder Structure after deleting 'public':");
        root.printStructure("");
    }
}
