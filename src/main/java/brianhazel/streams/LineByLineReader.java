void main() {
    try (BufferedReader br = new BufferedReader(new FileReader("poema.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    } catch (Exception e) {
        System.out.println("An error occurred.");
    }
}