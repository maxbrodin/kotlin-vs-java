package _05_null_safety;

public class NullSafety {
    public void nullSafetyString() {
        String value = "initial value";
        value = null;
    }

    public void nullSafetyClass() {
        Name name = new Name();
        name = null;
    }

    public void safetyCall(final Person person) {
        int result = 0;
        if (person != null && person.getName() != null && person.getName().getValue() != null) {
            result = person.getName().getValue().length();
        }
        System.out.println(result);
    }

    public void notNullAssert(final Person person) {
        if (person == null || person.getName() == null || person.getName().getValue() == null) {
            throw new NullPointerException();
        }

        int result = person.getName().getValue().length();
        System.out.println(result);
    }

    class Person {
        private Name name;

        public Name getName() {
            return name;
        }

        public void setName(Name name) {
            this.name = name;
        }
    }
    
    class Name {
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
