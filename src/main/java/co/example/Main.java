package co.example;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        Result result = service.doSomething();

        switch (result) {
            case Result.Success success -> System.out.println(success.successObject());
            case Result.Failure failure -> System.out.println(failure.error());
        }

        Result result2 = service.doSomethingElse();

        switch (result2) {
            case Result.Success success -> System.out.println(success.successObject());
            case Result.Failure failure -> System.out.println(failure.error());
        }

        System.out.println("Hello world!");
    }
}