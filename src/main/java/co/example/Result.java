package co.example;

public sealed interface Result {
    record Success(Object successObject) implements Result {}
    record Failure(String error) implements Result {}
}
