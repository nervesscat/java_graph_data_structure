package JSON;

public class Value {
    
    private JSON<String, Value> json;
    private String string;
    private double number;
    private Value[] array;

    private boolean isJSON = false;
    private boolean isString = false;
    private boolean isNumber = false;
    private boolean isArray = false;

    public Value(JSON<String, Value> json) {
        this.json = json;
        this.isJSON = true;
    }

    public Value(String string) {
        this.string = string;
        this.isString = true;
    }

    public Value(double number) {
        this.number = number;
        this.isNumber = true;
    }

    public Value(Value[] array) {
        this.array = array;
        this.isArray = true;
    }

    public String whatIsMyType(){
        if (this.isJSON) {
            return "JSON";
        } else if (this.isString) {
            return "String";
        } else if (this.isNumber) {
            return "Number";
        } else if (this.isArray) {
            return "Array";
        } else {
            return "Unknown";
        }
    }
    
    public JSON<String, Value> getJSON() {
        return this.json;
    }

    public String getString() {
        return this.string;
    }

    public double getNumber() {
        return this.number;
    }

    public Value[] getArray() {
        return this.array;
    }

    public boolean isJSON() {
        return this.isJSON;
    }

    public boolean isString() {
        return this.isString;
    }

    public boolean isNumber() {
        return this.isNumber;
    }

    public boolean isArray() {
        return this.isArray;
    }

    public String toString() {
        if (this.isJSON) {
            return this.json.toString();
        } else if (this.isString) {
            return this.string;
        } else if (this.isNumber) {
            return Double.toString(this.number);
        } else if (this.isArray) {
            String string = "[";
            for (int i = 0; i < this.array.length; i++) {
                string += this.array[i].toString();
                if (i < this.array.length - 1) {
                    string += ", ";
                }
            }
            string += "]";
            return string;
        } else {
            return "Unknown";
        }
    }
}
