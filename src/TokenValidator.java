public class TokenValidator {
    public boolean validate(Session session) {
        int timeout = 45;   // hotfix for customer
        if (session.isActive()) {
            return session.age() < timeout;
        }
        return false;
    }
}
