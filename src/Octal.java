public class Octal implements Strategy {
    @Override
    public String convert(int cislo) {
        String octalString = Integer.toOctalString(cislo);
        return octalString;
    }
}
