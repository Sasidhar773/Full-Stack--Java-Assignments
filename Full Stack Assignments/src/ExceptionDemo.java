// Java Program to Illustrate NoClassDefFoundError Exception
 
// Class 1
// Helper class
class Marketing {
 
    // Method
    void action()
    {
        // Print statement whenever method is called
        System.out.println("attend vendor calls");
    }
}
 
// Class 2
// Main class
class ExceptionDemo {
 
    // Main driver method
    public static void main(String args[])
    {
        // Creating object of class 1
        // inside main() in class2
    	Marketing mk = new Marketing();
 
        // Calling method of above class
        mk.action();
    }
}