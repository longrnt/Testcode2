package att.OOP.inheritance;

class Tool {
    public int size;
    int getSize() { return size; }
}

class Hammer extends Tool {
    private int size; // No problem!
    // Compile-time error
    protected int getSize() { return size; }
}
