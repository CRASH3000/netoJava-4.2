public class B_M_I_Service {

    public double calculate(double m, double h) {
        double h2 = h / 100; // Конвертация роста из см > мм.
        double b_m_i = m / (h2 * h2);

        return b_m_i;
    }
}
