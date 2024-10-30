public class User
{
    String name;
    String email;
    String password;
    Role role;
    User(String name, String email, String password, Role role){
        this.name=name;
        this.email=email;
        this.password=password;
        this.role=role;
    }

    public String toString(){
        return "User name: "+name+" Email: "+email+" Role: "+role;
    }
}
