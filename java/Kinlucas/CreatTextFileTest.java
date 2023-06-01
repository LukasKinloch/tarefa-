public class CreatTextFileTest {
    public static void main(String[] args){
        CreateTextFile application = new CreateTextFile();
        application.openFile();
        application.addRecords();
        application.closeFile();
    }
}
