public class ApplicationGlobalState {

    private static ApplicationGlobalState INSTANCE;
    private String selectedCity = null;
    private final String API_KEY = "Aqoxn6Xvxm0w5rf1Zn0xvzbzD9ОовекИ";

    private ApplicationGlobalState() {

    }

    public static ApplicationGlobalState getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApplicationGlobalState();
        }
        return INSTANCE;
    }

    public String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }

    public String getApiKey() {
        return this.API_KEY;
    }

}
