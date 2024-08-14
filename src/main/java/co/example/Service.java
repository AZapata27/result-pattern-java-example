package co.example;

public class Service {


    public Result doSomething() {
        return new Result.Success("Success!");
    }

    public Result doSomethingElse() {
        return new Result.Failure("Failure!");
    }
}
