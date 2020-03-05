package classes;

public class Triangulo {

    private int ladoA = 0;
    private int ladoB = 0;
    private int ladoC = 0;

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) throws Exception {
        if (ladoA <= 0) {
            throw new Exception("O lado A não pode ser menor ou igual a zero\nDigite novamente:");
        }
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) throws Exception {
        if (ladoB <= 0) {
            throw new Exception("O lado B não pode ser menor ou igual a zero\nDigite novamente:");
        }
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) throws Exception {
        if (ladoC <= 0) {
            throw new Exception("O lado C não pode ser menor ou igual a zero\nDigite novamente:");
        }
        this.ladoC = ladoC;
    }

    public String identificaTriangulo() throws Exception {

        String resultado = "";
        //A linha abaixo indica se as medidas formam um triângulo ou não.
        if ((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB)) {

            if ((ladoA == ladoB) && (ladoB == ladoC)) {
                resultado += "Triângulo Equilátero";
            } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)) {
                resultado += "Triângulo Isósceles";
            } else {
                resultado += "Triângulo Escaleno";
            }
        } else {
            throw new Exception("As medidas informadas não formam um triângulo!");
        }
        return resultado;
    }

    public String identificaAngulo() {

        String angulo = "";
        double A = 0;
        double BC = 0;
        A = Math.pow(ladoA, 2);
        BC = Math.pow(ladoB, 2) + Math.pow(ladoC, 2);
        if (A < BC) {
            angulo = "Acutângulo";
        } else if (A > BC) {
            angulo = "Obtusângulo";
        } else {
            angulo = "Retângulo";
        }

        return angulo;
    }

    public float calculaAreaTriangulo() {
        float T = (ladoA + ladoB + ladoC) / 2;
        float area = (float) Math.sqrt(T * (T - ladoA) * (T - ladoB) * (T - ladoC));

        return area;
    }

}
