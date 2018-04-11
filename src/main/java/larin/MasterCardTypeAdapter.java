package larin;

public class MasterCardTypeAdapter implements CardTypeAdapter {
    @Override
    public int get() {
        return 0;
    }

    @Override
    public void setValue(String s) {

    }

    public static CardTypeAdapter getInstance() {
        return new MasterCardTypeAdapter();
    }
}
