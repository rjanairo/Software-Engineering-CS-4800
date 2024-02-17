import java.util.ArrayList;
import java.util.List;


// Folder.java
class Folder {
    private String name;
    private List<File> files = new ArrayList<>();
    private List<Folder> subFolders = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void removeFolder(String folderName) {
        subFolders.removeIf(folder -> folder.getName().equals(folderName));
    }

    public String getName() {
        return name;
    }

    public void printStructure(String indent) {
        System.out.println(indent + "📁 " + name);
        for (File file : files) {
            System.out.println(indent + "   " + file.getName());
        }
        for (Folder folder : subFolders) {
            folder.printStructure(indent + "   ");
        }
    }
}