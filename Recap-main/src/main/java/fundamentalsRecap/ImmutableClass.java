package fundamentalsRecap;

public final class ImmutableClass {
    private final int x;

    public int getX() {
        return x;
    }

    public String getS() {
        return s;
    }

    private final String s;

    public ImmutableClass(int x, String s) {
        this.x = x;
        this.s = s;
    }
}
