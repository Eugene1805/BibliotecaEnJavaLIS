import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String userType;
    private String id;
    private String name;
    private String address;
    private Integer membership;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMembership() {
        return membership;
    }

    public void setMembership(Integer membership) {
        this.membership = membership;
    }

    public void signUp(Member user){
        System.out.println("Ingrese sus datos");
    }

    public void updateInformation(Member user){
        System.out.println("Ingrese los datos a modificas");
    }

    public void cancelMembership(String id){
        System.out.println("Membresía cancelada");
    }

    public void sendReminder(String id){
        System.out.println("Favor de regresar el libro antes de la fecha de devolución");
    }

    public static @NotNull List<Member> getMostActive(){
        List<Member> top = new ArrayList<>();
        System.out.println("Top 3:");
        return top;
    }

}
