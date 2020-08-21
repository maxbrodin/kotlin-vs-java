package _02_strings;

public class StringsJava {

    public static void main(String[] args) {
        System.out.println(multiLineStringSql());
        System.out.println(multiLineStringJson());
        System.out.println(format());
    }

    private static String multiLineStringSql() {
        return  "SELECT users.name \n" +
                "FROM users \n" +
                "WHERE users.name like 'Michael%'";
    }

    private static String multiLineStringJson() {
        return "{\n" +
                "    \"firstName\": \"Rack\",\n" +
                "    \"lastName\": \"Jackon\",\n" +
                "    \"gender\": \"man\",\n" +
                "    \"age\": 24,\n" +
                "    \"address\": {\n" +
                "        \"streetAddress\": \"126\",\n" +
                "        \"city\": \"San Jone\",\n" +
                "        \"state\": \"CA\",\n" +
                "        \"postalCode\": \"394221\"\n" +
                "    },\n" +
                "    \"phoneNumbers\": [\n" +
                "        { \"type\": \"home\", \"number\": \"7383627627\" }\n" +
                "    ]\n" +
                "}";
    }

    private static String format() {
        double value = 3.14;
        return String.format("PI value is %f", value, value, value, value);
    }
}
