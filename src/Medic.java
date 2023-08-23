public class Medic extends Hero {

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Medic применил супер силу");
    }

    public int healPoints = 50;


    public void increaseExperience() {
        System.out.println("очки здоровья = " +
                (this.healPoints + (this.healPoints * 10) / 100) + " количество ");
    }


}