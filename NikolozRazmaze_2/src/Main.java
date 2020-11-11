import org.apache.log4j.Logger;

import java.io.File;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {
        BasicConfigurator.configure();
        File dictionary = new File("/home/kokoi/Desktop/BTU_DOCUMENT"); // ლინუქსის დირექტორია
        Scanner sc = new Scanner(System.in);
        boolean found;
        while (true) {
            System.out.print("შეიყვანეთ საძიებო სიტყვა: ");
            String searchFileName = sc.nextLine();
            logger.info("შემოტანილი სიტყვა: " + searchFileName);
            found = searchFiles(dictionary, searchFileName);

            if (!found) {
                System.out.println("სიტყვის შესაბამისი ფაილი არ მოიძებნა!");
            }
        }
    }

    public static boolean searchFiles(File dirPath, String searchVal) throws InterruptedException {
        boolean found = false;
        for (File file : dirPath.listFiles()) {
            if (file.getName().toLowerCase().startsWith(searchVal.toLowerCase())) {
                // print in 3 sec interval
                Thread.sleep(300);
                logger.info("მოიძებნა: " + file.getName() + "  Dir:-> " + file.getPath());
                found = true;
            }
            if (file.isDirectory()) {
                if (searchFiles(file, searchVal)) {
                    found = true;
                }
            }
        }
        return found;
    }
}