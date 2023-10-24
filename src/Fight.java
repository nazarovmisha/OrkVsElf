public class Fight {
    public static void main(String[] args) {
        Ork ork = new Ork();
        Elf elf = new Elf();
        fight(elf, ork);
    }

    public static void fight(Elf elf, Ork ork) {
        while (true) {
            if (ork.isOrkAlive && !elf.isElfAlive) {
                System.out.println("Ork is win");
                break;
            } else if
            (!ork.isOrkAlive && elf.isElfAlive) {
                System.out.println("Elf is win");
                break;
            }else if

        }

    }
}
