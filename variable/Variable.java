class Variable {
    //variabel
    //data_type variablename = value
    /*
    int = 12
    char = 'A'
    double = 12.33
    string = "Dara"
    bool = true/false
    in oop they call datamember
    */
    public static void main(String[] args) {
        int age = 12;
        double price = 12.33;
        String name = "Dara";
        char grade = 'A';
        boolean is_student = true;
        System.out.println("Price"+price+"$");
        System.out.println(age +1);
        age += age;
        System.out.println(age);
        age -= age;
        System.out.println(age);
        age *= age;
        System.out.println(age);
        // toLowercase toUppercase
        name = name.toLowerCase();
        System.out.println(name);
        name = name.toUpperCase();
        System.out.println("Ur name is"+name);
        System.out.println("Your grade is:"+grade);
        System.out.println(is_student);
        //

    }
}
