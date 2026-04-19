void main() {
    String text = "Hello World! \n";
    try (FileOutputStream output = new FileOutputStream("filename.txt", true)) {
        output.write(text.getBytes());
        System.out.println("Successfully wrote to file.");
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}