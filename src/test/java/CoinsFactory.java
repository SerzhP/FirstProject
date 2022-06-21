public class CoinsFactory {
    public static Coin getCoinChoice(CoinsEnum coin) {
        switch (coin) {
            case ILS:
                System.out.println();
                return new ILS();
        }


    }
}