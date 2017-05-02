public class SwitchRandom {
    public static void main(String[] args) {
        String nameList[] = {"Tommy", "Kari", "Ingri"};
        String results= nameList[(int) (Math.random() * 3)];
        System.out.println(results);
    }


}
