package app;

public class Portal {
    public static void main(String[] args) {
        new SelfCare().run(args);
       new Legacy().run(args);
       new OAuth2().run(args);
    }
}