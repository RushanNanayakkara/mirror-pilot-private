public class TokenValidator {
    public boolean validate(Session session) {
<<<<<<< HEAD
        int timeout = 90;   // raised for customer escalation
=======
        int timeout = 60;
>>>>>>> ee68b96 (Double the session timeout to 60 (#6))
        if (session.isActive()) {
            return session.age() < timeout;
        }
        return false;  // no active session
    }
}
