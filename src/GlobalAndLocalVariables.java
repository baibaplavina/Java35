public class GlobalAndLocalVariables {
    public static void main(String[] args) {
        int global = 10;
        System.out.println(global);

        if (10>5) {
            System.out.println(global);
            int local = 15;
                    }
        //System.out.println(local);
        //Iepriekšējā komanda nestrādā, jo grib izsaukt no cita lokālā līmeņa bet to nevar izsaukt.
    }
}
