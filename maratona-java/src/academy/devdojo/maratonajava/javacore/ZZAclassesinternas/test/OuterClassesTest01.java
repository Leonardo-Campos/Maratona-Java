package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {

    }
}
