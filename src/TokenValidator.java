public class TokenValidator {
    public boolean validate(Session session) {
        int timeout = 90;   // raised for customer escalation
        if (session.isActive()) {
            return session.age() < timeout;
        }
        return false;  // no active session
    }
}
