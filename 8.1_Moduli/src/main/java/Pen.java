public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; }
        @Override public String toString() { return color; }
    }

    private Color color;
    private boolean capOn;

    public Pen() {
        this.color = Color.RED; // Color predeterminado
        this.capOn = true; // La tapa está inicialmente puesta
    }

    public Pen(Color color) {
        this.color = color;
        this.capOn = true;
    }

    public void capOff() {
        this.capOn = false;
    }

    public void capOn() {
        this.capOn = true;
    }

    public String draw() {
        return capOn ? "" : "Drawing " + color.toString();
    }

    public void changeColor(Color newColor) {
        if (capOn) {
            this.color = newColor;
        }
    }
}

