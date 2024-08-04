package homework2.office;

public class Office {
    String name;
    String jobTitle;

    public Office() {
    }

    public Office(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Office(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public void customizeManager(Office boss, Office manager) {
        System.out.println(boss.name + ": " + manager.name + " быстрее! ");
    }

    public void theManagerScreams(Office manager) {
        System.out.println(manager.name + ": я ничего не успеваю, помогите! ");
    }

    public void theSecretaryAsksYouToCalmDown(Office secretary, Office boss, Office manager, Office securityGuard) {
        System.out.println(secretary.jobTitle + ": " + boss.name + " не волнуйтесь, "
                + manager.name + " все успеет. " + securityGuard.name + " подождите!");
    }

    public void securityGuardAsksForAdvance(Office securityGuard) {
        System.out.println(securityGuard.name + ": выдайте мне аванс.");
    }

    public void workingDay(Office boss, Office manager, Office secretary, Office securityGuard) {
        customizeManager(boss, manager);
        theManagerScreams(manager);
        securityGuardAsksForAdvance(securityGuard);
        theSecretaryAsksYouToCalmDown(secretary, boss, manager, securityGuard);
    }
}
