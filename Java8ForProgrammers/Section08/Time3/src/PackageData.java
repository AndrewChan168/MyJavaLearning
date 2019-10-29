class PackageData {
    int number; // package-access instance variable
    String string; // package-access instance variable

    // constructor
    public PackageData(){
        number = 0;
        string = "Hello";
    }

    // return PackageData object String representation
    public String toString(){
        return String.format("number: %d; string: %s", number, string);
    }
}
