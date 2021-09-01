package artglorin.weirdjava.generic;

public class ReturnTypeInference {

    static  <T extends Runnable> T foo() {
        return (T) (Runnable) () -> System.out.println("Runnable");
    }

    static void stringConsumer(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        directCallAndNoIdeaInspection();
    }

    private static void directCallAndNoIdeaInspection() {
        // In this case return type reified as (Runnable & String)
        // This code compiles ??OK?? but throws ClassCastException on runtime
        stringConsumer(foo());
    }

    private static void directCallAnCast() {
        // In this case return type still reified as Runnable & String
        // but cannot be directly casts
//        stringConsumer((String) foo());
    }

    private static void withVariableAndIdeaInspection() {
        // But here the return type is still (Runnable & String), compiles normally
        // and of course throws ClassCastException
        String foo = foo();
        stringConsumer(foo);
    }

    private static void withTypeInferenceAndCorrectReturnType() {
        // If we will be use type inference the return type exactly Runnable
        // because we don't specify generic type.
        // it's fine and expected behaviour
        var foo = foo();
//        stringConsumer(foo);
    }

    private static void cannotCastWithTypeInference() {
        // But if we will try to specify type of return type with type reference
        // code will not compile, because String is not a subtype of Runnable
        // it is fine and correct behaviour
//        var foo = (String) foo();
    }
}
