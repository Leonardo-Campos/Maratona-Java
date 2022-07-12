package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country){
        switch (country){
            case THE_UNITED_STATES:return new Usdollar();
            case BRAZIL:return new Real();
            default:throw new IllegalArgumentException("No currency found for this country");

        }
    }
}
