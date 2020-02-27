public class Main {
    public static void main(String[] args) {
        Context context = new Context(new Octal());
        System.out.println(context.convertTo(2202));
        context = new Context(new Binary());
        System.out.println(context.convertTo(2202));
        context = new Context(new Hexadecimal());
        System.out.println(context.convertTo(2202));
    }
}
