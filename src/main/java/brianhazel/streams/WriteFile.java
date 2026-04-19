void main() {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt"))) {
        bw.write("First line");
        bw.newLine();
        bw.write("Second line");
        System.out.println("Successfully wrote to file.");
    } catch (Exception e) {
        System.out.println("An error occurred.");
    }
}