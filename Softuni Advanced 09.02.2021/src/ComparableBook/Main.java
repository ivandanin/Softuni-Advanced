package ComparableBook;


public class Main {
    public static void main(String[] args) {
        Book one = new Book("Animal Farm", 2003, "George Orwell");
        Book two = new Book("The Documents in the Case", 2002);
        Book three = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustance");


        if (one.compareTo(two) > 0){
            System.out.printf("%s is before %s%n", one, two);
        } else if (one.compareTo(two) < 0) {
            System.out.printf("%s is before %s%n", two, one);
        } else {
            System.out.println("Book are equal");
        }
    }
    }
