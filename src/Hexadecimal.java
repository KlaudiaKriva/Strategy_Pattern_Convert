public class Hexadecimal implements Strategy{
    @Override
    public String convert(int cislo) {
        String str = Integer.toHexString(cislo);
        return str;
    }
}
