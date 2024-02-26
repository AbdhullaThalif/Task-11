package programs;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Main{
    
    static void validateAge(int age) throws InvalidAgeException {
        
        if (age < 18)
            throw new InvalidAgeException("Not a valid age");
        else
            System.out.println("Welcome to vote");
    }

    public static void main(String args[]) {
        
        try {
            validateAge(13);
        } 
        catch (InvalidAgeException m) {
            System.out.println("Exception occured: " + m);
        }
    }
}

