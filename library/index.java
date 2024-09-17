import java.util.Scanner;

public class index {
    private static Scanner scanner = new Scanner(System.in);
     public static void main(String[] args) {
        registerBook book = new registerBook();
        registerPerson person = new registerPerson();
        int choice = 99;
        while(choice != 0){
            System.out.println("-----------------------");
            System.out.println("\tLibrary ");
            System.out.println("-----------------------");
            System.out.print("1 - Register book\n2 - Register customer\n3 - Search book\n4 - Search customer\n4 - Financial\n0 - Exit\nChoice: ");
            choice = scanner.nextInt();

            if (choice == 1){
                //REGISTER BOOK
                scanner.nextLine();
                System.out.print("Book name: ");
                String bookName = scanner.nextLine();
                book.setBookName(bookName);
                System.out.print("Author: ");
                String AuthorName = scanner.nextLine();
                book.setAuthorName(AuthorName);
                System.out.print("Publication date: ");
                String publicationDate = scanner.nextLine();
                book.setPublicationDate(publicationDate);
                System.out.print("Type of Book: ");
                String typeOfBook = scanner.nextLine();
                book.setTypeOfBook(typeOfBook);

                //REGISTER LOCALHOST   
                
            }
            else if(choice == 2){

                scanner.nextLine();
                System.out.print("Name: ");
                String personName = scanner.nextLine();
                person.setPersonName(personName);
                System.out.print("Date of birth: ");
                String dateOfBirth = scanner.nextLine();
                person.setDateOfBirth(dateOfBirth);
                System.out.print("CPF: ");
                int cpf = scanner.nextInt();
                person.setCpf(cpf);
                
               //REGISTER LOCALHOST
               
            }

            

        }
     }
}