import java.io.*;
import java.util.*;

class Calculator {
    // Basic arithmetic operations
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed!");
            return 0;
        }
        return (double) a / b;
    }
}

class FileHandler {
    // Writing to a file
    public void writeFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Content written to file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }

    // Reading from a file
    public void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("File Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        FileHandler fileHandler = new FileHandler();

        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Arithmetic Operations");
            System.out.println("2. File Handling");
            System.out.println("3. Person Details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nArithmetic Operations:");
                    System.out.print("Enter first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();

                    System.out.println("Addition: " + calculator.add(num1, num2));
                    System.out.println("Subtraction: " + calculator.subtract(num1, num2));
                    System.out.println("Multiplication: " + calculator.multiply(num1, num2));
                    System.out.println("Division: " + calculator.divide(num1, num2));
                    break;

                case 2:
                    System.out.println("\nFile Handling:");
                    System.out.println("1. Write to File");
                    System.out.println("2. Read from File");
                    System.out.print("Choose an option: ");
                    int fileChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    if (fileChoice == 1) {
                        System.out.print("Enter filename: ");
                        String filename = scanner.nextLine();
                        System.out.print("Enter content to write: ");
                        String content = scanner.nextLine();
                        fileHandler.writeFile(filename, content);
                    } else if (fileChoice == 2) {
                        System.out.print("Enter filename to read: ");
                        String filename = scanner.nextLine();
                        fileHandler.readFile(filename);
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 3:
                    System.out.println("\nPerson Details:");
                    System.out.print("Enter name: ");
                    scanner.nextLine(); // Consume the newline
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();

                    Person person = new Person(name, age);
                    person.displayDetails();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}

// import java.io.*;
// import java.util.*;

// abstract class Shape {
//     // Abstract class for shapes
//     abstract double getArea();
//     abstract double getPerimeter();
// }

// class Rectangle extends Shape {
//     private double length;
//     private double width;

//     public Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     @Override
//     double getArea() {
//         return length * width;
//     }

//     @Override
//     double getPerimeter() {
//         return 2 * (length + width);
//     }
// }

// class Circle extends Shape {
//     private double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     double getArea() {
//         return Math.PI * radius * radius;
//     }

//     @Override
//     double getPerimeter() {
//         return 2 * Math.PI * radius;
//     }
// }

// public class MainProgram {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         boolean exit = false;

//         while (!exit) {
//             System.out.println("\n=== Main Menu ===");
//             System.out.println("1. Arithmetic Operations");
//             System.out.println("2. File Handling");
//             System.out.println("3. String Manipulations");
//             System.out.println("4. Prime Number Check");
//             System.out.println("5. Shapes (OOP Example)");
//             System.out.println("6. Data Structures Demo");
//             System.out.println("7. Exit");
//             System.out.print("Choose an option: ");
//             int choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     handleArithmeticOperations(scanner);
//                     break;
//                 case 2:
//                     handleFileOperations(scanner);
//                     break;
//                 case 3:
//                     handleStringManipulations(scanner);
//                     break;
//                 case 4:
//                     checkPrimeNumber(scanner);
//                     break;
//                 case 5:
//                     demonstrateShapes(scanner);
//                     break;
//                 case 6:
//                     demonstrateDataStructures();
//                     break;
//                 case 7:
//                     exit = true;
//                     System.out.println("Exiting the program. Goodbye!");
//                     break;
//                 default:
//                     System.out.println("Invalid choice! Please try again.");
//             }
//         }

//         scanner.close();
//     }

//     // Arithmetic Operations
//     private static void handleArithmeticOperations(Scanner scanner) {
//         System.out.print("Enter first number: ");
//         int a = scanner.nextInt();
//         System.out.print("Enter second number: ");
//         int b = scanner.nextInt();

//         System.out.println("Addition: " + (a + b));
//         System.out.println("Subtraction: " + (a - b));
//         System.out.println("Multiplication: " + (a * b));
//         if (b != 0) {
//             System.out.println("Division: " + ((double) a / b));
//         } else {
//             System.out.println("Division by zero is not allowed.");
//         }
//     }

//     // File Handling
//     private static void handleFileOperations(Scanner scanner) {
//         System.out.println("1. Write to File");
//         System.out.println("2. Append to File");
//         System.out.println("3. Read from File");
//         System.out.println("4. List Files in Directory");
//         System.out.print("Choose an option: ");
//         int choice = scanner.nextInt();
//         scanner.nextLine(); // Consume the newline

//         switch (choice) {
//             case 1:
//                 System.out.print("Enter filename: ");
//                 String writeFile = scanner.nextLine();
//                 System.out.print("Enter content: ");
//                 String content = scanner.nextLine();
//                 try (BufferedWriter writer = new BufferedWriter(new FileWriter(writeFile))) {
//                     writer.write(content);
//                     System.out.println("Content written to file successfully!");
//                 } catch (IOException e) {
//                     System.out.println("Error writing to file: " + e.getMessage());
//                 }
//                 break;
//             case 2:
//                 System.out.print("Enter filename: ");
//                 String appendFile = scanner.nextLine();
//                 System.out.print("Enter content to append: ");
//                 String appendContent = scanner.nextLine();
//                 try (BufferedWriter writer = new BufferedWriter(new FileWriter(appendFile, true))) {
//                     writer.write(appendContent);
//                     System.out.println("Content appended to file successfully!");
//                 } catch (IOException e) {
//                     System.out.println("Error appending to file: " + e.getMessage());
//                 }
//                 break;
//             case 3:
//                 System.out.print("Enter filename: ");
//                 String readFile = scanner.nextLine();
//                 try (BufferedReader reader = new BufferedReader(new FileReader(readFile))) {
//                     String line;
//                     System.out.println("File Content:");
//                     while ((line = reader.readLine()) != null) {
//                         System.out.println(line);
//                     }
//                 } catch (IOException e) {
//                     System.out.println("Error reading file: " + e.getMessage());
//                 }
//                 break;
//             case 4:
//                 System.out.print("Enter directory path: ");
//                 String dirPath = scanner.nextLine();
//                 File dir = new File(dirPath);
//                 if (dir.isDirectory()) {
//                     System.out.println("Files in directory:");
//                     for (String file : Objects.requireNonNull(dir.list())) {
//                         System.out.println(file);
//                     }
//                 } else {
//                     System.out.println("Invalid directory path.");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid choice!");
//         }
//     }

//     // String Manipulations
//     private static void handleStringManipulations(Scanner scanner) {
//         System.out.print("Enter a string: ");
//         scanner.nextLine(); // Consume the newline
//         String input = scanner.nextLine();

//         System.out.println("Uppercase: " + input.toUpperCase());
//         System.out.println("Lowercase: " + input.toLowerCase());
//         System.out.println("Reversed: " + new StringBuilder(input).reverse());
//         System.out.println("Length: " + input.length());
//     }

//     // Prime Number Check
//     private static void checkPrimeNumber(Scanner scanner) {
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();

//         if (num <= 1) {
//             System.out.println(num + " is not a prime number.");
//             return;
//         }

//         boolean isPrime = true;
//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }

//         if (isPrime) {
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }
//     }

//     // Shapes Example
//     private static void demonstrateShapes(Scanner scanner) {
//         System.out.println("1. Rectangle");
//         System.out.println("2. Circle");
//         System.out.print("Choose a shape: ");
//         int shapeChoice = scanner.nextInt();

//         if (shapeChoice == 1) {
//             System.out.print("Enter length: ");
//             double length = scanner.nextDouble();
//             System.out.print("Enter width: ");
//             double width = scanner.nextDouble();
//             Shape rectangle = new Rectangle(length, width);
//             System.out.println("Area: " + rectangle.getArea());
//             System.out.println("Perimeter: " + rectangle.getPerimeter());
//         } else if (shapeChoice == 2) {
//             System.out.print("Enter radius: ");
//             double radius = scanner.nextDouble();
//             Shape circle = new Circle(radius);
//             System.out.println("Area: " + circle.getArea());
//             System.out.println("Perimeter: " + circle.getPerimeter());
//         } else {
//             System.out.println("Invalid choice!");
//         }
//     }

//     // Data Structures Demo
//     private static void demonstrateDataStructures() {
//         List<String> list = new ArrayList<>();
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Cherry");

//         System.out.println("ArrayList:");
//         for (String item : list) {
//             System.out.println(item);
//         }

//         Map<Integer, String> map = new HashMap<>();
//         map.put(1, "One");
//         map.put(2, "Two");
//         map.put(3, "Three");

//         System.out.println("\nHashMap:");
//         for (Map.Entry<Integer, String> entry : map.entrySet()) {
//             System.out.println(entry.getKey() + " -> " + entry.getValue());
//         }
//     }
// }












// import java.io.*;
// import java.net.*;
// import java.util.*;

// // Interface example
// interface Drawable {
//     void draw();
// }

// class Line implements Drawable {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a Line.");
//     }
// }

// class Square implements Drawable {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a Square.");
//     }
// }

// public class MainProgram {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         boolean exit = false;

//         while (!exit) {
//             System.out.println("\n=== Main Menu ===");
//             System.out.println("1. Arithmetic Operations");
//             System.out.println("2. File Handling");
//             System.out.println("3. String Manipulations");
//             System.out.println("4. Prime Number Check");
//             System.out.println("5. Shapes (OOP Example)");
//             System.out.println("6. Data Structures Demo");
//             System.out.println("7. Matrix Operations");
//             System.out.println("8. Sorting Algorithms");
//             System.out.println("9. Networking Demo");
//             System.out.println("10. Exit");
//             System.out.print("Choose an option: ");
//             int choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     handleArithmeticOperations(scanner);
//                     break;
//                 case 2:
//                     handleFileOperations(scanner);
//                     break;
//                 case 3:
//                     handleStringManipulations(scanner);
//                     break;
//                 case 4:
//                     checkPrimeNumber(scanner);
//                     break;
//                 case 5:
//                     demonstrateShapes(scanner);
//                     break;
//                 case 6:
//                     demonstrateDataStructures();
//                     break;
//                 case 7:
//                     matrixOperations(scanner);
//                     break;
//                 case 8:
//                     sortingAlgorithms(scanner);
//                     break;
//                 case 9:
//                     networkingDemo();
//                     break;
//                 case 10:
//                     exit = true;
//                     System.out.println("Exiting the program. Goodbye!");
//                     break;
//                 default:
//                     System.out.println("Invalid choice! Please try again.");
//             }
//         }

//         scanner.close();
//     }

//     // Existing methods...

//     // Matrix Operations
//     private static void matrixOperations(Scanner scanner) {
//         System.out.print("Enter the size of the square matrix (n x n): ");
//         int n = scanner.nextInt();

//         int[][] matrix1 = new int[n][n];
//         int[][] matrix2 = new int[n][n];
//         int[][] result = new int[n][n];

//         System.out.println("Enter elements of first matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix1[i][j] = scanner.nextInt();
//             }
//         }

//         System.out.println("Enter elements of second matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix2[i][j] = scanner.nextInt();
//             }
//         }

//         System.out.println("\nMatrix Addition:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 result[i][j] = matrix1[i][j] + matrix2[i][j];
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println("\nMatrix Multiplication:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 result[i][j] = 0;
//                 for (int k = 0; k < n; k++) {
//                     result[i][j] += matrix1[i][k] * matrix2[k][j];
//                 }
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     // Sorting Algorithms
//     private static void sortingAlgorithms(Scanner scanner) {
//         System.out.print("Enter the number of elements: ");
//         int n = scanner.nextInt();
//         int[] array = new int[n];

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             array[i] = scanner.nextInt();
//         }

//         System.out.println("1. Bubble Sort");
//         System.out.println("2. Insertion Sort");
//         System.out.print("Choose a sorting algorithm: ");
//         int choice = scanner.nextInt();

//         if (choice == 1) {
//             bubbleSort(array);
//         } else if (choice == 2) {
//             insertionSort(array);
//         } else {
//             System.out.println("Invalid choice!");
//             return;
//         }

//         System.out.println("Sorted Array:");
//         for (int num : array) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     private static void bubbleSort(int[] array) {
//         int n = array.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (array[j] > array[j + 1]) {
//                     // Swap
//                     int temp = array[j];
//                     array[j] = array[j + 1];
//                     array[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     private static void insertionSort(int[] array) {
//         int n = array.length;
//         for (int i = 1; i < n; i++) {
//             int key = array[i];
//             int j = i - 1;

//             while (j >= 0 && array[j] > key) {
//                 array[j + 1] = array[j];
//                 j--;
//             }
//             array[j + 1] = key;
//         }
//     }

//     // Networking Demo
//     private static void networkingDemo() {
//         Thread serverThread = new Thread(() -> {
//             try (ServerSocket serverSocket = new ServerSocket(5000)) {
//                 System.out.println("Server started. Waiting for a client...");
//                 Socket socket = serverSocket.accept();
//                 System.out.println("Client connected!");

//                 BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                 PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

//                 writer.println("Welcome to the server!");
//                 String message = reader.readLine();
//                 System.out.println("Client says: " + message);

//                 reader.close();
//                 writer.close();
//                 socket.close();
//             } catch (IOException e) {
//                 System.out.println("Server error: " + e.getMessage());
//             }
//         });

//         Thread clientThread = new Thread(() -> {
//             try {
//                 Thread.sleep(1000); // Allow server to start
//                 Socket socket = new Socket("localhost", 5000);
//                 System.out.println("Connected to the server!");

//                 BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                 PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

//                 System.out.println("Server says: " + reader.readLine());
//                 writer.println("Hello, Server!");

//                 reader.close();
//                 writer.close();
//                 socket.close();
//             } catch (IOException | InterruptedException e) {
//                 System.out.println("Client error: " + e.getMessage());
//             }
//         });

//         serverThread.start();
//         clientThread.start();

//         try {
//             serverThread.join();
//             clientThread.join();
//         } catch (InterruptedException e) {
//             System.out.println("Networking threads interrupted: " + e.getMessage());
//         }
//     }
// }
