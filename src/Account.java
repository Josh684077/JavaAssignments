import java.util.Date;

public class Account
{
    Integer id;
    String username;
    String password;
    String firstName;
    String lastName;
    Date birthDate;

    public boolean LoginSuccessful(String password)
    {
        return (this.password == password);
    }


}
