package homework2.office;

public class Runner {
    public static void main(String[] args) {

        Office boss = new Office("Петр Николаевич", "босс");
        Office manager = new Office("Володя", "менеджер");
        Office securityGuard = new Office("Петрович", "охранник");
        Office secretary = new Office("Секретарь");
        Office office = new Office();


        office.workingDay(boss, manager, secretary, securityGuard);
    }
}
