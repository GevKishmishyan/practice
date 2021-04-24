public class ImmutableUser {

    public static void main(String[] args) {
        User currentUser = new User("Valod", "Valodyan", 28, true);
        System.out.println(currentUser.getAge());

        User tmpUser = new User.UserBuilder("Valod1", "Valodyan2")
                .age(12)
                .isMarried(false)
                .build();
        System.out.println(tmpUser);
    }
}

final class User {
    private final String name;
    private final String surname;
    private final int age;
    private final boolean isMarried;

    public User(String name, String surname, int age, boolean isMarried) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMarried = isMarried;
    }

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.surname = userBuilder.surname;
        this.age = userBuilder.age;
        this.isMarried = userBuilder.isMarried;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                '}';
    }

    public static class UserBuilder {
        private final String name;
        private final String surname;
        private int age;
        private boolean isMarried;

        public UserBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder isMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
