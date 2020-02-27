public class Binary implements Strategy {
    @Override
    public String convert(int cislo) {
        int array[] = new int[40];
        int index = 0;
        String returning = "";
        while(cislo > 0){
            array[index++] = cislo%2;
            cislo = cislo/2;
        }
        for(int i = index-1;i >= 0;i--){
            returning += array[i];
        }

        return returning;
    }
}
