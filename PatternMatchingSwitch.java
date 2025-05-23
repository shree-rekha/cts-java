public class PatternMatchingSwitch {

    public static void checkObjectType(Object obj) {
        // Switch expression with pattern matching
        String result = switch (obj) {
            case Integer i -> "It's an Integer with value " + i;
            case String s -> "It's a String with value \"" + s + "\"";
            case Double d -> "It's a Double with value " + d;
            case null -> "The object is null";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
        
        System.out.println(result);
    }

    public static void main(String[] args) {
        checkObjectType(42);
        checkObjectType("Hello, Java 21!");
        checkObjectType(3.14);
        checkObjectType(true);
        checkObjectType(null);
    }
}
