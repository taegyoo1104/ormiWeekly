package daily.q0206;

public class LoginExample {

    public static void main(String[] args) {
        try {
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password) throws WrongPasswordException, NotExistsIdException {
        if(!id.equals("blue")) {
            throw new NotExistsIdException("ID DOES NOT EXIST");
        }

        if(!password.equals("12345")) {
            throw new WrongPasswordException("PASSWORD IS INCORRECT");
        }
    }
}
