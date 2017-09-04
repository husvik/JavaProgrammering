public class ClientProgram{
    public static void main(String[] args){
        Tupac[] elements = {new Biggie(), new Tupac(), new JayZ(), new FiftyCent()};
        for(int i = 0; i < elements.length; i++){
            elements[i].a();
            System.out.println();
            elements[i].b();
            System.out.println();
            System.out.println(elements[i]);
            System.out.println();
        }
    }
}