package exceptions;

public class IllegalEmailFormatExceptions extends RuntimeException{  // - dziedziczenie po klasie, gdzie nie trzeba łapać wyjątków
    //gdyby dziedziczyły po klasie CheckedExceptions to trzeba łapać w try catch

    public IllegalEmailFormatExceptions() {
    }


    public IllegalEmailFormatExceptions(String message) {
        super(message);
    }
}
