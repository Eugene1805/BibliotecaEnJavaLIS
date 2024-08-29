import java.util.List;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

    // Crear instancias de Member
    Member member1 = new Member();
    Member member2 = new Member();

    // Probar métodos de Member
    member1.signUp(member1);
    member2.updateInformation(member2);
    member1.cancelMembership("12345");
    member1.sendReminder("12345");

    List<Member> activeMembers = Member.getMostActive();
    System.out.println(activeMembers);  // Mostrará la lista vacía

    // Crear instancias de Book
    Book book1 = new Book();
    Book book2 = new Book();

    // Probar métodos de Book
    book1.push(book1);
    book2.pop(book2);
    book1.update(book1);

    List<Book> mostBorrowedBooks = Book.getMostBorrowed();
    System.out.println(mostBorrowedBooks);  // Mostrará la lista vacía

    List<Book> lessBorrowedBooks = Book.getLessBorrowed();
    System.out.println(lessBorrowedBooks);  // Mostrará la lista vacía

    // Crear instancia de Loan
    Loan loan = new Loan();

    // Probar métodos de Loan
    Date loanDate = new Date();
    Date devolutionDate = loan.calcDate(loanDate);
    System.out.println("Fecha de devolución calculada: " + devolutionDate);

    int fine = loan.calcFine(devolutionDate);
    System.out.println("Multa calculada: " + fine);

    loan.history("123456789");

    // Probar clases Standard y Premium
    Standard standardMember = new Standard();
    Premium premiumMember = new Premium();

    System.out.println("Límite de membresía estándar: " + standardMember.membershipLimit());
    System.out.println("Límite de membresía premium: " + premiumMember.membershipLimit());

    }
}