public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    private User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public static class UserBuilder {
        private User user;

        public UserBuilder() {
            user = new User();
        }

        public UserBuilder setFirstName(String firstName) {
            user.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            user.lastName = lastName;
            return this;
        }

        public UserBuilder setEmail(String email) {
            user.email = email;
            return this;
        }

        public UserBuilder setAge(int age) {
            user.age = age;
            return this;
        }

        public User build() {
            return user;
        }
    }
}