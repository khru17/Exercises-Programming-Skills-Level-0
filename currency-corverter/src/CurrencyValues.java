public enum CurrencyValues {

    CLP(
            1.0,
            0.91,
            0.0011,
            0.0010,
            0.033,
            0.00088),
    ARS(
            1.10,
            1.0,
            0.0012,
            0.0011,
            0.037,
            0.00097),
    USD(
            889.95,
            811.20,
            1,
            0.91,
            29.82,
            0.79
            ),
    EUR(
            975.16,
            888.87,
            1.10,
            1.0,
            32.68,
            0.86
    ),
    TRY(
          29.84,
            27.20,
            0.034,
            0.031,
            1.0,
            0.026
    ),
    GBP(
           1132.46,
            1032.25,
            1.27,
            1.16,
            37.95,
            1.0
    );


    double valueCurrencyCLP;
    double valueCurrencyARS;
    double valueCurrencyUSD;
    double valueCurrencyEUR;
    double valueCurrencyTRY;
    double valueCurrencyGBP;

    CurrencyValues(double valueCurrencyCLP,
             double valueCurrencyARS,
             double valueCurrencyUSD,
             double valueCurrencyEUR,
             double valueCurrencyTRY,
             double valueCurrencyGBP) {
        this.valueCurrencyCLP = valueCurrencyCLP;
        this.valueCurrencyARS = valueCurrencyARS;
        this.valueCurrencyUSD = valueCurrencyUSD;
        this.valueCurrencyEUR = valueCurrencyEUR;
        this.valueCurrencyTRY = valueCurrencyTRY;
        this.valueCurrencyGBP = valueCurrencyGBP;
    }


}
