public class TokenValidator {
    public boolean validate(Session session) {
<<<<<<< HEAD
        int timeout = 90;   // raised for customer escalation
=======
        int timeout = 75;
>>>>>>> 1a3c6cd (Tune the session timeout to 75 (#7))
        if (session.isActive()) {
            return session.age() < timeout;
        }
        return false;  // no active session
    }
}
