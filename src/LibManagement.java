public class LibManagement {
    public static void main(String[] args) {
        ReaderList<String> readerList = new ReaderList<>();
        readerList.addData("Alice");
        readerList.addData("Bob");
        readerList.addData("Charlie");

        System.out.println("Reader list:");
        readerList.display();
    }
}
