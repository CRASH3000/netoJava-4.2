import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        B_M_I_Service service = new B_M_I_Service();

        double mass = 100;
        double height = 179;
        double body_mass_index = service.calculate(mass, height);

        BigDecimal result = new BigDecimal(body_mass_index); // Округление результата рассчета индекс массы тела делал с помощью класса BigDecimal.
        result = result.setScale(1, RoundingMode.DOWN);
        System.out.print("ИМТ: " + result);


        if (body_mass_index < 16) {
            System.out.print(" - Выраженный дефицит массы тела");
        } else if (body_mass_index > 16 && body_mass_index < 18.5) {
            System.out.print(" - Недостаточная (дефицит) масса тела");
        } else if (body_mass_index > 18.5 && body_mass_index < 25) {
            System.out.print(" - Норма");
        } else if (body_mass_index > 25 && body_mass_index < 30) {
            System.out.print(" - Избыточная масса тела (предожирение)");
        } else if (body_mass_index > 30 && body_mass_index < 35) {
            System.out.print(" - Ожирение первой степени");
        } else if (body_mass_index > 35 && body_mass_index < 40) {
            System.out.print(" - Ожирение второй степени");
        } else {
            System.out.print(" - Ожирение третьей степени (морбидное)");
        }
    }
}